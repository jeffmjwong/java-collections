package com.pluralsight.collections;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static com.pluralsight.collections.ProductFixtures.door;
import static com.pluralsight.collections.ProductFixtures.floorPanel;
import static com.pluralsight.collections.ProductFixtures.window;
import static com.pluralsight.collections.ProductFixtures.bobs;
import static com.pluralsight.collections.ProductFixtures.kates;

public class ProductCatalogueTest {
    @Test
    public void shouldOnlyHoldUniqueProducts() {
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.getProducts(), containsInAnyOrder(door, floorPanel, window));
    }
}
