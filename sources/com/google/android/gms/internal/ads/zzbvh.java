package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzbvh extends zzayl implements zzbvj {
    public zzbvh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(zzbwa zzbwaVar, zzbvt zzbvtVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbwaVar);
        zzayn.zzf(zza, zzbvtVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(zzbwa zzbwaVar, zzbvt zzbvtVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbwaVar);
        zzayn.zzf(zza, zzbvtVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(zzbwa zzbwaVar, zzbvt zzbvtVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbwaVar);
        zzayn.zzf(zza, zzbvtVar);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzh(String str, zzbvt zzbvtVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayn.zzf(zza, zzbvtVar);
        zzdc(7, zza);
    }
}
