package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/* loaded from: classes7.dex */
public abstract class InventoryFilterPredicate implements Serializable {
    public abstract void accept(InventoryPredicateVisitor inventoryPredicateVisitor);
}
