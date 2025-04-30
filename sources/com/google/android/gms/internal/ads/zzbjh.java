package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbjh extends zzbad implements zzbjj {
    public zzbjh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zze(zzbjs zzbjsVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbjsVar);
        zzdc(1, zza);
    }
}
