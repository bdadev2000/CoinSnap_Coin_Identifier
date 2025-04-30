package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzboi;

/* loaded from: classes2.dex */
public abstract class zzbp extends zzbae implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbh zzbhVar = null;
        zzcf zzcfVar = null;
        switch (i9) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbh) {
                        zzbhVar = (zzbh) queryLocalInterface;
                    } else {
                        zzbhVar = new zzbf(readStrongBinder);
                    }
                }
                zzbaf.zzc(parcel);
                zzl(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbit zzb = zzbis.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbiw zzb2 = zzbiv.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbjc zzb3 = zzbjb.zzb(parcel.readStrongBinder());
                zzbiz zzb4 = zzbiy.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbhk zzbhkVar = (zzbhk) zzbaf.zza(parcel, zzbhk.CREATOR);
                zzbaf.zzc(parcel);
                zzo(zzbhkVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzcf) {
                        zzcfVar = (zzcf) queryLocalInterface2;
                    } else {
                        zzcfVar = new zzcf(readStrongBinder2);
                    }
                }
                zzbaf.zzc(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbjg zzb5 = zzbjf.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                zzbaf.zzc(parcel);
                zzj(zzb5, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzbaf.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzbaf.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbjj zzb6 = zzbji.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzk(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbnz zzbnzVar = (zzbnz) zzbaf.zza(parcel, zzbnz.CREATOR);
                zzbaf.zzc(parcel);
                zzn(zzbnzVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzboi zzb7 = zzboh.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzi(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzbaf.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzbaf.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
