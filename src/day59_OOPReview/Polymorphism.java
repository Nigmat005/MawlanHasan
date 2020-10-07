package day59_OOPReview;
import day55_Abstraction.ShapesTask.Circle;
import day55_Abstraction.ShapesTask.Rectangle;
import day55_Abstraction.ShapesTask.Shape;
/*
 Polymorphism:  behaviors of the objects in many forms
                parent is being refrenced to child class' objects
                A obj = new B();
                WebDriver driver =new ChromeDriver();
                List list = new ArrayList();
                ...
                    driver.get(URL)
                    Always the overriden one gets executed
                    if it's not overiden will execute parent' version
                    class A{
                        x
                    }
                    class B extends A{
                        y
                    }
                    A obj = new B();
                    obj.x
                    // obj.y
                    ( (B)obj ).y
                    Animal{
                        sleep();
                    }
                    Dog extends Animal{
                        bark();
                    }
                    Animal  animal = new Dog();
                        animal.sleep();
                        // animal.bark();
                        ( (Dog)animal ).bark();
                        ( (Cat)animal ).scartch();  // class cast exception
                    WebDriver driver = new ChromeDriver();
                    // driver.takeScreenShot
                    ( (TakeScreenShot)driver).takeScreenShot()

 */
public class Polymorphism {
    public static void main(String[] args) {
        Shape shape1 = new Circle(3);
   //   System.out.println(shape1.r);
        System.out.println(   (  (Circle)shape1).radius  );
  //    System.out.println(((Rectangle)shape1).length);

        Rectangle r1=new Rectangle(3,5);
        Shape shape2=(Shape)r1; // upcasting

    }
}
