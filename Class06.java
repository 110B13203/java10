package java10;
class CTriangle{
	protected int base;
	protected int height;
	protected void show() {
		System.out.println("base="+base+", height="+height);
	}
}
class CData extends CTriangle{
	private double area;
	public CData(int a,int b) {
		base=a;
		height=b;
	}
	public void area() {
		super.show();
		area=base*height/2;
		System.out.println("area="+area);
	}
}
public class Class06 {

	public static void main(String[] args) {
		CData obj=new CData(3,8);
		obj.area();
	}

}