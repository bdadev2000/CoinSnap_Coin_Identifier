package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbad extends zzayc implements zzbaf {
    public zzbad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final com.google.android.gms.ads.internal.client.zzby zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final com.google.android.gms.ads.internal.client.zzdy zzf() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzdy zzb = com.google.android.gms.ads.internal.client.zzdx.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzg(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaye.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzh(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzdrVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzi(IObjectWrapper iObjectWrapper, zzbam zzbamVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbamVar);
        zzdc(4, zza);
    }
}
