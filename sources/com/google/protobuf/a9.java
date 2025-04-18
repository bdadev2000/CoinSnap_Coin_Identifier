package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class a9 extends c9 {
    public a9(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.protobuf.c9
    public void copyMemory(long j3, byte[] bArr, long j10, long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.c9
    public boolean getBoolean(Object obj, long j3) {
        boolean booleanLittleEndian;
        boolean booleanBigEndian;
        if (d9.IS_BIG_ENDIAN) {
            booleanBigEndian = d9.getBooleanBigEndian(obj, j3);
            return booleanBigEndian;
        }
        booleanLittleEndian = d9.getBooleanLittleEndian(obj, j3);
        return booleanLittleEndian;
    }

    @Override // com.google.protobuf.c9
    public byte getByte(Object obj, long j3) {
        byte byteLittleEndian;
        byte byteBigEndian;
        if (d9.IS_BIG_ENDIAN) {
            byteBigEndian = d9.getByteBigEndian(obj, j3);
            return byteBigEndian;
        }
        byteLittleEndian = d9.getByteLittleEndian(obj, j3);
        return byteLittleEndian;
    }

    @Override // com.google.protobuf.c9
    public double getDouble(Object obj, long j3) {
        return Double.longBitsToDouble(getLong(obj, j3));
    }

    @Override // com.google.protobuf.c9
    public float getFloat(Object obj, long j3) {
        return Float.intBitsToFloat(getInt(obj, j3));
    }

    @Override // com.google.protobuf.c9
    public int getInt(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.c9
    public long getLong(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.c9
    public Object getStaticObject(java.lang.reflect.Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // com.google.protobuf.c9
    public void putBoolean(Object obj, long j3, boolean z10) {
        if (d9.IS_BIG_ENDIAN) {
            d9.putBooleanBigEndian(obj, j3, z10);
        } else {
            d9.putBooleanLittleEndian(obj, j3, z10);
        }
    }

    @Override // com.google.protobuf.c9
    public void putByte(Object obj, long j3, byte b3) {
        if (d9.IS_BIG_ENDIAN) {
            d9.putByteBigEndian(obj, j3, b3);
        } else {
            d9.putByteLittleEndian(obj, j3, b3);
        }
    }

    @Override // com.google.protobuf.c9
    public void putDouble(Object obj, long j3, double d10) {
        putLong(obj, j3, Double.doubleToLongBits(d10));
    }

    @Override // com.google.protobuf.c9
    public void putFloat(Object obj, long j3, float f10) {
        putInt(obj, j3, Float.floatToIntBits(f10));
    }

    @Override // com.google.protobuf.c9
    public void putInt(long j3, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.c9
    public void putLong(long j3, long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.c9
    public boolean supportsUnsafeByteBufferOperations() {
        return false;
    }

    @Override // com.google.protobuf.c9
    public void copyMemory(byte[] bArr, long j3, long j10, long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.c9
    public byte getByte(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.c9
    public void putByte(long j3, byte b3) {
        throw new UnsupportedOperationException();
    }
}
