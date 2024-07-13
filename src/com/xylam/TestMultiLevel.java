package com.xylam;
 
class TestMultiLevel {
    public static void main(String args[]){
        Colt c = (Colt)new Horse();
        
        //Animal
        //Horse
        c.desc();
        c.call();
        c.eat();
    }
}