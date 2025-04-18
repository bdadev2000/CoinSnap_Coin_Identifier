package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbhk extends zzayc implements zzbhm {
    public zzbhk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhm
    public final void zze(zzbhv zzbhvVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbhvVar);
        zzdc(1, zza);
    }
}
