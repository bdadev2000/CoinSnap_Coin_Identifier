package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzgcz {
    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        boolean z10;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
                z10 = true;
            } else if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                z10 = false;
            } else {
                continue;
            }
            if (z10) {
                return true;
            }
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
    }
}
