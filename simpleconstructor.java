package ConstructorPractise;

public class simpleconstructor {
        int a;
        long c;
        public simpleconstructor(){
            System.out.println("we need constructor for object creation ");
        }
        void setname()
        {
            System.out.println("dbcjnc");
        }
        public  simpleconstructor(int a,String name){
            System.out.println("constructor name is same as class name");

        }

        public static void main(String args[])
        {
            simpleconstructor pqr = new simpleconstructor(1,"mehar");


        }
    }
