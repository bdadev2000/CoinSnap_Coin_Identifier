package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzayw implements zzayy {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    public zzayw(zzayz zzayzVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}
