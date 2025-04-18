package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.adview.t;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbpm extends zzayl implements zzbpo {
    public zzbpm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzmVar);
        zza.writeString(str);
        zzayn.zzf(zza, zzbprVar);
        zzdc(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzmVar);
        zza.writeString(str);
        zzayn.zzf(zza, zzbprVar);
        zzdc(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzE() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzF() throws RemoteException {
        zzdc(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzG(boolean z2) throws RemoteException {
        Parcel zza = zza();
        int i2 = zzayn.zza;
        zza.writeInt(z2 ? 1 : 0);
        zzdc(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzdc(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzI() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzdc(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzdc(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzL() throws RemoteException {
        zzdc(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final boolean zzM() throws RemoteException {
        Parcel zzdb = zzdb(22, zza());
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final boolean zzN() throws RemoteException {
        Parcel zzdb = zzdb(13, zza());
        boolean zzg = zzayn.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbpw zzO() throws RemoteException {
        zzbpw zzbpwVar;
        Parcel zzdb = zzdb(15, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbpwVar = queryLocalInterface instanceof zzbpw ? (zzbpw) queryLocalInterface : new zzbpw(readStrongBinder);
        }
        zzdb.recycle();
        return zzbpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbpx zzP() throws RemoteException {
        zzbpx zzbpxVar;
        Parcel zzdb = zzdb(16, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbpxVar = queryLocalInterface instanceof zzbpx ? (zzbpx) queryLocalInterface : new zzbpx(readStrongBinder);
        }
        zzdb.recycle();
        return zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws RemoteException {
        Parcel zzdb = zzdb(26, zza());
        com.google.android.gms.ads.internal.client.zzeb zzb = com.google.android.gms.ads.internal.client.zzea.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbgw zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbpu zzj() throws RemoteException {
        zzbpu zzbpsVar;
        Parcel zzdb = zzdb(36, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbpsVar = queryLocalInterface instanceof zzbpu ? (zzbpu) queryLocalInterface : new zzbps(readStrongBinder);
        }
        zzdb.recycle();
        return zzbpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbqa zzk() throws RemoteException {
        zzbqa zzbpyVar;
        Parcel zzdb = zzdb(27, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbpyVar = queryLocalInterface instanceof zzbqa ? (zzbqa) queryLocalInterface : new zzbpy(readStrongBinder);
        }
        zzdb.recycle();
        return zzbpyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbrz zzl() throws RemoteException {
        Parcel zzdb = zzdb(33, zza());
        zzbrz zzbrzVar = (zzbrz) zzayn.zza(zzdb, zzbrz.CREATOR);
        zzdb.recycle();
        return zzbrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbrz zzm() throws RemoteException {
        Parcel zzdb = zzdb(34, zza());
        zzbrz zzbrzVar = (zzbrz) zzayn.zza(zzdb, zzbrz.CREATOR);
        zzdb.recycle();
        return zzbrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final IObjectWrapper zzn() throws RemoteException {
        return t.d(zzdb(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzo() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwx zzbwxVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzmVar);
        zza.writeString(null);
        zzayn.zzf(zza, zzbwxVar);
        zza.writeString(str2);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzq(IObjectWrapper iObjectWrapper, zzbly zzblyVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzblyVar);
        zza.writeTypedList(list);
        zzdc(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzr(IObjectWrapper iObjectWrapper, zzbwx zzbwxVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbwxVar);
        zza.writeStringList(list);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzmVar);
        zza.writeString(str);
        zzdc(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzmVar);
        zza.writeString(str);
        zzayn.zzf(zza, zzbprVar);
        zzdc(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzsVar);
        zzayn.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzf(zza, zzbprVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzsVar);
        zzayn.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzf(zza, zzbprVar);
        zzdc(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpr zzbprVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzf(zza, zzbprVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpr zzbprVar, zzbfr zzbfrVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzayn.zzf(zza, zzbprVar);
        zzayn.zzd(zza, zzbfrVar);
        zza.writeStringList(list);
        zzdc(14, zza);
    }
}
