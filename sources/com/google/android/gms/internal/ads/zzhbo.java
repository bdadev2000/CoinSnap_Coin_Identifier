package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* loaded from: classes2.dex */
public final class zzhbo extends AbstractList {
    private final zzhbm zza;
    private final zzhbn zzb;

    public zzhbo(zzhbm zzhbmVar, zzhbn zzhbnVar) {
        this.zza = zzhbmVar;
        this.zzb = zzhbnVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.zzb.zzb(this.zza.zzd(i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
