package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzgak extends AbstractCollection {
    final /* synthetic */ zzgal zza;

    public zzgak(zzgal zzgalVar) {
        this.zza = zzgalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzgal zzgalVar = this.zza;
        Map zzl = zzgalVar.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzgae(zzgalVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
