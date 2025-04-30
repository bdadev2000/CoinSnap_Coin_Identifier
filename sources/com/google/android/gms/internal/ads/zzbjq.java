package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.L;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbjq extends zzbad implements zzbjs {
    public zzbjq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzA() throws RemoteException {
        zzdc(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, bundle);
        zzdc(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzC() throws RemoteException {
        zzdc(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzcsVar);
        zzdc(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzdgVar);
        zzdc(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzF(zzbjp zzbjpVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbjpVar);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final boolean zzG() throws RemoteException {
        Parcel zzdb = zzdb(30, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final boolean zzH() throws RemoteException {
        Parcel zzdb = zzdb(24, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, bundle);
        Parcel zzdb = zzdb(16, zza);
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final double zze() throws RemoteException {
        Parcel zzdb = zzdb(8, zza());
        double readDouble = zzdb.readDouble();
        zzdb.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final Bundle zzf() throws RemoteException {
        Parcel zzdb = zzdb(20, zza());
        Bundle bundle = (Bundle) zzbaf.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        Parcel zzdb = zzdb(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzdb = zzdb(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final zzbho zzi() throws RemoteException {
        zzbho zzbhmVar;
        Parcel zzdb = zzdb(14, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbhmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof zzbho) {
                zzbhmVar = (zzbho) queryLocalInterface;
            } else {
                zzbhmVar = new zzbhm(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbhmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final zzbhs zzj() throws RemoteException {
        zzbhs zzbhqVar;
        Parcel zzdb = zzdb(29, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final zzbhv zzk() throws RemoteException {
        zzbhv zzbhtVar;
        Parcel zzdb = zzdb(5, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final IObjectWrapper zzl() throws RemoteException {
        return L.e(zzdb(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final IObjectWrapper zzm() throws RemoteException {
        return L.e(zzdb(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzn() throws RemoteException {
        Parcel zzdb = zzdb(7, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzo() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzp() throws RemoteException {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzq() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzs() throws RemoteException {
        Parcel zzdb = zzdb(10, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzt() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final List zzu() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList zzb = zzbaf.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final List zzv() throws RemoteException {
        Parcel zzdb = zzdb(23, zza());
        ArrayList zzb = zzbaf.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzw() throws RemoteException {
        zzdc(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzx() throws RemoteException {
        zzdc(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzcwVar);
        zzdc(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, bundle);
        zzdc(15, zza);
    }
}
