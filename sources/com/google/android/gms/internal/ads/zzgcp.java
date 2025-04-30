package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzgcp extends zzgbc {
    final /* synthetic */ zzgcq zza;

    public zzgcp(zzgcq zzgcqVar) {
        this.zza = zzgcqVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        int i10;
        Object[] objArr;
        Object[] objArr2;
        i10 = this.zza.zzc;
        zzfyg.zza(i9, i10, "index");
        objArr = this.zza.zzb;
        int i11 = i9 + i9;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i9;
        i9 = this.zza.zzc;
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final boolean zzf() {
        return true;
    }
}
