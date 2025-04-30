package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

/* loaded from: classes2.dex */
public final class zzbi extends zzbad implements zzbk {
    public zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzeVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() throws RemoteException {
        zzdc(1, zza());
    }
}
