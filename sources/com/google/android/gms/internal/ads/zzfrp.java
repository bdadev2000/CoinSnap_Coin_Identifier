package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class zzfrp {
    final /* synthetic */ zzfrr zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfrp(zzfrr zzfrrVar, byte[] bArr, zzfrq zzfrqVar) {
        this.zza = zzfrrVar;
        this.zzb = bArr;
    }

    public final zzfrp zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzfrp zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfrr zzfrrVar = this.zza;
            if (zzfrrVar.zzb) {
                zzfrrVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e2) {
            Log.d("GASS", "Clearcut log failed", e2);
        }
    }
}
