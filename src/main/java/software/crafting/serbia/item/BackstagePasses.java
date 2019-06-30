package software.crafting.serbia.item;

public class BackstagePasses extends Item {

  BackstagePasses(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void update() {

    if (sellIn < 6) {
      incrementQuality();
      incrementQuality();
      incrementQuality();
    } else if (sellIn < 11) {
      incrementQuality();
      incrementQuality();
    } else {
      incrementQuality();
    }

    sellIn = sellIn - 1;

    if (sellIn < 0) {
      quality = 0;
    }
  }
}
