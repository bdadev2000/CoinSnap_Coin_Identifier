package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbre extends zzayd implements zzbrf {
    public zzbre() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbrf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzbrf) {
            return (zzbrf) queryLocalInterface;
        }
        return new zzbrd(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0021. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbri zzbriVar = null;
        zzbqq zzbqoVar = null;
        zzbqz zzbqxVar = null;
        zzbqt zzbqrVar = null;
        zzbrc zzbraVar = null;
        zzbqz zzbqxVar2 = null;
        zzbrc zzbraVar2 = null;
        zzbqw zzbquVar = null;
        zzbqt zzbqrVar2 = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 10) {
                            if (i10 != 11) {
                                switch (i10) {
                                    case 13:
                                        String readString = parcel.readString();
                                        String readString2 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder = parcel.readStrongBinder();
                                        if (readStrongBinder != null) {
                                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface instanceof zzbqt) {
                                                zzbqrVar2 = (zzbqt) queryLocalInterface;
                                            } else {
                                                zzbqrVar2 = new zzbqr(readStrongBinder);
                                            }
                                        }
                                        zzbqt zzbqtVar = zzbqrVar2;
                                        zzbpm zzb = zzbpl.zzb(parcel.readStrongBinder());
                                        com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                                        zzaye.zzc(parcel);
                                        zzj(readString, readString2, zzmVar, asInterface, zzbqtVar, zzb, zzsVar);
                                        parcel2.writeNoException();
                                        break;
                                    case 14:
                                        String readString3 = parcel.readString();
                                        String readString4 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                                        if (readStrongBinder2 != null) {
                                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                            if (queryLocalInterface2 instanceof zzbqw) {
                                                zzbquVar = (zzbqw) queryLocalInterface2;
                                            } else {
                                                zzbquVar = new zzbqu(readStrongBinder2);
                                            }
                                        }
                                        zzbqw zzbqwVar = zzbquVar;
                                        zzbpm zzb2 = zzbpl.zzb(parcel.readStrongBinder());
                                        zzaye.zzc(parcel);
                                        zzl(readString3, readString4, zzmVar2, asInterface2, zzbqwVar, zzb2);
                                        parcel2.writeNoException();
                                        break;
                                    case 15:
                                        IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzaye.zzc(parcel);
                                        boolean zzs = zzs(asInterface3);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzs ? 1 : 0);
                                        break;
                                    case 16:
                                        String readString5 = parcel.readString();
                                        String readString6 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                                        if (readStrongBinder3 != null) {
                                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface3 instanceof zzbrc) {
                                                zzbraVar2 = (zzbrc) queryLocalInterface3;
                                            } else {
                                                zzbraVar2 = new zzbra(readStrongBinder3);
                                            }
                                        }
                                        zzbrc zzbrcVar = zzbraVar2;
                                        zzbpm zzb3 = zzbpl.zzb(parcel.readStrongBinder());
                                        zzaye.zzc(parcel);
                                        zzp(readString5, readString6, zzmVar3, asInterface4, zzbrcVar, zzb3);
                                        parcel2.writeNoException();
                                        break;
                                    case 17:
                                        IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzaye.zzc(parcel);
                                        boolean zzt = zzt(asInterface5);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzt ? 1 : 0);
                                        break;
                                    case 18:
                                        String readString7 = parcel.readString();
                                        String readString8 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                                        if (readStrongBinder4 != null) {
                                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface4 instanceof zzbqz) {
                                                zzbqxVar2 = (zzbqz) queryLocalInterface4;
                                            } else {
                                                zzbqxVar2 = new zzbqx(readStrongBinder4);
                                            }
                                        }
                                        zzbqz zzbqzVar = zzbqxVar2;
                                        zzbpm zzb4 = zzbpl.zzb(parcel.readStrongBinder());
                                        zzaye.zzc(parcel);
                                        zzm(readString7, readString8, zzmVar4, asInterface6, zzbqzVar, zzb4);
                                        parcel2.writeNoException();
                                        break;
                                    case 19:
                                        String readString9 = parcel.readString();
                                        zzaye.zzc(parcel);
                                        zzq(readString9);
                                        parcel2.writeNoException();
                                        break;
                                    case 20:
                                        String readString10 = parcel.readString();
                                        String readString11 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                                        if (readStrongBinder5 != null) {
                                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface5 instanceof zzbrc) {
                                                zzbraVar = (zzbrc) queryLocalInterface5;
                                            } else {
                                                zzbraVar = new zzbra(readStrongBinder5);
                                            }
                                        }
                                        zzbrc zzbrcVar2 = zzbraVar;
                                        zzbpm zzb5 = zzbpl.zzb(parcel.readStrongBinder());
                                        zzaye.zzc(parcel);
                                        zzo(readString10, readString11, zzmVar5, asInterface7, zzbrcVar2, zzb5);
                                        parcel2.writeNoException();
                                        break;
                                    case 21:
                                        String readString12 = parcel.readString();
                                        String readString13 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder6 = parcel.readStrongBinder();
                                        if (readStrongBinder6 != null) {
                                            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface6 instanceof zzbqt) {
                                                zzbqrVar = (zzbqt) queryLocalInterface6;
                                            } else {
                                                zzbqrVar = new zzbqr(readStrongBinder6);
                                            }
                                        }
                                        zzbqt zzbqtVar2 = zzbqrVar;
                                        zzbpm zzb6 = zzbpl.zzb(parcel.readStrongBinder());
                                        com.google.android.gms.ads.internal.client.zzs zzsVar2 = (com.google.android.gms.ads.internal.client.zzs) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                                        zzaye.zzc(parcel);
                                        zzk(readString12, readString13, zzmVar6, asInterface8, zzbqtVar2, zzb6, zzsVar2);
                                        parcel2.writeNoException();
                                        break;
                                    case 22:
                                        String readString14 = parcel.readString();
                                        String readString15 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder7 = parcel.readStrongBinder();
                                        if (readStrongBinder7 != null) {
                                            IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface7 instanceof zzbqz) {
                                                zzbqxVar = (zzbqz) queryLocalInterface7;
                                            } else {
                                                zzbqxVar = new zzbqx(readStrongBinder7);
                                            }
                                        }
                                        zzbqz zzbqzVar2 = zzbqxVar;
                                        zzbpm zzb7 = zzbpl.zzb(parcel.readStrongBinder());
                                        zzbfn zzbfnVar = (zzbfn) zzaye.zza(parcel, zzbfn.CREATOR);
                                        zzaye.zzc(parcel);
                                        zzn(readString14, readString15, zzmVar7, asInterface9, zzbqzVar2, zzb7, zzbfnVar);
                                        parcel2.writeNoException();
                                        break;
                                    case 23:
                                        String readString16 = parcel.readString();
                                        String readString17 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder8 = parcel.readStrongBinder();
                                        if (readStrongBinder8 != null) {
                                            IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                            if (queryLocalInterface8 instanceof zzbqq) {
                                                zzbqoVar = (zzbqq) queryLocalInterface8;
                                            } else {
                                                zzbqoVar = new zzbqo(readStrongBinder8);
                                            }
                                        }
                                        zzbqq zzbqqVar = zzbqoVar;
                                        zzbpm zzb8 = zzbpl.zzb(parcel.readStrongBinder());
                                        zzaye.zzc(parcel);
                                        zzi(readString16, readString17, zzmVar8, asInterface10, zzbqqVar, zzb8);
                                        parcel2.writeNoException();
                                        break;
                                    case 24:
                                        IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzaye.zzc(parcel);
                                        boolean zzr = zzr(asInterface11);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzr ? 1 : 0);
                                        break;
                                    default:
                                        return false;
                                }
                            } else {
                                parcel.createStringArray();
                                zzaye.zzc(parcel);
                                parcel2.writeNoException();
                            }
                        } else {
                            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                            zzaye.zzc(parcel);
                            parcel2.writeNoException();
                        }
                    } else {
                        com.google.android.gms.ads.internal.client.zzeb zze = zze();
                        parcel2.writeNoException();
                        zzaye.zzf(parcel2, zze);
                    }
                } else {
                    zzbru zzg = zzg();
                    parcel2.writeNoException();
                    zzaye.zze(parcel2, zzg);
                }
            } else {
                zzbru zzf = zzf();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzf);
            }
        } else {
            IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString18 = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzaye.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzaye.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzs zzsVar3 = (com.google.android.gms.ads.internal.client.zzs) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
            IBinder readStrongBinder9 = parcel.readStrongBinder();
            if (readStrongBinder9 != null) {
                IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface9 instanceof zzbri) {
                    zzbriVar = (zzbri) queryLocalInterface9;
                } else {
                    zzbriVar = new zzbrg(readStrongBinder9);
                }
            }
            zzbri zzbriVar2 = zzbriVar;
            zzaye.zzc(parcel);
            zzh(asInterface12, readString18, bundle, bundle2, zzsVar3, zzbriVar2);
            parcel2.writeNoException();
        }
        return true;
    }
}
