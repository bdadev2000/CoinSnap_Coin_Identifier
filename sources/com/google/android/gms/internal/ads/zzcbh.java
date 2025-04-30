package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcbh extends zzbad implements zzcbj {
    public zzcbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzcbg zze(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9) throws RemoteException {
        zzcbg zzcbeVar;
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcbeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzcbg) {
                zzcbeVar = (zzcbg) queryLocalInterface;
            } else {
                zzcbeVar = new zzcbe(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzcbeVar;
    }
}
