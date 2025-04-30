package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzcbg;

/* loaded from: classes2.dex */
public final class zzcc extends zzbad implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbrf zzbrfVar, int i9) throws RemoteException {
        zzbq zzboVar;
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(3, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbq) {
                zzboVar = (zzbq) queryLocalInterface;
            } else {
                zzboVar = new zzbo(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbrf zzbrfVar, int i9) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzqVar);
        zza.writeString(str);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(13, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbrf zzbrfVar, int i9) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzqVar);
        zza.writeString(str);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbrf zzbrfVar, int i9) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzqVar);
        zza.writeString(str);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i9) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(10, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i9) throws RemoteException {
        zzco zzcmVar;
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(9, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzco) {
                zzcmVar = (zzco) queryLocalInterface;
            } else {
                zzcmVar = new zzcm(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(17, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof zzdj) {
                zzdhVar = (zzdj) queryLocalInterface;
            } else {
                zzdhVar = new zzdh(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbhz zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, iObjectWrapper2);
        Parcel zzdb = zzdb(5, zza);
        zzbhz zzdA = zzbhy.zzdA(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzdA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbif zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, iObjectWrapper2);
        zzbaf.zzf(zza, iObjectWrapper3);
        Parcel zzdb = zzdb(11, zza);
        zzbif zze = zzbie.zze(zzdb.readStrongBinder());
        zzdb.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbmr zzk(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9, zzbmo zzbmoVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        zzbaf.zzf(zza, zzbmoVar);
        Parcel zzdb = zzdb(16, zza);
        zzbmr zzb = zzbmq.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbuz zzl(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(15, zza);
        zzbuz zzb = zzbuy.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvg zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(8, zza);
        zzbvg zzI = zzbvf.zzI(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyk zzn(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbza zzo(IObjectWrapper iObjectWrapper, String str, zzbrf zzbrfVar, int i9) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(12, zza);
        zzbza zzq = zzbyz.zzq(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzcbg zzp(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzf(zza, zzbrfVar);
        zza.writeInt(241806000);
        Parcel zzdb = zzdb(14, zza);
        zzcbg zzb = zzcbf.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }
}
