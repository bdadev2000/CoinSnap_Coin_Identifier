package com.amazonaws.services.s3.model.lifecycle;

import java.io.Serializable;

/* loaded from: classes7.dex */
public abstract class LifecycleFilterPredicate implements Serializable {
    public abstract void accept(LifecyclePredicateVisitor lifecyclePredicateVisitor);
}
