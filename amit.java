import java.io.*;

class amit {
    public static void main (String []h) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" enter number");
        String st=br.readLine();
        int x=Integer.parseInt(st);

        System.out.println(" enter power value");
        String st1=br.readLine();
        int y=Integer.parseInt(st1);
        
        int p=1;
        do{
            p=p*x;
            y--;
            System.out.println("power ="+p);
           
        }
        while(y>0);
    }
}