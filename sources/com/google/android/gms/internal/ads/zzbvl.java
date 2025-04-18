package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzbvl extends zzayl implements zzbvn {
    public zzbvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zze(zzbvf zzbvfVar, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbvfVar);
        zzayn.zzf(zza, zzbvqVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzf(zzbvb zzbvbVar, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbvbVar);
        zzayn.zzf(zza, zzbvqVar);
        zzdc(1, zza);
    }
}
