package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbwz;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxq;

/* loaded from: classes3.dex */
public final class zzfq extends zzbxb {
    private static void zzr(final zzbxj zzbxjVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfp
            @Override // java.lang.Runnable
            public final void run() {
                zzbxj zzbxjVar2 = zzbxj.this;
                if (zzbxjVar2 != null) {
                    try {
                        zzbxjVar2.zze(1);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final zzdy zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    @Nullable
    public final zzbwz zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzf(zzm zzmVar, zzbxj zzbxjVar) throws RemoteException {
        zzr(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzg(zzm zzmVar, zzbxj zzbxjVar) throws RemoteException {
        zzr(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzh(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzi(zzdo zzdoVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzj(zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzk(zzbxf zzbxfVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzl(zzbxq zzbxqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzp(zzbxk zzbxkVar) throws RemoteException {
    }
}
