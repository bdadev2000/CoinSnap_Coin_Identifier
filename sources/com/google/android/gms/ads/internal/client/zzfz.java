package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* loaded from: classes3.dex */
public final class zzfz extends zzed {
    private final VideoController.VideoLifecycleCallbacks zza;

    public zzfz(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zza = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() {
        this.zza.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z10) {
        this.zza.onVideoMute(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() {
        this.zza.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() {
        this.zza.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() {
        this.zza.onVideoStart();
    }
}
