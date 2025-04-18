package uc;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes3.dex */
public abstract class q {
    public static final q a;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    static {
        /*
            int r0 = uc.g.a
            r1 = 9
            r2 = 1
            r3 = 0
            if (r0 < r1) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r3
        Lb:
            if (r0 == 0) goto L21
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "canAccess"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L21
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L21
            uc.o r1 = new uc.o     // Catch: java.lang.NoSuchMethodException -> L21
            r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L21
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 != 0) goto L29
            uc.p r1 = new uc.p
            r1.<init>()
        L29:
            uc.q.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.q.<clinit>():void");
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
