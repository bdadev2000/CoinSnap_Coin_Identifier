package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfwa extends zzfwt {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final zzfwt zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final zzfwt zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final zzfwu zzc() {
        return new zzfwc(this.zza, this.zzb, null);
    }
}
