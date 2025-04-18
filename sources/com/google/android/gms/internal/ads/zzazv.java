package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* loaded from: classes4.dex */
public final class zzazv {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    @VisibleForTesting
    public zzazv(float f2, float f3, float f4, float f5, int i2) {
        this.zza = f2;
        this.zzb = f3;
        this.zzc = f2 + f4;
        this.zzd = f3 + f5;
        this.zze = i2;
    }

    public final float zza() {
        return this.zzd;
    }

    public final float zzb() {
        return this.zza;
    }

    public final float zzc() {
        return this.zzc;
    }

    public final float zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zze;
    }
}
