package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzbhy extends zzaym implements zzbhz {
    public zzbhy() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbhw zzbhuVar;
        switch (i2) {
            case 2:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 3:
                List zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(zzu);
                return true;
            case 4:
                String zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzo);
                return true;
            case 5:
                zzbgc zzk = zzk();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzk);
                return true;
            case 6:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 7:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 10:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzeb zzh = zzh();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzh);
                return true;
            case 12:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbfv zzi = zzi();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzayn.zza(parcel, Bundle.CREATOR);
                zzayn.zzc(parcel);
                zzz(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzayn.zza(parcel, Bundle.CREATOR);
                zzayn.zzc(parcel);
                boolean zzJ = zzJ(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzJ ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzayn.zza(parcel, Bundle.CREATOR);
                zzayn.zzc(parcel);
                zzC(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper zzm = zzm();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzm);
                return true;
            case 19:
                IObjectWrapper zzl = zzl();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzl);
                return true;
            case 20:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzayn.zze(parcel2, zzf);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbhuVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbhuVar = queryLocalInterface instanceof zzbhw ? (zzbhw) queryLocalInterface : new zzbhu(readStrongBinder);
                }
                zzayn.zzc(parcel);
                zzG(zzbhuVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 24:
                boolean zzI = zzI();
                parcel2.writeNoException();
                int i4 = zzayn.zza;
                parcel2.writeInt(zzI ? 1 : 0);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzdh zzb = com.google.android.gms.ads.internal.client.zzdg.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzy(zzb);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdd zzb2 = com.google.android.gms.ads.internal.client.zzdc.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzE(zzb2);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbfz zzj = zzj();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzj);
                return true;
            case 30:
                boolean zzH = zzH();
                parcel2.writeNoException();
                int i5 = zzayn.zza;
                parcel2.writeInt(zzH ? 1 : 0);
                return true;
            case 31:
                com.google.android.gms.ads.internal.client.zzdy zzg = zzg();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zzg);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdr zzb3 = com.google.android.gms.ads.internal.client.zzdq.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzF(zzb3);
                parcel2.writeNoException();
                return true;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                Bundle bundle4 = (Bundle) zzayn.zza(parcel, Bundle.CREATOR);
                zzayn.zzc(parcel);
                zzB(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
