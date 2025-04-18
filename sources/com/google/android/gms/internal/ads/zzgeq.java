package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
final class zzgeq extends zzgep {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    public zzgeq(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    public final int zza(zzget zzgetVar) {
        return this.zzb.decrementAndGet(zzgetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    public final void zzb(zzget zzgetVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.zza;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzgetVar, null, set2)) {
                if (atomicReferenceFieldUpdater.get(zzgetVar) != null) {
                }
            }
            return;
        } while (atomicReferenceFieldUpdater.get(zzgetVar) == null);
    }
}
