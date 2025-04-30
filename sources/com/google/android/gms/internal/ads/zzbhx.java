package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.L;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbhx extends zzbad implements zzbhz {
    public zzbhx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return L.e(zzdb(2, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzc() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzdv(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzdw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzdx(zzbhs zzbhsVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbhsVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzdy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzdz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zze(IObjectWrapper iObjectWrapper, int i9) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zza.writeInt(i9);
        zzdc(5, zza);
    }
}
