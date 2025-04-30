package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbyz extends zzbae implements zzbza {
    public zzbyz() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbza zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzbza) {
            return (zzbza) queryLocalInterface;
        }
        return new zzbyy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbzh zzbzhVar = null;
        zzbzh zzbzhVar2 = null;
        zzbzi zzbziVar = null;
        zzbzd zzbzdVar = null;
        switch (i9) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzbzh) {
                        zzbzhVar = (zzbzh) queryLocalInterface;
                    } else {
                        zzbzhVar = new zzbzf(readStrongBinder);
                    }
                }
                zzbaf.zzc(parcel);
                zzf(zzlVar, zzbzhVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzbzd) {
                        zzbzdVar = (zzbzd) queryLocalInterface2;
                    } else {
                        zzbzdVar = new zzbzb(readStrongBinder2);
                    }
                }
                zzbaf.zzc(parcel);
                zzk(zzbzdVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i11 = zzbaf.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzbzi) {
                        zzbziVar = (zzbzi) queryLocalInterface3;
                    } else {
                        zzbziVar = new zzbzi(readStrongBinder3);
                    }
                }
                zzbaf.zzc(parcel);
                zzp(zzbziVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbzo zzbzoVar = (zzbzo) zzbaf.zza(parcel, zzbzo.CREATOR);
                zzbaf.zzc(parcel);
                zzl(zzbzoVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdd zzb = com.google.android.gms.ads.internal.client.zzdc.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzg = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                zzn(asInterface2, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbyx zzd = zzd();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdn zzc = zzc();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdg zzb3 = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof zzbzh) {
                        zzbzhVar2 = (zzbzh) queryLocalInterface4;
                    } else {
                        zzbzhVar2 = new zzbzf(readStrongBinder4);
                    }
                }
                zzbaf.zzc(parcel);
                zzg(zzlVar2, zzbzhVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
