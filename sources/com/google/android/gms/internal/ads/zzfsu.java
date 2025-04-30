package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzfsu extends zzbad implements IInterface {
    public zzfsu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfss zze(zzfsq zzfsqVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzfsqVar);
        Parcel zzdb = zzdb(1, zza);
        zzfss zzfssVar = (zzfss) zzbaf.zza(zzdb, zzfss.CREATOR);
        zzdb.recycle();
        return zzfssVar;
    }

    public final zzftb zzf(zzfsz zzfszVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzfszVar);
        Parcel zzdb = zzdb(3, zza);
        zzftb zzftbVar = (zzftb) zzbaf.zza(zzdb, zzftb.CREATOR);
        zzdb.recycle();
        return zzftbVar;
    }

    public final void zzg(zzfsn zzfsnVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzfsnVar);
        zzdc(2, zza);
    }
}
