import java.util.*;
public class task2 {
	public static void main(String args[]) {
		int n,t=0;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a Number");
		n=a.nextInt();
		if(n<0) {
			System.out.println("Number too Small");
		}
		else if(n>32767) {
			System.out.println("Number too Large");
		}
		else {
			while(n!=1) {
				if(n%2!=0) {
					t++;
				}
				n=n/2;
			}
			if(t==1){
					System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}

}
}
