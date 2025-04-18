package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzchh extends zzayc implements zzchj {
    public zzchh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzchj
    public final void zze(IObjectWrapper iObjectWrapper, zzchg zzchgVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzchgVar);
        zzdc(2, zza);
    }
}
