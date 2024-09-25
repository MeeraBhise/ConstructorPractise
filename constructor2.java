package ConstructorPractise;

public class constructor2 {
    public constructor2(){
        System.out.println("default constructor");
    }
    public constructor2(int a,String name)
    {
        System.out.println("parameterized constructor");
    }
    public void method()
    {
        System.out.println("method ");
    }
    public static void main(String args[])
    {
        // Simpleconst s = new Simpleconst(1,"meera");
        constructor2 s = new constructor2();
        s.method();
    }
}
/*

public class constructor2{
    public constructor2()
    {
        super();
        System.out.println("constructor");
    }
    public constructor2(String s)
    {
        System.out.println("constructo09847");
    }
    public static void main(String[] args) {
        constructor2 s=new constructor2("meera");
    }
}
*/

