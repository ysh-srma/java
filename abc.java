import java.io.*;

class abc{
    public static void main (String h[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter your first number");
        String st=br.readLine();
        int a=Integer.parseInt(st);
        
        System.out.println("enter your second number");
        String st1=br.readLine();
        int b=Integer.parseInt(st1);
        
        System.out.println("enter your third number");
        String st2=br.readLine();
        int c=Integer.parseInt(st2);
        
        if(a>b && a>c)
        {
            System.out.println("a is greater number ="+a);
        }
        else
        {
            if(b>c)
            {
             System.out.println("b is greater number  ="+b);
            }
        else
        { 
            System.out.println("c is greater number ="+c);
        }
    }
}
}