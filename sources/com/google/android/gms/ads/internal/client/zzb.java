package com.google.android.gms.ads.internal.client;

/* loaded from: classes3.dex */
public final class zzb extends zzbh {
    private final zza zza;

    public zzb(zza zzaVar) {
        this.zza = zzaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbi
    public final void zzb() {
        this.zza.onAdClicked();
    }
}
