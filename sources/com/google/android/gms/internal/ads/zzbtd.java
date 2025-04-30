package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbtd extends zzbae implements zzbte {
    public zzbtd() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbte zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzbte) {
            return (zzbte) queryLocalInterface;
        }
        return new zzbtc(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0021. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbth zzbthVar = null;
        zzbsp zzbsnVar = null;
        zzbsy zzbswVar = null;
        zzbss zzbsqVar = null;
        zzbtb zzbszVar = null;
        zzbsy zzbswVar2 = null;
        zzbtb zzbszVar2 = null;
        zzbsv zzbstVar = null;
        zzbss zzbsqVar2 = null;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 5) {
                        if (i9 != 10) {
                            if (i9 != 11) {
                                switch (i9) {
                                    case 13:
                                        String readString = parcel.readString();
                                        String readString2 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder = parcel.readStrongBinder();
                                        if (readStrongBinder != null) {
                                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface instanceof zzbss) {
                                                zzbsqVar2 = (zzbss) queryLocalInterface;
                                            } else {
                                                zzbsqVar2 = new zzbsq(readStrongBinder);
                                            }
                                        }
                                        zzbss zzbssVar = zzbsqVar2;
                                        zzbrl zzb = zzbrk.zzb(parcel.readStrongBinder());
                                        com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                                        zzbaf.zzc(parcel);
                                        zzj(readString, readString2, zzlVar, asInterface, zzbssVar, zzb, zzqVar);
                                        parcel2.writeNoException();
                                        break;
                                    case 14:
                                        String readString3 = parcel.readString();
                                        String readString4 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                                        if (readStrongBinder2 != null) {
                                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                            if (queryLocalInterface2 instanceof zzbsv) {
                                                zzbstVar = (zzbsv) queryLocalInterface2;
                                            } else {
                                                zzbstVar = new zzbst(readStrongBinder2);
                                            }
                                        }
                                        zzbsv zzbsvVar = zzbstVar;
                                        zzbrl zzb2 = zzbrk.zzb(parcel.readStrongBinder());
                                        zzbaf.zzc(parcel);
                                        zzl(readString3, readString4, zzlVar2, asInterface2, zzbsvVar, zzb2);
                                        parcel2.writeNoException();
                                        break;
                                    case 15:
                                        IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzbaf.zzc(parcel);
                                        boolean zzs = zzs(asInterface3);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzs ? 1 : 0);
                                        break;
                                    case 16:
                                        String readString5 = parcel.readString();
                                        String readString6 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                                        if (readStrongBinder3 != null) {
                                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface3 instanceof zzbtb) {
                                                zzbszVar2 = (zzbtb) queryLocalInterface3;
                                            } else {
                                                zzbszVar2 = new zzbsz(readStrongBinder3);
                                            }
                                        }
                                        zzbtb zzbtbVar = zzbszVar2;
                                        zzbrl zzb3 = zzbrk.zzb(parcel.readStrongBinder());
                                        zzbaf.zzc(parcel);
                                        zzp(readString5, readString6, zzlVar3, asInterface4, zzbtbVar, zzb3);
                                        parcel2.writeNoException();
                                        break;
                                    case 17:
                                        IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzbaf.zzc(parcel);
                                        boolean zzt = zzt(asInterface5);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzt ? 1 : 0);
                                        break;
                                    case 18:
                                        String readString7 = parcel.readString();
                                        String readString8 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                                        if (readStrongBinder4 != null) {
                                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface4 instanceof zzbsy) {
                                                zzbswVar2 = (zzbsy) queryLocalInterface4;
                                            } else {
                                                zzbswVar2 = new zzbsw(readStrongBinder4);
                                            }
                                        }
                                        zzbsy zzbsyVar = zzbswVar2;
                                        zzbrl zzb4 = zzbrk.zzb(parcel.readStrongBinder());
                                        zzbaf.zzc(parcel);
                                        zzm(readString7, readString8, zzlVar4, asInterface6, zzbsyVar, zzb4);
                                        parcel2.writeNoException();
                                        break;
                                    case 19:
                                        String readString9 = parcel.readString();
                                        zzbaf.zzc(parcel);
                                        zzq(readString9);
                                        parcel2.writeNoException();
                                        break;
                                    case 20:
                                        String readString10 = parcel.readString();
                                        String readString11 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                                        if (readStrongBinder5 != null) {
                                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface5 instanceof zzbtb) {
                                                zzbszVar = (zzbtb) queryLocalInterface5;
                                            } else {
                                                zzbszVar = new zzbsz(readStrongBinder5);
                                            }
                                        }
                                        zzbtb zzbtbVar2 = zzbszVar;
                                        zzbrl zzb5 = zzbrk.zzb(parcel.readStrongBinder());
                                        zzbaf.zzc(parcel);
                                        zzo(readString10, readString11, zzlVar5, asInterface7, zzbtbVar2, zzb5);
                                        parcel2.writeNoException();
                                        break;
                                    case 21:
                                        String readString12 = parcel.readString();
                                        String readString13 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder6 = parcel.readStrongBinder();
                                        if (readStrongBinder6 != null) {
                                            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface6 instanceof zzbss) {
                                                zzbsqVar = (zzbss) queryLocalInterface6;
                                            } else {
                                                zzbsqVar = new zzbsq(readStrongBinder6);
                                            }
                                        }
                                        zzbss zzbssVar2 = zzbsqVar;
                                        zzbrl zzb6 = zzbrk.zzb(parcel.readStrongBinder());
                                        com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                                        zzbaf.zzc(parcel);
                                        zzk(readString12, readString13, zzlVar6, asInterface8, zzbssVar2, zzb6, zzqVar2);
                                        parcel2.writeNoException();
                                        break;
                                    case 22:
                                        String readString14 = parcel.readString();
                                        String readString15 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder7 = parcel.readStrongBinder();
                                        if (readStrongBinder7 != null) {
                                            IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface7 instanceof zzbsy) {
                                                zzbswVar = (zzbsy) queryLocalInterface7;
                                            } else {
                                                zzbswVar = new zzbsw(readStrongBinder7);
                                            }
                                        }
                                        zzbsy zzbsyVar2 = zzbswVar;
                                        zzbrl zzb7 = zzbrk.zzb(parcel.readStrongBinder());
                                        zzbhk zzbhkVar = (zzbhk) zzbaf.zza(parcel, zzbhk.CREATOR);
                                        zzbaf.zzc(parcel);
                                        zzn(readString14, readString15, zzlVar7, asInterface9, zzbsyVar2, zzb7, zzbhkVar);
                                        parcel2.writeNoException();
                                        break;
                                    case 23:
                                        String readString16 = parcel.readString();
                                        String readString17 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder8 = parcel.readStrongBinder();
                                        if (readStrongBinder8 != null) {
                                            IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                            if (queryLocalInterface8 instanceof zzbsp) {
                                                zzbsnVar = (zzbsp) queryLocalInterface8;
                                            } else {
                                                zzbsnVar = new zzbsn(readStrongBinder8);
                                            }
                                        }
                                        zzbsp zzbspVar = zzbsnVar;
                                        zzbrl zzb8 = zzbrk.zzb(parcel.readStrongBinder());
                                        zzbaf.zzc(parcel);
                                        zzi(readString16, readString17, zzlVar8, asInterface10, zzbspVar, zzb8);
                                        parcel2.writeNoException();
                                        break;
                                    case 24:
                                        IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzbaf.zzc(parcel);
                                        boolean zzr = zzr(asInterface11);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzr ? 1 : 0);
                                        break;
                                    default:
                                        return false;
                                }
                            } else {
                                parcel.createStringArray();
                                zzbaf.zzc(parcel);
                                parcel2.writeNoException();
                            }
                        } else {
                            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                            zzbaf.zzc(parcel);
                            parcel2.writeNoException();
                        }
                    } else {
                        com.google.android.gms.ads.internal.client.zzdq zze = zze();
                        parcel2.writeNoException();
                        zzbaf.zzf(parcel2, zze);
                    }
                } else {
                    zzbtt zzg = zzg();
                    parcel2.writeNoException();
                    zzbaf.zze(parcel2, zzg);
                }
            } else {
                zzbtt zzf = zzf();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzf);
            }
        } else {
            IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString18 = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzbaf.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzbaf.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder readStrongBinder9 = parcel.readStrongBinder();
            if (readStrongBinder9 != null) {
                IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface9 instanceof zzbth) {
                    zzbthVar = (zzbth) queryLocalInterface9;
                } else {
                    zzbthVar = new zzbtf(readStrongBinder9);
                }
            }
            zzbth zzbthVar2 = zzbthVar;
            zzbaf.zzc(parcel);
            zzh(asInterface12, readString18, bundle, bundle2, zzqVar3, zzbthVar2);
            parcel2.writeNoException();
        }
        return true;
    }
}
