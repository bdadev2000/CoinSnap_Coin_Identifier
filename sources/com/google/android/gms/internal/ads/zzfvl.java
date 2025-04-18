package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfvl extends zzfwo {
    private int zza;
    private String zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zzb(int i2) {
        this.zza = i2;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwp zzc() {
        if (this.zzc == 1) {
            return new zzfvn(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
