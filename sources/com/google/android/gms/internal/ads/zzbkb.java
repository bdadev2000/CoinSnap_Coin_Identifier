package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* loaded from: classes2.dex */
final class zzbkb implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    final /* synthetic */ zzbkc zzc;

    public zzbkb(zzbkc zzbkcVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
        this.zzc = zzbkcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (this.zza.zzb(this.zzb)) {
            zzbkc zzbkcVar = this.zzc;
            AdManagerAdView adManagerAdView = this.zza;
            onAdManagerAdViewLoadedListener = zzbkcVar.zza;
            onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(adManagerAdView);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not bind.");
    }
}
