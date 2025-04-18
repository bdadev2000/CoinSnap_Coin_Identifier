package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbpl extends zzayd implements zzbpm {
    public zzbpl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof zzbpm) {
            return (zzbpm) queryLocalInterface;
        }
        return new zzbpk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzaye.zzc(parcel);
                zzg(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbpq) {
                    }
                }
                zzaye.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzaye.zzc(parcel);
                zzq(readString, readString2);
                break;
            case 10:
                zzbgr.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzaye.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzaye.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzbwv zzbwvVar = (zzbwv) zzaye.zza(parcel, zzbwv.CREATOR);
                zzaye.zzc(parcel);
                zzs(zzbwvVar);
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzbwz zzb = zzbwy.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzt(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzaye.zzc(parcel);
                zzj(readInt2);
                break;
            case 18:
                zzu();
                break;
            case 19:
                zzaye.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzaye.zzc(parcel);
                zzl(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzaye.zzc(parcel);
                zzi(readInt3, readString4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzaye.zzc(parcel);
                zzh(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzaye.zzc(parcel);
                zzk(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
