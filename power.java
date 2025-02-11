import java.io.*;

class power
{
    public static void main(String h[]) throws IOException 
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number");
        String st=br.readLine();
        int x=Integer.parseInt(st);
        
        System.out.println("Enter power value");
        String st1=br.readLine();
        int y=Integer.parseInt(st1);
        
        int p=1;
        while(y>0)
        {
         p=p*x;
         y--;
        }
        

        System.out.println("power ="+p);
     }
    }
