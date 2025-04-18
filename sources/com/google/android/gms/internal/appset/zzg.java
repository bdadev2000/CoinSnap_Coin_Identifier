package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzg extends zza {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(com.google.android.gms.appset.zza zzaVar, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, zzaVar);
        zzc.zzc(zza, zzfVar);
        zzb(1, zza);
    }
}
