package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzavr implements zzavt {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    public zzavr(zzavu zzavuVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}
