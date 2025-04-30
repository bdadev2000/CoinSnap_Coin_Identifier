package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbms extends zzbad implements zzbmu {
    public zzbms(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final zzbmr zze(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9, zzbmo zzbmoVar) throws RemoteException {
        zzbmr zzbmpVar;
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        zzbaf.zzf(zza, zzbmoVar);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (queryLocalInterface instanceof zzbmr) {
                zzbmpVar = (zzbmr) queryLocalInterface;
            } else {
                zzbmpVar = new zzbmp(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbmpVar;
    }
}
