package software.crafting.serbia.item;

public class Item {

  public String name;

  public int sellIn;

  public int quality;

  Item(String name, int sellIn, int quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
  }

  public static Item createItem(String name, int sellIn, int quality) {
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
    return this.name + ", " + this.sellIn + ", " + this.quality;
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
    quality = quality - decrement;
    if (quality < 0) {
      quality = 0;
    }
  }

  protected void noQuality() {
    quality = 0;
  }

  protected void increaseQuality(int increment) {
    quality += increment;

    if (quality > 50) {
      quality = 50;
    }
  }
}
