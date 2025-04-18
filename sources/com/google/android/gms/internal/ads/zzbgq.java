package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbgq extends zzayc implements zzbgs {
    public zzbgq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final com.google.android.gms.ads.internal.client.zzeb zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzbfv zzf() throws RemoteException {
        zzbfv zzbftVar;
        Parcel zzdb = zzdb(16, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbftVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof zzbfv) {
                zzbftVar = (zzbfv) queryLocalInterface;
            } else {
                zzbftVar = new zzbft(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzbfy zzg(String str) throws RemoteException {
        zzbfy zzbfwVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzbfy) {
                zzbfwVar = (zzbfy) queryLocalInterface;
            } else {
                zzbfwVar = new zzbfw(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbfwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final IObjectWrapper zzh() throws RemoteException {
        return e.c(zzdb(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzi() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(1, zza);
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final List zzk() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList<String> createStringArrayList = zzdb.createStringArrayList();
        zzdb.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzl() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzm() throws RemoteException {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzo() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzq() throws RemoteException {
        Parcel zzdb = zzdb(12, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(17, zza);
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(10, zza);
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzt() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
