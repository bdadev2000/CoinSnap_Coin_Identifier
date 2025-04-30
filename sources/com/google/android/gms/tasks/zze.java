package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    public zze(zzf zzfVar, Task task) {
        this.zzb = zzfVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar;
        zzw zzwVar2;
        zzw zzwVar3;
        Continuation continuation;
        try {
            continuation = this.zzb.zzb;
            Task task = (Task) continuation.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzf zzfVar = this.zzb;
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, this.zzb);
            task.addOnCanceledListener(executor, this.zzb);
        } catch (RuntimeExecutionException e4) {
            if (e4.getCause() instanceof Exception) {
                zzwVar3 = this.zzb.zzc;
                zzwVar3.zza((Exception) e4.getCause());
            } else {
                zzwVar2 = this.zzb.zzc;
                zzwVar2.zza(e4);
            }
        } catch (Exception e9) {
            zzwVar = this.zzb.zzc;
            zzwVar.zza(e9);
        }
    }
}
