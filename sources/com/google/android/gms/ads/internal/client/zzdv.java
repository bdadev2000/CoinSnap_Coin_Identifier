package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzbpl;

/* loaded from: classes3.dex */
public final class zzdv extends zzayl implements IInterface {
    public zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdu zze(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) throws RemoteException {
        zzdu zzdsVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdsVar = queryLocalInterface instanceof zzdu ? (zzdu) queryLocalInterface : new zzds(readStrongBinder);
        }
        zzdb.recycle();
        return zzdsVar;
    }
}
