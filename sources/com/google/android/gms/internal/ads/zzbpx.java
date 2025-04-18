package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzbpx implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback {
    private final zzbpm zza;

    public zzbpx(zzbpm zzbpmVar) {
        this.zza = zzbpmVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public final void onAdFailedToShow(@NonNull AdError adError) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onAdFailedToShow.");
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            this.zza.zzk(adError.zza());
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onVideoComplete.");
        try {
            this.zza.zzu();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onVideoPause.");
        try {
            this.zza.zzw();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onVideoPlay.");
        try {
            this.zza.zzx();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called reportAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(String str) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onAdFailedToShow.");
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.zza.zzl(str);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }
}
