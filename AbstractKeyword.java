abstract class car{  // you can have abstract class without an abstract method there is no problem,
                    // but you should have abstract class if you have an abstract method
    public abstract void drive();

    public void music(){
        System.out.println("play music");
    }
}

class verna extends car{   // if you are extending an abstract class you need to have that method
                            // you need to have that abstract method in this class otherwise it will give you error
    public void drive(){
        System.out.println("i Know how to drive");
    }
}


public class AbstractKeyword {
    public static void main(String[] args) {
        // car obj = new car();  // you can create object for an abstarct class 

        verna obj = new verna(); // if you want to create an object you should go for the class which extends the abstract class
        obj.drive();
        obj.music();
    }
}