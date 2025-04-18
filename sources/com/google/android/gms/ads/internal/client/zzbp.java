package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* loaded from: classes3.dex */
public final class zzbp extends zzayc implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzmVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzmVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(zzm zzmVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzmVar);
        zza.writeInt(i10);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
