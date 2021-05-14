public class MainClass {
    public static void main(String[] args) {
         A a=new A();
         B b=new B();
         C c=new C();
         
         // Super class with refence of Child class
         // A parent instance can be called by Child Class
         //But the opp may give an runtime error 
         B d=new C(); 
         d.Vehicle();//Overrridden method by Child Class C
         A f=new B();
        f.Vehicle();//Overridden method by Child Class B
         // Methods in object
         a.Bus();
         a.Car();
         a.Vehicle();
         // Methods in object B
         b.Vehicle();
         b.Activa();
         b.Bike();
         // MEthods in Object C
         c.HeroHonda();
         c.MarutiSuzuki();
         c.Vehicle();

    }
}
