package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes2.dex */
final class zzbtw implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbtx zzb;

    public zzbtw(zzbtx zzbtxVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = zzbtxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzu.zzi();
        activity = this.zzb.zza;
        com.google.android.gms.ads.internal.overlay.zzn.zza(activity, this.zza, true);
    }
}
