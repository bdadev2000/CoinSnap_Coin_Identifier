package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
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
public interface zzbu extends IInterface {
    zzbr zze() throws RemoteException;

    void zzf(zzbgw zzbgwVar) throws RemoteException;

    void zzg(zzbgz zzbgzVar) throws RemoteException;

    void zzh(String str, zzbhf zzbhfVar, @Nullable zzbhc zzbhcVar) throws RemoteException;

    void zzi(zzbmk zzbmkVar) throws RemoteException;

    void zzj(zzbhj zzbhjVar, zzs zzsVar) throws RemoteException;

    void zzk(zzbhm zzbhmVar) throws RemoteException;

    void zzl(zzbl zzblVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbmb zzbmbVar) throws RemoteException;

    void zzo(zzbfn zzbfnVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcq zzcqVar) throws RemoteException;
}
