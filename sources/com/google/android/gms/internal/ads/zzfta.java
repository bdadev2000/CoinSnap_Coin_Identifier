package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class zzfta {
    final /* synthetic */ zzftb zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfta(zzftb zzftbVar, byte[] bArr, zzfsz zzfszVar) {
        this.zza = zzftbVar;
        this.zzb = bArr;
    }

    public final zzfta zza(int i2) {
        this.zzd = i2;
        return this;
    }

    public final zzfta zzb(int i2) {
        this.zzc = i2;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzftb zzftbVar = this.zza;
            if (zzftbVar.zzb) {
                zzftbVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
