package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbxl extends zzbad implements zzbxn {
    public zzbxl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbbVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, parcelFileDescriptor);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxu zzbxuVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, parcelFileDescriptor);
        zzbaf.zzd(zza, zzbxuVar);
        zzdc(3, zza);
    }
}
