package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzfk implements Runnable {
    final /* synthetic */ zzfl zza;

    public zzfk(zzfl zzflVar) {
        this.zza = zzflVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbl zzblVar;
        zzbl zzblVar2;
        zzfl zzflVar = this.zza;
        zzblVar = zzflVar.zza;
        if (zzblVar != null) {
            try {
                zzblVar2 = zzflVar.zza;
                zzblVar2.zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
