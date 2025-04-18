package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class zzcaf implements ThreadFactory {
    final /* synthetic */ String zza;
    private final AtomicInteger zzb = new AtomicInteger(1);

    public zzcaf(String str) {
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.zza + ") #" + this.zzb.getAndIncrement());
    }
}
