package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfry extends zzfsg {
    private String zza;
    private boolean zzb;
    private byte zzc;
    private int zzd;

    public final zzfsg zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsg
    public final zzfsg zzb(boolean z10) {
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsg
    public final zzfsg zzc(boolean z10) {
        this.zzb = z10;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsg
    public final zzfsh zzd() {
        if (this.zzc == 3 && this.zza != null && this.zzd != 0) {
            return new zzfsa(this.zza, false, this.zzb, null, null, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if ((this.zzc & 1) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" skipChecks");
        }
        if (this.zzd == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfsg
    public final zzfsg zze(int i10) {
        this.zzd = 1;
        return this;
    }
}
