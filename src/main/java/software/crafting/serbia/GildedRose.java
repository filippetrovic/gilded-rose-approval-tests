package software.crafting.serbia;

import software.crafting.serbia.item.Item;

public class GildedRose {

  private Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
      item.update();
    }
  }

}