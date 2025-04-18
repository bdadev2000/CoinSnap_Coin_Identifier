package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzavg implements Runnable {
    final /* synthetic */ zzavh zza;

    public zzavg(zzavh zzavhVar) {
        this.zza = zzavhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z2;
        zzawo zzawoVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzavh.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z3 = false;
            try {
                z2 = ((Boolean) zzbcv.zzcB.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z2 = false;
            }
            if (z2) {
                try {
                    zzawoVar = this.zza.zze;
                    zzavh.zza = zzftb.zzb(zzawoVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z3 = z2;
            this.zza.zzb = Boolean.valueOf(z3);
            conditionVariable2 = zzavh.zzc;
            conditionVariable2.open();
        }
    }
}
