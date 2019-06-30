package software.crafting.serbia.item;

public class BackstagePasses extends Item {

  BackstagePasses(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void update() {

    sellIn = sellIn - 1;

    if (sellIn < 5) {
      incrementQuality();
      incrementQuality();
      incrementQuality();
    } else if (sellIn < 10) {
      incrementQuality();
      incrementQuality();
    } else {
      incrementQuality();
    }

    if (sellIn < 0) {
      quality = 0;
    }
  }
}
