package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzauv implements Runnable {
    final /* synthetic */ zzauw zza;

    public zzauv(zzauw zzauwVar) {
        this.zza = zzauwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z10;
        zzawf zzawfVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzauw.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z11 = false;
            try {
                z10 = ((Boolean) zzbcn.zzcE.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
            if (z10) {
                try {
                    zzawfVar = this.zza.zze;
                    zzauw.zza = zzfrr.zzb(zzawfVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z11 = z10;
            this.zza.zzb = Boolean.valueOf(z11);
            conditionVariable2 = zzauw.zzc;
            conditionVariable2.open();
        }
    }
}
