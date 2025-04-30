package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfvx extends zzfwq {
    private int zza;
    private String zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzfwq
    public final zzfwq zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    public final zzfwq zzb(int i9) {
        this.zza = i9;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    public final zzfwr zzc() {
        if (this.zzc == 1) {
            return new zzfvz(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
