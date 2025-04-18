package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbqx extends zzayc implements zzbqz {
    public zzbqx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final void zzg(zzbpv zzbpvVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbpvVar);
        zzdc(1, zza);
    }
}
