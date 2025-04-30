package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class zztc {
    public static /* synthetic */ boolean zza(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(null, obj2)) {
            if (atomicReference.get() != null && atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}
