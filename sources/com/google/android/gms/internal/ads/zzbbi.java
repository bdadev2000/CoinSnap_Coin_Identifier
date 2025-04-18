package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzbbi extends zzayl implements IInterface {
    public zzbbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbbg zzbbgVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbbgVar);
        Parcel zzdb = zzdb(3, zza);
        long readLong = zzdb.readLong();
        zzdb.recycle();
        return readLong;
    }

    public final zzbbd zzf(zzbbg zzbbgVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbbgVar);
        Parcel zzdb = zzdb(1, zza);
        zzbbd zzbbdVar = (zzbbd) zzayn.zza(zzdb, zzbbd.CREATOR);
        zzdb.recycle();
        return zzbbdVar;
    }

    public final zzbbd zzg(zzbbg zzbbgVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbbgVar);
        Parcel zzdb = zzdb(2, zza);
        zzbbd zzbbdVar = (zzbbd) zzayn.zza(zzdb, zzbbd.CREATOR);
        zzdb.recycle();
        return zzbbdVar;
    }
}
