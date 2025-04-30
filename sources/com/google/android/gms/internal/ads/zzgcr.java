package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzgcr extends zzgbh {
    private final transient zzgbf zza;
    private final transient zzgbc zzb;

    public zzgcr(zzgbf zzgbfVar, zzgbc zzgbcVar) {
        this.zza = zzgbfVar;
        this.zzb = zzgbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final int zza(Object[] objArr, int i9) {
        return this.zzb.zza(objArr, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, com.google.android.gms.internal.ads.zzgax
    public final zzgbc zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, com.google.android.gms.internal.ads.zzgax
    /* renamed from: zze */
    public final zzgdi iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final boolean zzf() {
        return true;
    }
}
