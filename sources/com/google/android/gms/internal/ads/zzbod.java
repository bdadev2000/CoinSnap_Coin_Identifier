package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbod extends zzbad implements zzbof {
    public zzbod(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final void zze(int i9) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i9);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final void zzf() throws RemoteException {
        zzdc(1, zza());
    }
}
