package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzfyt extends AbstractSet {
    final /* synthetic */ zzfyx zza;

    public zzfyt(zzfyx zzfyxVar) {
        this.zza = zzfyxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfyx zzfyxVar = this.zza;
        Map zzl = zzfyxVar.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzfyo(zzfyxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzy;
        Object obj2;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        zzy = this.zza.zzy(obj);
        obj2 = zzfyx.zzd;
        if (zzy == obj2) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
