import java.util.Scanner;

class Student {
	
}

class P2{
	public static void main(String[] args) {
		
		System.out.println("How many student create marksheet :");
		Scanner scan = new Scanner(System.in);
		int studsize = scan.nextInt();
		int []student = new int[studsize];
		
		System.out.println("Enter "+studsize+" Student name : ");
		//string studname = scan.next();
		string []name = new string[studsize];
		
		System.out.println("Enter How many Subject ....");
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

