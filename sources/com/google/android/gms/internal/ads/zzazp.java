package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class zzazp {
    private final Object zza = new Object();
    private zzazn zzb = null;
    private boolean zzc = false;

    @Nullable
    public final Activity zza() {
        synchronized (this.zza) {
            try {
                zzazn zzaznVar = this.zzb;
                if (zzaznVar == null) {
                    return null;
                }
                return zzaznVar.zza();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final Context zzb() {
        synchronized (this.zza) {
            try {
                zzazn zzaznVar = this.zzb;
                if (zzaznVar == null) {
                    return null;
                }
                return zzaznVar.zzb();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzazo zzazoVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzazn();
                }
                this.zzb.zzf(zzazoVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Can not cast Context to Application");
                        return;
                    }
                    if (this.zzb == null) {
                        this.zzb = new zzazn();
                    }
                    this.zzb.zzg(application, context);
                    this.zzc = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(zzazo zzazoVar) {
        synchronized (this.zza) {
            try {
                zzazn zzaznVar = this.zzb;
                if (zzaznVar == null) {
                    return;
                }
                zzaznVar.zzh(zzazoVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
