package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzbap extends zzayl implements zzbar {
    public zzbap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzb(int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzd(zzbao zzbaoVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbaoVar);
        zzdc(1, zza);
    }
}
