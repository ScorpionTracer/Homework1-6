public class Dog extends Animal {
  private static final int MAX_LENGTH_RUN = 500;
  private static final double MAX_LENGTH_JUMP = 0.5;
  private static final int MAX_LENGTH_SWIM = 10;

  public Dog(int lengthRun, int lengthJump, int lengthSwim) {
    super(lengthRun, lengthJump, lengthSwim);
  }

  @Override
  public void run(int length) {
    System.out.println("Dog run: " + (length < MAX_LENGTH_RUN));
  }

  @Override
  public void jump(double length) {
    System.out.println("Dog jump: " + (length < MAX_LENGTH_JUMP));
  }

  @Override
  public void swim(int length) {
    System.out.println("Dog swim: " + (length < MAX_LENGTH_SWIM));
  }
}
