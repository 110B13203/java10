package java10;
class Car{
	protected String owner;
	protected String id;
	public Car(String own,String s) {
		owner=own;
		id=s;
	}
	public void show() {
		System.out.println("���D�m�W:"+owner);
		System.out.println("���P���X:"+id);
	}
}
class CColor extends Car{
	private String color;
	public CColor(String own,String s,String c) {
		super(own, s);
		color=c;
	}
	public void show() {
		System.out.println("���D�m�W:"+owner);
		System.out.println("���P���X:"+id);
		System.out.println("�����C��:"+color);
	}
}
public class Class17 {

	public static void main(String[] args) {
		CColor mycar=new CColor("Riaan","A1-2345","Black");
		mycar.show();
	}

}
