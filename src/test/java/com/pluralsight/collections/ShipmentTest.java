package com.pluralsight.collections;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;

public class ShipmentTest {
    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() throws Exception {
        this.shipment.add(door);
        this.shipment.add(window);

        assertThat(shipment, contains(door, window));
    }
}
