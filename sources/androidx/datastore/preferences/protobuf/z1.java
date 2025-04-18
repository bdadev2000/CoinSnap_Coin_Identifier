package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class z1 extends a2 {
    public z1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final boolean c(Object obj, long j3) {
        return this.a.getBoolean(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final byte d(Object obj, long j3) {
        return this.a.getByte(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final double e(Object obj, long j3) {
        return this.a.getDouble(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final float f(Object obj, long j3) {
        return this.a.getFloat(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final void k(Object obj, long j3, boolean z10) {
        this.a.putBoolean(obj, j3, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final void l(Object obj, long j3, byte b3) {
        this.a.putByte(obj, j3, b3);
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final void m(Object obj, long j3, double d10) {
        this.a.putDouble(obj, j3, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final void n(Object obj, long j3, float f10) {
        this.a.putFloat(obj, j3, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.a.getClass();
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
            b2.a(th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() {
        /*
            r11 = this;
            java.lang.String r0 = "copyMemory"
            java.lang.String r1 = "getLong"
            sun.misc.Unsafe r2 = r11.a
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto Lf
        Ld:
            r7 = r6
            goto L37
        Lf:
            java.lang.Class r7 = r2.getClass()     // Catch: java.lang.Throwable -> L32
            java.lang.String r8 = "objectFieldOffset"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L32
            java.lang.Class<java.lang.reflect.Field> r10 = java.lang.reflect.Field.class
            r9[r6] = r10     // Catch: java.lang.Throwable -> L32
            r7.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L32
            r8[r6] = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L32
            r8[r5] = r9     // Catch: java.lang.Throwable -> L32
            r7.getMethod(r1, r8)     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Field r7 = androidx.datastore.preferences.protobuf.b2.e()     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L30
            goto Ld
        L30:
            r7 = r5
            goto L37
        L32:
            r7 = move-exception
            androidx.datastore.preferences.protobuf.b2.a(r7)
            goto Ld
        L37:
            if (r7 != 0) goto L3a
            return r6
        L3a:
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "getByte"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9c
            r8[r6] = r9     // Catch: java.lang.Throwable -> L9c
            r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "putByte"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9c
            r8[r6] = r9     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L9c
            r8[r5] = r10     // Catch: java.lang.Throwable -> L9c
            r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "getInt"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9c
            r8[r6] = r9     // Catch: java.lang.Throwable -> L9c
            r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "putInt"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9c
            r8[r6] = r9     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L9c
            r8[r5] = r10     // Catch: java.lang.Throwable -> L9c
            r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9c
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9c
            r7[r6] = r9     // Catch: java.lang.Throwable -> L9c
            r2.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = "putLong"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9c
            r7[r6] = r9     // Catch: java.lang.Throwable -> L9c
            r7[r5] = r9     // Catch: java.lang.Throwable -> L9c
            r2.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L9c
            r1 = 3
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L9c
            r7[r6] = r9     // Catch: java.lang.Throwable -> L9c
            r7[r5] = r9     // Catch: java.lang.Throwable -> L9c
            r7[r4] = r9     // Catch: java.lang.Throwable -> L9c
            r2.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L9c
            r7 = 5
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L9c
            r7[r6] = r3     // Catch: java.lang.Throwable -> L9c
            r7[r5] = r9     // Catch: java.lang.Throwable -> L9c
            r7[r4] = r3     // Catch: java.lang.Throwable -> L9c
            r7[r1] = r9     // Catch: java.lang.Throwable -> L9c
            r1 = 4
            r7[r1] = r9     // Catch: java.lang.Throwable -> L9c
            r2.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L9c
            return r5
        L9c:
            r0 = move-exception
            androidx.datastore.preferences.protobuf.b2.a(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z1.s():boolean");
    }
}
