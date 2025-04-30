package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
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
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbit zzbitVar) throws RemoteException;

    void zzg(zzbiw zzbiwVar) throws RemoteException;

    void zzh(String str, zzbjc zzbjcVar, @Nullable zzbiz zzbizVar) throws RemoteException;

    void zzi(zzboi zzboiVar) throws RemoteException;

    void zzj(zzbjg zzbjgVar, zzq zzqVar) throws RemoteException;

    void zzk(zzbjj zzbjjVar) throws RemoteException;

    void zzl(zzbh zzbhVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbnz zzbnzVar) throws RemoteException;

    void zzo(zzbhk zzbhkVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcf zzcfVar) throws RemoteException;
}
