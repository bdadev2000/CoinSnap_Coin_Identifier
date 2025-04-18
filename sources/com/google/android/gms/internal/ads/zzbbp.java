package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzbbp {
    final /* synthetic */ zzbbr zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbbp(zzbbr zzbbrVar, byte[] bArr, zzbbq zzbbqVar) {
        this.zza = zzbbrVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbbr zzbbrVar = this.zza;
            if (zzbbrVar.zzb) {
                zzbbrVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Clearcut log failed", e2);
        }
    }

    public final zzbbp zza(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbo
            @Override // java.lang.Runnable
            public final void run() {
                zzbbp.this.zzd();
            }
        });
    }
}
