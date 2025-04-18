package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzfts extends zzayc implements zzftu {
    public zzfts(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final void zze(Bundle bundle, zzftw zzftwVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, bundle);
        zzaye.zzf(zza, zzftwVar);
        zzdd(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final void zzf(String str, Bundle bundle, zzftw zzftwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaye.zzd(zza, bundle);
        zzaye.zzf(zza, zzftwVar);
        zzdd(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final void zzg(Bundle bundle, zzftw zzftwVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, bundle);
        zzaye.zzf(zza, zzftwVar);
        zzdd(3, zza);
    }
}
