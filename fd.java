class fd{
public static void main (String h[])
{
    int n=9876,a,b,c,d,sum,rev;
    a=n%10;
    n=n/10;
    b=n%10;
    n=n/10;
    c=n%10;
    n=n/10;
    d=n%10;
    n=n/10;
    sum=a+b+c+d;
    rev=a*1000+b*100+c*10+d;
    System.out.println("sum of 4 digit number ="+sum);
    System.out.println("reverse of 4 digit number ="+rev);
}
}