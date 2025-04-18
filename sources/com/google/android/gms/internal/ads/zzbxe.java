package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbxe extends zzaym implements zzbxf {
    public zzbxe() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbxf zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzbxf ? (zzbxf) queryLocalInterface : new zzbxd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbxm zzbxmVar = null;
        zzbxm zzbxmVar2 = null;
        zzbxn zzbxnVar = null;
        zzbxi zzbxiVar = null;
        switch (i2) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbxmVar = queryLocalInterface instanceof zzbxm ? (zzbxm) queryLocalInterface : new zzbxk(readStrongBinder);
                }
                zzayn.zzc(parcel);
                zzf(zzmVar, zzbxmVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbxiVar = queryLocalInterface2 instanceof zzbxi ? (zzbxi) queryLocalInterface2 : new zzbxg(readStrongBinder2);
                }
                zzayn.zzc(parcel);
                zzk(zzbxiVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i4 = zzayn.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbxnVar = queryLocalInterface3 instanceof zzbxn ? (zzbxn) queryLocalInterface3 : new zzbxn(readStrongBinder3);
                }
                zzayn.zzc(parcel);
                zzp(zzbxnVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxt zzbxtVar = (zzbxt) zzayn.zza(parcel, zzbxt.CREATOR);
                zzayn.zzc(parcel);
                zzl(zzbxtVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdo zzb = com.google.android.gms.ads.internal.client.zzdn.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzayn.zze(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzg = zzayn.zzg(parcel);
                zzayn.zzc(parcel);
                zzn(asInterface2, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbxc zzd = zzd();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdy zzc = zzc();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdr zzb3 = com.google.android.gms.ads.internal.client.zzdq.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbxmVar2 = queryLocalInterface4 instanceof zzbxm ? (zzbxm) queryLocalInterface4 : new zzbxk(readStrongBinder4);
                }
                zzayn.zzc(parcel);
                zzg(zzmVar2, zzbxmVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzayn.zzg(parcel);
                zzayn.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
