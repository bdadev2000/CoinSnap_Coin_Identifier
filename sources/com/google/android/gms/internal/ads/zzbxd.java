package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbxd extends zzayl implements zzbxf {
    public zzbxd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final Bundle zzb() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        Bundle bundle = (Bundle) zzayn.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final com.google.android.gms.ads.internal.client.zzdy zzc() throws RemoteException {
        Parcel zzdb = zzdb(12, zza());
        com.google.android.gms.ads.internal.client.zzdy zzb = com.google.android.gms.ads.internal.client.zzdx.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final zzbxc zzd() throws RemoteException {
        zzbxc zzbxaVar;
        Parcel zzdb = zzdb(11, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbxaVar = queryLocalInterface instanceof zzbxc ? (zzbxc) queryLocalInterface : new zzbxa(readStrongBinder);
        }
        zzdb.recycle();
        return zzbxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxm zzbxmVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, zzbxmVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxm zzbxmVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, zzbxmVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzh(boolean z2) throws RemoteException {
        Parcel zza = zza();
        int i2 = zzayn.zza;
        zza.writeInt(z2 ? 1 : 0);
        zzdc(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzi(com.google.android.gms.ads.internal.client.zzdo zzdoVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzdoVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzj(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzdrVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzk(zzbxi zzbxiVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbxiVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzl(zzbxt zzbxtVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbxtVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzp(zzbxn zzbxnVar) throws RemoteException {
        throw null;
    }
}
