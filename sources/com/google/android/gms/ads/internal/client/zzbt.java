package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.view.MotionEventCompat;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbvr;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzbyn;

/* loaded from: classes2.dex */
public abstract class zzbt extends zzbae implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzbu) {
            return (zzbu) queryLocalInterface;
        }
        return new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbh zzbhVar = null;
        zzci zzciVar = null;
        zzbk zzbkVar = null;
        zzdg zzdgVar = null;
        zzby zzbyVar = null;
        zzcf zzcfVar = null;
        zzbe zzbeVar = null;
        zzcb zzcbVar = null;
        switch (i9) {
            case 1:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzaa = zzaa();
                parcel2.writeNoException();
                int i11 = zzbaf.zza;
                parcel2.writeInt(zzaa ? 1 : 0);
                return true;
            case 4:
                zzl zzlVar = (zzl) zzbaf.zza(parcel, zzl.CREATOR);
                zzbaf.zzc(parcel);
                boolean zzab = zzab(zzlVar);
                parcel2.writeNoException();
                parcel2.writeInt(zzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbh) {
                        zzbhVar = (zzbh) queryLocalInterface;
                    } else {
                        zzbhVar = new zzbf(readStrongBinder);
                    }
                }
                zzbaf.zzc(parcel);
                zzD(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzcb) {
                        zzcbVar = (zzcb) queryLocalInterface2;
                    } else {
                        zzcbVar = new zzbz(readStrongBinder2);
                    }
                }
                zzbaf.zzc(parcel);
                zzG(zzcbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzg = zzg();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzg);
                return true;
            case 13:
                zzq zzqVar = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                zzbaf.zzc(parcel);
                zzF(zzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbvp zzb = zzbvo.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbvs zzb2 = zzbvr.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzbaf.zzc(parcel);
                zzQ(zzb2, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                zzbfk zzb3 = zzbfj.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzbe) {
                        zzbeVar = (zzbe) queryLocalInterface3;
                    } else {
                        zzbeVar = new zzbc(readStrongBinder3);
                    }
                }
                zzbaf.zzc(parcel);
                zzC(zzbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzcf) {
                        zzcfVar = (zzcf) queryLocalInterface4;
                    } else {
                        zzcfVar = new zzcf(readStrongBinder4);
                    }
                }
                zzbaf.zzc(parcel);
                zzac(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzg2 = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                zzN(zzg2);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                int i12 = zzbaf.zza;
                parcel2.writeInt(zzZ ? 1 : 0);
                return true;
            case 24:
                zzbyn zzb4 = zzbym.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzbaf.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdq zzl = zzl();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzl);
                return true;
            case 29:
                zzfk zzfkVar = (zzfk) zzbaf.zza(parcel, zzfk.CREATOR);
                zzbaf.zzc(parcel);
                zzU(zzfkVar);
                parcel2.writeNoException();
                return true;
            case AD_PLAY_RESET_ON_DEINIT_VALUE:
                zzdu zzduVar = (zzdu) zzbaf.zza(parcel, zzdu.CREATOR);
                zzbaf.zzc(parcel);
                zzK(zzduVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                zzcb zzj = zzj();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzj);
                return true;
            case 33:
                zzbh zzi = zzi();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzi);
                return true;
            case 34:
                boolean zzg3 = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                zzL(zzg3);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzby) {
                        zzbyVar = (zzby) queryLocalInterface5;
                    } else {
                        zzbyVar = new zzbw(readStrongBinder5);
                    }
                }
                zzbaf.zzc(parcel);
                zzE(zzbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzd);
                return true;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                String readString3 = parcel.readString();
                zzbaf.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzw zzwVar = (zzw) zzbaf.zza(parcel, zzw.CREATOR);
                zzbaf.zzc(parcel);
                zzI(zzwVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbcj zze = zzbci.zze(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdn zzk = zzk();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof zzdg) {
                        zzdgVar = (zzdg) queryLocalInterface6;
                    } else {
                        zzdgVar = new zzde(readStrongBinder6);
                    }
                }
                zzbaf.zzc(parcel);
                zzP(zzdgVar);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                zzl zzlVar2 = (zzl) zzbaf.zza(parcel, zzl.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface7 instanceof zzbk) {
                        zzbkVar = (zzbk) queryLocalInterface7;
                    } else {
                        zzbkVar = new zzbi(readStrongBinder7);
                    }
                }
                zzbaf.zzc(parcel);
                zzy(zzlVar2, zzbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzW(asInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface8 instanceof zzci) {
                        zzciVar = (zzci) queryLocalInterface8;
                    } else {
                        zzciVar = new zzcg(readStrongBinder8);
                    }
                }
                zzbaf.zzc(parcel);
                zzJ(zzciVar);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                boolean zzY = zzY();
                parcel2.writeNoException();
                int i13 = zzbaf.zza;
                parcel2.writeInt(zzY ? 1 : 0);
                return true;
        }
    }
}
