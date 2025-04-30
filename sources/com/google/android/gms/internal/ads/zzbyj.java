package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbyj extends zzbae implements zzbyk {
    public zzbyj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x000e. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                zzbyn zzbynVar = null;
                zzbyi zzbyiVar = null;
                if (i9 != 3) {
                    if (i9 != 34) {
                        switch (i9) {
                            case 5:
                                boolean zzs = zzs();
                                parcel2.writeNoException();
                                int i11 = zzbaf.zza;
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
                                zzbaf.zzc(parcel);
                                zzi(asInterface);
                                parcel2.writeNoException();
                                break;
                            case 10:
                                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzbaf.zzc(parcel);
                                zzk(asInterface2);
                                parcel2.writeNoException();
                                break;
                            case 11:
                                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzbaf.zzc(parcel);
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
                                zzbaf.zzc(parcel);
                                zzp(readString);
                                parcel2.writeNoException();
                                break;
                            case 14:
                                com.google.android.gms.ads.internal.client.zzby zzb = com.google.android.gms.ads.internal.client.zzbx.zzb(parcel.readStrongBinder());
                                zzbaf.zzc(parcel);
                                zzl(zzb);
                                parcel2.writeNoException();
                                break;
                            case 15:
                                Bundle zzb2 = zzb();
                                parcel2.writeNoException();
                                zzbaf.zze(parcel2, zzb2);
                                break;
                            case 16:
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                    if (queryLocalInterface instanceof zzbyi) {
                                        zzbyiVar = (zzbyi) queryLocalInterface;
                                    } else {
                                        zzbyiVar = new zzbyi(readStrongBinder);
                                    }
                                }
                                zzbaf.zzc(parcel);
                                zzu(zzbyiVar);
                                parcel2.writeNoException();
                                break;
                            case 17:
                                parcel.readString();
                                zzbaf.zzc(parcel);
                                parcel2.writeNoException();
                                break;
                            case 18:
                                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzbaf.zzc(parcel);
                                zzr(asInterface4);
                                parcel2.writeNoException();
                                break;
                            case 19:
                                String readString2 = parcel.readString();
                                zzbaf.zzc(parcel);
                                zzm(readString2);
                                parcel2.writeNoException();
                                break;
                            case 20:
                                boolean zzt = zzt();
                                parcel2.writeNoException();
                                int i12 = zzbaf.zza;
                                parcel2.writeInt(zzt ? 1 : 0);
                                break;
                            case 21:
                                com.google.android.gms.ads.internal.client.zzdn zzc = zzc();
                                parcel2.writeNoException();
                                zzbaf.zzf(parcel2, zzc);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        boolean zzg = zzbaf.zzg(parcel);
                        zzbaf.zzc(parcel);
                        zzn(zzg);
                        parcel2.writeNoException();
                    }
                } else {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                        if (queryLocalInterface2 instanceof zzbyn) {
                            zzbynVar = (zzbyn) queryLocalInterface2;
                        } else {
                            zzbynVar = new zzbyl(readStrongBinder2);
                        }
                    }
                    zzbaf.zzc(parcel);
                    zzo(zzbynVar);
                    parcel2.writeNoException();
                }
            } else {
                zzq();
                parcel2.writeNoException();
            }
        } else {
            zzbyo zzbyoVar = (zzbyo) zzbaf.zza(parcel, zzbyo.CREATOR);
            zzbaf.zzc(parcel);
            zzg(zzbyoVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
