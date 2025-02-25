class Outer {
   public void outercl() {
      int x=10;
      System.out.println("Outer class method");
   
      class Inner {
         public void Innercl() {
         System.out.println("x = "+x);
         //System.out.println("Inner class method");
      }
}
   Inner y = new Inner();
   y.Innercl();
}
}
class nitro {
public static void main(String[] args) {
   Outer z = new Outer();
   z.outercl();
}
}