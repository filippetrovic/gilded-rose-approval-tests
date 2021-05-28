package software.crafting.serbia;

public class AgedBrie extends Item {

  protected AgedBrie(int sellIn, int quality) {
    super("Aged Brie", sellIn, quality);
  }

  @Override
  public void updateQuality() {
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
