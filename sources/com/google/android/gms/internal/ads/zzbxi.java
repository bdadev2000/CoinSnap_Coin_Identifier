package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbxi extends zzbad implements zzbxk {
    public zzbxi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbbVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, parcelFileDescriptor);
        zzdc(1, zza);
    }
}
