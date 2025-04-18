package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzbpl;

/* loaded from: classes.dex */
public final class zzbv extends zzayl implements IInterface {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, String str, zzbpl zzbplVar, int i2) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        zzdb.recycle();
        return readStrongBinder;
    }
}
