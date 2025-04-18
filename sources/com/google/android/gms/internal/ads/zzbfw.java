package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbfw extends zzayc implements zzbfy {
    public zzbfw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final double zzb() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        double readDouble = zzdb.readDouble();
        zzdb.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final int zzc() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        int readInt = zzdb.readInt();
        zzdb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final int zzd() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        int readInt = zzdb.readInt();
        zzdb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final Uri zze() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        Uri uri = (Uri) zzaye.zza(zzdb, Uri.CREATOR);
        zzdb.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final IObjectWrapper zzf() throws RemoteException {
        return e.c(zzdb(1, zza()));
    }
}
