package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbvq extends zzayc {
    public zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbaVar);
        zzdc(2, zza);
    }

    public final void zzf(String str, zzbuz zzbuzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaye.zzd(zza, zzbuzVar);
        zzdc(1, zza);
    }
}
