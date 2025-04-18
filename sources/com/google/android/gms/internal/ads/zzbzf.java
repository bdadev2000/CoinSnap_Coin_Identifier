package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbzf extends zzayc implements zzbzh {
    public zzbzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, iObjectWrapper2);
        zza.writeString(str);
        zzaye.zzf(zza, iObjectWrapper3);
        return e.c(zzdb(11, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(IObjectWrapper iObjectWrapper, zzbzl zzbzlVar, zzbze zzbzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzbzlVar);
        zzaye.zzf(zza, zzbzeVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbue zzbueVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbueVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbtvVar);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbtvVar);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbtvVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbtvVar);
        zzdc(5, zza);
    }
}
