package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbvd extends zzayc implements zzbvf {
    public zzbvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zze(zzbvx zzbvxVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbvxVar);
        zzaye.zzf(zza, zzbvpVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzf(zzbvx zzbvxVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbvxVar);
        zzaye.zzf(zza, zzbvpVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzg(zzbvx zzbvxVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbvxVar);
        zzaye.zzf(zza, zzbvpVar);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzh(String str, zzbvp zzbvpVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaye.zzf(zza, zzbvpVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzi(zzbuz zzbuzVar, zzbvq zzbvqVar) throws RemoteException {
        throw null;
    }
}
