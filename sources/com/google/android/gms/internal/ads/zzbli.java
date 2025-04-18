package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbli extends zzayc {
    public zzbli(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzblc zzblcVar, zzblh zzblhVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzblcVar);
        zzaye.zzf(zza, zzblhVar);
        zzdd(2, zza);
    }
}
