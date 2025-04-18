package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.pgl.ssdk.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1264g {
    static {
        "0123456789abcdef".toCharArray();
    }

    public static C1265h a(InterfaceC1271n interfaceC1271n, C1273p c1273p, int i10) throws IOException, C1266i {
        try {
            C1261d a = AbstractC1260c.a(interfaceC1271n, c1273p);
            long b3 = a.b();
            C1268k c1268k = (C1268k) a.a();
            ByteBuffer a10 = c1268k.a(0L, (int) c1268k.a());
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            a10.order(byteOrder);
            if (a10.order() == byteOrder) {
                int capacity = a10.capacity() - 24;
                if (capacity >= 8) {
                    int capacity2 = a10.capacity();
                    if (capacity <= a10.capacity()) {
                        int limit = a10.limit();
                        int position = a10.position();
                        int i11 = 0;
                        try {
                            a10.position(0);
                            a10.limit(capacity);
                            a10.position(8);
                            ByteBuffer slice = a10.slice();
                            slice.order(a10.order());
                            while (slice.hasRemaining()) {
                                i11++;
                                if (slice.remaining() >= 8) {
                                    long j3 = slice.getLong();
                                    if (j3 >= 4 && j3 <= 2147483647L) {
                                        int i12 = (int) j3;
                                        int position2 = slice.position() + i12;
                                        if (i12 <= slice.remaining()) {
                                            if (slice.getInt() == i10) {
                                                return new C1265h(a(slice, i12 - 4), b3, c1273p.a(), c1273p.e(), c1273p.d());
                                            }
                                            slice.position(position2);
                                        } else {
                                            StringBuilder n10 = a4.j.n("APK Signing Block entry #", i11, " size out of range: ", i12, ", available: ");
                                            n10.append(slice.remaining());
                                            throw new C1266i(n10.toString());
                                        }
                                    } else {
                                        throw new C1266i("APK Signing Block entry #" + i11 + " size out of range: " + j3);
                                    }
                                } else {
                                    throw new C1266i("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i11)));
                                }
                            }
                            throw new C1266i("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i10)));
                        } finally {
                            a10.position(0);
                            a10.limit(limit);
                            a10.position(position);
                        }
                    }
                    throw new IllegalArgumentException(a4.j.e("end > capacity: ", capacity, " > ", capacity2));
                }
                throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("end < start: ", capacity, " < 8"));
            }
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        } catch (C1259b e2) {
            throw new C1266i(e2.getMessage(), e2);
        }
    }

    public static byte[] b(ByteBuffer byteBuffer) throws C1258a {
        int i10 = byteBuffer.getInt();
        if (i10 >= 0) {
            if (i10 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i10];
                byteBuffer.get(bArr);
                return bArr;
            }
            StringBuilder m10 = a4.j.m("Underflow while reading length-prefixed value. Length: ", i10, ", available: ");
            m10.append(byteBuffer.remaining());
            throw new C1258a(m10.toString());
        }
        throw new C1258a("Negative length");
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i10) {
        if (i10 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i11 = i10 + position;
            if (i11 >= position && i11 <= limit) {
                byteBuffer.limit(i11);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i11);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException("size: ".concat(String.valueOf(i10)));
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) throws C1258a {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 >= 0) {
                if (i10 <= byteBuffer.remaining()) {
                    return a(byteBuffer, i10);
                }
                StringBuilder m10 = a4.j.m("Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ");
                m10.append(byteBuffer.remaining());
                throw new C1258a(m10.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new C1258a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }
}
