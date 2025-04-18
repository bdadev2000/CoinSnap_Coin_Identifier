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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbxl extends RewardedAd {
    private final String zza;
    private final zzbxc zzb;
    private final Context zzc;
    private final zzbxu zzd;
    private com.google.android.gms.ads.internal.client.zzci zze;

    @Nullable
    private OnAdMetadataChangedListener zzf;

    @Nullable
    private OnPaidEventListener zzg;

    @Nullable
    private FullScreenContentCallback zzh;
    private final long zzi;
    private final Object zzj;

    public zzbxl(Context context, String str) {
        this(context.getApplicationContext(), str, com.google.android.gms.ads.internal.client.zzbc.zza().zzs(context, str, new zzbpc()), new zzbxu());
    }

    private final void zzd(Context context, zzbpg zzbpgVar) {
        synchronized (this.zzj) {
            if (this.zze == null) {
                this.zze = com.google.android.gms.ads.internal.client.zzbc.zza().zzg(context, zzbpgVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @NonNull
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @Nullable
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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
            if (zzbwzVar == null) {
                return RewardItem.DEFAULT_REWARD;
            }
            return new zzbxm(zzbwzVar);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.zzh = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zzf = onAdMetadataChangedListener;
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzi(new com.google.android.gms.ads.internal.client.zzfr(onAdMetadataChangedListener));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzg = onPaidEventListener;
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzj(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(@Nullable ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbxc zzbxcVar = this.zzb;
                if (zzbxcVar != null) {
                    zzbxcVar.zzl(new zzbxq(serverSideVerificationOptions));
                }
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(@NonNull Activity activity, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
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

    @Nullable
    public final RewardedAd zza() {
        try {
            zzd(this.zzc, new zzbpc());
            zzbxc zzg = this.zze.zzg(this.zza);
            if (zzg == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("Failed to obtain a Rewarded Ad from the preloader.", null);
                return null;
            }
            return new zzbxl(this.zzc, this.zza, zzg, this.zzd);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final void zzb(com.google.android.gms.ads.internal.client.zzei zzeiVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            if (this.zzb != null) {
                zzeiVar.zzq(this.zzi);
                this.zzb.zzf(com.google.android.gms.ads.internal.client.zzr.zza.zza(this.zzc, zzeiVar), new zzbxp(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final boolean zzc() {
        try {
            zzd(this.zzc, new zzbpc());
            return this.zze.zzl(this.zza);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public zzbxl(Context context, String str, zzbxc zzbxcVar, zzbxu zzbxuVar) {
        this.zzi = System.currentTimeMillis();
        this.zzj = new Object();
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzbxcVar;
        this.zzd = zzbxuVar;
    }
}
