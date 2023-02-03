import java.io.*;
class Bill{
        public static void main(String args[]){
                Console con=System.console();

		float pencil = Float.parseFloat(con.readLine());

		float pen = Float.parseFloat(con.readLine());

		float eraser = Float.parseFloat(con.readLine());

		float total = pen+pencil+eraser;

		System.out.println("Your Total is "+total);
	}
}
