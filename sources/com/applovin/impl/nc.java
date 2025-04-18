package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* loaded from: classes.dex */
public abstract class nc {
    public static int a(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static int a(long j3, long j10) {
        if (j3 < j10) {
            return -1;
        }
        return j3 > j10 ? 1 : 0;
    }

    public static long a(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j3 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 > j3) {
                j3 = j10;
            }
        }
        return j3;
    }
}
