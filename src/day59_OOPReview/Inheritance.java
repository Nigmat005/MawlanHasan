package day59_OOPReview;
/*
 Inheritance: build parent(super) & sub(child) relations (IS A relation)
            super class: cannot inherit from sub
            sub class: can inherit from super class ( visible methods & variables)
            advantage:
                    east to maintain
                    reusable
                    readable, clear,clean, less codes..
            method overriding: MUST happen in subclass
            Class B
            Class  A  extends   B
                  sub          super
            11 sub classes
            10 @BeforeMethod or 1
                TestBase (super)
                    setup:
                        setup the browser
                        open brwoser
                        maxmize window
                        implicit wait
                        go to URL
                        log in
                    1 sub class does not require maximize window
                            @Override
                            setup:
                                setup the browser
                                open brwoser
                                implicit wait
                                go to URL
                                log in
 */
class A{

    private int a=100;
    int b=200;
    protected int c=300;
    public int d=400;

    private void method1(){

    }
    void method2(){}
    protected void method3(){
        System.out.println("Hello World");
    }
    public void method4(){}
}

public class Inheritance extends A{

    @Override
    public void method3(){
        System.out.println("Hello Cybertek");
    }

    public static void main(String[] args) {

        Inheritance object=new Inheritance();
    //  System.out.println(object.a);  private can not be inherited
        System.out.println(object.b);
        System.out.println(object.c);
        System.out.println(object.d);

    //  object.method1(); private can not be inherited
        object.method2();
        object.method3();
        object.method4();

    }
}
