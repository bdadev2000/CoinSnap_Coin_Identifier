package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbzb extends zzbad implements zzbzd {
    public zzbzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zze() throws RemoteException {
        zzdc(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzf() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzg() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzh(int i9) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i9);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzeVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzj() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzk(zzbyx zzbyxVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbyxVar);
        zzdc(3, zza);
    }
}
