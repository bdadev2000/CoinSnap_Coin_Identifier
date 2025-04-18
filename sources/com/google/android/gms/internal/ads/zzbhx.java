package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.adview.t;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbhx extends zzayl implements zzbhz {
    public zzbhx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzA() throws RemoteException {
        zzdc(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, bundle);
        zzdc(33, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzC(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, bundle);
        zzdc(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzD() throws RemoteException {
        zzdc(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzE(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzddVar);
        zzdc(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzF(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzdrVar);
        zzdc(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzG(zzbhw zzbhwVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbhwVar);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final boolean zzH() throws RemoteException {
        Parcel zzdb = zzdb(30, zza());
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final boolean zzI() throws RemoteException {
        Parcel zzdb = zzdb(24, zza());
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final boolean zzJ(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, bundle);
        Parcel zzdb = zzdb(16, zza);
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final double zze() throws RemoteException {
        Parcel zzdb = zzdb(8, zza());
        double readDouble = zzdb.readDouble();
        zzdb.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final Bundle zzf() throws RemoteException {
        Parcel zzdb = zzdb(20, zza());
        Bundle bundle = (Bundle) zzayn.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.ads.internal.client.zzdy zzg() throws RemoteException {
        Parcel zzdb = zzdb(31, zza());
        com.google.android.gms.ads.internal.client.zzdy zzb = com.google.android.gms.ads.internal.client.zzdx.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws RemoteException {
        Parcel zzdb = zzdb(11, zza());
        com.google.android.gms.ads.internal.client.zzeb zzb = com.google.android.gms.ads.internal.client.zzea.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final zzbfv zzi() throws RemoteException {
        zzbfv zzbftVar;
        Parcel zzdb = zzdb(14, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbftVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbftVar = queryLocalInterface instanceof zzbfv ? (zzbfv) queryLocalInterface : new zzbft(readStrongBinder);
        }
        zzdb.recycle();
        return zzbftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final zzbfz zzj() throws RemoteException {
        zzbfz zzbfxVar;
        Parcel zzdb = zzdb(29, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbfxVar = queryLocalInterface instanceof zzbfz ? (zzbfz) queryLocalInterface : new zzbfx(readStrongBinder);
        }
        zzdb.recycle();
        return zzbfxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final zzbgc zzk() throws RemoteException {
        zzbgc zzbgaVar;
        Parcel zzdb = zzdb(5, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbgaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbgaVar = queryLocalInterface instanceof zzbgc ? (zzbgc) queryLocalInterface : new zzbga(readStrongBinder);
        }
        zzdb.recycle();
        return zzbgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final IObjectWrapper zzl() throws RemoteException {
        return t.d(zzdb(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final IObjectWrapper zzm() throws RemoteException {
        return t.d(zzdb(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final String zzn() throws RemoteException {
        Parcel zzdb = zzdb(7, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final String zzo() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final String zzp() throws RemoteException {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final String zzq() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final String zzs() throws RemoteException {
        Parcel zzdb = zzdb(10, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final String zzt() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final List zzu() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList zzb = zzayn.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final List zzv() throws RemoteException {
        Parcel zzdb = zzdb(23, zza());
        ArrayList zzb = zzayn.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzw() throws RemoteException {
        zzdc(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzx() throws RemoteException {
        zzdc(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzy(com.google.android.gms.ads.internal.client.zzdh zzdhVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzdhVar);
        zzdc(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, bundle);
        zzdc(15, zza);
    }
}
