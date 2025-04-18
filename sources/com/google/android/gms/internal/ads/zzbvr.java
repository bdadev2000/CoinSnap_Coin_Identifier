package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzbvr extends zzayl implements zzbvt {
    public zzbvr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbbVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, parcelFileDescriptor);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbwa zzbwaVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, parcelFileDescriptor);
        zzayn.zzd(zza, zzbwaVar);
        zzdc(3, zza);
    }
}
