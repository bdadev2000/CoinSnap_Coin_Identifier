package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbpg;

/* loaded from: classes3.dex */
public final class zzbz extends zzayc {
    public zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpg zzbpgVar, int i10, int i11) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzsVar);
        zza.writeString(str);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        zza.writeInt(i11);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        zzdb.recycle();
        return readStrongBinder;
    }
}
