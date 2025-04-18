package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes3.dex */
final class zzbrw implements com.google.android.gms.ads.internal.overlay.zzr {
    final /* synthetic */ zzbry zza;

    public zzbrw(zzbry zzbryVar) {
        this.zza = zzbryVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzm.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbry zzbryVar = this.zza;
        mediationInterstitialListener = zzbryVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbryVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int i10) {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzm.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbry zzbryVar = this.zza;
        mediationInterstitialListener = zzbryVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbryVar);
    }
}
