package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbvk extends zzayc implements zzbvm {
    public zzbvk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbaVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, parcelFileDescriptor);
        zzdc(1, zza);
    }
}
