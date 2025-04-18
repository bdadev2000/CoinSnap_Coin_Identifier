package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbdp;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbtu;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbwr;
import com.google.android.gms.internal.ads.zzbws;
import com.google.zxing.aztec.encoder.Encoder;

/* loaded from: classes.dex */
public abstract class zzbx extends zzaym implements zzby {
    public zzbx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzby zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzbw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbl zzblVar = null;
        zzct zzctVar = null;
        zzbo zzboVar = null;
        zzdr zzdrVar = null;
        zzcc zzccVar = null;
        zzcq zzcqVar = null;
        zzbi zzbiVar = null;
        zzcm zzcmVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzaa = zzaa();
                parcel2.writeNoException();
                int i4 = zzayn.zza;
                parcel2.writeInt(zzaa ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzayn.zza(parcel, zzm.CREATOR);
                zzayn.zzc(parcel);
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
                    zzblVar = queryLocalInterface instanceof zzbl ? (zzbl) queryLocalInterface : new zzbj(readStrongBinder);
                }
                zzayn.zzc(parcel);
                zzD(zzblVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzcmVar = queryLocalInterface2 instanceof zzcm ? (zzcm) queryLocalInterface2 : new zzck(readStrongBinder2);
                }
                zzayn.zzc(parcel);
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
                zzayn.zze(parcel2, zzg);
                return true;
            case 13:
                zzs zzsVar = (zzs) zzayn.zza(parcel, zzs.CREATOR);
                zzayn.zzc(parcel);
                zzF(zzsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbtv zzb = zzbtu.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbty zzb2 = zzbtx.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzayn.zzc(parcel);
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
                zzbdq zzb3 = zzbdp.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbiVar = queryLocalInterface3 instanceof zzbi ? (zzbi) queryLocalInterface3 : new zzbg(readStrongBinder3);
                }
                zzayn.zzc(parcel);
                zzC(zzbiVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcqVar = queryLocalInterface4 instanceof zzcq ? (zzcq) queryLocalInterface4 : new zzcq(readStrongBinder4);
                }
                zzayn.zzc(parcel);
                zzac(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzg2 = zzayn.zzg(parcel);
                zzayn.zzc(parcel);
                zzN(zzg2);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                int i5 = zzayn.zza;
                parcel2.writeInt(zzZ ? 1 : 0);
                return true;
            case 24:
                zzbws zzb4 = zzbwr.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzayn.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzeb zzl = zzl();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzl);
                return true;
            case 29:
                zzgb zzgbVar = (zzgb) zzayn.zza(parcel, zzgb.CREATOR);
                zzayn.zzc(parcel);
                zzU(zzgbVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzef zzefVar = (zzef) zzayn.zza(parcel, zzef.CREATOR);
                zzayn.zzc(parcel);
                zzK(zzefVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                zzcm zzj = zzj();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzj);
                return true;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                zzbl zzi = zzi();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzi);
                return true;
            case 34:
                boolean zzg3 = zzayn.zzg(parcel);
                zzayn.zzc(parcel);
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
                    zzccVar = queryLocalInterface5 instanceof zzcc ? (zzcc) queryLocalInterface5 : new zzca(readStrongBinder5);
                }
                zzayn.zzc(parcel);
                zzE(zzccVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                zzayn.zze(parcel2, zzd);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzayn.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzy zzyVar = (zzy) zzayn.zza(parcel, zzy.CREATOR);
                zzayn.zzc(parcel);
                zzI(zzyVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbar zze = zzbaq.zze(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdy zzk = zzk();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdrVar = queryLocalInterface6 instanceof zzdr ? (zzdr) queryLocalInterface6 : new zzdp(readStrongBinder6);
                }
                zzayn.zzc(parcel);
                zzP(zzdrVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzayn.zza(parcel, zzm.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzboVar = queryLocalInterface7 instanceof zzbo ? (zzbo) queryLocalInterface7 : new zzbm(readStrongBinder7);
                }
                zzayn.zzc(parcel);
                zzy(zzmVar2, zzboVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzW(asInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzctVar = queryLocalInterface8 instanceof zzct ? (zzct) queryLocalInterface8 : new zzcr(readStrongBinder8);
                }
                zzayn.zzc(parcel);
                zzJ(zzctVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zzY = zzY();
                parcel2.writeNoException();
                int i6 = zzayn.zza;
                parcel2.writeInt(zzY ? 1 : 0);
                return true;
        }
    }
}
