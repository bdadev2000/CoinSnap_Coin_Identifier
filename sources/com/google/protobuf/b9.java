package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class b9 extends c9 {
    public b9(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.protobuf.c9
    public void copyMemory(long j3, byte[] bArr, long j10, long j11) {
        this.unsafe.copyMemory((Object) null, j3, bArr, d9.BYTE_ARRAY_BASE_OFFSET + j10, j11);
    }

    @Override // com.google.protobuf.c9
    public boolean getBoolean(Object obj, long j3) {
        return this.unsafe.getBoolean(obj, j3);
    }

    @Override // com.google.protobuf.c9
    public byte getByte(Object obj, long j3) {
        return this.unsafe.getByte(obj, j3);
    }

    @Override // com.google.protobuf.c9
    public double getDouble(Object obj, long j3) {
        return this.unsafe.getDouble(obj, j3);
    }

    @Override // com.google.protobuf.c9
    public float getFloat(Object obj, long j3) {
        return this.unsafe.getFloat(obj, j3);
    }

    @Override // com.google.protobuf.c9
    public int getInt(long j3) {
        return this.unsafe.getInt(j3);
    }

    @Override // com.google.protobuf.c9
    public long getLong(long j3) {
        return this.unsafe.getLong(j3);
    }

    @Override // com.google.protobuf.c9
    public Object getStaticObject(java.lang.reflect.Field field) {
        return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
    }

    @Override // com.google.protobuf.c9
    public void putBoolean(Object obj, long j3, boolean z10) {
        this.unsafe.putBoolean(obj, j3, z10);
    }

    @Override // com.google.protobuf.c9
    public void putByte(Object obj, long j3, byte b3) {
        this.unsafe.putByte(obj, j3, b3);
    }

    @Override // com.google.protobuf.c9
    public void putDouble(Object obj, long j3, double d10) {
        this.unsafe.putDouble(obj, j3, d10);
    }

    @Override // com.google.protobuf.c9
    public void putFloat(Object obj, long j3, float f10) {
        this.unsafe.putFloat(obj, j3, f10);
    }

    @Override // com.google.protobuf.c9
    public void putInt(long j3, int i10) {
        this.unsafe.putInt(j3, i10);
    }

    @Override // com.google.protobuf.c9
    public void putLong(long j3, long j10) {
        this.unsafe.putLong(j3, j10);
    }

    @Override // com.google.protobuf.c9
    public boolean supportsUnsafeArrayOperations() {
        if (!super.supportsUnsafeArrayOperations()) {
            return false;
        }
        try {
            Class<?> cls = this.unsafe.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            d9.logMissingMethod(th2);
            return false;
        }
    }

    @Override // com.google.protobuf.c9
    public boolean supportsUnsafeByteBufferOperations() {
        if (!super.supportsUnsafeByteBufferOperations()) {
            return false;
        }
        try {
            Class<?> cls = this.unsafe.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th2) {
            d9.logMissingMethod(th2);
            return false;
        }
    }

    @Override // com.google.protobuf.c9
    public void copyMemory(byte[] bArr, long j3, long j10, long j11) {
        this.unsafe.copyMemory(bArr, d9.BYTE_ARRAY_BASE_OFFSET + j3, (Object) null, j10, j11);
    }

    @Override // com.google.protobuf.c9
    public byte getByte(long j3) {
        return this.unsafe.getByte(j3);
    }

    @Override // com.google.protobuf.c9
    public void putByte(long j3, byte b3) {
        this.unsafe.putByte(j3, b3);
    }
}
