package software.crafting.serbia.item;

public class BackstagePasses extends Item {

  BackstagePasses(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void update() {
    if (quality < 50) {
      quality = quality + 1;

      if (sellIn < 11) {
        if (quality < 50) {
          quality = quality + 1;
        }
      }

      if (sellIn < 6) {
        if (quality < 50) {
          quality = quality + 1;
        }
      }
    }

    sellIn = sellIn - 1;

    if (sellIn < 0) {
      quality = 0;
    }
  }
}
