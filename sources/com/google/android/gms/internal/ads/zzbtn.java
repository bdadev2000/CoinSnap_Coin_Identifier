package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbtn implements MediationAdLoadCallback {
    final /* synthetic */ zzbsy zza;
    final /* synthetic */ zzbrl zzb;

    public zzbtn(zzbtr zzbtrVar, zzbsy zzbsyVar, zzbrl zzbrlVar) {
        this.zza = zzbsyVar;
        this.zzb = zzbrlVar;
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
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        if (unifiedNativeAdMapper == null) {
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
            this.zza.zzg(new zzbsm(unifiedNativeAdMapper));
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
