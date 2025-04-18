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

/* loaded from: classes2.dex */
public final class zzbxo extends RewardedAd {
    private final String zza;
    private final zzbxf zzb;
    private final Context zzc;
    private final zzbxx zzd;
    private com.google.android.gms.ads.internal.client.zzci zze;

    @Nullable
    private OnAdMetadataChangedListener zzf;

    @Nullable
    private OnPaidEventListener zzg;

    @Nullable
    private FullScreenContentCallback zzh;
    private final long zzi;
    private final Object zzj;

    public zzbxo(Context context, String str) {
        this(context.getApplicationContext(), str, com.google.android.gms.ads.internal.client.zzbc.zza().zzs(context, str, new zzbph()), new zzbxx());
    }

    private final void zzd(Context context, zzbpl zzbplVar) {
        if (this.zze == null) {
            this.zze = com.google.android.gms.ads.internal.client.zzbc.zza().zzg(context, zzbplVar);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzbxf zzbxfVar = this.zzb;
            if (zzbxfVar != null) {
                return zzbxfVar.zzb();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
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
            zzbxf zzbxfVar = this.zzb;
            if (zzbxfVar != null) {
                zzdyVar = zzbxfVar.zzc();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdyVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @NonNull
    public final RewardItem getRewardItem() {
        try {
            zzbxf zzbxfVar = this.zzb;
            zzbxc zzd = zzbxfVar != null ? zzbxfVar.zzd() : null;
            return zzd == null ? RewardItem.DEFAULT_REWARD : new zzbxp(zzd);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.zzh = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z2) {
        try {
            zzbxf zzbxfVar = this.zzb;
            if (zzbxfVar != null) {
                zzbxfVar.zzh(z2);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zzf = onAdMetadataChangedListener;
            zzbxf zzbxfVar = this.zzb;
            if (zzbxfVar != null) {
                zzbxfVar.zzi(new com.google.android.gms.ads.internal.client.zzfs(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzg = onPaidEventListener;
            zzbxf zzbxfVar = this.zzb;
            if (zzbxfVar != null) {
                zzbxfVar.zzj(new com.google.android.gms.ads.internal.client.zzft(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(@Nullable ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbxf zzbxfVar = this.zzb;
                if (zzbxfVar != null) {
                    zzbxfVar.zzl(new zzbxt(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
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
            zzbxf zzbxfVar = this.zzb;
            if (zzbxfVar != null) {
                zzbxfVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Nullable
    public final RewardedAd zza() {
        try {
            synchronized (this.zzj) {
                try {
                    zzd(this.zzc, new zzbph());
                    zzbxf zzg = this.zze.zzg(this.zza);
                    if (zzg == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("Failed to obtain a Rewarded Ad from the preloader.", null);
                        return null;
                    }
                    return new zzbxo(this.zzc, this.zza, zzg, this.zzd);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void zzb(com.google.android.gms.ads.internal.client.zzei zzeiVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            if (this.zzb != null) {
                zzeiVar.zzq(this.zzi);
                this.zzb.zzf(com.google.android.gms.ads.internal.client.zzr.zza.zza(this.zzc, zzeiVar), new zzbxs(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzc() {
        boolean zzl;
        try {
            synchronized (this.zzj) {
                zzd(this.zzc, new zzbph());
                zzl = this.zze.zzl(this.zza);
            }
            return zzl;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public zzbxo(Context context, String str, zzbxf zzbxfVar, zzbxx zzbxxVar) {
        this.zzi = System.currentTimeMillis();
        this.zzj = new Object();
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzbxfVar;
        this.zzd = zzbxxVar;
    }
}
