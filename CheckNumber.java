import java.io.*;
class CheckNumber{
        public static void main(String args[]){
                Console con=System.console();
		System.out.println("Enter Number");

		int no = Integer.parseInt(con.readLine());
		
		if(no<0){
			System.out.println("Negative");
		}
		else if(no>0){
			System.out.println("Positive");
			}
		else
			System.out.println("Zero");
		




}
}
