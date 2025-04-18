package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzgck extends zzgax {
    final /* synthetic */ zzgcl zza;

    public zzgck(zzgcl zzgclVar) {
        this.zza = zzgclVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        int i3;
        Object[] objArr;
        Object[] objArr2;
        i3 = this.zza.zzc;
        zzfxz.zza(i2, i3, FirebaseAnalytics.Param.INDEX);
        objArr = this.zza.zzb;
        int i4 = i2 + i2;
        Object obj = objArr[i4];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i2;
        i2 = this.zza.zzc;
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final boolean zzf() {
        return true;
    }
}
