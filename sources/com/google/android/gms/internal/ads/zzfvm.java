package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzfvm extends zzbad implements zzfvo {
    public zzfvm(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final void zze(Bundle bundle, zzfvq zzfvqVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, bundle);
        zzbaf.zzf(zza, zzfvqVar);
        zzdd(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final void zzf(String str, Bundle bundle, zzfvq zzfvqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbaf.zzd(zza, bundle);
        zzbaf.zzf(zza, zzfvqVar);
        zzdd(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final void zzg(Bundle bundle, zzfvq zzfvqVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, bundle);
        zzbaf.zzf(zza, zzfvqVar);
        zzdd(3, zza);
    }
}
