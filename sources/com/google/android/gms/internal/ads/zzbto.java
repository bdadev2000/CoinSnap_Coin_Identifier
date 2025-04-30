package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;

/* loaded from: classes2.dex */
final class zzbto implements MediationAdLoadCallback {
    final /* synthetic */ zzbsp zza;
    final /* synthetic */ zzbrl zzb;
    final /* synthetic */ zzbtr zzc;

    public zzbto(zzbtr zzbtrVar, zzbsp zzbspVar, zzbrl zzbrlVar) {
        this.zza = zzbspVar;
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
        MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
        if (mediationAppOpenAd == null) {
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
            this.zzc.zzd = mediationAppOpenAd;
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
