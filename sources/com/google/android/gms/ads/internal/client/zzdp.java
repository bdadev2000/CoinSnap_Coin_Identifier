package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* loaded from: classes3.dex */
public final class zzdp extends zzayc implements zzdr {
    public zzdp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final void zze(zzu zzuVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzuVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final boolean zzf() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
