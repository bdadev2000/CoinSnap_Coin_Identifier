package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
final class zzgdk extends zzgdj {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    public zzgdk(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final int zza(zzgdn zzgdnVar) {
        return this.zzb.decrementAndGet(zzgdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zzb(zzgdn zzgdnVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z10;
        do {
            atomicReferenceFieldUpdater = this.zza;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(zzgdnVar, null, set2)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(zzgdnVar) != null) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(zzgdnVar) == null);
    }
}
