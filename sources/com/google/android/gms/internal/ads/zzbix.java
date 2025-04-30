package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbix extends zzbad implements zzbiz {
    public zzbix(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zze(zzbip zzbipVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbipVar);
        zza.writeString(str);
        zzdc(1, zza);
    }
}
