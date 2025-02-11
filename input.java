import java.io.*;

class input
{
    public static void main(String h[]) throws IOException 
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first subject marks");
        String st=br.readLine();
        int x=Integer.parseInt(st);

        System.out.println("Enter second subject marks");
        String st1=br.readLine();
        int y=Integer.parseInt(st1);
        
        System.out.println("Enter thrid");
        String st2=br.readLine();
        int z=Integer.parseInt(st2);

        System.out.println("Enter fourth");
        String st3=br.readLine();
        int a=Integer.parseInt(st3);

        System.out.println("Enter fifth");
        String st4=br.readLine();
        int b=Integer.parseInt(st4);

        int s=x+y+z+a+b;
        int p=s/5;
        System.out.println("sum = "+s);
        System.out.println("average marks = "+p);
        if(p>=33){
            System.out.println("student is promoted to next class");
        }
        else{
            System.out.println("student is failed");
        }
    }
}