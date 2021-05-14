// class A
// {

// }
// class B{}
// class C{}
public class MainClass2 {
    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();
        C c1=new C();
        // DataMembers Of A 
        System.out.println("Datamembers of A");
        System.err.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.c);
        // DataMembers Of B 
        System.out.println("Datamembers of B");
        System.out.println(b1.a);
        System.out.println(b1.d);
        System.out.println(b1.e);
        // DataMembers Of C
        System.out.println("Datamembers of C");
        System.out.println(c1.a);
        System.out.println(c1.f);
        System.out.println(c1.g);
        System.out.println("___________________");
        // Caling B instance with help of C
        // A child can  access parent methods a datamembers
        // But a parent cannot access a child methods easily
        B b2=new C();
        A a2=new B();
        System.out.println(b2.a);
        System.out.println(b2.e);
        System.out.println("___________________");
        System.out.println(a2.b);
        System.out.println(a2.c);


        
    }
}
