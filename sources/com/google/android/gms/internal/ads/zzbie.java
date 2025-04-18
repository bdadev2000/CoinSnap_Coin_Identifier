package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbie extends zzbhi {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbie(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zze(com.google.android.gms.ads.internal.client.zzby zzbyVar, IObjectWrapper iObjectWrapper) {
        AdListener adListener;
        if (zzbyVar != null && iObjectWrapper != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzbyVar.zzi() instanceof com.google.android.gms.ads.internal.client.zzg) {
                    com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbyVar.zzi();
                    if (zzgVar != null) {
                        adListener = zzgVar.zzb();
                    } else {
                        adListener = null;
                    }
                    adManagerAdView.setAdListener(adListener);
                }
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            }
            try {
                if (zzbyVar.zzj() instanceof zzaza) {
                    zzaza zzazaVar = (zzaza) zzbyVar.zzj();
                    if (zzazaVar != null) {
                        appEventListener = zzazaVar.zzb();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e10);
            }
            com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzbid(this, adManagerAdView, zzbyVar));
        }
    }
}
