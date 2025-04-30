package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzgaf extends AbstractSet {
    final /* synthetic */ zzgal zza;

    public zzgaf(zzgal zzgalVar) {
        this.zza = zzgalVar;
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
            if (zzw != -1 && zzfya.zza(zzgal.zzj(this.zza, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgal zzgalVar = this.zza;
        Map zzl = zzgalVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzgad(zzgalVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzv;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i9;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzgal zzgalVar = this.zza;
            if (!zzgalVar.zzr()) {
                zzv = zzgalVar.zzv();
                Object key = entry.getKey();
                Object value = entry.getValue();
                zzgal zzgalVar2 = this.zza;
                Object zzi = zzgal.zzi(zzgalVar2);
                zzA = zzgalVar2.zzA();
                zzB = zzgalVar2.zzB();
                zzC = zzgalVar2.zzC();
                int zzb = zzgam.zzb(key, value, zzv, zzi, zzA, zzB, zzC);
                if (zzb != -1) {
                    this.zza.zzq(zzb, zzv);
                    zzgal zzgalVar3 = this.zza;
                    i9 = zzgalVar3.zzg;
                    zzgalVar3.zzg = i9 - 1;
                    this.zza.zzo();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
