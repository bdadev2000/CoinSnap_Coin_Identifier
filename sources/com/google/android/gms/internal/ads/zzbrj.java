package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbrj extends zzaym implements zzbrk {
    public zzbrj() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbrk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbrk ? (zzbrk) queryLocalInterface : new zzbri(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0021. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbrn zzbrnVar = null;
        zzbqv zzbqtVar = null;
        zzbre zzbrcVar = null;
        zzbqy zzbqwVar = null;
        zzbrh zzbrfVar = null;
        zzbre zzbrcVar2 = null;
        zzbrh zzbrfVar2 = null;
        zzbrb zzbqzVar = null;
        zzbqy zzbqwVar2 = null;
        if (i2 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzayn.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzayn.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbrnVar = queryLocalInterface instanceof zzbrn ? (zzbrn) queryLocalInterface : new zzbrl(readStrongBinder);
            }
            zzbrn zzbrnVar2 = zzbrnVar;
            zzayn.zzc(parcel);
            zzh(asInterface, readString, bundle, bundle2, zzsVar, zzbrnVar2);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            zzbrz zzf = zzf();
            parcel2.writeNoException();
            zzayn.zze(parcel2, zzf);
        } else if (i2 == 3) {
            zzbrz zzg = zzg();
            parcel2.writeNoException();
            zzayn.zze(parcel2, zzg);
        } else if (i2 == 5) {
            com.google.android.gms.ads.internal.client.zzeb zze = zze();
            parcel2.writeNoException();
            zzayn.zzf(parcel2, zze);
        } else if (i2 == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayn.zzc(parcel);
            parcel2.writeNoException();
        } else if (i2 != 11) {
            switch (i2) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqwVar2 = queryLocalInterface2 instanceof zzbqy ? (zzbqy) queryLocalInterface2 : new zzbqw(readStrongBinder2);
                    }
                    zzbqy zzbqyVar = zzbqwVar2;
                    zzbpr zzb = zzbpq.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzs zzsVar2 = (com.google.android.gms.ads.internal.client.zzs) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                    zzayn.zzc(parcel);
                    zzj(readString2, readString3, zzmVar, asInterface2, zzbqyVar, zzb, zzsVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbqzVar = queryLocalInterface3 instanceof zzbrb ? (zzbrb) queryLocalInterface3 : new zzbqz(readStrongBinder3);
                    }
                    zzbrb zzbrbVar = zzbqzVar;
                    zzbpr zzb2 = zzbpq.zzb(parcel.readStrongBinder());
                    zzayn.zzc(parcel);
                    zzl(readString4, readString5, zzmVar2, asInterface3, zzbrbVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayn.zzc(parcel);
                    boolean zzs = zzs(asInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzs ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbrfVar2 = queryLocalInterface4 instanceof zzbrh ? (zzbrh) queryLocalInterface4 : new zzbrf(readStrongBinder4);
                    }
                    zzbrh zzbrhVar = zzbrfVar2;
                    zzbpr zzb3 = zzbpq.zzb(parcel.readStrongBinder());
                    zzayn.zzc(parcel);
                    zzp(readString6, readString7, zzmVar3, asInterface5, zzbrhVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayn.zzc(parcel);
                    boolean zzt = zzt(asInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbrcVar2 = queryLocalInterface5 instanceof zzbre ? (zzbre) queryLocalInterface5 : new zzbrc(readStrongBinder5);
                    }
                    zzbre zzbreVar = zzbrcVar2;
                    zzbpr zzb4 = zzbpq.zzb(parcel.readStrongBinder());
                    zzayn.zzc(parcel);
                    zzm(readString8, readString9, zzmVar4, asInterface7, zzbreVar, zzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzayn.zzc(parcel);
                    zzq(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbrfVar = queryLocalInterface6 instanceof zzbrh ? (zzbrh) queryLocalInterface6 : new zzbrf(readStrongBinder6);
                    }
                    zzbrh zzbrhVar2 = zzbrfVar;
                    zzbpr zzb5 = zzbpq.zzb(parcel.readStrongBinder());
                    zzayn.zzc(parcel);
                    zzo(readString11, readString12, zzmVar5, asInterface8, zzbrhVar2, zzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqwVar = queryLocalInterface7 instanceof zzbqy ? (zzbqy) queryLocalInterface7 : new zzbqw(readStrongBinder7);
                    }
                    zzbqy zzbqyVar2 = zzbqwVar;
                    zzbpr zzb6 = zzbpq.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzs zzsVar3 = (com.google.android.gms.ads.internal.client.zzs) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                    zzayn.zzc(parcel);
                    zzk(readString13, readString14, zzmVar6, asInterface9, zzbqyVar2, zzb6, zzsVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbrcVar = queryLocalInterface8 instanceof zzbre ? (zzbre) queryLocalInterface8 : new zzbrc(readStrongBinder8);
                    }
                    zzbre zzbreVar2 = zzbrcVar;
                    zzbpr zzb7 = zzbpq.zzb(parcel.readStrongBinder());
                    zzbfr zzbfrVar = (zzbfr) zzayn.zza(parcel, zzbfr.CREATOR);
                    zzayn.zzc(parcel);
                    zzn(readString15, readString16, zzmVar7, asInterface10, zzbreVar2, zzb7, zzbfrVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbqtVar = queryLocalInterface9 instanceof zzbqv ? (zzbqv) queryLocalInterface9 : new zzbqt(readStrongBinder9);
                    }
                    zzbqv zzbqvVar = zzbqtVar;
                    zzbpr zzb8 = zzbpq.zzb(parcel.readStrongBinder());
                    zzayn.zzc(parcel);
                    zzi(readString17, readString18, zzmVar8, asInterface11, zzbqvVar, zzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayn.zzc(parcel);
                    boolean zzr = zzr(asInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzayn.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
