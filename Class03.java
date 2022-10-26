package java10;
class Caaa{
	public int num1;    //如果設定成private，set_num()和show()無法存取
	public int num2;    //如果設定成private，set_num()和show()無法存取
	public Caaa() {
		num1=1;
		num2=1;
	}
	public Caaa(int a,int b) {
		num1=a;
		num2=b;
	}
	void show() {
		System.out.println(num1+","+num2);
	}
}
class Cbbb extends Caaa{
	public Cbbb(int a,int b) {
		super(a,b);
	}
	void set_num(int a,int b) {
		num1=a;
		num2=b;
	}
}
public class Class03 {

	public static void main(String[] args) {
		Caaa aa=new Caaa();
		aa.show();
		Caaa aaa=new Caaa(9,7);
		aaa.show();
		Cbbb bb=new Cbbb(2,5);
		bb.show();
	}

}