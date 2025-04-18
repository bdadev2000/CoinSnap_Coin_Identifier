package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbta extends zzayc implements zzbtc {
    public zzbta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbsz zze(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) throws RemoteException {
        zzbsz zzbsxVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof zzbsz) {
                zzbsxVar = (zzbsz) queryLocalInterface;
            } else {
                zzbsxVar = new zzbsx(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbsxVar;
    }
}
