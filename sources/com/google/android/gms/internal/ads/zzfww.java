package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class zzfww implements Runnable {

    @Nullable
    private final TaskCompletionSource zza;

    public zzfww() {
        this.zza = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e4) {
            zzc(e4);
        }
    }

    public abstract void zza();

    @Nullable
    public final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public zzfww(@Nullable TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
