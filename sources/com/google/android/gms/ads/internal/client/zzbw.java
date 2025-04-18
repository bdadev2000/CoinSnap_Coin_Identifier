package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.adview.t;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbws;

/* loaded from: classes.dex */
public final class zzbw extends zzayl implements zzby {
    public zzbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws RemoteException {
        zzdc(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbiVar);
        zzdc(20, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzblVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzsVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzsVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzcmVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbar zzbarVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbarVar);
        zzdc(40, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzyVar);
        zzdc(39, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzctVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzctVar);
        zzdc(45, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzefVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z2) throws RemoteException {
        Parcel zza = zza();
        int i2 = zzayn.zza;
        zza.writeInt(z2 ? 1 : 0);
        zzdc(34, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtv zzbtvVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z2) throws RemoteException {
        Parcel zza = zza();
        int i2 = zzayn.zza;
        zza.writeInt(z2 ? 1 : 0);
        zzdc(22, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(zzbdq zzbdqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzdrVar);
        zzdc(42, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbty zzbtyVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbws zzbwsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzgb zzgbVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzgbVar);
        zzdc(29, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzdc(44, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws RemoteException {
        Parcel zzdb = zzdb(46, zza());
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() throws RemoteException {
        Parcel zzdb = zzdb(23, zza());
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(zzm zzmVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzmVar);
        Parcel zzdb = zzdb(4, zza);
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() throws RemoteException {
        Parcel zzdb = zzdb(12, zza());
        zzs zzsVar = (zzs) zzayn.zza(zzdb, zzs.CREATOR);
        zzdb.recycle();
        return zzsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() throws RemoteException {
        zzbl zzbjVar;
        Parcel zzdb = zzdb(33, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbjVar = queryLocalInterface instanceof zzbl ? (zzbl) queryLocalInterface : new zzbj(readStrongBinder);
        }
        zzdb.recycle();
        return zzbjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() throws RemoteException {
        zzcm zzckVar;
        Parcel zzdb = zzdb(32, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzckVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzckVar = queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(readStrongBinder);
        }
        zzdb.recycle();
        return zzckVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzdy zzk() throws RemoteException {
        zzdy zzdwVar;
        Parcel zzdb = zzdb(41, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdwVar = queryLocalInterface instanceof zzdy ? (zzdy) queryLocalInterface : new zzdw(readStrongBinder);
        }
        zzdb.recycle();
        return zzdwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() throws RemoteException {
        zzeb zzdzVar;
        Parcel zzdb = zzdb(26, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdzVar = queryLocalInterface instanceof zzeb ? (zzeb) queryLocalInterface : new zzdz(readStrongBinder);
        }
        zzdb.recycle();
        return zzdzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() throws RemoteException {
        return t.d(zzdb(1, zza()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() throws RemoteException {
        Parcel zzdb = zzdb(31, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzmVar, zzbo zzboVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzmVar);
        zzayn.zzf(zza, zzboVar);
        zzdc(43, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws RemoteException {
        zzdc(5, zza());
    }
}
