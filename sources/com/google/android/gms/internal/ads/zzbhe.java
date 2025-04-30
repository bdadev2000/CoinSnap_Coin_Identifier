package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbhe extends zzbad implements IInterface {
    public zzbhe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbwq zzbwqVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbwqVar);
        zzdc(1, zza);
    }
}
