import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[][] mat=new int[10][10];
		int i,j,x;
		System.out.println("Enter dim of mat:");
		int n=scan.nextInt();
		int sp=-1;
		for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		        System.out.println("Enter a no.");
		        x=scan.nextInt();
		        mat[i][j]=x;
		    }
		}
		for(i=0;i<n;i++){
		    int min=1000000,idx=-1;
		    for(j=0;j<n;j++){
		        if(mat[i][j]<min){
		            min=mat[i][j];
		            idx=j;
		        }
		    }
		    if(idx!=-1){
		        int k=0;
		        while(k<n){
		            if(min<mat[k][idx]){
		                break;
		            }
		            k++;
		        }
		        if(k==n){
		            sp=mat[i][idx];
		        }
		    }
		    
		    
		} 
		if(sp!=-1){
		    System.out.println("The saddle point of given matrix is:");
		    System.out.println(sp);
		}
		else{
		    System.out.println("Saddle point in not present in the given matrix,");
		}
		
	}
}
