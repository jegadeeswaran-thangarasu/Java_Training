package day8;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import day7.In;

public class FactoryDemo {
	public static void main(String[] args) throws Exception {
		ShoeShop shop = Container.getShoeShop();
		
		Object obj = (Importer)Proxy.newProxyInstance(
				ShoeShop.class.getClassLoader(), new Class[] {Importer.class,ShoeSeller.class},
				new ImportInvocationHandler (new Object [] {new ImportImpl(),shop}));
		
		Importer importshop = (Importer)obj;
		importshop.doImport();
		
		ShoeSeller shop2 =(ShoeSeller)obj;
		
		Shoe shoe = shop2.sellShoe();
		
		System.out.println(shoe);
	}
}

class ImportInvocationHandler implements InvocationHandler {

	Object o[];
	public ImportInvocationHandler(Object o[]) {
		this.o = o;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object obj = null;
		try {
			for(int i = 0; i < o.length; i++) {
				obj = method.invoke(o[i], args);
			}
		}catch(Exception e) {}
		return obj;
	}
}
interface Importer {
	public void doImport();
}
class ImportImpl implements Importer {
	@Override
	public void doImport() {
		// TODO Auto-generated method stub
		System.out.println("do import is happening...");
	}	
}
abstract class Shoe {  }
class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}

interface ShoeManufacturer {
	public Shoe makeShoe();
}
abstract class ShoeFactory implements ShoeManufacturer {}

class BataShoeFactory extends ShoeFactory {
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new LeatherShoe();
	}
}

class LakhaniShoeFactory extends ShoeFactory {
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new SportsShoe();
	}
}

interface ShoeSeller {
	public Shoe sellShoe();
}

abstract class ShoeShop implements ShoeSeller {
	@In(data = "day8.BataShoeFactory")
	private ShoeFactory factory;
	
	public ShoeFactory getFactory() {
		return factory;
	}
	
	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
}
class NaveenShoeShop extends ShoeShop {
	@Override
	public Shoe sellShoe() {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}

class Container {
	public static ShoeShop getShoeShop() throws Exception {
		ShoeShop shop = new NaveenShoeShop();
		Class c = shop.getClass();
		Field f = c.getSuperclass().getDeclaredField("factory");
		f.setAccessible(true);
		In in = f.getAnnotation(In.class);
		if(in != null) {
			String factoryclass = in.data();
			ShoeFactory factory = (ShoeFactory)Class.forName(factoryclass).newInstance();
			shop.setFactory(factory);//injection
		}
		return shop;
	}
}