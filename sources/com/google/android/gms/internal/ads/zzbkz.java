package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbkz extends zzayl implements zzblb {
    public zzbkz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final zzbky zze(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2, zzbkv zzbkvVar) throws RemoteException {
        zzbky zzbkwVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        zzayn.zzf(zza, zzbkvVar);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbkwVar = queryLocalInterface instanceof zzbky ? (zzbky) queryLocalInterface : new zzbkw(readStrongBinder);
        }
        zzdb.recycle();
        return zzbkwVar;
    }
}
