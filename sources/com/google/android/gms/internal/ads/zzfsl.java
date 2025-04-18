package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzfsl extends zzayl implements IInterface {
    public zzfsl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfsj zze(zzfsh zzfshVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzfshVar);
        Parcel zzdb = zzdb(1, zza);
        zzfsj zzfsjVar = (zzfsj) zzayn.zza(zzdb, zzfsj.CREATOR);
        zzdb.recycle();
        return zzfsjVar;
    }

    public final zzfss zzf(zzfsq zzfsqVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzfsqVar);
        Parcel zzdb = zzdb(3, zza);
        zzfss zzfssVar = (zzfss) zzayn.zza(zzdb, zzfss.CREATOR);
        zzdb.recycle();
        return zzfssVar;
    }

    public final void zzg(zzfse zzfseVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzfseVar);
        zzdc(2, zza);
    }
}
