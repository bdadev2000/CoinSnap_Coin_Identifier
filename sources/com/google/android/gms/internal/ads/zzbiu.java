package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbiu extends zzbad implements zzbiw {
    public zzbiu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbiw
    public final void zze(zzbim zzbimVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbimVar);
        zzdc(1, zza);
    }
}
