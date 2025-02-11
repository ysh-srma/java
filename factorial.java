import java.io.*;

class factorial
{
    public static void main(String h[]) throws IOException 
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first subject marks");
        String st=br.readLine();
        
        double x=Integer.parseInt(st);
        double a=x;
        double f=1;
       
        while(x>0)
        {
            f=f*x;
            x--;
        }

        
        System.out.println("Factorial of " + a + " is "+ f); 
    }
}