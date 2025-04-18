package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* loaded from: classes3.dex */
public final class zzcr extends zzayc implements zzct {
    public zzcr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzb() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzc() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzd(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzeVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zze() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzf() throws RemoteException {
        zzdc(2, zza());
    }
}
