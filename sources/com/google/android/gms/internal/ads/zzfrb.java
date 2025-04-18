package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzfrb extends zzayc {
    public zzfrb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfqz zze(zzfqx zzfqxVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzfqxVar);
        Parcel zzdb = zzdb(1, zza);
        zzfqz zzfqzVar = (zzfqz) zzaye.zza(zzdb, zzfqz.CREATOR);
        zzdb.recycle();
        return zzfqzVar;
    }

    public final zzfri zzf(zzfrg zzfrgVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzfrgVar);
        Parcel zzdb = zzdb(3, zza);
        zzfri zzfriVar = (zzfri) zzaye.zza(zzdb, zzfri.CREATOR);
        zzdb.recycle();
        return zzfriVar;
    }

    public final void zzg(zzfqu zzfquVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzfquVar);
        zzdc(2, zza);
    }
}
