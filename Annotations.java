// Annotations simple means a supplement to the compliler or to the runtime

// @Override one of the annotations

class A{
    public void showthedatabelongstothisclass(){  // you can see here the method name is big
        System.out.println("i am in show A");
    }
}

class B extends A{
    
    @Override        // this will say that if you enter the override method correctly or not as it is a big name we make make mistakes
    public void showthedatabelongstothisclass(){
        System.out.println("i am in show B");
    }
}

public class Annotations {
    public static void main(String[] args) {
        B object = new B();

        object.showthedatabelongstothisclass();
    }
}   
