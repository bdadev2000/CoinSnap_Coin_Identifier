package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzry {
    public static /* synthetic */ boolean zza(AtomicReference atomicReference, Object obj, Object obj2) {
        boolean z10;
        while (true) {
            if (atomicReference.compareAndSet(null, obj2)) {
                z10 = true;
            } else if (atomicReference.get() != null) {
                z10 = false;
            } else {
                continue;
            }
            if (z10) {
                return true;
            }
            if (atomicReference.get() != null) {
                return false;
            }
        }
    }
}
