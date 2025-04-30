package com.google.protobuf;

import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.z5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2046z5 extends B5 {
    public C2046z5(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.protobuf.B5
    public void copyMemory(long j7, byte[] bArr, long j9, long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.B5
    public boolean getBoolean(Object obj, long j7) {
        boolean booleanLittleEndian;
        boolean booleanBigEndian;
        if (C5.IS_BIG_ENDIAN) {
            booleanBigEndian = C5.getBooleanBigEndian(obj, j7);
            return booleanBigEndian;
        }
        booleanLittleEndian = C5.getBooleanLittleEndian(obj, j7);
        return booleanLittleEndian;
    }

    @Override // com.google.protobuf.B5
    public byte getByte(Object obj, long j7) {
        byte byteLittleEndian;
        byte byteBigEndian;
        if (C5.IS_BIG_ENDIAN) {
            byteBigEndian = C5.getByteBigEndian(obj, j7);
            return byteBigEndian;
        }
        byteLittleEndian = C5.getByteLittleEndian(obj, j7);
        return byteLittleEndian;
    }

    @Override // com.google.protobuf.B5
    public double getDouble(Object obj, long j7) {
        return Double.longBitsToDouble(getLong(obj, j7));
    }

    @Override // com.google.protobuf.B5
    public float getFloat(Object obj, long j7) {
        return Float.intBitsToFloat(getInt(obj, j7));
    }

    @Override // com.google.protobuf.B5
    public int getInt(long j7) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.B5
    public long getLong(long j7) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.B5
    public Object getStaticObject(java.lang.reflect.Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // com.google.protobuf.B5
    public void putBoolean(Object obj, long j7, boolean z8) {
        if (C5.IS_BIG_ENDIAN) {
            C5.putBooleanBigEndian(obj, j7, z8);
        } else {
            C5.putBooleanLittleEndian(obj, j7, z8);
        }
    }

    @Override // com.google.protobuf.B5
    public void putByte(Object obj, long j7, byte b) {
        if (C5.IS_BIG_ENDIAN) {
            C5.putByteBigEndian(obj, j7, b);
        } else {
            C5.putByteLittleEndian(obj, j7, b);
        }
    }

    @Override // com.google.protobuf.B5
    public void putDouble(Object obj, long j7, double d2) {
        putLong(obj, j7, Double.doubleToLongBits(d2));
    }

    @Override // com.google.protobuf.B5
    public void putFloat(Object obj, long j7, float f9) {
        putInt(obj, j7, Float.floatToIntBits(f9));
    }

    @Override // com.google.protobuf.B5
    public void putInt(long j7, int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.B5
    public void putLong(long j7, long j9) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.B5
    public boolean supportsUnsafeByteBufferOperations() {
        return false;
    }

    @Override // com.google.protobuf.B5
    public void copyMemory(byte[] bArr, long j7, long j9, long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.B5
    public byte getByte(long j7) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.B5
    public void putByte(long j7, byte b) {
        throw new UnsupportedOperationException();
    }
}
