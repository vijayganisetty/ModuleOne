package com.practice.spring.vijay.ModuleOne.homework;


import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake(){
        frosting.getFrostingType();

        System.out.println("baking cake with "+frosting.getFrostingType()+" and "+syrup.getSyrupType());
    }
}
