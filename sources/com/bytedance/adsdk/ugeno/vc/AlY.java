package com.bytedance.adsdk.ugeno.vc;

import java.util.Collection;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class AlY {
    public static int YFl(boolean z10, int i10, int i11) {
        if (i11 == 0 || !z10) {
            return i10;
        }
        int i12 = i10 - LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        int abs = Math.abs(i12) % i11;
        return (i12 >= 0 || abs == 0) ? abs : i11 - abs;
    }

    public static boolean YFl(int i10, Collection<?> collection) {
        return i10 >= 0 && i10 < collection.size();
    }
}
