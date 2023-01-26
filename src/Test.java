public class Test {
  public static void main(String[] args) {
    var catOne = new Cat(100,200,300);
    var catTwo = new Cat(200,200,300);
    var dogOne = new Dog(150,50,20);
    var dogTwo = new Dog(200,150,20);
    catOne.jump(1);
    catTwo.swim(100);
    catOne.run(100);
    dogOne.run(100);
    dogTwo.swim(100);
    dogTwo.jump(100);
  }
}
