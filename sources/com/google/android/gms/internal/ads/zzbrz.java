package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* loaded from: classes2.dex */
final class zzbrz implements InitializationCompleteCallback {
    final /* synthetic */ zzbnr zza;

    public zzbrz(zzbsg zzbsgVar, zzbnr zzbnrVar) {
        this.zza = zzbnrVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }
}
