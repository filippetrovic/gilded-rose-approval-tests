package software.crafting.serbia.item;

import software.crafting.serbia.attribute.Quality;

public class Item {

  public String name;

  public int sellIn;

  public Quality quality;

  Item(String name, int sellIn, Quality quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
  }

  public static Item createItem(String name, int sellIn, Quality quality) {
    switch (name) {
      case "Aged Brie":
        return new AgedBrie(name, sellIn, quality);
      case "Backstage passes to a TAFKAL80ETC concert":
        return new BackstagePasses(name, sellIn, quality);
      case "Sulfuras, Hand of Ragnaros":
        return new Sulfuras(name, sellIn, quality);
      default:
        return new Item(name, sellIn, quality);
    }

  }

  @Override
  public String toString() {
    return this.name + ", " + this.sellIn + ", " + this.quality.asInt();
  }

  public void update() {
    sellIn = sellIn - 1;

    if (sellIn < 0) {
      decreaseQuality(2);
    } else {
      decreaseQuality(1);
    }
  }

  private void decreaseQuality(int decrement) {
    quality.decrease(decrement);
  }

  protected void noQuality() {
    quality.noQuality();
  }

  protected void increaseQuality(int increment) {
    quality.increase(increment);
  }
}
