package software.crafting.serbia.attribute;

public class Quality {

  private int value;

  public Quality(int value) {
    this.value = value;
  }

  public static Quality of(Integer quality) {

    if (quality < 0) {
      return new Quality(0);
    }

    if (quality > 50) {
      return new Quality(50);
    }

    return new Quality(quality);
  }

  public void decrease(int decrement) {
    value = value - decrement;
    if (value < 0) {
      value = 0;
    }
  }

  public void noQuality() {
    value = 0;
  }

  public void increase(int increment) {
    value += increment;

    if (value > 50) {
      value = 50;
    }
  }

  public int asInt() {
    return value;
  }
}
