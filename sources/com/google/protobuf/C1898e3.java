package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.protobuf.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1898e3 {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final S EMPTY_CODED_INPUT_STREAM;
    static final Charset US_ASCII = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);
    static final Charset UTF_8 = Charset.forName("UTF-8");
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = S.newInstance(bArr);
    }

    private C1898e3() {
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static H bytesDefaultValue(String str) {
        return H.copyFrom(str.getBytes(ISO_8859_1));
    }

    public static <T> T checkNotNull(T t9) {
        t9.getClass();
        return t9;
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!Arrays.equals(list.get(i9), list2.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return ((ByteBuffer) byteBuffer.duplicate().clear()).equals((ByteBuffer) byteBuffer2.duplicate().clear());
    }

    public static <T extends N3> T getDefaultInstance(Class<T> cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e4) {
            throw new RuntimeException("Failed to get default instance for " + cls, e4);
        }
    }

    public static int hashBoolean(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int i9 = 1;
        while (it.hasNext()) {
            i9 = (i9 * 31) + hashCode(it.next());
        }
        return i9;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int i9 = 1;
        while (it.hasNext()) {
            i9 = (i9 * 31) + hashCodeByteBuffer(it.next());
        }
        return i9;
    }

    public static int hashEnum(V2 v22) {
        return v22.getNumber();
    }

    public static int hashEnumList(List<? extends V2> list) {
        Iterator<? extends V2> it = list.iterator();
        int i9 = 1;
        while (it.hasNext()) {
            i9 = (i9 * 31) + hashEnum(it.next());
        }
        return i9;
    }

    public static int hashLong(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static boolean isValidUtf8(H h6) {
        return h6.isValidUtf8();
    }

    public static Object mergeMessage(Object obj, Object obj2) {
        return ((AbstractC1873b) ((N3) obj).toBuilder()).mergeFrom((N3) obj2).buildPartial();
    }

    public static int partialHash(int i9, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i9 = (i9 * 31) + bArr[i12];
        }
        return i9;
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static <T> T checkNotNull(T t9, String str) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(str);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return I5.isValidUtf8(bArr);
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!equalsByteBuffer(list.get(i9), list2.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(byte[] bArr) {
        return hashCode(bArr, 0, bArr.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int partialHash = partialHash(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (partialHash == 0) {
                return 1;
            }
            return partialHash;
        }
        int capacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[capacity];
        ByteBuffer duplicate = byteBuffer.duplicate();
        int capacity2 = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity ? duplicate.remaining() : capacity;
            duplicate.get(bArr, 0, remaining);
            capacity2 = partialHash(capacity2, bArr, 0, remaining);
        }
        if (capacity2 == 0) {
            return 1;
        }
        return capacity2;
    }

    public static int hashCode(byte[] bArr, int i9, int i10) {
        int partialHash = partialHash(i10, bArr, i9, i10);
        if (partialHash == 0) {
            return 1;
        }
        return partialHash;
    }
}
