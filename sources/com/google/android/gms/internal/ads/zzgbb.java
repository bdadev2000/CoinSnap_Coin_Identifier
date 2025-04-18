package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgbb extends zzfzo {
    final /* synthetic */ zzgbc zza;

    public zzgbb(zzgbc zzgbcVar) {
        this.zza = zzgbcVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.zza.zzc;
        zzfwq.zza(i10, i11, "index");
        objArr = this.zza.zzb;
        int i12 = i10 + i10;
        Object obj = objArr[i12];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i12 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.zza.zzc;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final boolean zzf() {
        return true;
    }
}
