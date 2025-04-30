package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.L;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzq extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() throws RemoteException {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z8) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z8 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String str, boolean z8) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z8 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String str, int i9) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i9);
        return L.e(zzB(2, zza));
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String str, int i9, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i9);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper2);
        return L.e(zzB(8, zza));
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, int i9) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i9);
        return L.e(zzB(4, zza));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, boolean z8, long j7) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z8 ? 1 : 0);
        zza.writeLong(j7);
        return L.e(zzB(7, zza));
    }
}
