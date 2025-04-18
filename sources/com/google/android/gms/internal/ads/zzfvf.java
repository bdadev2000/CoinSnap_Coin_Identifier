package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfvf extends zzfvr {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final zzfvr zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final zzfvr zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final zzfvs zzc() {
        return new zzfvh(this.zza, this.zzb, null);
    }
}
