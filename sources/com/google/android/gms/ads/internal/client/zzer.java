package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzer implements Runnable {
    final /* synthetic */ zzet zza;

    public zzer(zzet zzetVar) {
        this.zza = zzetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.zza.zza;
        if (zzeu.zzb(zzeuVar) != null) {
            try {
                zzeu.zzb(zzeuVar).zze(1);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not notify onAdFailedToLoad event.", e4);
            }
        }
    }
}
