package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
final class zzq implements Callable {
    private final long zza;

    public zzq(long j3) {
        this.zza = j3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ConcurrentHashMap concurrentHashMap;
        long j3 = this.zza;
        concurrentHashMap = AdOverlayInfoParcel.zzz;
        if (concurrentHashMap.remove(Long.valueOf(j3)) != null) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
            return null;
        }
        return null;
    }
}
