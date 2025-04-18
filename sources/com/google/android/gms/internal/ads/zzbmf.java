package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbmf extends zzayc implements zzbmh {
    public zzbmf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zze(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zzf() throws RemoteException {
        zzdc(1, zza());
    }
}
