import java.io.*;
class IncomeTax{
        public static void main(String args[]){
                Console con=System.console();


	System.out.println("Enter Your Yearly Income");

	int in = Integer.parseInt(con.readLine());

	if(in < 500000){
		System.out.println("Income tax not applicable");
	}
	if(in > 500000 && in < 1000000){
		System.out.println("Income Tax is :"+(int) (in*0.20));
	}
	else if(in > 1000000){
		System.out.println("Your income Tax is :"+(int)(in*0.30));

	}
}
}
