package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzpy {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpy zza(boolean z8) {
        this.zza = true;
        return this;
    }

    public final zzpy zzb(boolean z8) {
        this.zzb = z8;
        return this;
    }

    public final zzpy zzc(boolean z8) {
        this.zzc = z8;
        return this;
    }

    public final zzqa zzd() {
        if (!this.zza && (this.zzb || this.zzc)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new zzqa(this, null);
    }
}
