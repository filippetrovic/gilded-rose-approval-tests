package software.crafting.serbia.item;

public class AgedBrie extends Item {

  public AgedBrie(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void update() {

    sellIn = sellIn - 1;

    if (sellIn < 0) {
      incrementQuality();
      incrementQuality();
    } else {
      incrementQuality();
    }
  }

}
