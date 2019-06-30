package software.crafting.serbia.item;

import software.crafting.serbia.attribute.Quality;

public class BackstagePasses extends Item {

  BackstagePasses(String name, int sellIn, Quality quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void update() {

    sellIn = sellIn - 1;

    if (sellIn < 0) {
      noQuality();
    } else if (sellIn < 5) {
      increaseQuality(3);
    } else if (sellIn < 10) {
      increaseQuality(2);
    } else {
      increaseQuality(1);
    }

  }

}
