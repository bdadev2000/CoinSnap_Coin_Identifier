package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzox {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzox zza(boolean z10) {
        this.zza = true;
        return this;
    }

    public final zzox zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzox zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzoz zzd() {
        if (!this.zza && (this.zzb || this.zzc)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new zzoz(this, null);
    }
}
