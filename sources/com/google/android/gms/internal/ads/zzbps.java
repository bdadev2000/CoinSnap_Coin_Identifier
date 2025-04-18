package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbps extends zzayc {
    public zzbps(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        Bundle bundle = (Bundle) zzaye.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzeb zzf() throws RemoteException {
        Parcel zzdb = zzdb(16, zza());
        com.google.android.gms.ads.internal.client.zzeb zzb = com.google.android.gms.ads.internal.client.zzea.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    public final zzbfr zzg() throws RemoteException {
        Parcel zzdb = zzdb(19, zza());
        zzbfr zzj = zzbfq.zzj(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzj;
    }

    public final zzbfy zzh() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        zzbfy zzg = zzbfx.zzg(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzg;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        return e.c(zzdb(15, zza()));
    }

    public final IObjectWrapper zzj() throws RemoteException {
        return e.c(zzdb(20, zza()));
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return e.c(zzdb(21, zza()));
    }

    public final String zzl() throws RemoteException {
        Parcel zzdb = zzdb(7, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    public final String zzm() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    public final String zzn() throws RemoteException {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    public final List zzp() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList zzb = zzaye.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(9, zza);
    }

    public final void zzr() throws RemoteException {
        zzdc(8, zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(10, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, iObjectWrapper2);
        zzaye.zzf(zza, iObjectWrapper3);
        zzdc(22, zza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(14, zza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel zzdb = zzdb(12, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    public final boolean zzw() throws RemoteException {
        Parcel zzdb = zzdb(11, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
