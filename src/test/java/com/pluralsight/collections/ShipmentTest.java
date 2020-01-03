package com.pluralsight.collections;

import org.junit.Test;

import static com.pluralsight.collections.ProductFixtures.door;
import static com.pluralsight.collections.ProductFixtures.window;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;

public class ShipmentTest {
    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() throws Exception {
        shipment.add(door);
        shipment.add(window);

        assertThat(shipment, contains(door, window));
    }
}
