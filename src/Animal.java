import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Animal {
  private final int lengthRun;
  private final int lengthJump;
  private final int lengthSwim;

  public abstract void run(int length);

  public abstract void jump(double length);

  public abstract void swim(int length);
}
