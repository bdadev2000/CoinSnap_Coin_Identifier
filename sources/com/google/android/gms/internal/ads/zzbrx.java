package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes3.dex */
final class zzbrx implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbry zzb;

    public zzbrx(zzbry zzbryVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = zzbryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzv.zzj();
        activity = this.zzb.zza;
        com.google.android.gms.ads.internal.overlay.zzn.zza(activity, this.zza, true);
    }
}
