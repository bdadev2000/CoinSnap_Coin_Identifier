package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbch extends zzbad implements zzbcj {
    public zzbch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzb(int i9) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i9);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzd(zzbcg zzbcgVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbcgVar);
        zzdc(1, zza);
    }
}
