package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzpb {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpb zza(boolean z2) {
        this.zza = true;
        return this;
    }

    public final zzpb zzb(boolean z2) {
        this.zzb = z2;
        return this;
    }

    public final zzpb zzc(boolean z2) {
        this.zzc = z2;
        return this;
    }

    public final zzpd zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpd(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
