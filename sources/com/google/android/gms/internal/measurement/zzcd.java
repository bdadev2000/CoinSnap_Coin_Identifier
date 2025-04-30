package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzcd extends zzcm {
    private String zza;
    private zzcl zzb;
    private byte zzc;

    public final zzcm zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zzb(boolean z8) {
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zza(zzcl zzclVar) {
        if (zzclVar != null) {
            this.zzb = zzclVar;
            return this;
        }
        throw new NullPointerException("Null filePurpose");
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zza(boolean z8) {
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcj zza() {
        if (this.zzc == 3 && this.zza != null && this.zzb != null) {
            return new zzce(this.zza, this.zzb);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if ((this.zzc & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (this.zzb == null) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
