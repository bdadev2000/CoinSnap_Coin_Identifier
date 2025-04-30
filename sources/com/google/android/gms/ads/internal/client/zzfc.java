package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzo;

/* loaded from: classes2.dex */
public final class zzfc extends zzbyz {
    private static void zzr(final zzbzh zzbzhVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfb
            @Override // java.lang.Runnable
            public final void run() {
                zzbzh zzbzhVar2 = zzbzh.this;
                if (zzbzhVar2 != null) {
                    try {
                        zzbzhVar2.zze(1);
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final zzdn zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    @Nullable
    public final zzbyx zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzf(zzl zzlVar, zzbzh zzbzhVar) throws RemoteException {
        zzr(zzbzhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzg(zzl zzlVar, zzbzh zzbzhVar) throws RemoteException {
        zzr(zzbzhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzh(boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzi(zzdd zzddVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzj(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzk(zzbzd zzbzdVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzl(zzbzo zzbzoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzp(zzbzi zzbziVar) throws RemoteException {
    }
}
