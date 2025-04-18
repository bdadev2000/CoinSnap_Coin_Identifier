package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbho extends zzayl implements zzbhq {
    public zzbho(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zze(zzbhz zzbhzVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbhzVar);
        zzdc(1, zza);
    }
}
