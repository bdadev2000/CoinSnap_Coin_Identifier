package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbml extends AdManagerInterstitialAd {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzr zzb;
    private final com.google.android.gms.ads.internal.client.zzby zzc;
    private final String zzd;
    private final zzbpc zze;
    private final long zzf;

    @Nullable
    private AppEventListener zzg;

    @Nullable
    private FullScreenContentCallback zzh;

    @Nullable
    private OnPaidEventListener zzi;

    public zzbml(Context context, String str) {
        zzbpc zzbpcVar = new zzbpc();
        this.zze = zzbpcVar;
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzr.zza;
        this.zzc = com.google.android.gms.ads.internal.client.zzbc.zza().zzf(context, new com.google.android.gms.ads.internal.client.zzs(), str, zzbpcVar);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    @Nullable
    public final AppEventListener getAppEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    @NonNull
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVar = null;
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzdyVar = zzbyVar.zzk();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzb(zzdyVar);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(@Nullable AppEventListener appEventListener) {
        zzaza zzazaVar;
        try {
            this.zzg = appEventListener;
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                if (appEventListener != null) {
                    zzazaVar = new zzaza(appEventListener);
                } else {
                    zzazaVar = null;
                }
                zzbyVar.zzG(zzazaVar);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.zzh = fullScreenContentCallback;
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzbyVar.zzJ(new com.google.android.gms.ads.internal.client.zzbf(fullScreenContentCallback));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z10) {
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzbyVar.zzL(z10);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzi = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzbyVar.zzP(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(@NonNull Activity activity) {
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.ads.internal.client.zzby zzbyVar = this.zzc;
            if (zzbyVar != null) {
                zzbyVar.zzW(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzei zzeiVar, AdLoadCallback adLoadCallback) {
        try {
            if (this.zzc != null) {
                zzeiVar.zzq(this.zzf);
                this.zzc.zzy(this.zzb.zza(this.zza, zzeiVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    public zzbml(Context context, String str, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zze = new zzbpc();
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzr.zza;
        this.zzc = zzbyVar;
    }
}
