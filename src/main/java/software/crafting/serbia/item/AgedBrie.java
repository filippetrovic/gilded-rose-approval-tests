package software.crafting.serbia.item;

import software.crafting.serbia.attribute.Quality;

public class AgedBrie extends Item {

  public AgedBrie(String name, int sellIn, Quality quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void update() {

    sellIn = sellIn - 1;

    if (sellIn < 0) {
      increaseQuality(2);
    } else {
      increaseQuality(1);
    }
  }

}
