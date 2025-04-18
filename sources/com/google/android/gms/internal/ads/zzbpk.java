package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbpk extends zzayc implements zzbpm {
    public zzbpk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zze() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzf() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzeVar);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzi(int i10, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeString(str);
        zzdc(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzj(int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzeVar);
        zzdc(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzm() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzn() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzo() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzp() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzr(zzbgs zzbgsVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbgsVar);
        zza.writeString(str);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzs(zzbwv zzbwvVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzt(zzbwz zzbwzVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbwzVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzu() throws RemoteException {
        zzdc(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzv() throws RemoteException {
        zzdc(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzw() throws RemoteException {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzx() throws RemoteException {
        zzdc(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzy() throws RemoteException {
        zzdc(13, zza());
    }
}
