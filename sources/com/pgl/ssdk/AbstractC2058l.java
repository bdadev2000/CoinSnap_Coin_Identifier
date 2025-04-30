package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.pgl.ssdk.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2058l {
    public static C2057k<ByteBuffer, Long> a(InterfaceC2059m interfaceC2059m) throws IOException {
        C2056j c2056j = (C2056j) interfaceC2059m;
        if (c2056j.a() < 22) {
            return null;
        }
        C2057k<ByteBuffer, Long> a6 = a(c2056j, 0);
        return a6 != null ? a6 : a(c2056j, 65535);
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
        return byteBuffer.getShort(byteBuffer.position() + 10) & 65535;
    }

    private static C2057k<ByteBuffer, Long> a(InterfaceC2059m interfaceC2059m, int i9) throws IOException {
        int i10;
        if (i9 >= 0 && i9 <= 65535) {
            C2056j c2056j = (C2056j) interfaceC2059m;
            long a6 = c2056j.a();
            if (a6 < 22) {
                return null;
            }
            int min = ((int) Math.min(i9, a6 - 22)) + 22;
            long j7 = a6 - min;
            ByteBuffer a9 = c2056j.a(j7, min);
            a9.order(ByteOrder.LITTLE_ENDIAN);
            a(a9);
            int capacity = a9.capacity();
            if (capacity >= 22) {
                int i11 = capacity - 22;
                int min2 = Math.min(i11, 65535);
                for (int i12 = 0; i12 <= min2; i12++) {
                    i10 = i11 - i12;
                    if (a9.getInt(i10) == 101010256 && (a9.getShort(i10 + 20) & 65535) == i12) {
                        break;
                    }
                }
            }
            i10 = -1;
            if (i10 == -1) {
                return null;
            }
            a9.position(i10);
            ByteBuffer slice = a9.slice();
            slice.order(ByteOrder.LITTLE_ENDIAN);
            return new C2057k<>(slice, Long.valueOf(j7 + i10));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i9)));
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
