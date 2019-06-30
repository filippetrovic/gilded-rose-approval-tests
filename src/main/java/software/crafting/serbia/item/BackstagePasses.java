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
      quality.noQuality();
    } else if (sellIn < 5) {
      quality.increase(3);
    } else if (sellIn < 10) {
      quality.increase(2);
    } else {
      quality.increase(1);
    }

  }

}
