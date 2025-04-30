package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbyy extends zzbad implements zzbza {
    public zzbyy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final Bundle zzb() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        Bundle bundle = (Bundle) zzbaf.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel zzdb = zzdb(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final zzbyx zzd() throws RemoteException {
        zzbyx zzbyvVar;
        Parcel zzdb = zzdb(11, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbyvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof zzbyx) {
                zzbyvVar = (zzbyx) queryLocalInterface;
            } else {
                zzbyvVar = new zzbyv(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbzh zzbzhVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzlVar);
        zzbaf.zzf(zza, zzbzhVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbzh zzbzhVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzlVar);
        zzbaf.zzf(zza, zzbzhVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzh(boolean z8) throws RemoteException {
        Parcel zza = zza();
        int i9 = zzbaf.zza;
        zza.writeInt(z8 ? 1 : 0);
        zzdc(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzddVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzdgVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzk(zzbzd zzbzdVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbzdVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzl(zzbzo zzbzoVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbzoVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z8) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzp(zzbzi zzbziVar) throws RemoteException {
        throw null;
    }
}
