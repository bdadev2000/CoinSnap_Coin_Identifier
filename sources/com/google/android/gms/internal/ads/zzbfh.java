package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbfh extends zzayc {
    public zzbfh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbuq zzbuqVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbuqVar);
        zzdc(1, zza);
    }
}
