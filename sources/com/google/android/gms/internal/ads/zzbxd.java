package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbxd extends zzayc implements zzbxf {
    public zzbxd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zze() throws RemoteException {
        zzdc(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzg() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzh(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzeVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzj() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzk(zzbwz zzbwzVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbwzVar);
        zzdc(3, zza);
    }
}
