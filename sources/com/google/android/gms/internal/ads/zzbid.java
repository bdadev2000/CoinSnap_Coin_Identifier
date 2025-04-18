package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* loaded from: classes3.dex */
final class zzbid implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zzb;
    final /* synthetic */ zzbie zzc;

    public zzbid(zzbie zzbieVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbyVar;
        this.zzc = zzbieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (this.zza.zzb(this.zzb)) {
            zzbie zzbieVar = this.zzc;
            AdManagerAdView adManagerAdView = this.zza;
            onAdManagerAdViewLoadedListener = zzbieVar.zza;
            onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(adManagerAdView);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not bind.");
    }
}
