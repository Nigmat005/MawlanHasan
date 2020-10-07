package day59_OOPReview;
import java.time.LocalDate;
/*
OOP: design pattern of the application in organized and modular way
    Encapsulation, Inheritance, Abstraction, Polymorphism
    Encapsulation: hiding the data by using private, generate public getter & setter instance methods
            getter(READ ONLY): return the private data
            setter(WRITE ONLY): assigning the argument to the private variable
            IF PRIVATE DATA IS FINAL, WE CAN ONLY GENERATE GETTER

 */
public class Encapsulation {

    private int ssn;
    private LocalDate Published= LocalDate.of(2020,6,17);

    public int getSsN(){ // read only
        return ssn;
    }
    public void setSsn(int ssn){ // modify only
        this.ssn=ssn;
    }

    public LocalDate getPublished(){
        return Published;
    }

}
