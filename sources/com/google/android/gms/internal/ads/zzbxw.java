package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbxw extends RewardedInterstitialAd {
    private final String zza;
    private final zzbxc zzb;
    private final Context zzc;

    @Nullable
    private FullScreenContentCallback zze;

    @Nullable
    private OnAdMetadataChangedListener zzf;

    @Nullable
    private OnPaidEventListener zzg;
    private final long zzh = System.currentTimeMillis();
    private final zzbxu zzd = new zzbxu();

    public zzbxw(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = com.google.android.gms.ads.internal.client.zzbc.zza().zzs(context, str, new zzbpc());
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                return zzbxcVar.zzb();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @Nullable
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @NonNull
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVar = null;
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzdyVar = zzbxcVar.zzc();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzb(zzdyVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @NonNull
    public final RewardItem getRewardItem() {
        zzbwz zzbwzVar;
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbwzVar = zzbxcVar.zzd();
            } else {
                zzbwzVar = null;
            }
            if (zzbwzVar != null) {
                return new zzbxm(zzbwzVar);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.zze = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z10) {
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzh(z10);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzf = onAdMetadataChangedListener;
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzi(new com.google.android.gms.ads.internal.client.zzfr(onAdMetadataChangedListener));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zzg = onPaidEventListener;
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzj(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzl(new zzbxq(serverSideVerificationOptions));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(@NonNull Activity activity, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzei zzeiVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            if (this.zzb != null) {
                zzeiVar.zzq(this.zzh);
                this.zzb.zzg(com.google.android.gms.ads.internal.client.zzr.zza.zza(this.zzc, zzeiVar), new zzbxv(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }
}
