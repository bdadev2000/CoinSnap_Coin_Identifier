package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbyl extends zzbad implements zzbyn {
    public zzbyl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zze(zzbyh zzbyhVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbyhVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzf() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzg(int i9) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i9);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzh() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzi() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzj() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzk() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzl() throws RemoteException {
        zzdc(3, zza());
    }
}
