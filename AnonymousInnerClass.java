public class AnonymousInnerClass {
    public static void main(String[] args) {
        A Obj = new A(){
            public void show(){           // here you are changing the method propose that is call 
                System.out.println("in B Show"); // AnonymousInnerClass where you dont need to create
            }                                      // create an extra class just to overide an single
        };                                         // method.
        Obj.show();
    }

}

class A{
    public void show(){
        System.out.println("in A Show");
    }
}
