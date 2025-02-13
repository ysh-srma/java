
public class o {
    void get()
    {
        System.out.println("Computer");
    }

    void get(int a)
    {
        System.out.println("a ="+a);
    }

    void get(int a, int b)
    {
        System.out.println("a ="+a+" b ="+b);
    }
    public static void main(String[] args) {
      
        o p=new o();
        p.get();
        p.get(90);
        p.get(88,99);  
    }
}

