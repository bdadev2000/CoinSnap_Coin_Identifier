package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcvh implements com.google.android.gms.ads.internal.client.zza {
    private final zzcvl zza;
    private final zzfhc zzb;

    public zzcvh(zzcvl zzcvlVar, zzfhc zzfhcVar) {
        this.zza = zzcvlVar;
        this.zzb = zzfhcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
