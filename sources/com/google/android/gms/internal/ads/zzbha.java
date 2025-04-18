package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbha extends zzayc implements zzbhc {
    public zzbha(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zze(zzbgs zzbgsVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbgsVar);
        zza.writeString(str);
        zzdc(1, zza);
    }
}
