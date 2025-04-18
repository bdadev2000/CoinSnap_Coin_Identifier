package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class zzbbz {
    final /* synthetic */ zzbca zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbbz(zzbca zzbcaVar, byte[] bArr, zzbby zzbbyVar) {
        this.zza = zzbcaVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbca zzbcaVar = this.zza;
            if (zzbcaVar.zzb) {
                zzbcaVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Clearcut log failed", e);
        }
    }

    public final zzbbz zza(int i2) {
        this.zzc = i2;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbx
            @Override // java.lang.Runnable
            public final void run() {
                zzbbz.this.zzd();
            }
        });
    }
}
