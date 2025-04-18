package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* loaded from: classes3.dex */
public final class zzgzh extends AbstractList {
    private final zzgzf zza;
    private final zzgzg zzb;

    public zzgzh(zzgzf zzgzfVar, zzgzg zzgzgVar) {
        this.zza = zzgzfVar;
        this.zzb = zzgzgVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.zzb.zzb(this.zza.zzd(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
