package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* loaded from: classes3.dex */
final class zzbrq implements SignalCallbacks {
    final /* synthetic */ zzbri zza;

    public zzbrq(zzbrs zzbrsVar, zzbri zzbriVar) {
        this.zza = zzbriVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }
}
