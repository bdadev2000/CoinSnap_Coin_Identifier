package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class A5 extends B5 {
    public A5(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.protobuf.B5
    public void copyMemory(long j7, byte[] bArr, long j9, long j10) {
        this.unsafe.copyMemory((Object) null, j7, bArr, C5.BYTE_ARRAY_BASE_OFFSET + j9, j10);
    }

    @Override // com.google.protobuf.B5
    public boolean getBoolean(Object obj, long j7) {
        return this.unsafe.getBoolean(obj, j7);
    }

    @Override // com.google.protobuf.B5
    public byte getByte(Object obj, long j7) {
        return this.unsafe.getByte(obj, j7);
    }

    @Override // com.google.protobuf.B5
    public double getDouble(Object obj, long j7) {
        return this.unsafe.getDouble(obj, j7);
    }

    @Override // com.google.protobuf.B5
    public float getFloat(Object obj, long j7) {
        return this.unsafe.getFloat(obj, j7);
    }

    @Override // com.google.protobuf.B5
    public int getInt(long j7) {
        return this.unsafe.getInt(j7);
    }

    @Override // com.google.protobuf.B5
    public long getLong(long j7) {
        return this.unsafe.getLong(j7);
    }

    @Override // com.google.protobuf.B5
    public Object getStaticObject(java.lang.reflect.Field field) {
        return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
    }

    @Override // com.google.protobuf.B5
    public void putBoolean(Object obj, long j7, boolean z8) {
        this.unsafe.putBoolean(obj, j7, z8);
    }

    @Override // com.google.protobuf.B5
    public void putByte(Object obj, long j7, byte b) {
        this.unsafe.putByte(obj, j7, b);
    }

    @Override // com.google.protobuf.B5
    public void putDouble(Object obj, long j7, double d2) {
        this.unsafe.putDouble(obj, j7, d2);
    }

    @Override // com.google.protobuf.B5
    public void putFloat(Object obj, long j7, float f9) {
        this.unsafe.putFloat(obj, j7, f9);
    }

    @Override // com.google.protobuf.B5
    public void putInt(long j7, int i9) {
        this.unsafe.putInt(j7, i9);
    }

    @Override // com.google.protobuf.B5
    public void putLong(long j7, long j9) {
        this.unsafe.putLong(j7, j9);
    }

    @Override // com.google.protobuf.B5
    public boolean supportsUnsafeArrayOperations() {
        if (!super.supportsUnsafeArrayOperations()) {
            return false;
        }
        try {
            Class<?> cls = this.unsafe.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            C5.logMissingMethod(th);
            return false;
        }
    }

    @Override // com.google.protobuf.B5
    public boolean supportsUnsafeByteBufferOperations() {
        if (!super.supportsUnsafeByteBufferOperations()) {
            return false;
        }
        try {
            Class<?> cls = this.unsafe.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            C5.logMissingMethod(th);
            return false;
        }
    }

    @Override // com.google.protobuf.B5
    public void copyMemory(byte[] bArr, long j7, long j9, long j10) {
        this.unsafe.copyMemory(bArr, C5.BYTE_ARRAY_BASE_OFFSET + j7, (Object) null, j9, j10);
    }

    @Override // com.google.protobuf.B5
    public byte getByte(long j7) {
        return this.unsafe.getByte(j7);
    }

    @Override // com.google.protobuf.B5
    public void putByte(long j7, byte b) {
        this.unsafe.putByte(j7, b);
    }
}
