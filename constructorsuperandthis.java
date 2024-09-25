package ConstructorPractise;
class constructorsuperandthis{

        public constructorsuperandthis(){
            this(100);
            System.out.println("This is default constructor of ASDF class");
        }
        public constructorsuperandthis(int a){
            System.out.println("This is Parameterized constructor of ASDF class takes int param");
        }
    }
    class ThisSuperMixTest extends constructorsuperandthis{
        public ThisSuperMixTest(){
            this("Java");
            System.out.println("This default constructor of class ThisSuperMixTest");
        }
        public ThisSuperMixTest(String name){
            System.out.println("This Parameterized constructor of class ThisSuperMixTest");
        }
        public static void main(String[] args) {
            ThisSuperMixTest obj = new ThisSuperMixTest("meera");
            // ASDF a = new ASDF(100);
        }
    }
