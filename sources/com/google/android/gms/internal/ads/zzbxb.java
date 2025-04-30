package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbxb extends zzbad implements zzbxd {
    public zzbxb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zze(zzbxu zzbxuVar, zzbxn zzbxnVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbxuVar);
        zzbaf.zzf(zza, zzbxnVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzf(zzbxu zzbxuVar, zzbxn zzbxnVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbxuVar);
        zzbaf.zzf(zza, zzbxnVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzg(zzbxu zzbxuVar, zzbxn zzbxnVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbxuVar);
        zzbaf.zzf(zza, zzbxnVar);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzh(String str, zzbxn zzbxnVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbaf.zzf(zza, zzbxnVar);
        zzdc(7, zza);
    }
}
