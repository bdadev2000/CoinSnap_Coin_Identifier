package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzftr extends zzfty {
    private String zza;
    private byte zzb;
    private int zzc;

    public final zzfty zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    public final zzfty zzb(boolean z8) {
        this.zzb = (byte) (this.zzb | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    public final zzfty zzc(boolean z8) {
        this.zzb = (byte) (this.zzb | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    public final zzftz zzd() {
        if (this.zzb == 3 && this.zza != null && this.zzc != 0) {
            return new zzftt(this.zza, false, false, null, null, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if ((this.zzb & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((this.zzb & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (this.zzc == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    public final zzfty zze(int i9) {
        this.zzc = 1;
        return this;
    }
}
