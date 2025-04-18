package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbgg extends zzayc implements zzbgi {
    public zzbgg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzc(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzd() throws RemoteException {
        zzdc(2, zza());
    }
}
