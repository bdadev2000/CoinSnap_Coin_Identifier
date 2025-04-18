package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbhh extends zzayc implements zzbhj {
    public zzbhh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zze(com.google.android.gms.ads.internal.client.zzby zzbyVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbyVar);
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(1, zza);
    }
}
