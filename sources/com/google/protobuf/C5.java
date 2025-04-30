package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class C5 {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE;
    private static final long BUFFER_ADDRESS_OFFSET;
    private static final int BYTE_ARRAY_ALIGNMENT;
    static final long BYTE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_INDEX_SCALE;
    private static final long FLOAT_ARRAY_BASE_OFFSET;
    private static final long FLOAT_ARRAY_INDEX_SCALE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    static final boolean IS_BIG_ENDIAN;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final long OBJECT_ARRAY_BASE_OFFSET;
    private static final long OBJECT_ARRAY_INDEX_SCALE;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = getUnsafe();
    private static final Class<?> MEMORY_CLASS = C1901f.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final B5 MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    static {
        boolean z8;
        long arrayBaseOffset = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (arrayBaseOffset & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z8 = true;
        } else {
            z8 = false;
        }
        IS_BIG_ENDIAN = z8;
    }

    private C5() {
    }

    public static long addressOffset(ByteBuffer byteBuffer) {
        return MEMORY_ACCESSOR.getLong(byteBuffer, BUFFER_ADDRESS_OFFSET);
    }

    public static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) UNSAFE.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    private static int arrayBaseOffset(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field bufferAddressField() {
        java.lang.reflect.Field field;
        if (C1901f.isOnAndroidDevice() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        java.lang.reflect.Field field2 = field(Buffer.class, "address");
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void copyMemory(byte[] bArr, long j7, long j9, long j10) {
        MEMORY_ACCESSOR.copyMemory(bArr, j7, j9, j10);
    }

    public static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
        if (!C1901f.isOnAndroidDevice()) {
            return false;
        }
        try {
            Class<?> cls2 = MEMORY_CLASS;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static java.lang.reflect.Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(java.lang.reflect.Field field) {
        B5 b52;
        if (field != null && (b52 = MEMORY_ACCESSOR) != null) {
            return b52.objectFieldOffset(field);
        }
        return -1L;
    }

    private static int firstDifferingByteIndexNativeEndian(long j7, long j9) {
        int numberOfTrailingZeros;
        if (IS_BIG_ENDIAN) {
            numberOfTrailingZeros = Long.numberOfLeadingZeros(j7 ^ j9);
        } else {
            numberOfTrailingZeros = Long.numberOfTrailingZeros(j7 ^ j9);
        }
        return numberOfTrailingZeros >> 3;
    }

    public static boolean getBoolean(Object obj, long j7) {
        return MEMORY_ACCESSOR.getBoolean(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object obj, long j7) {
        if (getByteBigEndian(obj, j7) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object obj, long j7) {
        if (getByteLittleEndian(obj, j7) != 0) {
            return true;
        }
        return false;
    }

    public static byte getByte(Object obj, long j7) {
        return MEMORY_ACCESSOR.getByte(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object obj, long j7) {
        return (byte) ((getInt(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object obj, long j7) {
        return (byte) ((getInt(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    public static double getDouble(Object obj, long j7) {
        return MEMORY_ACCESSOR.getDouble(obj, j7);
    }

    public static float getFloat(Object obj, long j7) {
        return MEMORY_ACCESSOR.getFloat(obj, j7);
    }

    public static int getInt(Object obj, long j7) {
        return MEMORY_ACCESSOR.getInt(obj, j7);
    }

    public static long getLong(Object obj, long j7) {
        return MEMORY_ACCESSOR.getLong(obj, j7);
    }

    private static B5 getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (C1901f.isOnAndroidDevice()) {
            if (IS_ANDROID_64) {
                return new C2046z5(unsafe);
            }
            if (!IS_ANDROID_32) {
                return null;
            }
            return new C2039y5(unsafe);
        }
        return new A5(unsafe);
    }

    public static Object getObject(Object obj, long j7) {
        return MEMORY_ACCESSOR.getObject(obj, j7);
    }

    public static Object getStaticObject(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    public static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2032x5());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    public static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    public static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable th) {
        Logger.getLogger(C5.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static int mismatch(byte[] bArr, int i9, byte[] bArr2, int i10, int i11) {
        if (i9 >= 0 && i10 >= 0 && i11 >= 0 && i9 + i11 <= bArr.length && i10 + i11 <= bArr2.length) {
            int i12 = 0;
            if (HAS_UNSAFE_ARRAY_OPERATIONS) {
                for (int i13 = (BYTE_ARRAY_ALIGNMENT + i9) & 7; i12 < i11 && (i13 & 7) != 0; i13++) {
                    if (bArr[i9 + i12] != bArr2[i10 + i12]) {
                        return i12;
                    }
                    i12++;
                }
                int i14 = ((i11 - i12) & (-8)) + i12;
                while (i12 < i14) {
                    long j7 = BYTE_ARRAY_BASE_OFFSET;
                    long j9 = i12;
                    long j10 = getLong((Object) bArr, i9 + j7 + j9);
                    long j11 = getLong((Object) bArr2, j7 + i10 + j9);
                    if (j10 != j11) {
                        return i12 + firstDifferingByteIndexNativeEndian(j10, j11);
                    }
                    i12 += 8;
                }
            }
            while (i12 < i11) {
                if (bArr[i9 + i12] != bArr2[i10 + i12]) {
                    return i12;
                }
                i12++;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }

    public static long objectFieldOffset(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    public static void putBoolean(Object obj, long j7, boolean z8) {
        MEMORY_ACCESSOR.putBoolean(obj, j7, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j7, boolean z8) {
        putByteBigEndian(obj, j7, z8 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j7, boolean z8) {
        putByteLittleEndian(obj, j7, z8 ? (byte) 1 : (byte) 0);
    }

    public static void putByte(Object obj, long j7, byte b) {
        MEMORY_ACCESSOR.putByte(obj, j7, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object obj, long j7, byte b) {
        long j9 = (-4) & j7;
        int i9 = getInt(obj, j9);
        int i10 = ((~((int) j7)) & 3) << 3;
        putInt(obj, j9, ((255 & b) << i10) | (i9 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object obj, long j7, byte b) {
        long j9 = (-4) & j7;
        int i9 = (((int) j7) & 3) << 3;
        putInt(obj, j9, ((255 & b) << i9) | (getInt(obj, j9) & (~(255 << i9))));
    }

    public static void putDouble(Object obj, long j7, double d2) {
        MEMORY_ACCESSOR.putDouble(obj, j7, d2);
    }

    public static void putFloat(Object obj, long j7, float f9) {
        MEMORY_ACCESSOR.putFloat(obj, j7, f9);
    }

    public static void putInt(Object obj, long j7, int i9) {
        MEMORY_ACCESSOR.putInt(obj, j7, i9);
    }

    public static void putLong(Object obj, long j7, long j9) {
        MEMORY_ACCESSOR.putLong(obj, j7, j9);
    }

    public static void putObject(Object obj, long j7, Object obj2) {
        MEMORY_ACCESSOR.putObject(obj, j7, obj2);
    }

    private static boolean supportsUnsafeArrayOperations() {
        B5 b52 = MEMORY_ACCESSOR;
        if (b52 == null) {
            return false;
        }
        return b52.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        B5 b52 = MEMORY_ACCESSOR;
        if (b52 == null) {
            return false;
        }
        return b52.supportsUnsafeByteBufferOperations();
    }

    public static void copyMemory(long j7, byte[] bArr, long j9, long j10) {
        MEMORY_ACCESSOR.copyMemory(j7, bArr, j9, j10);
    }

    public static boolean getBoolean(boolean[] zArr, long j7) {
        return MEMORY_ACCESSOR.getBoolean(zArr, (j7 * BOOLEAN_ARRAY_INDEX_SCALE) + BOOLEAN_ARRAY_BASE_OFFSET);
    }

    public static byte getByte(byte[] bArr, long j7) {
        return MEMORY_ACCESSOR.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + j7);
    }

    public static double getDouble(double[] dArr, long j7) {
        return MEMORY_ACCESSOR.getDouble(dArr, (j7 * DOUBLE_ARRAY_INDEX_SCALE) + DOUBLE_ARRAY_BASE_OFFSET);
    }

    public static float getFloat(float[] fArr, long j7) {
        return MEMORY_ACCESSOR.getFloat(fArr, (j7 * FLOAT_ARRAY_INDEX_SCALE) + FLOAT_ARRAY_BASE_OFFSET);
    }

    public static int getInt(int[] iArr, long j7) {
        return MEMORY_ACCESSOR.getInt(iArr, (j7 * INT_ARRAY_INDEX_SCALE) + INT_ARRAY_BASE_OFFSET);
    }

    public static long getLong(long[] jArr, long j7) {
        return MEMORY_ACCESSOR.getLong(jArr, (j7 * LONG_ARRAY_INDEX_SCALE) + LONG_ARRAY_BASE_OFFSET);
    }

    public static Object getObject(Object[] objArr, long j7) {
        return MEMORY_ACCESSOR.getObject(objArr, (j7 * OBJECT_ARRAY_INDEX_SCALE) + OBJECT_ARRAY_BASE_OFFSET);
    }

    public static void putBoolean(boolean[] zArr, long j7, boolean z8) {
        MEMORY_ACCESSOR.putBoolean(zArr, (j7 * BOOLEAN_ARRAY_INDEX_SCALE) + BOOLEAN_ARRAY_BASE_OFFSET, z8);
    }

    public static void putByte(byte[] bArr, long j7, byte b) {
        MEMORY_ACCESSOR.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + j7, b);
    }

    public static void putDouble(double[] dArr, long j7, double d2) {
        MEMORY_ACCESSOR.putDouble(dArr, (j7 * DOUBLE_ARRAY_INDEX_SCALE) + DOUBLE_ARRAY_BASE_OFFSET, d2);
    }

    public static void putFloat(float[] fArr, long j7, float f9) {
        MEMORY_ACCESSOR.putFloat(fArr, (j7 * FLOAT_ARRAY_INDEX_SCALE) + FLOAT_ARRAY_BASE_OFFSET, f9);
    }

    public static void putInt(int[] iArr, long j7, int i9) {
        MEMORY_ACCESSOR.putInt(iArr, (j7 * INT_ARRAY_INDEX_SCALE) + INT_ARRAY_BASE_OFFSET, i9);
    }

    public static void putLong(long[] jArr, long j7, long j9) {
        MEMORY_ACCESSOR.putLong(jArr, (j7 * LONG_ARRAY_INDEX_SCALE) + LONG_ARRAY_BASE_OFFSET, j9);
    }

    public static void putObject(Object[] objArr, long j7, Object obj) {
        MEMORY_ACCESSOR.putObject(objArr, (j7 * OBJECT_ARRAY_INDEX_SCALE) + OBJECT_ARRAY_BASE_OFFSET, obj);
    }

    public static void copyMemory(byte[] bArr, long j7, byte[] bArr2, long j9, long j10) {
        System.arraycopy(bArr, (int) j7, bArr2, (int) j9, (int) j10);
    }

    public static byte getByte(long j7) {
        return MEMORY_ACCESSOR.getByte(j7);
    }

    public static int getInt(long j7) {
        return MEMORY_ACCESSOR.getInt(j7);
    }

    public static long getLong(long j7) {
        return MEMORY_ACCESSOR.getLong(j7);
    }

    public static void putByte(long j7, byte b) {
        MEMORY_ACCESSOR.putByte(j7, b);
    }

    public static void putInt(long j7, int i9) {
        MEMORY_ACCESSOR.putInt(j7, i9);
    }

    public static void putLong(long j7, long j9) {
        MEMORY_ACCESSOR.putLong(j7, j9);
    }
}
