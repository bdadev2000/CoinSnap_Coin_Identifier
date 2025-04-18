package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgcj extends zzgax {
    static final zzgax zza = new zzgcj(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzgcj(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzfxz.zza(i2, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgax, com.google.android.gms.internal.ads.zzgas
    public final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, i2, this.zzc);
        return i2 + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final Object[] zzg() {
        return this.zzb;
    }
}
