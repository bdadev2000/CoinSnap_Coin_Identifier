package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class B5 {
    Unsafe unsafe;

    public B5(Unsafe unsafe) {
        this.unsafe = unsafe;
    }

    public final int arrayBaseOffset(Class<?> cls) {
        return this.unsafe.arrayBaseOffset(cls);
    }

    public final int arrayIndexScale(Class<?> cls) {
        return this.unsafe.arrayIndexScale(cls);
    }

    public abstract void copyMemory(long j7, byte[] bArr, long j9, long j10);

    public abstract void copyMemory(byte[] bArr, long j7, long j9, long j10);

    public abstract boolean getBoolean(Object obj, long j7);

    public abstract byte getByte(long j7);

    public abstract byte getByte(Object obj, long j7);

    public abstract double getDouble(Object obj, long j7);

    public abstract float getFloat(Object obj, long j7);

    public abstract int getInt(long j7);

    public final int getInt(Object obj, long j7) {
        return this.unsafe.getInt(obj, j7);
    }

    public abstract long getLong(long j7);

    public final long getLong(Object obj, long j7) {
        return this.unsafe.getLong(obj, j7);
    }

    public final Object getObject(Object obj, long j7) {
        return this.unsafe.getObject(obj, j7);
    }

    public abstract Object getStaticObject(java.lang.reflect.Field field);

    public final long objectFieldOffset(java.lang.reflect.Field field) {
        return this.unsafe.objectFieldOffset(field);
    }

    public abstract void putBoolean(Object obj, long j7, boolean z8);

    public abstract void putByte(long j7, byte b);

    public abstract void putByte(Object obj, long j7, byte b);

    public abstract void putDouble(Object obj, long j7, double d2);

    public abstract void putFloat(Object obj, long j7, float f9);

    public abstract void putInt(long j7, int i9);

    public final void putInt(Object obj, long j7, int i9) {
        this.unsafe.putInt(obj, j7, i9);
    }

    public abstract void putLong(long j7, long j9);

    public final void putLong(Object obj, long j7, long j9) {
        this.unsafe.putLong(obj, j7, j9);
    }

    public final void putObject(Object obj, long j7, Object obj2) {
        this.unsafe.putObject(obj, j7, obj2);
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
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            C5.logMissingMethod(th);
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
            bufferAddressField = C5.bufferAddressField();
            if (bufferAddressField == null) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C5.logMissingMethod(th);
            return false;
        }
    }
}
