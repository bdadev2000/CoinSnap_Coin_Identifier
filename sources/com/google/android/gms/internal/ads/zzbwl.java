package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbwl extends zzayd implements zzbwm {
    public zzbwl() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x000e. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                zzbwp zzbwpVar = null;
                zzbwk zzbwkVar = null;
                if (i10 != 3) {
                    if (i10 != 34) {
                        switch (i10) {
                            case 5:
                                boolean zzs = zzs();
                                parcel2.writeNoException();
                                int i12 = zzaye.zza;
                                parcel2.writeInt(zzs ? 1 : 0);
                                break;
                            case 6:
                                zzh();
                                parcel2.writeNoException();
                                break;
                            case 7:
                                zzj();
                                parcel2.writeNoException();
                                break;
                            case 8:
                                zze();
                                parcel2.writeNoException();
                                break;
                            case 9:
                                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzaye.zzc(parcel);
                                zzi(asInterface);
                                parcel2.writeNoException();
                                break;
                            case 10:
                                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzaye.zzc(parcel);
                                zzk(asInterface2);
                                parcel2.writeNoException();
                                break;
                            case 11:
                                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzaye.zzc(parcel);
                                zzf(asInterface3);
                                parcel2.writeNoException();
                                break;
                            case 12:
                                String zzd = zzd();
                                parcel2.writeNoException();
                                parcel2.writeString(zzd);
                                break;
                            case 13:
                                String readString = parcel.readString();
                                zzaye.zzc(parcel);
                                zzp(readString);
                                parcel2.writeNoException();
                                break;
                            case 14:
                                com.google.android.gms.ads.internal.client.zzcc zzb = com.google.android.gms.ads.internal.client.zzcb.zzb(parcel.readStrongBinder());
                                zzaye.zzc(parcel);
                                zzl(zzb);
                                parcel2.writeNoException();
                                break;
                            case 15:
                                Bundle zzb2 = zzb();
                                parcel2.writeNoException();
                                zzaye.zze(parcel2, zzb2);
                                break;
                            case 16:
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                    if (queryLocalInterface instanceof zzbwk) {
                                        zzbwkVar = (zzbwk) queryLocalInterface;
                                    } else {
                                        zzbwkVar = new zzbwk(readStrongBinder);
                                    }
                                }
                                zzaye.zzc(parcel);
                                zzu(zzbwkVar);
                                parcel2.writeNoException();
                                break;
                            case 17:
                                parcel.readString();
                                zzaye.zzc(parcel);
                                parcel2.writeNoException();
                                break;
                            case 18:
                                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzaye.zzc(parcel);
                                zzr(asInterface4);
                                parcel2.writeNoException();
                                break;
                            case 19:
                                String readString2 = parcel.readString();
                                zzaye.zzc(parcel);
                                zzm(readString2);
                                parcel2.writeNoException();
                                break;
                            case 20:
                                boolean zzt = zzt();
                                parcel2.writeNoException();
                                int i13 = zzaye.zza;
                                parcel2.writeInt(zzt ? 1 : 0);
                                break;
                            case 21:
                                com.google.android.gms.ads.internal.client.zzdy zzc = zzc();
                                parcel2.writeNoException();
                                zzaye.zzf(parcel2, zzc);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        boolean zzg = zzaye.zzg(parcel);
                        zzaye.zzc(parcel);
                        zzn(zzg);
                        parcel2.writeNoException();
                    }
                } else {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                        if (queryLocalInterface2 instanceof zzbwp) {
                            zzbwpVar = (zzbwp) queryLocalInterface2;
                        } else {
                            zzbwpVar = new zzbwn(readStrongBinder2);
                        }
                    }
                    zzaye.zzc(parcel);
                    zzo(zzbwpVar);
                    parcel2.writeNoException();
                }
            } else {
                zzq();
                parcel2.writeNoException();
            }
        } else {
            zzbwq zzbwqVar = (zzbwq) zzaye.zza(parcel, zzbwq.CREATOR);
            zzaye.zzc(parcel);
            zzg(zzbwqVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
