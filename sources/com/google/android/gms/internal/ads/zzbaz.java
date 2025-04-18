package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbaz extends zzayc {
    public zzbaz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbax zzbaxVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbaxVar);
        Parcel zzdb = zzdb(3, zza);
        long readLong = zzdb.readLong();
        zzdb.recycle();
        return readLong;
    }

    public final zzbau zzf(zzbax zzbaxVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbaxVar);
        Parcel zzdb = zzdb(1, zza);
        zzbau zzbauVar = (zzbau) zzaye.zza(zzdb, zzbau.CREATOR);
        zzdb.recycle();
        return zzbauVar;
    }

    public final zzbau zzg(zzbax zzbaxVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbaxVar);
        Parcel zzdb = zzdb(2, zza);
        zzbau zzbauVar = (zzbau) zzaye.zza(zzdb, zzbau.CREATOR);
        zzdb.recycle();
        return zzbauVar;
    }
}
