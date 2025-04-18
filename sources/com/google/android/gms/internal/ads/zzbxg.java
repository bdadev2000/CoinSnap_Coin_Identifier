package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbxg extends zzayc {
    public zzbxg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, String str, zzbpg zzbpgVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        zzdb.recycle();
        return readStrongBinder;
    }
}
