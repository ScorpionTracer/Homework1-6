import java.util.Random;

public class Test {
  public static Random random = new Random();

  public static void main(String[] args) {

    var cat1 = new Cats(random.nextInt(500), random.nextInt(500), random.nextInt(500));
    var dog1 = new Dogs(random.nextInt(500), random.nextInt(500), random.nextInt(500));

    cat1.jump(100);
    dog1.run(100);
  }
}
