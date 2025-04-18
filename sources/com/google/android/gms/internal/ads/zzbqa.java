package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* loaded from: classes3.dex */
final class zzbqa implements InitializationCompleteCallback {
    final /* synthetic */ zzblt zza;

    public zzbqa(zzbqh zzbqhVar, zzblt zzbltVar) {
        this.zza = zzbltVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }
}
