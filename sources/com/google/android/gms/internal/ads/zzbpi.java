package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.view.MotionEventCompat;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class zzbpi extends zzayd implements zzbpj {
    public zzbpi() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbpm zzbpmVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzbpm) {
                        zzbpmVar = (zzbpm) queryLocalInterface;
                    } else {
                        zzbpmVar = new zzbpk(readStrongBinder);
                    }
                }
                zzbpm zzbpmVar2 = zzbpmVar;
                zzaye.zzc(parcel);
                zzu(asInterface, zzsVar, zzmVar, readString, zzbpmVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzn);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzbpm) {
                        zzbpmVar = (zzbpm) queryLocalInterface2;
                    } else {
                        zzbpmVar = new zzbpk(readStrongBinder2);
                    }
                }
                zzaye.zzc(parcel);
                zzx(asInterface2, zzmVar2, readString2, zzbpmVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar2 = (com.google.android.gms.ads.internal.client.zzs) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzbpm) {
                        zzbpmVar = (zzbpm) queryLocalInterface3;
                    } else {
                        zzbpmVar = new zzbpk(readStrongBinder3);
                    }
                }
                zzbpm zzbpmVar3 = zzbpmVar;
                zzaye.zzc(parcel);
                zzv(asInterface3, zzsVar2, zzmVar3, readString3, readString4, zzbpmVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzbpm) {
                        zzbpmVar = (zzbpm) queryLocalInterface4;
                    } else {
                        zzbpmVar = new zzbpk(readStrongBinder4);
                    }
                }
                zzbpm zzbpmVar4 = zzbpmVar;
                zzaye.zzc(parcel);
                zzy(asInterface4, zzmVar4, readString5, readString6, zzbpmVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString7 = parcel.readString();
                zzbwu zzb = zzbwt.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzaye.zzc(parcel);
                zzp(asInterface5, zzmVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString9 = parcel.readString();
                zzaye.zzc(parcel);
                zzs(zzmVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i12 = zzaye.zza;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzbpm) {
                        zzbpmVar = (zzbpm) queryLocalInterface5;
                    } else {
                        zzbpmVar = new zzbpk(readStrongBinder5);
                    }
                }
                zzbpm zzbpmVar5 = zzbpmVar;
                zzbfn zzbfnVar = (zzbfn) zzaye.zza(parcel, zzbfn.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzaye.zzc(parcel);
                zzz(asInterface6, zzmVar7, readString10, readString11, zzbpmVar5, zzbfnVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzg);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzaye.zzc(parcel);
                zzB(zzmVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzD(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i13 = zzaye.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbwu zzb2 = zzbwt.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzaye.zzc(parcel);
                zzr(asInterface8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbgs zzi = zzi();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzi);
                return true;
            case 25:
                boolean zzg2 = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzG(zzg2);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzeb zzh = zzh();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzh);
                return true;
            case 27:
                zzbpv zzk = zzk();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzk);
                return true;
            case 28:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzbpm) {
                        zzbpmVar = (zzbpm) queryLocalInterface6;
                    } else {
                        zzbpmVar = new zzbpk(readStrongBinder6);
                    }
                }
                zzaye.zzc(parcel);
                zzA(asInterface9, zzmVar9, readString14, zzbpmVar);
                parcel2.writeNoException();
                return true;
            case NOTIFICATION_REDIRECT_VALUE:
            default:
                return false;
            case 30:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzK(asInterface10);
                parcel2.writeNoException();
                return true;
            case TEMPLATE_HTML_SIZE_VALUE:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzblt zzb3 = zzbls.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzblz.CREATOR);
                zzaye.zzc(parcel);
                zzq(asInterface11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof zzbpm) {
                        zzbpmVar = (zzbpm) queryLocalInterface7;
                    } else {
                        zzbpmVar = new zzbpk(readStrongBinder7);
                    }
                }
                zzaye.zzc(parcel);
                zzC(asInterface12, zzmVar10, readString15, zzbpmVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbru zzl = zzl();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzl);
                return true;
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                zzbru zzm = zzm();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzm);
                return true;
            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar3 = (com.google.android.gms.ads.internal.client.zzs) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof zzbpm) {
                        zzbpmVar = (zzbpm) queryLocalInterface8;
                    } else {
                        zzbpmVar = new zzbpk(readStrongBinder8);
                    }
                }
                zzbpm zzbpmVar6 = zzbpmVar;
                zzaye.zzc(parcel);
                zzw(asInterface13, zzsVar3, zzmVar11, readString16, readString17, zzbpmVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbpp zzj = zzj();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzj);
                return true;
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzJ(asInterface14);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface9 instanceof zzbpm) {
                        zzbpmVar = (zzbpm) queryLocalInterface9;
                    } else {
                        zzbpmVar = new zzbpk(readStrongBinder9);
                    }
                }
                zzaye.zzc(parcel);
                zzt(asInterface15, zzmVar12, readString18, zzbpmVar);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzH(asInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
