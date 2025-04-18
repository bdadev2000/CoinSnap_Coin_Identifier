package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzfj implements Runnable {
    final /* synthetic */ zzfk zza;

    public zzfj(zzfk zzfkVar) {
        this.zza = zzfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbl zzblVar;
        zzbl zzblVar2;
        zzfk zzfkVar = this.zza;
        zzblVar = zzfkVar.zza;
        if (zzblVar != null) {
            try {
                zzblVar2 = zzfkVar.zza;
                zzblVar2.zze(1);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
