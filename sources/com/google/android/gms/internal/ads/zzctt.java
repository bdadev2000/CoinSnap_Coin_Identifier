package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzctt implements com.google.android.gms.ads.internal.client.zza {
    private final zzctx zza;
    private final zzffo zzb;

    public zzctt(zzctx zzctxVar, zzffo zzffoVar) {
        this.zza = zzctxVar;
        this.zzb = zzffoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
