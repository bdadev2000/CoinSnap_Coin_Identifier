package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbce extends zzbad implements zzbcg {
    public zzbce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final com.google.android.gms.ads.internal.client.zzdn zzf() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzg(boolean z8) throws RemoteException {
        Parcel zza = zza();
        int i9 = zzbaf.zza;
        zza.writeInt(z8 ? 1 : 0);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzdgVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzi(IObjectWrapper iObjectWrapper, zzbcn zzbcnVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbcnVar);
        zzdc(4, zza);
    }
}
