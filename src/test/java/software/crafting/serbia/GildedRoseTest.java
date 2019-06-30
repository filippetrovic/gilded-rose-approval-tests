package software.crafting.serbia;

import org.approvaltests.Approvals;
import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void approvalTestFixtureForGildedRose() {
    // Given
    Item[] items = new Item[]{
        new Item("name", 0, 0)
    };
    final GildedRose gildedRose = new GildedRose(items);

    // When
    gildedRose.updateQuality();

    // Then
    Approvals.verify(items[0].toString());

  }
}
