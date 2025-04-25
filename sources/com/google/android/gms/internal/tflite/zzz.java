package com.google.android.gms.internal.tflite;

import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
final class zzz implements ThreadFactory {
    final /* synthetic */ ThreadFactory zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ AtomicLong zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzz(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = threadFactory;
        this.zzb = str;
        this.zzc = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zza.newThread(runnable);
        String str = this.zzb;
        if (str != null) {
            AtomicLong atomicLong = this.zzc;
            atomicLong.getClass();
            newThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        return newThread;
    }
}
