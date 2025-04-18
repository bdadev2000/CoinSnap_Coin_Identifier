package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfug extends zzfvj {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final zzfvj zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final zzfvj zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final zzfvk zzc() {
        return new zzfui(this.zza, this.zzb, null);
    }
}
