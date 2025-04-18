package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.view.MotionEventCompat;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbtr;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbwp;

/* loaded from: classes3.dex */
public abstract class zzbx extends zzayd implements zzby {
    public zzbx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzby zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzby) {
            return (zzby) queryLocalInterface;
        }
        return new zzbw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbl zzblVar = null;
        zzct zzctVar = null;
        zzbo zzboVar = null;
        zzdr zzdrVar = null;
        zzcc zzccVar = null;
        zzcq zzcqVar = null;
        zzbi zzbiVar = null;
        zzcm zzcmVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzaa = zzaa();
                parcel2.writeNoException();
                int i12 = zzaye.zza;
                parcel2.writeInt(zzaa ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzaye.zza(parcel, zzm.CREATOR);
                zzaye.zzc(parcel);
                boolean zzab = zzab(zzmVar);
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
                    if (queryLocalInterface instanceof zzbl) {
                        zzblVar = (zzbl) queryLocalInterface;
                    } else {
                        zzblVar = new zzbj(readStrongBinder);
                    }
                }
                zzaye.zzc(parcel);
                zzD(zzblVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzcm) {
                        zzcmVar = (zzcm) queryLocalInterface2;
                    } else {
                        zzcmVar = new zzck(readStrongBinder2);
                    }
                }
                zzaye.zzc(parcel);
                zzG(zzcmVar);
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
                zzs zzg = zzg();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzg);
                return true;
            case 13:
                zzs zzsVar = (zzs) zzaye.zza(parcel, zzs.CREATOR);
                zzaye.zzc(parcel);
                zzF(zzsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbtp zzb = zzbto.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbts zzb2 = zzbtr.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzaye.zzc(parcel);
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
                zzbdi zzb3 = zzbdh.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzbi) {
                        zzbiVar = (zzbi) queryLocalInterface3;
                    } else {
                        zzbiVar = new zzbg(readStrongBinder3);
                    }
                }
                zzaye.zzc(parcel);
                zzC(zzbiVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzcq) {
                        zzcqVar = (zzcq) queryLocalInterface4;
                    } else {
                        zzcqVar = new zzcq(readStrongBinder4);
                    }
                }
                zzaye.zzc(parcel);
                zzac(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzg2 = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzN(zzg2);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                int i13 = zzaye.zza;
                parcel2.writeInt(zzZ ? 1 : 0);
                return true;
            case 24:
                zzbwp zzb4 = zzbwo.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzaye.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzeb zzl = zzl();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzl);
                return true;
            case NOTIFICATION_REDIRECT_VALUE:
                zzga zzgaVar = (zzga) zzaye.zza(parcel, zzga.CREATOR);
                zzaye.zzc(parcel);
                zzU(zzgaVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzef zzefVar = (zzef) zzaye.zza(parcel, zzef.CREATOR);
                zzaye.zzc(parcel);
                zzK(zzefVar);
                parcel2.writeNoException();
                return true;
            case TEMPLATE_HTML_SIZE_VALUE:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                zzcm zzj = zzj();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzj);
                return true;
            case 33:
                zzbl zzi = zzi();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzi);
                return true;
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                boolean zzg3 = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzL(zzg3);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzcc) {
                        zzccVar = (zzcc) queryLocalInterface5;
                    } else {
                        zzccVar = new zzca(readStrongBinder5);
                    }
                }
                zzaye.zzc(parcel);
                zzE(zzccVar);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzd);
                return true;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                String readString3 = parcel.readString();
                zzaye.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                zzy zzyVar = (zzy) zzaye.zza(parcel, zzy.CREATOR);
                zzaye.zzc(parcel);
                zzI(zzyVar);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                zzbai zze = zzbah.zze(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                zzdy zzk = zzk();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzk);
                return true;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof zzdr) {
                        zzdrVar = (zzdr) queryLocalInterface6;
                    } else {
                        zzdrVar = new zzdp(readStrongBinder6);
                    }
                }
                zzaye.zzc(parcel);
                zzP(zzdrVar);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                zzm zzmVar2 = (zzm) zzaye.zza(parcel, zzm.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface7 instanceof zzbo) {
                        zzboVar = (zzbo) queryLocalInterface7;
                    } else {
                        zzboVar = new zzbm(readStrongBinder7);
                    }
                }
                zzaye.zzc(parcel);
                zzy(zzmVar2, zzboVar);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzW(asInterface);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface8 instanceof zzct) {
                        zzctVar = (zzct) queryLocalInterface8;
                    } else {
                        zzctVar = new zzcr(readStrongBinder8);
                    }
                }
                zzaye.zzc(parcel);
                zzJ(zzctVar);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                boolean zzY = zzY();
                parcel2.writeNoException();
                int i14 = zzaye.zza;
                parcel2.writeInt(zzY ? 1 : 0);
                return true;
        }
    }
}
