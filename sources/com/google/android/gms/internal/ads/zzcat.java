package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.o;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcat implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzcat(zzcau zzcauVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, o.h(this.zza.getAndIncrement(), "AdWorker(SCION_TASK_EXECUTOR) #"));
    }
}
