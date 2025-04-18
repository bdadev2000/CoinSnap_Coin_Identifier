package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* loaded from: classes3.dex */
public final class zzcd extends zzayc implements zzcf {
    public zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(zzft zzftVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzftVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(zzft zzftVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzftVar);
        zzdc(2, zza);
    }
}
