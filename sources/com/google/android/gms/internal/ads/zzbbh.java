package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzbbh {
    private final Object zza = new Object();
    private zzbbf zzb = null;
    private boolean zzc = false;

    @Nullable
    public final Activity zza() {
        synchronized (this.zza) {
            try {
                zzbbf zzbbfVar = this.zzb;
                if (zzbbfVar != null) {
                    return zzbbfVar.zza();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final Context zzb() {
        synchronized (this.zza) {
            try {
                zzbbf zzbbfVar = this.zzb;
                if (zzbbfVar != null) {
                    return zzbbfVar.zzb();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzbbg zzbbgVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbbf();
                }
                this.zzb.zzf(zzbbgVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(Context context) {
        Application application;
        synchronized (this.zza) {
            try {
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
                        this.zzb = new zzbbf();
                    }
                    this.zzb.zzg(application, context);
                    this.zzc = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(zzbbg zzbbgVar) {
        synchronized (this.zza) {
            try {
                zzbbf zzbbfVar = this.zzb;
                if (zzbbfVar == null) {
                    return;
                }
                zzbbfVar.zzh(zzbbgVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
