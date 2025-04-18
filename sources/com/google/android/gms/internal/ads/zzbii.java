package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* loaded from: classes3.dex */
final class zzbii implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zzb;
    final /* synthetic */ zzbij zzc;

    public zzbii(zzbij zzbijVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbyVar;
        this.zzc = zzbijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (!this.zza.zzb(this.zzb)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not bind.");
            return;
        }
        zzbij zzbijVar = this.zzc;
        AdManagerAdView adManagerAdView = this.zza;
        onAdManagerAdViewLoadedListener = zzbijVar.zza;
        onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(adManagerAdView);
    }
}
