package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbzi extends zzayc implements zzbzk {
    public zzbzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final zzbzh zze(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) throws RemoteException {
        zzbzh zzbzfVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbzfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzbzh) {
                zzbzfVar = (zzbzh) queryLocalInterface;
            } else {
                zzbzfVar = new zzbzf(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbzfVar;
    }
}
