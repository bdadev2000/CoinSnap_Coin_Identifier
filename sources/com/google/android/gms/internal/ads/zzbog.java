package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbog extends zzbad implements zzboi {
    public zzbog(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zze(int i9) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i9);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzg(zzboc zzbocVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbocVar);
        zzdc(1, zza);
    }
}
