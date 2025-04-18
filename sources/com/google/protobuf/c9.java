package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class c9 {
    Unsafe unsafe;

    public c9(Unsafe unsafe) {
        this.unsafe = unsafe;
    }

    public final int arrayBaseOffset(Class<?> cls) {
        return this.unsafe.arrayBaseOffset(cls);
    }

    public final int arrayIndexScale(Class<?> cls) {
        return this.unsafe.arrayIndexScale(cls);
    }

    public abstract void copyMemory(long j3, byte[] bArr, long j10, long j11);

    public abstract void copyMemory(byte[] bArr, long j3, long j10, long j11);

    public abstract boolean getBoolean(Object obj, long j3);

    public abstract byte getByte(long j3);

    public abstract byte getByte(Object obj, long j3);

    public abstract double getDouble(Object obj, long j3);

    public abstract float getFloat(Object obj, long j3);

    public abstract int getInt(long j3);

    public final int getInt(Object obj, long j3) {
        return this.unsafe.getInt(obj, j3);
    }

    public abstract long getLong(long j3);

    public final long getLong(Object obj, long j3) {
        return this.unsafe.getLong(obj, j3);
    }

    public final Object getObject(Object obj, long j3) {
        return this.unsafe.getObject(obj, j3);
    }

    public abstract Object getStaticObject(java.lang.reflect.Field field);

    public final long objectFieldOffset(java.lang.reflect.Field field) {
        return this.unsafe.objectFieldOffset(field);
    }

    public abstract void putBoolean(Object obj, long j3, boolean z10);

    public abstract void putByte(long j3, byte b3);

    public abstract void putByte(Object obj, long j3, byte b3);

    public abstract void putDouble(Object obj, long j3, double d10);

    public abstract void putFloat(Object obj, long j3, float f10);

    public abstract void putInt(long j3, int i10);

    public final void putInt(Object obj, long j3, int i10) {
        this.unsafe.putInt(obj, j3, i10);
    }

    public abstract void putLong(long j3, long j10);

    public final void putLong(Object obj, long j3, long j10) {
        this.unsafe.putLong(obj, j3, j10);
    }

    public final void putObject(Object obj, long j3, Object obj2) {
        this.unsafe.putObject(obj, j3, obj2);
    }

    public boolean supportsUnsafeArrayOperations() {
        Unsafe unsafe = this.unsafe;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            d9.logMissingMethod(th2);
            return false;
        }
    }

    public boolean supportsUnsafeByteBufferOperations() {
        java.lang.reflect.Field bufferAddressField;
        Unsafe unsafe = this.unsafe;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            bufferAddressField = d9.bufferAddressField();
            if (bufferAddressField == null) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            d9.logMissingMethod(th2);
            return false;
        }
    }
}
