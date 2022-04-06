import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String num=scan.nextLine();
		int n=num.length();
		int i=0,c=0;
		while(i<n){
		    int k=0;
		    int j;
		    for( j=i+1;j<n;j++){
		        if(num.charAt(i)=='0' && num.charAt(j)=='1'){
		            k++;
		        }
		        else if(num.charAt(i)=='0' && k>0 && num.charAt(j)=='0'){
		            c++;
		            break;
		        }
		        
		    }
		    i=j;
		    
		}
		System.out.println(c);
		
	}
}
