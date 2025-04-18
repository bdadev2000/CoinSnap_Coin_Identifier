package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* loaded from: classes3.dex */
public final class zzec extends zzayc implements zzee {
    public zzec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaye.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() throws RemoteException {
        zzdc(1, zza());
    }
}
