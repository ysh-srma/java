import java.io.*;

class gn {
public static void main(String []h )throws IOException
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter the number");
    int a = Integer.parseInt(br.readLine());
   
    int i ; 
    for(i=1; i<=10; i++){
        System.out.println(a+"*"+i+"="+a*i);
    }
    
}   
}