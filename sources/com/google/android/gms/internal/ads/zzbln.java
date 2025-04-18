package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbln extends zzayl implements IInterface {
    public zzbln(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzblh zzblhVar, zzblm zzblmVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzblhVar);
        zzayn.zzf(zza, zzblmVar);
        zzdd(2, zza);
    }
}
