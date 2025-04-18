package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbwn extends zzayc implements zzbwp {
    public zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zze(zzbwj zzbwjVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbwjVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzf() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzh() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzk() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzl() throws RemoteException {
        zzdc(3, zza());
    }
}
