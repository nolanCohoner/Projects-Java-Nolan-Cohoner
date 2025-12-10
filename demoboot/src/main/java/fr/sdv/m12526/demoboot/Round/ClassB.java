package fr.sdv.m12526.demoboot.Round;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {

    private ClassA classA;

    @Autowired
    public ClassB(ClassA classA) {
        this.classA = classA;
    }

}
