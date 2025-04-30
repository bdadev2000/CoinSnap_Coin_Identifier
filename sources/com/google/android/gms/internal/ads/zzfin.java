package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final class zzfin {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgge zzc;

    public zzfin(Callable callable, zzgge zzggeVar) {
        this.zzb = callable;
        this.zzc = zzggeVar;
    }

    public final synchronized f4.c zza() {
        zzc(1);
        return (f4.c) this.zza.poll();
    }

    public final synchronized void zzb(f4.c cVar) {
        this.zza.addFirst(cVar);
    }

    public final synchronized void zzc(int i9) {
        int size = i9 - this.zza.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
