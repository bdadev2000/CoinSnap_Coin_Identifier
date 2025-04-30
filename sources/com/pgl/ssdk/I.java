package com.pgl.ssdk;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private static Method f19541a;
    private static Method b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f19542c;

    static {
        try {
            f19541a = Class.class.getDeclaredMethod("forName", String.class);
            b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f19542c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[Catch: all -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:3:0x0001, B:10:0x001c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.Object r4) {
        /*
            r1 = 0
            boolean r4 = a()     // Catch: java.lang.Throwable -> L23
            r0 = 1
            if (r4 == 0) goto L18
            java.lang.reflect.Method r4 = com.pgl.ssdk.I.f19542c     // Catch: java.lang.Throwable -> L18
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r4.invoke(r2, r3)     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L18
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L19
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 != 0) goto L1c
            return r1
        L1c:
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L23
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.I.a(java.lang.Object, java.lang.Class, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[Catch: all -> 0x001f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001f, blocks: (B:3:0x0001, B:7:0x001b), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.Class[] r5, java.lang.Object... r6) {
        /*
            r0 = 0
            boolean r1 = a()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L18
            java.lang.reflect.Method r1 = com.pgl.ssdk.I.b     // Catch: java.lang.Throwable -> L18
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r1.invoke(r3, r4)     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L18
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L19
            goto L19
        L18:
            r3 = r0
        L19:
            if (r3 == 0) goto L1f
            java.lang.Object r0 = r3.invoke(r2, r6)     // Catch: java.lang.Throwable -> L1f
        L1f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.I.a(java.lang.Object, java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.Object");
    }

    private static boolean a() {
        return (f19541a == null || b == null || f19542c == null) ? false : true;
    }
}
