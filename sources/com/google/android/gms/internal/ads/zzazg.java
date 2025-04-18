package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzazg {
    private final Object zza = new Object();
    private zzaze zzb = null;
    private boolean zzc = false;

    @Nullable
    public final Activity zza() {
        synchronized (this.zza) {
            zzaze zzazeVar = this.zzb;
            if (zzazeVar != null) {
                return zzazeVar.zza();
            }
            return null;
        }
    }

    @Nullable
    public final Context zzb() {
        synchronized (this.zza) {
            zzaze zzazeVar = this.zzb;
            if (zzazeVar != null) {
                return zzazeVar.zzb();
            }
            return null;
        }
    }

    public final void zzc(zzazf zzazfVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzaze();
            }
            this.zzb.zzf(zzazfVar);
        }
    }

    public final void zzd(Context context) {
        Application application;
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                if (application == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzaze();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzazf zzazfVar) {
        synchronized (this.zza) {
            zzaze zzazeVar = this.zzb;
            if (zzazeVar == null) {
                return;
            }
            zzazeVar.zzh(zzazfVar);
        }
    }
}
