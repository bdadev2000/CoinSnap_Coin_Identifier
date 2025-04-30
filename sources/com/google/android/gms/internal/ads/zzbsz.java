package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbsz extends zzbad implements zzbtb {
    public zzbsz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzeVar);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzg() throws RemoteException {
        zzdc(2, zza());
    }
}
