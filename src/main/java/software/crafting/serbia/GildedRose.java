package software.crafting.serbia;

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