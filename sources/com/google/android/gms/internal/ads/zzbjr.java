package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbjr extends zzbae implements zzbjs {
    public zzbjr() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbjp zzbjnVar;
        switch (i9) {
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
                zzbhv zzk = zzk();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzk);
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
                com.google.android.gms.ads.internal.client.zzdq zzh = zzh();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzh);
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
                zzbho zzi = zzi();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzbaf.zza(parcel, Bundle.CREATOR);
                zzbaf.zzc(parcel);
                zzz(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzbaf.zza(parcel, Bundle.CREATOR);
                zzbaf.zzc(parcel);
                boolean zzI = zzI(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzI ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzbaf.zza(parcel, Bundle.CREATOR);
                zzbaf.zzc(parcel);
                zzB(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper zzm = zzm();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzm);
                return true;
            case 19:
                IObjectWrapper zzl = zzl();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzl);
                return true;
            case 20:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzf);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbjnVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof zzbjp) {
                        zzbjnVar = (zzbjp) queryLocalInterface;
                    } else {
                        zzbjnVar = new zzbjn(readStrongBinder);
                    }
                }
                zzbaf.zzc(parcel);
                zzF(zzbjnVar);
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
                boolean zzH = zzH();
                parcel2.writeNoException();
                int i11 = zzbaf.zza;
                parcel2.writeInt(zzH ? 1 : 0);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzcw zzb = com.google.android.gms.ads.internal.client.zzcv.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzy(zzb);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzcs zzb2 = com.google.android.gms.ads.internal.client.zzcr.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzD(zzb2);
                parcel2.writeNoException();
                return true;
            case 27:
                zzC();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbhs zzj = zzj();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzj);
                return true;
            case AD_PLAY_RESET_ON_DEINIT_VALUE:
                boolean zzG = zzG();
                parcel2.writeNoException();
                int i12 = zzbaf.zza;
                parcel2.writeInt(zzG ? 1 : 0);
                return true;
            case 31:
                com.google.android.gms.ads.internal.client.zzdn zzg = zzg();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzg);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdg zzb3 = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzE(zzb3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
