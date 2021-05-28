package software.crafting.serbia;

public class Item {

  public String name;

  public int sellIn;

  public int quality;

  protected Item(String name, int sellIn, int quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
  }

  public static Item createItem(String name, int sellIn, int quality) {
    if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
      return new BackstagePasses(sellIn, quality);
    }
    return new Item(name, sellIn, quality);
  }

  @Override
  public String toString() {
    return this.name + ", " + this.sellIn + ", " + this.quality;
  }

  public void updateQuality() {
    switch (name) {
      case "Aged Brie":
        if (quality < 50) {
          quality = quality + 1;

        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
          if (quality < 50) {
            quality = quality + 1;
          }
        }
        break;
      case "Sulfuras, Hand of Ragnaros":

        break;
      default:
        if (quality > 0) {
          quality = quality - 1;
        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
          if (quality > 0) {
            quality = quality - 1;
          }
        }
        break;
    }
  }
}
