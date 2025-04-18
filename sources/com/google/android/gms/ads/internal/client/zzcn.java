package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgh;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbtg;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzh;

/* loaded from: classes3.dex */
public final class zzcn extends zzayc implements zzcp {
    public zzcn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(IObjectWrapper iObjectWrapper, String str, zzbpg zzbpgVar, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(3, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpg zzbpgVar, int i10) throws RemoteException {
        zzby zzbwVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzsVar);
        zza.writeString(str);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(13, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzby) {
                zzbwVar = (zzby) queryLocalInterface;
            } else {
                zzbwVar = new zzbw(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpg zzbpgVar, int i10) throws RemoteException {
        zzby zzbwVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzsVar);
        zza.writeString(str);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzby) {
                zzbwVar = (zzby) queryLocalInterface;
            } else {
                zzbwVar = new zzbw(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpg zzbpgVar, int i10) throws RemoteException {
        zzby zzbwVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzsVar);
        zza.writeString(str);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzby) {
                zzbwVar = (zzby) queryLocalInterface;
            } else {
                zzbwVar = new zzbw(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, int i10) throws RemoteException {
        zzby zzbwVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzsVar);
        zza.writeString(str);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(10, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzby) {
                zzbwVar = (zzby) queryLocalInterface;
            } else {
                zzbwVar = new zzbw(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) throws RemoteException {
        zzci zzcgVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(18, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            if (queryLocalInterface instanceof zzci) {
                zzcgVar = (zzci) queryLocalInterface;
            } else {
                zzcgVar = new zzcg(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzcgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzcz zzcxVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(9, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzcz) {
                zzcxVar = (zzcz) queryLocalInterface;
            } else {
                zzcxVar = new zzcx(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzcxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) throws RemoteException {
        zzdu zzdsVar;
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(17, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof zzdu) {
                zzdsVar = (zzdu) queryLocalInterface;
            } else {
                zzdsVar = new zzds(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzdsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgc zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, iObjectWrapper2);
        Parcel zzdb = zzdb(5, zza);
        zzbgc zzdA = zzbgb.zzdA(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzdA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgi zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, iObjectWrapper2);
        zzaye.zzf(zza, iObjectWrapper3);
        Parcel zzdb = zzdb(11, zza);
        zzbgi zze = zzbgh.zze(zzdb.readStrongBinder());
        zzdb.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbkt zzl(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10, zzbkq zzbkqVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        zzaye.zzf(zza, zzbkqVar);
        Parcel zzdb = zzdb(16, zza);
        zzbkt zzb = zzbks.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbsz zzm(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(15, zza);
        zzbsz zzb = zzbsy.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbtg zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(8, zza);
        zzbtg zzI = zzbtf.zzI(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbwm zzo(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbxc zzp(IObjectWrapper iObjectWrapper, String str, zzbpg zzbpgVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(12, zza);
        zzbxc zzq = zzbxb.zzq(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbzh zzq(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzf(zza, zzbpgVar);
        zza.writeInt(243799000);
        Parcel zzdb = zzdb(14, zza);
        zzbzh zzb = zzbzg.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }
}
