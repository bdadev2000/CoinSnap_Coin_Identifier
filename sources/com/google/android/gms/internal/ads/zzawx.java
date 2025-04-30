package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzawx implements Runnable {
    final /* synthetic */ zzawy zza;

    public zzawx(zzawy zzawyVar) {
        this.zza = zzawyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z8;
        zzaye zzayeVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzawy.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z9 = false;
            try {
                z8 = ((Boolean) zzbep.zzcy.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z8 = false;
            }
            if (z8) {
                try {
                    zzayeVar = this.zza.zze;
                    zzawy.zza = zzftk.zzb(zzayeVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z9 = z8;
            this.zza.zzb = Boolean.valueOf(z9);
            conditionVariable2 = zzawy.zzc;
            conditionVariable2.open();
        }
    }
}
