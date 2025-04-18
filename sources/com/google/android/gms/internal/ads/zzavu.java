package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class zzavu implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzavu(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzavm(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(new zzavs(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(new zzavp(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(new zzavo(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzavr(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(new zzavn(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(new zzavq(this, activity));
    }

    public final void zza(zzavt zzavtVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzavtVar.zza(activityLifecycleCallbacks);
            } else if (!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception unused) {
        }
    }
}
