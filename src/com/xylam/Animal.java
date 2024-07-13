package com.xylam;
 
class Animal {
    void eat(){
      System.out.println("Animals eat");
  }
}
 
class Horse extends Animal {
  void call(){
     System.out.println("Horses neigh");
  }
}
 
class Colt extends Horse {
   void desc(){
     System.out.println("Colts are baby horses");
  }
}

 