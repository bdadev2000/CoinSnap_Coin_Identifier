package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ug {
    public static List a(byte[] bArr) {
        long b2 = b(c(bArr));
        long b3 = b(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(a(b2));
        arrayList.add(a(b3));
        return arrayList;
    }

    public static int b(byte[] bArr) {
        return bArr[9] & UnsignedBytes.MAX_VALUE;
    }

    private static int c(byte[] bArr) {
        return (bArr[10] & UnsignedBytes.MAX_VALUE) | ((bArr[11] & UnsignedBytes.MAX_VALUE) << 8);
    }

    private static long b(long j2) {
        return (j2 * 1000000000) / 48000;
    }

    private static byte[] a(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }
}
