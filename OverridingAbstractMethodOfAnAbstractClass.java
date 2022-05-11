abstract class Shape{
    abstract int rectangleArea(int l,int b);
    abstract int squareArea(int a);
    abstract double circleArea(int r);
}
class Area extends Shape{
    int rectangleArea(int l,int b){
        return (l*b);
    }
    int squareArea(int a){
        return (a*a);
    }
    double circleArea(int r){
        return (Math.PI*(r*r));
    }
}
public class Main
{
	public static void main(String[] args) {
		Area obj=new Area();
		int rec=obj.rectangleArea(10,5);
		int sq=obj.squareArea(5);
		double cir=obj.circleArea(5);
		System.out.println(rec+" "+sq+" "+cir);
		
	}
}
