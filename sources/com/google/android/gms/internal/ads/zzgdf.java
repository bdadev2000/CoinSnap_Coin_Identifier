package com.google.android.gms.internal.ads;

import java.util.Iterator;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgdf extends zzgbh {
    final transient Object zza;

    public zzgdf(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgbl(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC2914a.e("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final int zza(Object[] objArr, int i9) {
        objArr[i9] = this.zza;
        return i9 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, com.google.android.gms.internal.ads.zzgax
    public final zzgbc zzd() {
        return zzgbc.zzn(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, com.google.android.gms.internal.ads.zzgax
    /* renamed from: zze */
    public final zzgdi iterator() {
        return new zzgbl(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final boolean zzf() {
        return false;
    }
}
