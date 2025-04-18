package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes3.dex */
public final class zzfgn {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzges zzc;

    public zzfgn(Callable callable, zzges zzgesVar) {
        this.zzb = callable;
        this.zzc = zzgesVar;
    }

    public final synchronized ua.b zza() {
        zzc(1);
        return (ua.b) this.zza.poll();
    }

    public final synchronized void zzb(ua.b bVar) {
        this.zza.addFirst(bVar);
    }

    public final synchronized void zzc(int i10) {
        int size = i10 - this.zza.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
