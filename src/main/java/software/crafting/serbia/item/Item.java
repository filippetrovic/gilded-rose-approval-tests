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
    if (quality > 0) {
      quality = quality - 1;
    }

    sellIn = sellIn - 1;

    if (sellIn < 0) {
      if (quality > 0) {
        quality = quality - 1;
      }
    }
  }
}
