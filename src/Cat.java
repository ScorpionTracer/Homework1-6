public class Cat extends Animal {
  private static final int MAX_LENGTH_RUN = 200;
  private static final int MAX_LENGTH_JUMP = 2;
  private static final boolean MAX_LENGTH_SWIM = false;

  public Cat(int lengthRun, int lengthJump, int lengthSwim) {
    super(lengthRun, lengthJump, lengthSwim);
  }

  @Override
  public void run(int length) {
    System.out.println("Cat run: " + (length < MAX_LENGTH_RUN));
  }

  @Override
  public void jump(double length) {
    System.out.println("Cat jump: " + (length < MAX_LENGTH_JUMP));
  }

  @Override
  public void swim(int length) {
    System.out.println("Cat swim: " + MAX_LENGTH_SWIM);
  }
}
