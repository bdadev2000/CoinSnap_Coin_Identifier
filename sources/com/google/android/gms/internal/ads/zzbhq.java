package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.L;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbhq extends zzbad implements zzbhs {
    public zzbhq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final float zze() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final float zzf() throws RemoteException {
        Parcel zzdb = zzdb(6, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final float zzg() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzdb = zzdb(7, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final IObjectWrapper zzi() throws RemoteException {
        return L.e(zzdb(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final boolean zzk() throws RemoteException {
        Parcel zzdb = zzdb(10, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final boolean zzl() throws RemoteException {
        Parcel zzdb = zzdb(8, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final void zzm(zzbjd zzbjdVar) throws RemoteException {
        throw null;
    }
}
