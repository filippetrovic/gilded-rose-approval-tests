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
      quality.increase(2);
    } else {
      quality.increase(1);
    }
  }

}
