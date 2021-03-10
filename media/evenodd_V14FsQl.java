import java.util.Scanner; 
public class evenodd{	
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num");
	int n = sc.nextInt();
	System.out.println("enter char");
	char a = scan.next().charAt(0);
	
	for(int i=1;i<n;i++){
		for(int j=n;j>1;j--){
			System.out.print(a);
			}
			System.out.println();
		}	
	}
}
 