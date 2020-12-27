package day7;

import java.lang.reflect.Field;

public class ContainerDemo {
	public static void main(String[] args) throws Exception {
		PaintBrush<Paint> pbrush = PaintContainer.getPaintBrush();
		Painter painter = new Painter();
		Class c = painter.getClass();
		Field f = c.getDeclaredField("brush");
		f.setAccessible(true);
		In in = f.getAnnotation(In.class);
		if(in != null) {
			String data = in.data();
			painter.brush = pbrush;
			painter.doPianting();
		}
		else {
			System.out.println("painter is not authorized...");
		}
		/*
		Paint p = pbrush.getObj();
		p.color();
		
		PaintBrush<Water> wbrush = WaterContainer.getPaintBrush();
		Water w = wbrush.getObj();
		w.sprinkle();
		
		PaintBrush<Paint> bbrush = PaintContainer.getPaintBrush();
		Paint pb = bbrush.getObj();
		pb.color();
		*/
	}
}

class Painter {
	@In(data = "day7.RedPaint")
	PaintBrush<Paint> brush;
	public void doPianting() {
		brush.getObj().color();
	}
}
class PaintContainer {
	public static PaintBrush<Paint> getPaintBrush() throws Exception {
		PaintBrush<Paint> brush = new PaintBrush<>();
		Class c = brush.getClass();
		Field f = c.getDeclaredField("obj");
		f.setAccessible(true);
		c.getAnnotation(In.class);
		Paint p = new RedPaint();
		brush.setObj(p);
		return brush;
	}
}

class WaterContainer {
	public static PaintBrush<Water> getPaintBrush() {
		PaintBrush<Water> brush = new PaintBrush<>();
		Water w = new Water();
		brush.setObj(w);
		return brush;
	}
}

class PaintBrush<T> {
	private T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}

abstract class Paint {
	public abstract void color();
}

class RedPaint extends Paint {

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("red color...");
	}
}
class BluePaint extends Paint {

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("blue color...");
	}
}
class Water {
	public void sprinkle() {
		System.out.println("water sprinkled...");
	}
}

class DryAir {
	public void dry() {
		System.out.println("can be used for dusting now...");
	}
}


/*
public class ContainerDemo {
	public static void main(String[] args) {
		PaintBrush<Paint> brush = new PaintBrush();
		Paint paint = new RedPaint();
		Water water = new Water();
		brush.setObj(paint);
		Paint p = brush.getObj();
		p.color();
		//brush.obj = water;
		//brush.doPaint();
	}
}
class PaintContainer {
	public static PaintBrush getPaintBrush() {
		PaintBrush<Paint> brush = new PaintBrush<>();
	}
}
class PaintBrush <T>{
	private T obj;
	public T getObj() {
		return obj;
	}
	public setObj(Paint p) {
		
	}
	/*
	public void doPaint() {
		if(obj instanceof Paint) {
			Paint paint = (Paint) obj;
			paint.color();
		}
		else if(obj instanceof Water) {
			Water water = (Water) obj;
			water.sprinkle();
		}
	}
	/*\/
}

abstract class Paint {
	public abstract void color();
}

class RedPaint extends Paint {

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("red color...");
	}
	
}
class BulePaint extends Paint {

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("blue color...");
	}
	
}
class Water {
	public void sprinkle() {
		System.out.println("water is sprikled...");
	}
}
class DryAir {
	public void dry() {
		System.out.println("can be used for dusting now...");
	}
}
*/