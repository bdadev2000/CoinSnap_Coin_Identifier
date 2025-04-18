package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbvn extends zzayc implements zzbvp {
    public zzbvn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbaVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, parcelFileDescriptor);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvx zzbvxVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, parcelFileDescriptor);
        zzaye.zzd(zza, zzbvxVar);
        zzdc(3, zza);
    }
}
