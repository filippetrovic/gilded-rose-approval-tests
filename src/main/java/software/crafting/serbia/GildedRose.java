package software.crafting.serbia;

public class GildedRose {

  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
      updateQuality(item);
    }
  }

  private void updateQuality(Item item) {
    switch (item.name) {
      case "Backstage passes to a TAFKAL80ETC concert":
        if (item.quality < 50) {
          item.quality = item.quality + 1;

          if (item.sellIn < 11) {
            if (item.quality < 50) {
              item.quality = item.quality + 1;
            }
          }

          if (item.sellIn < 6) {
            if (item.quality < 50) {
              item.quality = item.quality + 1;
            }
          }
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
          item.quality = item.quality - item.quality;
        }
        break;
      case "Aged Brie":
        if (item.quality < 50) {
          item.quality = item.quality + 1;

        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
          if (item.quality < 50) {
            item.quality = item.quality + 1;
          }
        }
        break;
      case "Sulfuras, Hand of Ragnaros":

        break;
      default:
        if (item.quality > 0) {
          item.quality = item.quality - 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
          if (item.quality > 0) {
            item.quality = item.quality - 1;
          }
        }
        break;
    }
  }

}