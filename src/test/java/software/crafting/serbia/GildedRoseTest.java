package software.crafting.serbia;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

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
    assertThat(items[0].name)
        .isEqualTo("name");

  }
}
