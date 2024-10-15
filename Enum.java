// Enums are named constants which we create
// When you want to return a status to the client who can simple return Status enum  
// enum is a class , but u cant extend enum with other class
// as enum is a class we can create constructors , veriables inside the enum;
// every class has some inbuild methods , so enums also as some inbuilt method (check line 64)

enum Status{  // here Status is class
    Running, failed, pending, success // and all these are objects of the class
//     0       1        2       3
}

enum Status2{
    Running, failed, pending, success  
}

enum Laptops{
    Mackbook(2000) , XPS(2200) , Surface , Thinkpad(1800); // these are the objects with prices so we neec to create an constructor
    // check line 81
    private int price;

    private Laptops(){  // default constructor
        price = 1500;
    }

    private Laptops(int price){
        this.price = price;
    }

    public int getprice(){
        return price;
    }
}

public class Enum {
    public static void main(String[] args) {
        Status r = Status.Running;
        System.out.println(r);
        System.out.println(r.ordinal());  // ordinal means position of an enum constant
        Status s = Status.success;
        System.out.println(s);
        System.out.println(s.ordinal()); // the output with me 3 as success constant is in 3rd position
        // if we want to print all the status we have to use values() method which is from enum Status class
        // the output will be in array form so use array[]
        Status[] all = Status.values();
        for(Status A : all){
            System.out.println(A);
        }

        // using enums with ifelse and switch
        // we can compare the constants for example 

        // ifelse
        Status2 ss = Status2.Running;   // the output will be "It is working Good" as it is in running status
        
        if(ss == Status2.Running){
            System.out.println("It is working Good");
        }else if(ss == Status2.failed){
            System.out.println("It has failed");
        }else if(ss == Status2.pending){
            System.out.println("please wait");
        }else{
            System.out.println("Done");
        }

        // swtich

        Status2 sss = Status2.success;
        switch(sss){
            case Running:
                System.out.println("It is working Good");
                break;
            case failed:
                System.out.println("It has failed");    
                break;
            case pending:
                System.out.println("please wait");   
                break;
            default: 
                System.out.println("Done");
                break;
            }

            System.out.println(sss.getClass().getSuperclass()); // here we get the outout of the enums super class

            Laptops lap = Laptops.Mackbook;
            System.out.println(lap + " " + lap.getprice());

            Laptops[] ALLprices = Laptops.values();

            for(Laptops All : ALLprices){
                System.out.println(All + " " + All.getprice());
            }

            

    }
}
