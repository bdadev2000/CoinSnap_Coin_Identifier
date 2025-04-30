package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* loaded from: classes.dex */
public abstract class nc {
    public static int a(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static int a(long j7, long j9) {
        if (j7 < j9) {
            return -1;
        }
        return j7 > j9 ? 1 : 0;
    }

    public static long a(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j7 = jArr[0];
        for (int i9 = 1; i9 < jArr.length; i9++) {
            long j9 = jArr[i9];
            if (j9 > j7) {
                j7 = j9;
            }
        }
        return j7;
    }
}
