import java.io.*;

class nsp {
    public static void main (String h[]) throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

        System.out.println("enter your first number");
        String st=br.readLine();
        int a=Integer.parseInt(st);

        System.out.println("enter your first number");
        String st2=br.readLine();
        int b=Integer.parseInt(st2);

        System.out.println("enter your first number");
        String st3=br.readLine();
        int c=Integer.parseInt(st3);

        System.out.println("enter your first number");
        String st4=br.readLine();
        int d=Integer.parseInt(st4);

        if(a>b && a>c && a>d)
        {
            System.out.println("a is greater number "+a);
        }
        else{
            if(b>c && b>d){
                System.out.println("B is greater number "+b);
            }        
            else{
                if(c>d){
                    System.out.println("C is greater number "+c);
                }
                else{
                    System.out.println("D is greater number "+d);
                }
            }
        }
    
    
    
    
    
    }
}