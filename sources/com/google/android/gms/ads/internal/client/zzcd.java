package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;

/* loaded from: classes.dex */
public final class zzcd extends zzayl implements zzcf {
    public zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(zzfu zzfuVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzfuVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(zzfu zzfuVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzfuVar);
        zzdc(2, zza);
    }
}
