package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbij extends zzbae implements zzbik {
    public zzbij() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i9) {
            case 2:
                IObjectWrapper zzh = zzh();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzh);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(zzo);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                zzbhv zzf = zzf();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzf);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 10:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 11:
                Bundle zzc = zzc();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdq zzd = zzd();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzbaf.zza(parcel, Bundle.CREATOR);
                zzbaf.zzc(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzbaf.zza(parcel, Bundle.CREATOR);
                zzbaf.zzc(parcel);
                boolean zzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzs ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzbaf.zza(parcel, Bundle.CREATOR);
                zzbaf.zzc(parcel);
                zzr(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                zzbho zze = zze();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zze);
                return true;
            case 18:
                IObjectWrapper zzg = zzg();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzg);
                return true;
            case 19:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
