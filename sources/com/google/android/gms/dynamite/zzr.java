package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzr extends com.google.android.gms.internal.common.zza {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper2);
        return e.c(zzB(2, zza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper2);
        return e.c(zzB(3, zza));
    }
}
