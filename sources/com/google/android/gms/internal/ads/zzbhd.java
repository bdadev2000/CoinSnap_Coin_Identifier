package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbhd extends zzayc implements zzbhf {
    public zzbhd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhf
    public final void zze(zzbgs zzbgsVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbgsVar);
        zzdc(1, zza);
    }
}
