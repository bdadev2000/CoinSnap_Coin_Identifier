package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbrf;

/* loaded from: classes2.dex */
public final class zzbv extends zzbad implements IInterface {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbrf zzbrfVar, int i9, int i10) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzqVar);
        zza.writeString(str);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        zza.writeInt(i10);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        zzdb.recycle();
        return readStrongBinder;
    }
}
