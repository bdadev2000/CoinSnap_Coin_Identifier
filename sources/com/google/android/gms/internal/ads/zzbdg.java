package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbdg extends zzayc implements zzbdi {
    public zzbdg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void zze(zzbdf zzbdfVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbdfVar);
        zzdc(1, zza);
    }
}
