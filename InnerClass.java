public class InnerClass {  // A class inside an class
    public static void main(String[] args) {
        A obj = new A();

        obj.show();

        A.B obj2 = obj.new B();  // B class belongs to A class so you need the obj of A to call B class
                                 // if you have Static for B class you dont need the obj of A
                                 // -> A.B obj2 = new A.B();
                                 // static can be only used for the inner class not for other(main) class

        obj2.config();
    }
}

class A{

    int age;

    public void show(){
        System.out.println("in show");
    }

    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}
