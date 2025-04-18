package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;

/* loaded from: classes.dex */
public abstract class zzbt extends zzaym implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbl zzblVar = null;
        zzcq zzcqVar = null;
        switch (i2) {
            case 1:
                zzbr zze = zze();
                parcel2.writeNoException();
                zzayn.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzblVar = queryLocalInterface instanceof zzbl ? (zzbl) queryLocalInterface : new zzbj(readStrongBinder);
                }
                zzayn.zzc(parcel);
                zzl(zzblVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbha zzb = zzbgz.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbhd zzb2 = zzbhc.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbhj zzb3 = zzbhi.zzb(parcel.readStrongBinder());
                zzbhg zzb4 = zzbhf.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbfr zzbfrVar = (zzbfr) zzayn.zza(parcel, zzbfr.CREATOR);
                zzayn.zzc(parcel);
                zzo(zzbfrVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcqVar = queryLocalInterface2 instanceof zzcq ? (zzcq) queryLocalInterface2 : new zzcq(readStrongBinder2);
                }
                zzayn.zzc(parcel);
                zzq(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbhn zzb5 = zzbhm.zzb(parcel.readStrongBinder());
                zzs zzsVar = (zzs) zzayn.zza(parcel, zzs.CREATOR);
                zzayn.zzc(parcel);
                zzj(zzb5, zzsVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzayn.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzayn.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbhq zzb6 = zzbhp.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzk(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbmg zzbmgVar = (zzbmg) zzayn.zza(parcel, zzbmg.CREATOR);
                zzayn.zzc(parcel);
                zzn(zzbmgVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmp zzb7 = zzbmo.zzb(parcel.readStrongBinder());
                zzayn.zzc(parcel);
                zzi(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzayn.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzayn.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
