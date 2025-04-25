package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes12.dex */
public abstract class zzj implements Runnable {
    private final TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj() {
        this.zza = null;
    }

    public zzj(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e) {
            zzc(e);
        }
    }

    protected abstract void zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }
}
