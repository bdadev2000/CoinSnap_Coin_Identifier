package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* renamed from: com.pgl.ssdk.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1270m {
    public static C1269l<ByteBuffer, Long> a(InterfaceC1271n interfaceC1271n) throws IOException {
        C1268k c1268k = (C1268k) interfaceC1271n;
        if (c1268k.a() < 22) {
            return null;
        }
        C1269l<ByteBuffer, Long> a = a(c1268k, 0);
        return a != null ? a : a(c1268k, 65535);
    }

    public static long b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
    }

    public static long c(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L;
    }

    public static int d(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getShort(byteBuffer.position() + 10) & UShort.MAX_VALUE;
    }

    private static C1269l<ByteBuffer, Long> a(InterfaceC1271n interfaceC1271n, int i10) throws IOException {
        int i11;
        if (i10 >= 0 && i10 <= 65535) {
            C1268k c1268k = (C1268k) interfaceC1271n;
            long a = c1268k.a();
            if (a < 22) {
                return null;
            }
            int min = ((int) Math.min(i10, a - 22)) + 22;
            long j3 = a - min;
            ByteBuffer a10 = c1268k.a(j3, min);
            a10.order(ByteOrder.LITTLE_ENDIAN);
            a(a10);
            int capacity = a10.capacity();
            if (capacity >= 22) {
                int i12 = capacity - 22;
                int min2 = Math.min(i12, 65535);
                for (int i13 = 0; i13 <= min2; i13++) {
                    i11 = i12 - i13;
                    if (a10.getInt(i11) == 101010256 && (a10.getShort(i11 + 20) & UShort.MAX_VALUE) == i13) {
                        break;
                    }
                }
            }
            i11 = -1;
            if (i11 == -1) {
                return null;
            }
            a10.position(i11);
            ByteBuffer slice = a10.slice();
            slice.order(ByteOrder.LITTLE_ENDIAN);
            return new C1269l<>(slice, Long.valueOf(j3 + i11));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i10)));
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
