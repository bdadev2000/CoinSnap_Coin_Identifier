package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbga extends zzayc implements zzbgc {
    public zzbga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return e.c(zzdb(2, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zzc() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zzdv(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zzdw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zzdx(zzbfv zzbfvVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbfvVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zzdy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zzdz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zze(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zza.writeInt(i10);
        zzdc(5, zza);
    }
}
