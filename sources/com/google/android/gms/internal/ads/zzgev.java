package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
final class zzgev extends zzgeu {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    public zzgev(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzgeu
    public final int zza(zzgey zzgeyVar) {
        return this.zzb.decrementAndGet(zzgeyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgeu
    public final void zzb(zzgey zzgeyVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.zza;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzgeyVar, null, set2)) {
                if (atomicReferenceFieldUpdater.get(zzgeyVar) != null) {
                }
            }
            return;
        } while (atomicReferenceFieldUpdater.get(zzgeyVar) == null);
    }
}
