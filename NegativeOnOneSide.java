import java.util.*;
class NegSort{
    void neg_sort(int arr[],int n){
        int i=0,temp,k;
        while(true){
            k=0;
            for(int j=0;j<n-1;j++){
                if(arr[j]>0 && arr[j+1]<0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    k++;
                }
            }
            if(k==0){
                break;
            }
        }
        System.out.println("\n After Sort:");
        for(int j=0;j<n;j++){
		    System.out.print(arr[j]+" ");
		}
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,x,j;
		for(i=0;i<n;i++){
		    System.out.println("Enter a no.:");
		    x=sc.nextInt();
		    arr[i]=x;
		}
		System.out.println("Before Sort:");
        for(j=0;j<n;j++){
		    System.out.print(arr[j]+" ");
		}
		NegSort myobj=new NegSort();
		myobj.neg_sort(arr,n);
		
		
		
	}
}
