import java.io.*;
class Average{
	public static void main(String args[]){
		Console con=System.console();
		int a=Integer.parseInt(con.readLine());
		int b=Integer.parseInt(con.readLine());
		int c=Integer.parseInt(con.readLine());

		int avg=(a+b+c)/3;
		System.out.println(avg);
}
}
