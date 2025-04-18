package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbku extends zzayc implements zzbkw {
    public zzbku(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final zzbkt zze(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10, zzbkq zzbkqVar) throws RemoteException {
        zzbkt zzbkrVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        zzaye.zzf(zza, zzbkqVar);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (queryLocalInterface instanceof zzbkt) {
                zzbkrVar = (zzbkt) queryLocalInterface;
            } else {
                zzbkrVar = new zzbkr(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbkrVar;
    }
}
