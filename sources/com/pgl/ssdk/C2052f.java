package com.pgl.ssdk;

import Q7.n0;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.pgl.ssdk.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2052f {
    static {
        "0123456789abcdef".toCharArray();
    }

    public static C2053g a(InterfaceC2059m interfaceC2059m, C2061o c2061o, int i9) throws IOException, C2054h {
        try {
            C2050d a6 = AbstractC2049c.a(interfaceC2059m, c2061o);
            long b = a6.b();
            C2056j c2056j = (C2056j) a6.a();
            ByteBuffer a9 = c2056j.a(0L, (int) c2056j.a());
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            a9.order(byteOrder);
            if (a9.order() == byteOrder) {
                int capacity = a9.capacity() - 24;
                if (capacity >= 8) {
                    int capacity2 = a9.capacity();
                    if (capacity <= a9.capacity()) {
                        int limit = a9.limit();
                        int position = a9.position();
                        int i10 = 0;
                        try {
                            a9.position(0);
                            a9.limit(capacity);
                            a9.position(8);
                            ByteBuffer slice = a9.slice();
                            slice.order(a9.order());
                            while (slice.hasRemaining()) {
                                i10++;
                                if (slice.remaining() >= 8) {
                                    long j7 = slice.getLong();
                                    if (j7 >= 4 && j7 <= 2147483647L) {
                                        int i11 = (int) j7;
                                        int position2 = slice.position() + i11;
                                        if (i11 <= slice.remaining()) {
                                            if (slice.getInt() == i9) {
                                                return new C2053g(a(slice, i11 - 4), b, c2061o.a(), c2061o.e(), c2061o.d());
                                            }
                                            slice.position(position2);
                                        } else {
                                            StringBuilder o3 = n0.o(i10, i11, "APK Signing Block entry #", " size out of range: ", ", available: ");
                                            o3.append(slice.remaining());
                                            throw new C2054h(o3.toString());
                                        }
                                    } else {
                                        throw new C2054h("APK Signing Block entry #" + i10 + " size out of range: " + j7);
                                    }
                                } else {
                                    throw new C2054h("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i10)));
                                }
                            }
                            throw new C2054h("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i9)));
                        } finally {
                            a9.position(0);
                            a9.limit(limit);
                            a9.position(position);
                        }
                    }
                    throw new IllegalArgumentException(n0.e(capacity, capacity2, "end > capacity: ", " > "));
                }
                throw new IllegalArgumentException(n0.f(capacity, "end < start: ", " < 8"));
            }
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        } catch (C2048b e4) {
            throw new C2054h(e4.getMessage(), e4);
        }
    }

    public static byte[] b(ByteBuffer byteBuffer) throws C2047a {
        int i9 = byteBuffer.getInt();
        if (i9 >= 0) {
            if (i9 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i9];
                byteBuffer.get(bArr);
                return bArr;
            }
            StringBuilder p2 = n0.p(i9, "Underflow while reading length-prefixed value. Length: ", ", available: ");
            p2.append(byteBuffer.remaining());
            throw new C2047a(p2.toString());
        }
        throw new C2047a("Negative length");
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i9) {
        if (i9 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i10 = i9 + position;
            if (i10 >= position && i10 <= limit) {
                byteBuffer.limit(i10);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i10);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException("size: ".concat(String.valueOf(i9)));
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) throws C2047a {
        if (byteBuffer.remaining() >= 4) {
            int i9 = byteBuffer.getInt();
            if (i9 >= 0) {
                if (i9 <= byteBuffer.remaining()) {
                    return a(byteBuffer, i9);
                }
                StringBuilder p2 = n0.p(i9, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
                p2.append(byteBuffer.remaining());
                throw new C2047a(p2.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new C2047a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }
}
