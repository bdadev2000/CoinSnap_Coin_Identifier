package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbva extends zzbad implements zzbvc {
    public zzbva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final zzbuz zze(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9) throws RemoteException {
        zzbuz zzbuxVar;
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbuxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof zzbuz) {
                zzbuxVar = (zzbuz) queryLocalInterface;
            } else {
                zzbuxVar = new zzbux(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbuxVar;
    }
}
