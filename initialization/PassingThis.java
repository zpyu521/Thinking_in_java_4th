package initialization;//: initialization/PassingThis.java

class Person {
  public void eat(Apple apple) {
    Apple peeled = apple.getPeeled();
    System.out.println("Yummy");
  }
}

class Peeler {
  static Apple peel(Apple apple) {
    // ... remove peel
    return apple; // Peeled
  }
}



public class PassingThis {
  public static void main(String[] args) {
    new Person().eat(new Apple());
  }
}
class Apple {
  Apple getPeeled() { return Peeler.peel(this); }
}

/* Output:
Yummy
*///:~
