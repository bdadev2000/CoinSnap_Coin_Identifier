package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzbdt {
    final /* synthetic */ zzbdu zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbdt(zzbdu zzbduVar, byte[] bArr, zzbds zzbdsVar) {
        this.zza = zzbduVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbdu zzbduVar = this.zza;
            if (zzbduVar.zzb) {
                zzbduVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Clearcut log failed", e4);
        }
    }

    public final zzbdt zza(int i9) {
        this.zzc = i9;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdr
            @Override // java.lang.Runnable
            public final void run() {
                zzbdt.this.zzd();
            }
        });
    }
}
