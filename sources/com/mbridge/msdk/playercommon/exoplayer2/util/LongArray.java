package com.mbridge.msdk.playercommon.exoplayer2.util;

import Q7.n0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public final void add(long j7) {
        int i9 = this.size;
        long[] jArr = this.values;
        if (i9 == jArr.length) {
            this.values = Arrays.copyOf(jArr, i9 * 2);
        }
        long[] jArr2 = this.values;
        int i10 = this.size;
        this.size = i10 + 1;
        jArr2[i10] = j7;
    }

    public final long get(int i9) {
        if (i9 >= 0 && i9 < this.size) {
            return this.values[i9];
        }
        StringBuilder p2 = n0.p(i9, "Invalid index ", ", size is ");
        p2.append(this.size);
        throw new IndexOutOfBoundsException(p2.toString());
    }

    public final int size() {
        return this.size;
    }

    public final long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray(int i9) {
        this.values = new long[i9];
    }
}
