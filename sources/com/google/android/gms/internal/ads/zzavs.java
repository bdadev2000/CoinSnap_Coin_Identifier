package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class zzavs implements zzavt {
    final /* synthetic */ Activity zza;

    public zzavs(zzavu zzavuVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.zza);
    }
}
