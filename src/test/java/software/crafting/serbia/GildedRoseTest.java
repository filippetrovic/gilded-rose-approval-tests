package software.crafting.serbia;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.legacycode.Range;
import org.junit.Test;
import software.crafting.serbia.attribute.Quality;
import software.crafting.serbia.item.Item;

public class GildedRoseTest {

  @Test
  public void approvalTestFixtureForGildedRose() {
    // Given
    final String[] names = {
        "",
        "name",
        "Aged Brie",
        "Backstage passes to a TAFKAL80ETC concert",
        "Sulfuras, Hand of Ragnaros"
    };

    Integer[] qualities = Range.get(0, 50);

    Integer[] sellIns = Range.get(-30, 30);


    // Then
    CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualities, sellIns);

  }

  private String doStuff(String name, Integer quality, Integer sellIn) {
    Item[] items = new Item[]{
        Item.createItem(name, sellIn, Quality.of(quality))
    };

    final GildedRose gildedRose = new GildedRose(items);

    gildedRose.updateQuality();

    return items[0].toString();
  }
}
