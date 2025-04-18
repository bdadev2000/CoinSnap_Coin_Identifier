package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbak extends zzayc implements zzbam {
    public zzbak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzb() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzc() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zze() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzf() throws RemoteException {
        zzdc(1, zza());
    }
}
