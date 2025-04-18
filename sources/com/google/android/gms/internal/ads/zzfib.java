package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes4.dex */
public final class zzfib {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgfz zzc;

    public zzfib(Callable callable, zzgfz zzgfzVar) {
        this.zzb = callable;
        this.zzc = zzgfzVar;
    }

    public final synchronized ListenableFuture zza() {
        zzc(1);
        return (ListenableFuture) this.zza.poll();
    }

    public final synchronized void zzb(ListenableFuture listenableFuture) {
        this.zza.addFirst(listenableFuture);
    }

    public final synchronized void zzc(int i2) {
        int size = i2 - this.zza.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
