package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class zzavp implements zzavt {
    final /* synthetic */ Activity zza;

    public zzavp(zzavu zzavuVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.zza);
    }
}
