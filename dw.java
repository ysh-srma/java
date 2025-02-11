import java.io.*;

class dw
{
    public static void main(String h[]) throws IOException 
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number");
        String st=br.readLine();
        int x=Integer.parseInt(st);

        System.out.println("Enter last number");
        String st1=br.readLine();
        int y=Integer.parseInt(st1);
        
        do{
            System.out.println("x="+x);
            x++;
        }
        while(x<=y);
        
    
    
    
    
    }
}