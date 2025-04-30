package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

/* loaded from: classes2.dex */
public final class zzdo extends zzbad implements zzdq {
    public zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        int readInt = zzdb.readInt();
        zzdb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() throws RemoteException {
        zzdt zzdrVar;
        Parcel zzdb = zzdb(11, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof zzdt) {
                zzdrVar = (zzdt) queryLocalInterface;
            } else {
                zzdrVar = new zzdr(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzdrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z8) throws RemoteException {
        Parcel zza = zza();
        int i9 = zzbaf.zza;
        zza.writeInt(z8 ? 1 : 0);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzdtVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() throws RemoteException {
        zzdc(13, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() throws RemoteException {
        Parcel zzdb = zzdb(12, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() throws RemoteException {
        Parcel zzdb = zzdb(10, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
