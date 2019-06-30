package software.crafting.serbia;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void approvalTestFixtureForGildedRose() {
    // Given
    final String[] names = {
        "name"
    };

    // Then
    CombinationApprovals.verifyAllCombinations(this::doStuff, names);

  }

  private String doStuff(String name) {
    Item[] items = new Item[]{
        new Item(name, 0, 0)
    };

    final GildedRose gildedRose = new GildedRose(items);

    gildedRose.updateQuality();

    return items[0].toString();
  }
}
