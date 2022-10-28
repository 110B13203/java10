package java10;
class Caaa{
	private int num;
	public Caaa(int n) {
		num=n;
	}
	public int get() {
		return num;
	}
	public void display() {
		System.out.println("printed from Caaa class");
	}
}
class Cbbb extends Caaa{
	public Cbbb() {
		super(2);
	}
	public void show() {
		System.out.println("num="+super.get());
	}
	public void display() {
		System.out.println("printed from Cbbb class");
	}
}
public class Class09 {

	public static void main(String[] args) {
		Caaa bb=new Cbbb();
		bb.display();  //子類別的display()會被呼叫
	}

}
