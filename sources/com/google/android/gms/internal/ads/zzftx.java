package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzftx extends zzfuj {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfuj zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfuj zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfuk zzc() {
        return new zzftz(this.zza, this.zzb, null);
    }
}
