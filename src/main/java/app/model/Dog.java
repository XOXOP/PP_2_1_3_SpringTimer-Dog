package app.model;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("dog")
public class Dog extends Animal{
    public Dog(){ System.out.println("dog ben is created");}



}
/* private String saing;


    public Dog(String saing) {
        this.saing = saing;
    }
    @Override
    void say() {
        System.out.println(saing);
    }
    @Override
    public String toString() {
        return "Im a Dog";
    }*/