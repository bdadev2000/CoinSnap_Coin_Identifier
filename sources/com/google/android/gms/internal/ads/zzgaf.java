package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzgaf extends AbstractCollection {
    final /* synthetic */ zzgag zza;

    public zzgaf(zzgag zzgagVar) {
        this.zza = zzgagVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzgag zzgagVar = this.zza;
        Map zzl = zzgagVar.zzl();
        return zzl != null ? zzl.values().iterator() : new zzfzz(zzgagVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
