package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmp;

/* loaded from: classes.dex */
public final class zzbs extends zzayl implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbr zze() throws RemoteException {
        zzbr zzbpVar;
        Parcel zzdb = zzdb(1, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbpVar = queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbp(readStrongBinder);
        }
        zzdb.recycle();
        return zzbpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(zzbha zzbhaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbhd zzbhdVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String str, zzbhj zzbhjVar, zzbhg zzbhgVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayn.zzf(zza, zzbhjVar);
        zzayn.zzf(zza, zzbhgVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzbmp zzbmpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzbhn zzbhnVar, zzs zzsVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbhnVar);
        zzayn.zzd(zza, zzsVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(zzbhq zzbhqVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbhqVar);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(zzbl zzblVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzblVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, adManagerAdViewOptions);
        zzdc(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(zzbmg zzbmgVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzbfr zzbfrVar) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzd(zza, zzbfrVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzcq zzcqVar) throws RemoteException {
        throw null;
    }
}
