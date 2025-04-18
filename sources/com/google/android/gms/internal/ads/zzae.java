package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzae {
    private final zzm zza;
    private final int zzb;
    private final int zzc;
    private float zzd = 1.0f;

    public zzae(zzm zzmVar, int i10, int i11) {
        this.zza = zzmVar;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final zzae zza(float f10) {
        this.zzd = f10;
        return this;
    }

    public final zzag zzb() {
        return new zzag(this.zza, this.zzb, this.zzc, this.zzd, 0L, null);
    }
}
