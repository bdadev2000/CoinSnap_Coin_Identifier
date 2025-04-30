package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

/* loaded from: classes2.dex */
public final class zzcg extends zzbad implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzb() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzeVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zze() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() throws RemoteException {
        zzdc(2, zza());
    }
}
