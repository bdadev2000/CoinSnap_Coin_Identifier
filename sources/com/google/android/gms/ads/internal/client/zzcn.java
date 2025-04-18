package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbxe;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzl;

/* loaded from: classes.dex */
public final class zzcn extends zzayl implements zzcp {
    public zzcn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(IObjectWrapper iObjectWrapper, String str, zzbpl zzbplVar, int i2) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(3, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpl zzbplVar, int i2) throws RemoteException {
        zzby zzbwVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzsVar);
        zza.writeString(str);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(13, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzbw(readStrongBinder);
        }
        zzdb.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpl zzbplVar, int i2) throws RemoteException {
        zzby zzbwVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzsVar);
        zza.writeString(str);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzbw(readStrongBinder);
        }
        zzdb.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpl zzbplVar, int i2) throws RemoteException {
        zzby zzbwVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzsVar);
        zza.writeString(str);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzbw(readStrongBinder);
        }
        zzdb.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, int i2) throws RemoteException {
        zzby zzbwVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzd(zza, zzsVar);
        zza.writeString(str);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(10, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzbw(readStrongBinder);
        }
        zzdb.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) throws RemoteException {
        zzci zzcgVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(18, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcgVar = queryLocalInterface instanceof zzci ? (zzci) queryLocalInterface : new zzcg(readStrongBinder);
        }
        zzdb.recycle();
        return zzcgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzcz zzcxVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(9, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcxVar = queryLocalInterface instanceof zzcz ? (zzcz) queryLocalInterface : new zzcx(readStrongBinder);
        }
        zzdb.recycle();
        return zzcxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) throws RemoteException {
        zzdu zzdsVar;
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(17, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdsVar = queryLocalInterface instanceof zzdu ? (zzdu) queryLocalInterface : new zzds(readStrongBinder);
        }
        zzdb.recycle();
        return zzdsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgg zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, iObjectWrapper2);
        Parcel zzdb = zzdb(5, zza);
        zzbgg zzdA = zzbgf.zzdA(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzdA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgm zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, iObjectWrapper2);
        zzayn.zzf(zza, iObjectWrapper3);
        Parcel zzdb = zzdb(11, zza);
        zzbgm zze = zzbgl.zze(zzdb.readStrongBinder());
        zzdb.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbky zzl(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2, zzbkv zzbkvVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        zzayn.zzf(zza, zzbkvVar);
        Parcel zzdb = zzdb(16, zza);
        zzbky zzb = zzbkx.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbtf zzm(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(15, zza);
        zzbtf zzb = zzbte.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbtm zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(8, zza);
        zzbtm zzI = zzbtl.zzI(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbwp zzo(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbxf zzp(IObjectWrapper iObjectWrapper, String str, zzbpl zzbplVar, int i2) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(12, zza);
        zzbxf zzq = zzbxe.zzq(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbzl zzq(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, iObjectWrapper);
        zzayn.zzf(zza, zzbplVar);
        zza.writeInt(243220000);
        Parcel zzdb = zzdb(14, zza);
        zzbzl zzb = zzbzk.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }
}
