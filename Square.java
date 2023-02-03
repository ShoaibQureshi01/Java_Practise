import java.io.*;
class Square{
        public static void main(String args[]){
                Console con=System.console();

		float side = Float.parseFloat(con.readLine());
		
		float area=side*side;
		System.out.println("Area is "+area);
	}	
}
