package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.L;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbin extends zzbad implements zzbip {
    public zzbin(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final zzbhs zzf() throws RemoteException {
        zzbhs zzbhqVar;
        Parcel zzdb = zzdb(16, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbhqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof zzbhs) {
                zzbhqVar = (zzbhs) queryLocalInterface;
            } else {
                zzbhqVar = new zzbhq(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final zzbhv zzg(String str) throws RemoteException {
        zzbhv zzbhtVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbhtVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzbhv) {
                zzbhtVar = (zzbhv) queryLocalInterface;
            } else {
                zzbhtVar = new zzbht(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final IObjectWrapper zzh() throws RemoteException {
        return L.e(zzdb(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final String zzi() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final String zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzdb = zzdb(1, zza);
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final List zzk() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList<String> createStringArrayList = zzdb.createStringArrayList();
        zzdb.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzl() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzm() throws RemoteException {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzo() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzq() throws RemoteException {
        Parcel zzdb = zzdb(12, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(17, zza);
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(10, zza);
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzt() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
