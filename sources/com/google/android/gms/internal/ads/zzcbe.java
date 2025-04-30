package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.L;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcbe extends zzbad implements zzcbg {
    public zzcbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, iObjectWrapper2);
        zza.writeString(str);
        zzbaf.zzf(zza, iObjectWrapper3);
        return L.e(zzdb(11, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(IObjectWrapper iObjectWrapper, zzcbk zzcbkVar, zzcbd zzcbdVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzcbkVar);
        zzbaf.zzf(zza, zzcbdVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(zzbwe zzbweVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbweVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbvvVar);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbvvVar);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbvvVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbvvVar);
        zzdc(5, zza);
    }
}
