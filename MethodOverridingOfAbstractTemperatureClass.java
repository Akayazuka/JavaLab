abstract class Temperature{
    double temp;
    void setTemp(double t){
        temp=t;
    }    
    abstract void changeTemp();
}
class Fahrenheit extends Temperature{
    void changeTemp(){
        temp=(5/9.0)*(temp-32);
        System.out.println(temp);
    }
}
class Celcius extends Temperature{
    void changeTemp(){
        temp=((9/5.0)*temp)+32;
        System.out.println(temp);
    }
}
public class Main
{
	public static void main(String[] args) {
		Fahrenheit obj=new Fahrenheit();
		obj.setTemp(41);
		obj.changeTemp();
		Celcius obj2=new Celcius();
		obj2.setTemp(25);
		obj2.changeTemp();
	}
}
