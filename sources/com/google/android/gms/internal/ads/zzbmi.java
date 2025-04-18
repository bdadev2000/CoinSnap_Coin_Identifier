package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbmi extends zzayc implements zzbmk {
    public zzbmi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zze(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzeVar);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzg(zzbme zzbmeVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbmeVar);
        zzdc(1, zza);
    }
}
