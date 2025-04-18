package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzfg implements Runnable {
    final /* synthetic */ zzfi zza;

    public zzfg(zzfi zzfiVar) {
        this.zza = zzfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfj zzfjVar = this.zza.zza;
        if (zzfj.zzb(zzfjVar) != null) {
            try {
                zzfj.zzb(zzfjVar).zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
