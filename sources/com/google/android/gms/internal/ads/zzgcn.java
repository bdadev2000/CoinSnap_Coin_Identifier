package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzgcn extends zzgax {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzgcn(Object[] objArr, int i2, int i3) {
        this.zza = objArr;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzfxz.zza(i2, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i2 + i2 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final boolean zzf() {
        return true;
    }
}
