package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbda extends zzbad implements IInterface {
    public zzbda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbcy zzbcyVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbcyVar);
        Parcel zzdb = zzdb(3, zza);
        long readLong = zzdb.readLong();
        zzdb.recycle();
        return readLong;
    }

    public final zzbcv zzf(zzbcy zzbcyVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbcyVar);
        Parcel zzdb = zzdb(1, zza);
        zzbcv zzbcvVar = (zzbcv) zzbaf.zza(zzdb, zzbcv.CREATOR);
        zzdb.recycle();
        return zzbcvVar;
    }

    public final zzbcv zzg(zzbcy zzbcyVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbcyVar);
        Parcel zzdb = zzdb(2, zza);
        zzbcv zzbcvVar = (zzbcv) zzbaf.zza(zzdb, zzbcv.CREATOR);
        zzdb.recycle();
        return zzbcvVar;
    }
}
