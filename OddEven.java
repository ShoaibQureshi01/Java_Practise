import java.io.*;
class OddEven{
        public static void main(String args[]){
                Console con=System.console();

		System.out.println("Enter Number :");
		int no = Integer.parseInt(con.readLine());
		
		if(no%2==0){
			System.out.println("no. is Even");
		}
		else{
			System.out.println("no. is Odd");

		}

	
	}
}
