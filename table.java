class rahul{
    int a=900;
    int b=90;
}
class sum extends rahul
{
    int s;
    public void show()
    {
        s=a+b;
         System.out.println("sum =" +s);
    }
}
0
class multiply extends rahul
{
    int u;
    public void show()
    {
        u=a*b;
         System.out.println("multiply =" +u);
    }
}
class subtract extends rahul
{
    int v;
    public void show()
    {
        v=a-b;
         System.out.println("subtract =" +v);
    }
}

class divide extends rahul
{
    int w;
    public void show()
    {
        w=a/b;
         System.out.println("divide =" +w);
    }
}


class table
    {
        public static void main(String h[]) 
        {
            sum m=new sum();
            m.show();
        
            multiply n=new multiply();
            n.show();

            subtract v=new subtract();
            v.show();

            divide w=new divide();
            w.show();
        }
    }