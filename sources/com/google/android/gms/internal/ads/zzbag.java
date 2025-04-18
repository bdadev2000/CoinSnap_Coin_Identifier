package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbag extends zzayc implements zzbai {
    public zzbag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzb(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzd(zzbaf zzbafVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbafVar);
        zzdc(1, zza);
    }
}
