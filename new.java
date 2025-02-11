import java.io.*;

class input
{
    public static void main(String h[]) throws IOException 
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first subject marks");
        String st=br.readLine();
        int x=Integer.parseInt(st);