package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbqr extends zzayc implements zzbqt {
    public zzbqr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzh(zzbpp zzbppVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbppVar);
        zzdc(4, zza);
    }
}
