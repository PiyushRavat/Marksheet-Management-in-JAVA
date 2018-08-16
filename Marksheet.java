import java.util.Scanner;
class P2{
	public static void main(String[] args) {

		System.out.println("Enter How many Subject ....");
		Scanner scan=new Scanner(System.in);
		int asize = scan.nextInt();
		int []marks= new int[asize];
		System.out.println("Enter "+asize+" Subject marks");

		for (int i=0;i<marks.length;i++) {
			marks[i] = scan.nextInt();			
		}
		int sum=0;
		for (int i=0;i<marks.length;i++ ) {
			sum+=marks[i];
		}
		System.out.println("total marks : "+sum);
		System.out.println("percentage is : "+(sum/asize)+"%");		

	}
}