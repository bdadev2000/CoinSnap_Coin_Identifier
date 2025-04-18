package v;

/* loaded from: classes3.dex */
public abstract class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.lifecycle.Lifecycle r6, h0.g r7) {
        /*
            boolean r0 = r7 instanceof v.c
            if (r0 == 0) goto L13
            r0 = r7
            v.c r0 = (v.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            v.c r0 = new v.c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31375c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            d0.b0 r3 = d0.b0.f30125a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlin.jvm.internal.f0 r6 = r0.f31374b
            androidx.lifecycle.Lifecycle r0 = r0.f31373a
            kotlin.jvm.internal.q.m(r7)     // Catch: java.lang.Throwable -> L2d
            goto L71
        L2d:
            r7 = move-exception
            goto L80
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.jvm.internal.q.m(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.b()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.d
            int r7 = r7.compareTo(r2)
            if (r7 < 0) goto L47
            return r3
        L47:
            kotlin.jvm.internal.f0 r7 = new kotlin.jvm.internal.f0
            r7.<init>()
            r0.f31373a = r6     // Catch: java.lang.Throwable -> L7b
            r0.f31374b = r7     // Catch: java.lang.Throwable -> L7b
            r0.d = r4     // Catch: java.lang.Throwable -> L7b
            b1.l r2 = new b1.l     // Catch: java.lang.Throwable -> L7b
            h0.g r0 = b1.f0.r(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7b
            r2.p()     // Catch: java.lang.Throwable -> L7b
            v.d r0 = new v.d     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            r7.f30930a = r0     // Catch: java.lang.Throwable -> L7b
            r6.a(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r2.o()     // Catch: java.lang.Throwable -> L7b
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r6
            r6 = r7
        L71:
            java.lang.Object r6 = r6.f30930a
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L7a
            r0.d(r6)
        L7a:
            return r3
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            java.lang.Object r6 = r6.f30930a
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L89
            r0.d(r6)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.a(androidx.lifecycle.Lifecycle, h0.g):java.lang.Object");
    }
}
