package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;

/* loaded from: classes.dex */
public final class zzbj extends zzayl implements zzbl {
    public zzbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzeVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() throws RemoteException {
        zzdc(7, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() throws RemoteException {
        zzdc(9, zza());
    }
}
