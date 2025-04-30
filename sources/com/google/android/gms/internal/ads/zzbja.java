package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbja extends zzbad implements zzbjc {
    public zzbja(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zze(zzbip zzbipVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbipVar);
        zzdc(1, zza);
    }
}
