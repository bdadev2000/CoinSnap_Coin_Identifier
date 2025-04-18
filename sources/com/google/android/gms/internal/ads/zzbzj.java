package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.adview.t;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbzj extends zzayl implements zzbzl {
    public zzbzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, iObjectWrapper2);
        zza.writeString(str);
        zzayn.zzf(zza, iObjectWrapper3);
        return t.d(zzdb(11, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzf(IObjectWrapper iObjectWrapper, zzbzp zzbzpVar, zzbzi zzbziVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzbzpVar);
        zzayn.zzf(zza, zzbziVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzg(zzbuk zzbukVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbukVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbub zzbubVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbubVar);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbub zzbubVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbubVar);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbub zzbubVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbubVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbub zzbubVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbubVar);
        zzdc(5, zza);
    }
}
