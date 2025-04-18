package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzfva extends zzayl implements zzfvc {
    public zzfva(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final void zze(Bundle bundle, zzfve zzfveVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, bundle);
        zzayn.zzf(zza, zzfveVar);
        zzdd(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final void zzf(String str, Bundle bundle, zzfve zzfveVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayn.zzd(zza, bundle);
        zzayn.zzf(zza, zzfveVar);
        zzdd(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final void zzg(Bundle bundle, zzfve zzfveVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, bundle);
        zzayn.zzf(zza, zzfveVar);
        zzdd(3, zza);
    }
}
