package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmk;

/* loaded from: classes3.dex */
public final class zzbs extends zzayc implements zzbu {
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
            if (queryLocalInterface instanceof zzbr) {
                zzbpVar = (zzbr) queryLocalInterface;
            } else {
                zzbpVar = new zzbp(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(zzbgw zzbgwVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbgz zzbgzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String str, zzbhf zzbhfVar, zzbhc zzbhcVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaye.zzf(zza, zzbhfVar);
        zzaye.zzf(zza, zzbhcVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzbmk zzbmkVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzbhj zzbhjVar, zzs zzsVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbhjVar);
        zzaye.zzd(zza, zzsVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(zzbhm zzbhmVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbhmVar);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(zzbl zzblVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzblVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, adManagerAdViewOptions);
        zzdc(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(zzbmb zzbmbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzbfn zzbfnVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, zzbfnVar);
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
