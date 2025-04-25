package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class InventorySchedule implements Serializable {
    private String frequency;

    public String getFrequency() {
        return this.frequency;
    }

    public void setFrequency(String str) {
        this.frequency = str;
    }

    public void setFrequency(InventoryFrequency inventoryFrequency) {
        String inventoryFrequency2;
        if (inventoryFrequency == null) {
            inventoryFrequency2 = null;
        } else {
            inventoryFrequency2 = inventoryFrequency.toString();
        }
        setFrequency(inventoryFrequency2);
    }

    public InventorySchedule withFrequency(String str) {
        setFrequency(str);
        return this;
    }

    public InventorySchedule withFrequency(InventoryFrequency inventoryFrequency) {
        setFrequency(inventoryFrequency);
        return this;
    }
}
