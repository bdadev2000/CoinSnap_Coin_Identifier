package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class d9 {
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
    private static final Class<?> MEMORY_CLASS = f.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final c9 MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    static {
        boolean z10;
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
            z10 = true;
        } else {
            z10 = false;
        }
        IS_BIG_ENDIAN = z10;
    }

    private d9() {
    }

    public static long addressOffset(ByteBuffer byteBuffer) {
        return MEMORY_ACCESSOR.getLong(byteBuffer, BUFFER_ADDRESS_OFFSET);
    }

    public static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) UNSAFE.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
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
        if (f.isOnAndroidDevice() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        java.lang.reflect.Field field2 = field(Buffer.class, "address");
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void copyMemory(byte[] bArr, long j3, long j10, long j11) {
        MEMORY_ACCESSOR.copyMemory(bArr, j3, j10, j11);
    }

    public static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
        if (!f.isOnAndroidDevice()) {
            return false;
        }
        try {
            Class<?> cls2 = MEMORY_CLASS;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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
        c9 c9Var;
        if (field == null || (c9Var = MEMORY_ACCESSOR) == null) {
            return -1L;
        }
        return c9Var.objectFieldOffset(field);
    }

    private static int firstDifferingByteIndexNativeEndian(long j3, long j10) {
        int numberOfTrailingZeros;
        if (IS_BIG_ENDIAN) {
            numberOfTrailingZeros = Long.numberOfLeadingZeros(j3 ^ j10);
        } else {
            numberOfTrailingZeros = Long.numberOfTrailingZeros(j3 ^ j10);
        }
        return numberOfTrailingZeros >> 3;
    }

    public static boolean getBoolean(Object obj, long j3) {
        return MEMORY_ACCESSOR.getBoolean(obj, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object obj, long j3) {
        return getByteBigEndian(obj, j3) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object obj, long j3) {
        return getByteLittleEndian(obj, j3) != 0;
    }

    public static byte getByte(Object obj, long j3) {
        return MEMORY_ACCESSOR.getByte(obj, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object obj, long j3) {
        return (byte) ((getInt(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object obj, long j3) {
        return (byte) ((getInt(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255);
    }

    public static double getDouble(Object obj, long j3) {
        return MEMORY_ACCESSOR.getDouble(obj, j3);
    }

    public static float getFloat(Object obj, long j3) {
        return MEMORY_ACCESSOR.getFloat(obj, j3);
    }

    public static int getInt(Object obj, long j3) {
        return MEMORY_ACCESSOR.getInt(obj, j3);
    }

    public static long getLong(Object obj, long j3) {
        return MEMORY_ACCESSOR.getLong(obj, j3);
    }

    private static c9 getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (f.isOnAndroidDevice()) {
            if (IS_ANDROID_64) {
                return new a9(unsafe);
            }
            if (!IS_ANDROID_32) {
                return null;
            }
            return new z8(unsafe);
        }
        return new b9(unsafe);
    }

    public static Object getObject(Object obj, long j3) {
        return MEMORY_ACCESSOR.getObject(obj, j3);
    }

    public static Object getStaticObject(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    public static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new y8());
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
    public static void logMissingMethod(Throwable th2) {
        Logger.getLogger(d9.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static int mismatch(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (i10 >= 0 && i11 >= 0 && i12 >= 0 && i10 + i12 <= bArr.length && i11 + i12 <= bArr2.length) {
            int i13 = 0;
            if (HAS_UNSAFE_ARRAY_OPERATIONS) {
                for (int i14 = (BYTE_ARRAY_ALIGNMENT + i10) & 7; i13 < i12 && (i14 & 7) != 0; i14++) {
                    if (bArr[i10 + i13] != bArr2[i11 + i13]) {
                        return i13;
                    }
                    i13++;
                }
                int i15 = ((i12 - i13) & (-8)) + i13;
                while (i13 < i15) {
                    long j3 = BYTE_ARRAY_BASE_OFFSET;
                    long j10 = i13;
                    long j11 = getLong((Object) bArr, i10 + j3 + j10);
                    long j12 = getLong((Object) bArr2, j3 + i11 + j10);
                    if (j11 != j12) {
                        return i13 + firstDifferingByteIndexNativeEndian(j11, j12);
                    }
                    i13 += 8;
                }
            }
            while (i13 < i12) {
                if (bArr[i10 + i13] != bArr2[i11 + i13]) {
                    return i13;
                }
                i13++;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }

    public static long objectFieldOffset(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    public static void putBoolean(Object obj, long j3, boolean z10) {
        MEMORY_ACCESSOR.putBoolean(obj, j3, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j3, boolean z10) {
        putByteBigEndian(obj, j3, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j3, boolean z10) {
        putByteLittleEndian(obj, j3, z10 ? (byte) 1 : (byte) 0);
    }

    public static void putByte(Object obj, long j3, byte b3) {
        MEMORY_ACCESSOR.putByte(obj, j3, b3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object obj, long j3, byte b3) {
        long j10 = (-4) & j3;
        int i10 = getInt(obj, j10);
        int i11 = ((~((int) j3)) & 3) << 3;
        putInt(obj, j10, ((255 & b3) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object obj, long j3, byte b3) {
        long j10 = (-4) & j3;
        int i10 = (((int) j3) & 3) << 3;
        putInt(obj, j10, ((255 & b3) << i10) | (getInt(obj, j10) & (~(255 << i10))));
    }

    public static void putDouble(Object obj, long j3, double d10) {
        MEMORY_ACCESSOR.putDouble(obj, j3, d10);
    }

    public static void putFloat(Object obj, long j3, float f10) {
        MEMORY_ACCESSOR.putFloat(obj, j3, f10);
    }

    public static void putInt(Object obj, long j3, int i10) {
        MEMORY_ACCESSOR.putInt(obj, j3, i10);
    }

    public static void putLong(Object obj, long j3, long j10) {
        MEMORY_ACCESSOR.putLong(obj, j3, j10);
    }

    public static void putObject(Object obj, long j3, Object obj2) {
        MEMORY_ACCESSOR.putObject(obj, j3, obj2);
    }

    private static boolean supportsUnsafeArrayOperations() {
        c9 c9Var = MEMORY_ACCESSOR;
        if (c9Var == null) {
            return false;
        }
        return c9Var.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        c9 c9Var = MEMORY_ACCESSOR;
        if (c9Var == null) {
            return false;
        }
        return c9Var.supportsUnsafeByteBufferOperations();
    }

    public static void copyMemory(long j3, byte[] bArr, long j10, long j11) {
        MEMORY_ACCESSOR.copyMemory(j3, bArr, j10, j11);
    }

    public static boolean getBoolean(boolean[] zArr, long j3) {
        return MEMORY_ACCESSOR.getBoolean(zArr, (j3 * BOOLEAN_ARRAY_INDEX_SCALE) + BOOLEAN_ARRAY_BASE_OFFSET);
    }

    public static byte getByte(byte[] bArr, long j3) {
        return MEMORY_ACCESSOR.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + j3);
    }

    public static double getDouble(double[] dArr, long j3) {
        return MEMORY_ACCESSOR.getDouble(dArr, (j3 * DOUBLE_ARRAY_INDEX_SCALE) + DOUBLE_ARRAY_BASE_OFFSET);
    }

    public static float getFloat(float[] fArr, long j3) {
        return MEMORY_ACCESSOR.getFloat(fArr, (j3 * FLOAT_ARRAY_INDEX_SCALE) + FLOAT_ARRAY_BASE_OFFSET);
    }

    public static int getInt(int[] iArr, long j3) {
        return MEMORY_ACCESSOR.getInt(iArr, (j3 * INT_ARRAY_INDEX_SCALE) + INT_ARRAY_BASE_OFFSET);
    }

    public static long getLong(long[] jArr, long j3) {
        return MEMORY_ACCESSOR.getLong(jArr, (j3 * LONG_ARRAY_INDEX_SCALE) + LONG_ARRAY_BASE_OFFSET);
    }

    public static Object getObject(Object[] objArr, long j3) {
        return MEMORY_ACCESSOR.getObject(objArr, (j3 * OBJECT_ARRAY_INDEX_SCALE) + OBJECT_ARRAY_BASE_OFFSET);
    }

    public static void putBoolean(boolean[] zArr, long j3, boolean z10) {
        MEMORY_ACCESSOR.putBoolean(zArr, (j3 * BOOLEAN_ARRAY_INDEX_SCALE) + BOOLEAN_ARRAY_BASE_OFFSET, z10);
    }

    public static void putByte(byte[] bArr, long j3, byte b3) {
        MEMORY_ACCESSOR.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + j3, b3);
    }

    public static void putDouble(double[] dArr, long j3, double d10) {
        MEMORY_ACCESSOR.putDouble(dArr, (j3 * DOUBLE_ARRAY_INDEX_SCALE) + DOUBLE_ARRAY_BASE_OFFSET, d10);
    }

    public static void putFloat(float[] fArr, long j3, float f10) {
        MEMORY_ACCESSOR.putFloat(fArr, (j3 * FLOAT_ARRAY_INDEX_SCALE) + FLOAT_ARRAY_BASE_OFFSET, f10);
    }

    public static void putInt(int[] iArr, long j3, int i10) {
        MEMORY_ACCESSOR.putInt(iArr, (j3 * INT_ARRAY_INDEX_SCALE) + INT_ARRAY_BASE_OFFSET, i10);
    }

    public static void putLong(long[] jArr, long j3, long j10) {
        MEMORY_ACCESSOR.putLong(jArr, (j3 * LONG_ARRAY_INDEX_SCALE) + LONG_ARRAY_BASE_OFFSET, j10);
    }

    public static void putObject(Object[] objArr, long j3, Object obj) {
        MEMORY_ACCESSOR.putObject(objArr, (j3 * OBJECT_ARRAY_INDEX_SCALE) + OBJECT_ARRAY_BASE_OFFSET, obj);
    }

    public static void copyMemory(byte[] bArr, long j3, byte[] bArr2, long j10, long j11) {
        System.arraycopy(bArr, (int) j3, bArr2, (int) j10, (int) j11);
    }

    public static byte getByte(long j3) {
        return MEMORY_ACCESSOR.getByte(j3);
    }

    public static int getInt(long j3) {
        return MEMORY_ACCESSOR.getInt(j3);
    }

    public static long getLong(long j3) {
        return MEMORY_ACCESSOR.getLong(j3);
    }

    public static void putByte(long j3, byte b3) {
        MEMORY_ACCESSOR.putByte(j3, b3);
    }

    public static void putInt(long j3, int i10) {
        MEMORY_ACCESSOR.putInt(j3, i10);
    }

    public static void putLong(long j3, long j10) {
        MEMORY_ACCESSOR.putLong(j3, j10);
    }
}
