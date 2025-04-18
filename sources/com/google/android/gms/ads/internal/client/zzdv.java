package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbpg;

/* loaded from: classes3.dex */
public final class zzdv extends zzayc {
    public zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdu zze(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) throws RemoteException {
        zzdu zzdsVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof zzdu) {
                zzdsVar = (zzdu) queryLocalInterface;
            } else {
                zzdsVar = new zzds(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzdsVar;
    }
}
