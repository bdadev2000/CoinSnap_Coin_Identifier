package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbws extends zzayc implements zzbwu {
    public zzbws(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzg(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zza.writeInt(i10);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzk(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzm(IObjectWrapper iObjectWrapper, zzbwv zzbwvVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzbwvVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(5, zza);
    }
}
