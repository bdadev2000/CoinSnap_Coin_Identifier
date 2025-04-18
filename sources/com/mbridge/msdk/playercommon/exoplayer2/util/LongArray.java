package com.mbridge.msdk.playercommon.exoplayer2.util;

import a4.j;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public final void add(long j3) {
        int i10 = this.size;
        long[] jArr = this.values;
        if (i10 == jArr.length) {
            this.values = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.values;
        int i11 = this.size;
        this.size = i11 + 1;
        jArr2[i11] = j3;
    }

    public final long get(int i10) {
        if (i10 >= 0 && i10 < this.size) {
            return this.values[i10];
        }
        StringBuilder m10 = j.m("Invalid index ", i10, ", size is ");
        m10.append(this.size);
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public final int size() {
        return this.size;
    }

    public final long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray(int i10) {
        this.values = new long[i10];
    }
}
