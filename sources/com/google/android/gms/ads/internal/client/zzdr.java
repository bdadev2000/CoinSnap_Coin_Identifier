package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

/* loaded from: classes2.dex */
public final class zzdr extends zzbad implements zzdt {
    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzf(boolean z8) throws RemoteException {
        Parcel zza = zza();
        int i9 = zzbaf.zza;
        zza.writeInt(z8 ? 1 : 0);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() throws RemoteException {
        zzdc(1, zza());
    }
}
