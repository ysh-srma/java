import java.io.*;

class n
{
    public static void main(String h[]) throws IOException 
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number");
        String st=br.readLine();
        int n=Integer.parseInt(st);

        int x=1;
        while(x<n)
        {

        System.out.println("n ="+x);
        x++;

        }
    }
}
        
