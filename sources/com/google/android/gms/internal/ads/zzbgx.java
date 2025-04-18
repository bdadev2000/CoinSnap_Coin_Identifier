package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbgx extends zzayc implements zzbgz {
    public zzbgx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zze(zzbgp zzbgpVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbgpVar);
        zzdc(1, zza);
    }
}
