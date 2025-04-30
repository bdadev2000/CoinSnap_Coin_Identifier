package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzao {
    private final zzt zza;
    private final int zzb;
    private final int zzc;
    private float zzd = 1.0f;

    public zzao(zzt zztVar, int i9, int i10) {
        this.zza = zztVar;
        this.zzb = i9;
        this.zzc = i10;
    }

    public final zzao zza(float f9) {
        this.zzd = f9;
        return this;
    }

    public final zzaq zzb() {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, 0L, null);
    }
}
