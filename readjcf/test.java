public class Increment {
  private int num;

  public Increment(int num) {
    this.num = num;
  }

  public int increment(int add) {
    num += add;
    return num;
  }
}
