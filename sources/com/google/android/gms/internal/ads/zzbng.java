package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbng extends zzbad implements IInterface {
    public zzbng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbna zzbnaVar, zzbnf zzbnfVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbnaVar);
        zzbaf.zzf(zza, zzbnfVar);
        zzdd(2, zza);
    }
}
