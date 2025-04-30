package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes2.dex */
public final class zzftj {
    final /* synthetic */ zzftk zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzftj(zzftk zzftkVar, byte[] bArr, zzfti zzftiVar) {
        this.zza = zzftkVar;
        this.zzb = bArr;
    }

    public final zzftj zza(int i9) {
        this.zzd = i9;
        return this;
    }

    public final zzftj zzb(int i9) {
        this.zzc = i9;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzftk zzftkVar = this.zza;
            if (zzftkVar.zzb) {
                zzftkVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e4) {
            Log.d("GASS", "Clearcut log failed", e4);
        }
    }
}
