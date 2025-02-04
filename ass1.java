import java.util.*;
public class ass1 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of Passengers\n");
int n=sc.nextInt();
int tot=0;
for(int i=0;i<n;i++) {
	System.out.print("Enter the name\n");
	String name=sc.next();
	System.out.print("Enter the age\n");
	int age=sc.nextInt();
	System.out.print("Enter the Boarding point\n");
	String b=sc.next();
	if(age>5 && b.equals("Pune")) {
		tot=tot+295;
	}
	else if(age>5 && b.equals("Lonavala")) {
		tot=tot+235;
	}
}
System.out.print(tot);
}
}
