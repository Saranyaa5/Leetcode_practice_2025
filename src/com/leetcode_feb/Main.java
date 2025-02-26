package com.leetcode_feb;
class Animal {

void jump() {

System.out.println(ConsoleColors.YELLOW+"Animal"+ConsoleColors.RESET);
}
}
class Cat extends Animal { void jump(int a) {

System.out.println(ConsoleColors.YELLOW+"Cat"+ConsoleColors.RESET+"in this class");

}
}
class Rabbit extends Animal { void jump() {

System.out.println("Rabbit");

}
}
public class Main{

public static void main(String args[]) { Animal cat = new Cat(); Rabbit rabbit = new Rabbit(); cat.jump();

rabbit.jump();

}

}
