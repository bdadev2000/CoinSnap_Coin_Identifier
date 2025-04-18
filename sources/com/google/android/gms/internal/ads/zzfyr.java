package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzfyr extends AbstractSet {
    final /* synthetic */ zzfyx zza;

    public zzfyr(zzfyx zzfyxVar) {
        this.zza = zzfyxVar;
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
            if (zzw != -1 && zzfwn.zza(zzfyx.zzj(this.zza, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfyx zzfyxVar = this.zza;
        Map zzl = zzfyxVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzfyp(zzfyxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzv;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i10;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzfyx zzfyxVar = this.zza;
            if (!zzfyxVar.zzr()) {
                zzv = zzfyxVar.zzv();
                Object key = entry.getKey();
                Object value = entry.getValue();
                zzfyx zzfyxVar2 = this.zza;
                Object zzi = zzfyx.zzi(zzfyxVar2);
                zzA = zzfyxVar2.zzA();
                zzB = zzfyxVar2.zzB();
                zzC = zzfyxVar2.zzC();
                int zzb = zzfyy.zzb(key, value, zzv, zzi, zzA, zzB, zzC);
                if (zzb != -1) {
                    this.zza.zzq(zzb, zzv);
                    zzfyx zzfyxVar3 = this.zza;
                    i10 = zzfyxVar3.zzg;
                    zzfyxVar3.zzg = i10 - 1;
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
