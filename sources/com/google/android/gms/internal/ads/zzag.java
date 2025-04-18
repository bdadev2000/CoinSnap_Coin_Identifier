package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzag {
    private final zzo zza;
    private final int zzb;
    private final int zzc;
    private float zzd = 1.0f;

    public zzag(zzo zzoVar, int i2, int i3) {
        this.zza = zzoVar;
        this.zzb = i2;
        this.zzc = i3;
    }

    public final zzag zza(float f2) {
        this.zzd = f2;
        return this;
    }

    public final zzai zzb() {
        return new zzai(this.zza, this.zzb, this.zzc, this.zzd, 0L, null);
    }
}
