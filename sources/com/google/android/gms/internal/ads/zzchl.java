package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzchl extends zzayl implements zzchn {
    public zzchl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zze(IObjectWrapper iObjectWrapper, zzchk zzchkVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzchkVar);
        zzdc(2, zza);
    }
}
