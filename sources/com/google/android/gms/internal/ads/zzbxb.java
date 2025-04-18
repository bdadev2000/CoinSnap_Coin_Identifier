package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbxb extends zzayd implements zzbxc {
    public zzbxb() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbxc zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzbxc) {
            return (zzbxc) queryLocalInterface;
        }
        return new zzbxa(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbxj zzbxjVar = null;
        zzbxj zzbxjVar2 = null;
        zzbxk zzbxkVar = null;
        zzbxf zzbxfVar = null;
        switch (i10) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzbxj) {
                        zzbxjVar = (zzbxj) queryLocalInterface;
                    } else {
                        zzbxjVar = new zzbxh(readStrongBinder);
                    }
                }
                zzaye.zzc(parcel);
                zzf(zzmVar, zzbxjVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzbxf) {
                        zzbxfVar = (zzbxf) queryLocalInterface2;
                    } else {
                        zzbxfVar = new zzbxd(readStrongBinder2);
                    }
                }
                zzaye.zzc(parcel);
                zzk(zzbxfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i12 = zzaye.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzbxk) {
                        zzbxkVar = (zzbxk) queryLocalInterface3;
                    } else {
                        zzbxkVar = new zzbxk(readStrongBinder3);
                    }
                }
                zzaye.zzc(parcel);
                zzp(zzbxkVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxq zzbxqVar = (zzbxq) zzaye.zza(parcel, zzbxq.CREATOR);
                zzaye.zzc(parcel);
                zzl(zzbxqVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdo zzb = com.google.android.gms.ads.internal.client.zzdn.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzg = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzn(asInterface2, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbwz zzd = zzd();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdy zzc = zzc();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdr zzb3 = com.google.android.gms.ads.internal.client.zzdq.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof zzbxj) {
                        zzbxjVar2 = (zzbxj) queryLocalInterface4;
                    } else {
                        zzbxjVar2 = new zzbxh(readStrongBinder4);
                    }
                }
                zzaye.zzc(parcel);
                zzg(zzmVar2, zzbxjVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
