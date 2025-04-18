package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class zzfnt implements Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private zzfns zzc;

    private final void zza(boolean z10) {
        if (this.zza != z10) {
            this.zza = z10;
            if (this.zzb) {
                zzb(z10);
                zzfns zzfnsVar = this.zzc;
                if (zzfnsVar != null) {
                    zzfnsVar.zzc(z10);
                }
            }
        }
    }

    private final boolean zzh() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100 && !zzc()) {
            return false;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(zzh());
    }

    public void zzb(boolean z10) {
    }

    public boolean zzc() {
        return false;
    }

    public final void zzd(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void zze(zzfns zzfnsVar) {
        this.zzc = zzfnsVar;
    }

    public final void zzf() {
        this.zzb = true;
        boolean zzh = zzh();
        this.zza = zzh;
        zzb(zzh);
    }

    public final void zzg() {
        this.zzb = false;
        this.zzc = null;
    }
}
