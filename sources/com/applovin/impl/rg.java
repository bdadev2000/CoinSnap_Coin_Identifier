package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class rg {
    public static List a(byte[] bArr) {
        long b3 = b(c(bArr));
        long b10 = b(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(a(b3));
        arrayList.add(a(b10));
        return arrayList;
    }

    public static int b(byte[] bArr) {
        return bArr[9] & UByte.MAX_VALUE;
    }

    private static int c(byte[] bArr) {
        return (bArr[10] & UByte.MAX_VALUE) | ((bArr[11] & UByte.MAX_VALUE) << 8);
    }

    private static long b(long j3) {
        return (j3 * C.NANOS_PER_SECOND) / 48000;
    }

    private static byte[] a(long j3) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j3).array();
    }
}
