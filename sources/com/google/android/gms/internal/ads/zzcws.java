package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcws implements com.google.android.gms.ads.internal.client.zza {
    private final zzcww zza;
    private final zzfho zzb;

    public zzcws(zzcww zzcwwVar, zzfho zzfhoVar) {
        this.zza = zzcwwVar;
        this.zzb = zzfhoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
