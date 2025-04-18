package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfud extends zzfvg {
    private int zza;
    private String zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzfvg
    public final zzfvg zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvg
    public final zzfvg zzb(int i10) {
        this.zza = i10;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvg
    public final zzfvh zzc() {
        if (this.zzc == 1) {
            return new zzfuf(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
