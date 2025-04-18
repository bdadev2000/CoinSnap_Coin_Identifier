package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbft extends zzayc implements zzbfv {
    public zzbft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zze() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zzf() throws RemoteException {
        Parcel zzdb = zzdb(6, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zzg() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws RemoteException {
        Parcel zzdb = zzdb(7, zza());
        com.google.android.gms.ads.internal.client.zzeb zzb = com.google.android.gms.ads.internal.client.zzea.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final IObjectWrapper zzi() throws RemoteException {
        return e.c(zzdb(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final boolean zzk() throws RemoteException {
        Parcel zzdb = zzdb(10, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final boolean zzl() throws RemoteException {
        Parcel zzdb = zzdb(8, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzm(zzbhg zzbhgVar) throws RemoteException {
        throw null;
    }
}
