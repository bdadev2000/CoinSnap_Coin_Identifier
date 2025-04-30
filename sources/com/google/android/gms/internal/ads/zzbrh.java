package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.view.MotionEventCompat;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzbrh extends zzbae implements zzbri {
    public zzbrh() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbrl zzbrlVar = null;
        switch (i9) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzbrl) {
                        zzbrlVar = (zzbrl) queryLocalInterface;
                    } else {
                        zzbrlVar = new zzbrj(readStrongBinder);
                    }
                }
                zzbrl zzbrlVar2 = zzbrlVar;
                zzbaf.zzc(parcel);
                zzu(asInterface, zzqVar, zzlVar, readString, zzbrlVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzn);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzbrl) {
                        zzbrlVar = (zzbrl) queryLocalInterface2;
                    } else {
                        zzbrlVar = new zzbrj(readStrongBinder2);
                    }
                }
                zzbaf.zzc(parcel);
                zzx(asInterface2, zzlVar2, readString2, zzbrlVar);
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
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzbrl) {
                        zzbrlVar = (zzbrl) queryLocalInterface3;
                    } else {
                        zzbrlVar = new zzbrj(readStrongBinder3);
                    }
                }
                zzbrl zzbrlVar3 = zzbrlVar;
                zzbaf.zzc(parcel);
                zzv(asInterface3, zzqVar2, zzlVar3, readString3, readString4, zzbrlVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzbrl) {
                        zzbrlVar = (zzbrl) queryLocalInterface4;
                    } else {
                        zzbrlVar = new zzbrj(readStrongBinder4);
                    }
                }
                zzbrl zzbrlVar4 = zzbrlVar;
                zzbaf.zzc(parcel);
                zzy(asInterface4, zzlVar4, readString5, readString6, zzbrlVar4);
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
                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString7 = parcel.readString();
                zzbys zzb = zzbyr.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzbaf.zzc(parcel);
                zzp(asInterface5, zzlVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString9 = parcel.readString();
                zzbaf.zzc(parcel);
                zzs(zzlVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i11 = zzbaf.zza;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzbrl) {
                        zzbrlVar = (zzbrl) queryLocalInterface5;
                    } else {
                        zzbrlVar = new zzbrj(readStrongBinder5);
                    }
                }
                zzbrl zzbrlVar5 = zzbrlVar;
                zzbhk zzbhkVar = (zzbhk) zzbaf.zza(parcel, zzbhk.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzbaf.zzc(parcel);
                zzz(asInterface6, zzlVar7, readString10, readString11, zzbrlVar5, zzbhkVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzg);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzbaf.zzc(parcel);
                zzB(zzlVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzD(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i12 = zzbaf.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbys zzb2 = zzbyr.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzbaf.zzc(parcel);
                zzr(asInterface8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbip zzi = zzi();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzi);
                return true;
            case 25:
                boolean zzg2 = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                zzG(zzg2);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdq zzh = zzh();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzh);
                return true;
            case 27:
                zzbru zzk = zzk();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzk);
                return true;
            case 28:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar9 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzbrl) {
                        zzbrlVar = (zzbrl) queryLocalInterface6;
                    } else {
                        zzbrlVar = new zzbrj(readStrongBinder6);
                    }
                }
                zzbaf.zzc(parcel);
                zzA(asInterface9, zzlVar9, readString14, zzbrlVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case AD_PLAY_RESET_ON_DEINIT_VALUE:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzK(asInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnr zzb3 = zzbnq.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbnx.CREATOR);
                zzbaf.zzc(parcel);
                zzq(asInterface11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar10 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof zzbrl) {
                        zzbrlVar = (zzbrl) queryLocalInterface7;
                    } else {
                        zzbrlVar = new zzbrj(readStrongBinder7);
                    }
                }
                zzbaf.zzc(parcel);
                zzC(asInterface12, zzlVar10, readString15, zzbrlVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbtt zzl = zzl();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzl);
                return true;
            case 34:
                zzbtt zzm = zzm();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzm);
                return true;
            case 35:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar11 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof zzbrl) {
                        zzbrlVar = (zzbrl) queryLocalInterface8;
                    } else {
                        zzbrlVar = new zzbrj(readStrongBinder8);
                    }
                }
                zzbrl zzbrlVar6 = zzbrlVar;
                zzbaf.zzc(parcel);
                zzw(asInterface13, zzqVar3, zzlVar11, readString16, readString17, zzbrlVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbro zzj = zzj();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzj);
                return true;
            case 37:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzJ(asInterface14);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar12 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface9 instanceof zzbrl) {
                        zzbrlVar = (zzbrl) queryLocalInterface9;
                    } else {
                        zzbrlVar = new zzbrj(readStrongBinder9);
                    }
                }
                zzbaf.zzc(parcel);
                zzt(asInterface15, zzlVar12, readString18, zzbrlVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzH(asInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
