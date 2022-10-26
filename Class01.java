package java10;
class Caaa{
	public int num1;    //如果設定成private，set_num()和show()無法存取
	public int num2;    //如果設定成private，set_num()和show()無法存取
}
class Cbbb extends Caaa{
	void set_num(int a,int b) {
		num1=a;
		num2=b;
	}
	void show() {
		System.out.println(num1+","+num2);
	}
}
public class Class01 {

	public static void main(String[] args) {
		Cbbb bb=new Cbbb();
		bb.set_num(5, 10);
		bb.show();
	}

}
