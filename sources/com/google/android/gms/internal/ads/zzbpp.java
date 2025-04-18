package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzbpp extends zzayl implements zzbpr {
    public zzbpp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zze() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzf() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzg(int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzeVar);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzi(int i2, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i2);
        zza.writeString(str);
        zzdc(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzj(int i2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzeVar);
        zzdc(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzm() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzn() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzo() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzp() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzr(zzbgw zzbgwVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbgwVar);
        zza.writeString(str);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzs(zzbwy zzbwyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzt(zzbxc zzbxcVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbxcVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzu() throws RemoteException {
        zzdc(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzv() throws RemoteException {
        zzdc(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzw() throws RemoteException {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzx() throws RemoteException {
        zzdc(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzy() throws RemoteException {
        zzdc(13, zza());
    }
}
