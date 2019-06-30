package software.crafting.serbia.attribute;

public class Quality {

  private final int value;

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

  public Quality minimum() {
    return new Quality(0);
  }

  public Quality decrease(int decrement) {
    return Quality.of(value - decrement);
  }

  public Quality increase(int increment) {
    return Quality.of(value + increment);
  }

  public int asInt() {
    return value;
  }
}
