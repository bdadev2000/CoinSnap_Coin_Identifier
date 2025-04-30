package com.applovin.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class rg {
    public static List a(byte[] bArr) {
        long b = b(c(bArr));
        long b8 = b(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(a(b));
        arrayList.add(a(b8));
        return arrayList;
    }

    public static int b(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static int c(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    private static long b(long j7) {
        return (j7 * com.mbridge.msdk.playercommon.exoplayer2.C.NANOS_PER_SECOND) / 48000;
    }

    private static byte[] a(long j7) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j7).array();
    }
}
