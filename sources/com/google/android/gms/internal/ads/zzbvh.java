package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbvh extends zzayc implements zzbvj {
    public zzbvh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(zzbvb zzbvbVar, zzbvm zzbvmVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbvbVar);
        zzaye.zzf(zza, zzbvmVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(zzbuv zzbuvVar, zzbvm zzbvmVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbuvVar);
        zzaye.zzf(zza, zzbvmVar);
        zzdc(1, zza);
    }
}
