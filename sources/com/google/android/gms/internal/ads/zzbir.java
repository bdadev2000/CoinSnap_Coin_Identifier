package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbir extends zzbad implements zzbit {
    public zzbir(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbit
    public final void zze(zzbik zzbikVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbikVar);
        zzdc(1, zza);
    }
}
