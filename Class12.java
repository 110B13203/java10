package java10;
class CShape{
	final double pi=3.1415;
	protected int r;
	protected int length;
	protected int height;
	protected int bottom;
	public double area() {
		return 0.0;
	}
	public static double largrst(double a,double b) {
		return Math.max(a, b);
	}
}
class CCircle extends CShape{
	public CCircle(int n) {
		r=n;
	}
	public double area() {
		return pi*r*r;
	}
}
class CSquare extends CShape{
	public CSquare(int n) {
		length=n;
	}
	public double area() {
		return length*length;
	}
}
class CTriangle extends CShape{
	public CTriangle(int n1,int n2) {
		bottom=n1;
		height=n2;
	}
	public double area() {
		return bottom*height/2;
	}
}
public class Class12 {

	public static void main(String[] args) {
		CShape shp[]=new CShape[6];
		shp[0]=new CCircle(2);
		shp[1]=new CCircle(3);
		shp[2]=new CSquare(10);
		shp[3]=new CSquare(15);
		shp[4]=new CTriangle(13,4);
		shp[5]=new CTriangle(166,16);
		double max = 0;
		for(int i = 0;i<5;i++) {
			if (max<CShape.largrst(shp[i].area(),shp[i+1].area())) {
			max=CShape.largrst(shp[i].area(),shp[i+1].area());
			}	
		}		
		System.out.println(max);
	}

}