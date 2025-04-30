package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzboi;

/* loaded from: classes2.dex */
public final class zzbo extends zzbad implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel zzdb = zzdb(1, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof zzbn) {
                zzblVar = (zzbn) queryLocalInterface;
            } else {
                zzblVar = new zzbl(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbit zzbitVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbiw zzbiwVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbjc zzbjcVar, zzbiz zzbizVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbaf.zzf(zza, zzbjcVar);
        zzbaf.zzf(zza, zzbizVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzboi zzboiVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbjg zzbjgVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbjgVar);
        zzbaf.zzd(zza, zzqVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbjj zzbjjVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbjjVar);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbhVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, adManagerAdViewOptions);
        zzdc(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbnz zzbnzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbhk zzbhkVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, zzbhkVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) throws RemoteException {
        throw null;
    }
}
