package software.crafting.serbia;

public class GildedRose {

  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
      loopBody(item);
    }
  }

  private void loopBody(Item item) {
    item.update();
  }

}