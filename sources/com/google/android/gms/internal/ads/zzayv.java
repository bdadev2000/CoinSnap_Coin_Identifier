package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class zzayv implements zzayy {
    final /* synthetic */ Activity zza;

    public zzayv(zzayz zzayzVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.zza);
    }
}
