package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes2.dex */
final class zzbtv implements com.google.android.gms.ads.internal.overlay.zzp {
    final /* synthetic */ zzbtx zza;

    public zzbtv(zzbtx zzbtxVar) {
        this.zza = zzbtxVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzm.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbtx zzbtxVar = this.zza;
        mediationInterstitialListener = zzbtxVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbtxVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i9) {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzm.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbtx zzbtxVar = this.zza;
        mediationInterstitialListener = zzbtxVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbtxVar);
    }
}
