package software.crafting.serbia;

public class AgedBrie extends Item {

  public AgedBrie(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void update() {
    if (quality < 50) {
      quality = quality + 1;
    }

    sellIn = sellIn - 1;

    if (sellIn < 0) {
      if (quality < 50) {
        quality = quality + 1;
      }
    }
  }
}