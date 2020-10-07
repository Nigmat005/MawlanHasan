package day59_OOPReview;
/*
  Abstraction: hiding the implementation
                    focusing on essentials, without worrying about the details
                abstract method: without the body
                                meant to be overriden
                2 ways:
                    abstract class: not concrete, cannot create object
                                    meant to be extended
                            class can extend one abstract class
                    interface: not a class
                            class can implement multiple interfaces
                            we cannot have:
                                    instance variables
                                    instance methods
                                    constructor
                                    blocks
                    extends vs implements
                            class   implements  interface
                            class   extends     class
                            interface  extends    interface
                            class    extends   class    implements     interface
                            class   implements  interface1, interface2 ....
        WebDriver
            get(URL);
        chrome: get(URL){ }
        firefox: get(URL){ }
        edge: get(URL){ }
        ie: get(URL){ }
        safari: get(URL){ }
            interface downloadable:
                    download();
            interface AppleApp extends downloadable{

            }
            interface AndroidApp extends downloadable{

            }
            class Iphone extends Phone implements AppleApp{

            }
            class Samsung extends Phone implemnts AndroidApp{

            }
            class Test {
                WebDriver driver;
            }
            interface flyable{
                fly();
            }
            interface Predator{
                hunting();
            }
            interface swim{
                    swim();
            }
            abstract class Animal{
                eat();
                drink();

            }
            class Tiger extends Animal implements Predator{
                    eat(){ }
                    drink(){ }
                    hunting(){ }
            }
            class Dog extends Animal{
                eat(){}
                drink(){}
            }
            class Eagle extends Animal implements flyable, Predator {
                    eat(){ }
                    drink(){ }
                    fly(){ }
                    hunting(){ }
            }
            interfaces or abstract class i have used:
                    WebElement
                    WebDriver
                    By
                    Alert
                    List
                    ...
 */
interface X{
    public abstract void method1(); // abs method
    void method2(); // abs method

    int a =100; // by default it is public static final so you have to initialize them
    static int b=200; // you have to initialize them, by default it is public static final
/*
    Y(){

    }

    static{

    }
    */
}

abstract class Y{
    public abstract void method1();
    int a =100; // you don't have to initialize it
    static int b=200;

    Y(){

    }

    static{

    }


}

public class Abstraction {
    public static void main(String[] args) {
    //  X object2=new X(); interface is not a class
    //  Y object=new Y();  can not have object

    }

}
