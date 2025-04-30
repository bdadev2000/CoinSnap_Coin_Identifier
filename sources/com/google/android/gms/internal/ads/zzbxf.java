package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbxf extends zzbad implements zzbxh {
    public zzbxf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zze(zzbwz zzbwzVar, zzbxk zzbxkVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbwzVar);
        zzbaf.zzf(zza, zzbxkVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzf(zzbwv zzbwvVar, zzbxk zzbxkVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbwvVar);
        zzbaf.zzf(zza, zzbxkVar);
        zzdc(1, zza);
    }
}
