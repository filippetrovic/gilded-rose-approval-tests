package software.crafting.serbia;

public class BackstagePasses extends Item {

  protected BackstagePasses(int sellIn, int quality) {
    super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
  }


  @Override
  public void updateQuality() {
    if (quality < 50) {
      quality = quality + 1;

      if (sellIn < 11) {
        if (quality < 50) {
          quality = quality + 1;
        }
      }

      if (sellIn < 6) {
        if (quality < 50) {
          quality = quality + 1;
        }
      }
    }

    sellIn = sellIn - 1;

    if (sellIn < 0) {
      quality = quality - quality;
    }
  }
}
