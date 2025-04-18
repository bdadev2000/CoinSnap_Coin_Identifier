package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaze implements Application.ActivityLifecycleCallbacks {

    @Nullable
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private boolean zzd = true;
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            Activity activity2 = this.zza;
            if (activity2 == null) {
                return;
            }
            if (activity2.equals(activity)) {
                this.zza = null;
            }
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    if (((zzazt) it.next()).zza()) {
                        it.remove();
                    }
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzazt) it.next()).zzb();
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        zzftd zzftdVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzazd zzazdVar = new zzazd(this);
        this.zzh = zzazdVar;
        zzftdVar.postDelayed(zzazdVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z10 = !this.zzd;
        this.zzd = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzazt) it.next()).zzc();
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
                }
            }
            if (z10) {
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzazf) it2.next()).zza(true);
                    } catch (Exception e10) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("", e10);
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Nullable
    public final Activity zza() {
        return this.zza;
    }

    @Nullable
    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzazf zzazfVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzazfVar);
        }
    }

    public final void zzg(Application application, Context context) {
        if (!this.zzi) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                zzk((Activity) context);
            }
            this.zzb = application;
            this.zzj = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaZ)).longValue();
            this.zzi = true;
        }
    }

    public final void zzh(zzazf zzazfVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzazfVar);
        }
    }
}
