package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzbfl extends zzayl implements IInterface {
    public zzbfl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbuw zzbuwVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbuwVar);
        zzdc(1, zza);
    }
}
