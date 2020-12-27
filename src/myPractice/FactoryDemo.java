package myPractice;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import day7.In;
public class FactoryDemo {
	public static void main(String[] args) throws Exception{
		ShoeShop shop=Container.getShoeShop();
		Shoe shoe=shop.sellShoe();
		System.out.println(shoe);
		//Time goes by ,,,, now we want the shop to also have import facility....
		
		Object obj=Proxy.newProxyInstance
				(ShoeShop.class.getClassLoader(), new Class[] {Importer.class,ShoeSeller.class},
						new ImportInvocationHandler(new Object[] {shop,new ImportImpl()}));
		
		Importer importshop=(Importer)obj;
		importshop.doImport();
		
		ShoeSeller shop2=(ShoeSeller)obj;
		
		shoe=shop2.sellShoe();
		
		System.out.println(shoe);
		
		obj=Proxy.newProxyInstance(ShoeShop.class.getClassLoader(),
				new Class[] {ShoeSeller.class,Importer.class,Exporter.class},
				new ImportInvocationHandler(new Object[] {new ExporterImpl(),obj}));
		
		Exporter exportShop=(Exporter)obj;
		exportShop.doExport();
		
		importshop=(Importer)obj;
		importshop.doImport();
//		
		shop2=(ShoeSeller)obj;
		
		shoe=shop2.sellShoe();
		
		System.out.println(shoe);
	}
}
class ImportInvocationHandler implements InvocationHandler{
	Object obj[];
	Object o;
	public ImportInvocationHandler(Object obj[]) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		for(int i=0;i<obj.length;i++) {
			try {
				o=method.invoke(obj[i], args);
			}catch(Exception e) {}
		}
		return o;
	}
}
interface Importer{
	public void doImport();
}
class ImportImpl implements Importer{
	@Override
	public void doImport() {
		System.out.println("do import is happening now in shop..\n..shop has become  an import shop");
	}
}
interface Exporter {
	public void doExport();
}
class ExporterImpl implements Exporter{
	@Override
	public void doExport() {
		System.out.println("do export is happening now in shop..\n shop has become as export shop.");
	}
}
abstract class Shoe{   }
class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}
interface ShoeManufacturer{
	public Shoe makeShoe();
}
abstract class ShoeFactory implements ShoeManufacturer{}
class BataShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}
interface ShoeSeller{
	public Shoe sellShoe();
}
abstract class ShoeShop implements ShoeSeller{
	@In(data = "myPractice.LakhaniShoeFactory")
	private ShoeFactory factory;
	public ShoeFactory getFactory() {
		return factory;
	}
	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
}
class NaveenShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe() {
		// TODO Auto-generated method stub
		System.out.println("sell shoe method is called..");
		return getFactory().makeShoe();
	}
}
class Container{
	public static ShoeShop getShoeShop()throws Exception {
		ShoeShop shop=new NaveenShoeShop();
		Class c=shop.getClass();		
		Field f=c.getSuperclass().getDeclaredField("factory");
		f.setAccessible(true);
		In in=f.getAnnotation(In.class);
		if(in!=null) {
			String factoryclass=in.data();
			ShoeFactory factory=(ShoeFactory)Class.forName(factoryclass).newInstance();
			shop.setFactory(factory);//injection
		}
		return shop;
	}
}
