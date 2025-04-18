package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* loaded from: classes3.dex */
final class zzbpz implements MediationAdLoadCallback {
    final /* synthetic */ zzbpm zza;
    final /* synthetic */ Adapter zzb;
    final /* synthetic */ zzbqh zzc;

    public zzbpz(zzbqh zzbqhVar, zzbpm zzbpmVar, Adapter adapter) {
        this.zza = zzbpmVar;
        this.zzb = adapter;
        this.zzc = zzbqhVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(@NonNull AdError adError) {
        try {
            com.google.android.gms.ads.internal.util.client.zzm.zze(this.zzb.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            this.zza.zzh(adError.zza());
            this.zza.zzi(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzc.zzj = (MediationInterscrollerAd) obj;
            this.zza.zzo();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
        return new zzbpx(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
