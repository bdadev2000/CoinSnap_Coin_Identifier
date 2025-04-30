package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzev implements Runnable {
    final /* synthetic */ zzew zza;

    public zzev(zzew zzewVar) {
        this.zza = zzewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzew zzewVar = this.zza;
        zzbhVar = zzewVar.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar2 = zzewVar.zza;
                zzbhVar2.zze(1);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not notify onAdFailedToLoad event.", e4);
            }
        }
    }
}
