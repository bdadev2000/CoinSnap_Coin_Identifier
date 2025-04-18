package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
public final class p extends LruCache {
    public p(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public int sizeOf(String str, Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.getByteCount() / LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
    }
}
