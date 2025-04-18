package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes4.dex */
public final class zzbam extends zzayl implements zzbao {
    public zzbam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final com.google.android.gms.ads.internal.client.zzby zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final com.google.android.gms.ads.internal.client.zzdy zzf() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzdy zzb = com.google.android.gms.ads.internal.client.zzdx.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzg(boolean z2) throws RemoteException {
        Parcel zza = zza();
        int i2 = zzayn.zza;
        zza.writeInt(z2 ? 1 : 0);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzh(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzdrVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzi(IObjectWrapper iObjectWrapper, zzbav zzbavVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbavVar);
        zzdc(4, zza);
    }
}
