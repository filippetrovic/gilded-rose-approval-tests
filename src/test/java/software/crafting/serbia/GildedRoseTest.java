package software.crafting.serbia;

import org.approvaltests.Approvals;
import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void approvalTestFixtureForGildedRose() {
    // Given
    final String name = "name";

    // When
    String result = doStuff(name);

    // Then
    Approvals.verify(result);

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
