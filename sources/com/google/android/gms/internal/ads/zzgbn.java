package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* loaded from: classes3.dex */
abstract class zzgbn extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return zzgbq.zze(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
