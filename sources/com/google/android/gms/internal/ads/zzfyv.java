package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzfyv extends AbstractCollection {
    final /* synthetic */ zzfyx zza;

    public zzfyv(zzfyx zzfyxVar) {
        this.zza = zzfyxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfyx zzfyxVar = this.zza;
        Map zzl = zzfyxVar.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzfyq(zzfyxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
