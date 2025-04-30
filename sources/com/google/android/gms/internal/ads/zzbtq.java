package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* loaded from: classes2.dex */
final class zzbtq implements MediationAdLoadCallback {
    final /* synthetic */ zzbtb zza;
    final /* synthetic */ zzbrl zzb;
    final /* synthetic */ zzbtr zzc;

    public zzbtq(zzbtr zzbtrVar, zzbtb zzbtbVar, zzbrl zzbrlVar) {
        this.zza = zzbtbVar;
        this.zzb = zzbrlVar;
        this.zzc = zzbtrVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    @Nullable
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
                return null;
            }
        }
        try {
            this.zzc.zzc = mediationRewardedAd;
            this.zza.zzg();
        } catch (RemoteException e9) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e9);
        }
        return new zzbts(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
