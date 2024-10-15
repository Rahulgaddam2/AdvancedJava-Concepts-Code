// Interface is not an class
// if you jave abstract method and if you dont want to use abstract class you can use interfaces



public interface Interface {  // by default every method in interface is an abstract class, we dont need to mention

    int age = 24;   // all the variable inside the interface is either static or final
    String name = "Rahul";
    public abstract void method();  // see here you are useing this method in Interface rather than class
    void method1(); // see here i am not using abstract keyword and i am not getting any errors because we are in interface
}

interface otherInterface {
        int age = 30;
        String name = "Sushma";

        public void method2();
    
}

class B implements Interface , otherInterface{ // to extend the Interface into class we using implements keyword rather than extends keyword
                                                // class -> class  use extends
                                                // class -> interface use implements
                                                // interface to interface use extends
    @Override
    public void method() {
        System.out.println("i am using method");
    }

    @Override
    public void method1() {
        System.out.println("i am using method1");
    }

    public void method2(){
        System.out.println("I my name is sushma");
    }
    
}


class Demo{
    public static void main(String[] args) {
        B obj = new B();

        obj.method();
        obj.method1();

        obj.method2();

        System.out.println(Interface.age);
        System.out.println(otherInterface.age);
    }
}