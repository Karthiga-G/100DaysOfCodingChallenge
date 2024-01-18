## Challenge 
Print the factors common to both x and y.
Sample input:
12 16 4
Sample output:
1 2 4 8 12

## Solution
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n, x, y;
		n= sc.nextInt();
		x= sc.nextInt();
		y= sc.nextInt();
        for(int ctr=1; ctr<n; ctr++){
            if(x%ctr==0 || y%ctr==0){
                if(x%y==0 || y%x==0){
                    System.out.print(ctr+" ");
                }
            }
        }
        System.out.print(n);
	}
}
