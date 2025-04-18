package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbmn extends zzayl implements zzbmp {
    public zzbmn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zze(int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzg(zzbmj zzbmjVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbmjVar);
        zzdc(1, zza);
    }
}
