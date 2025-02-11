class start 
{
    public static void main(String []args)
    {
        double bs,da,hr,net;
        bs=5000;
        da=bs*.05;
       hr=bs*.06;
        net=bs+da+hr;
       
        System.out.println("net = "+net);
        System.out.println("da = "+da);
        System.out.println("house rent = "+hr);
    }
}