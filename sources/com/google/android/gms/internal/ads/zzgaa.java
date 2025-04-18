package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgaa extends AbstractSet {
    final /* synthetic */ zzgag zza;

    public zzgaa(zzgag zzgagVar) {
        this.zza = zzgagVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzw;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzw = this.zza.zzw(entry.getKey());
            if (zzw != -1 && zzfxw.zza(zzgag.zzj(this.zza, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgag zzgagVar = this.zza;
        Map zzl = zzgagVar.zzl();
        return zzl != null ? zzl.entrySet().iterator() : new zzfzy(zzgagVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzv;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i2;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzgag zzgagVar = this.zza;
        if (zzgagVar.zzr()) {
            return false;
        }
        zzv = zzgagVar.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzgag zzgagVar2 = this.zza;
        Object zzi = zzgag.zzi(zzgagVar2);
        zzA = zzgagVar2.zzA();
        zzB = zzgagVar2.zzB();
        zzC = zzgagVar2.zzC();
        int zzb = zzgah.zzb(key, value, zzv, zzi, zzA, zzB, zzC);
        if (zzb == -1) {
            return false;
        }
        this.zza.zzq(zzb, zzv);
        zzgag zzgagVar3 = this.zza;
        i2 = zzgagVar3.zzg;
        zzgagVar3.zzg = i2 - 1;
        this.zza.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
