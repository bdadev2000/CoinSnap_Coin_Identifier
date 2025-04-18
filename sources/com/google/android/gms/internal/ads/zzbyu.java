package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import eb.j;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbyu implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzbyu(zzbyv zzbyvVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, j.i("AdWorker(SCION_TASK_EXECUTOR) #", this.zza.getAndIncrement()));
    }
}
