package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbsw extends zzbad implements zzbsy {
    public zzbsw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzg(zzbru zzbruVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbruVar);
        zzdc(1, zza);
    }
}
