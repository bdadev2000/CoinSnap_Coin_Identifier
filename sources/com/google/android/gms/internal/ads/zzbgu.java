package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbgu extends zzayc implements zzbgw {
    public zzbgu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zze(zzbgn zzbgnVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbgnVar);
        zzdc(1, zza);
    }
}
