package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbzm extends zzayl implements zzbzo {
    public zzbzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final zzbzl zze(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) throws RemoteException {
        zzbzl zzbzjVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbzjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbzjVar = queryLocalInterface instanceof zzbzl ? (zzbzl) queryLocalInterface : new zzbzj(readStrongBinder);
        }
        zzdb.recycle();
        return zzbzjVar;
    }
}
