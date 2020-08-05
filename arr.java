import java.io.*;
class arr
{
	public static void main(String args[])throws IOException
	{
		 int[] hello=new int[10];
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter 10 no");
		 for(int i=0;i<=9;i++)
		 {
			 hello[i]=Integer.parseInt(br.readLine());
		 }
		 System.out.println("Array elements are");
		 		 for(int i=0;i<=9;i++)
		 		 {
		 			 System.out.println(hello[i]);
		 }
	 }
 }