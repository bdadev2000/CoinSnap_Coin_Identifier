package y0;

/* loaded from: classes.dex */
public final class i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Throwable, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008b -> B:13:0x006d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:13:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(y0.i r5, java.util.List r6, y0.w0 r7, kotlin.coroutines.Continuation r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof y0.f
            if (r0 == 0) goto L16
            r0 = r8
            y0.f r0 = (y0.f) r0
            int r1 = r0.f27727g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f27727g = r1
            goto L1b
        L16:
            y0.f r0 = new y0.f
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r5 = r0.f27725d
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f27727g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            java.util.Iterator r6 = r0.f27724c
            java.io.Serializable r7 = r0.f27723b
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L86
            goto L6d
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            java.io.Serializable r6 = r0.f27723b
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.throwOnFailure(r5)
            goto L61
        L45:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            y0.h r1 = new y0.h
            r4 = 0
            r1.<init>(r6, r5, r4)
            r0.f27723b = r5
            r0.f27727g = r3
            y0.m r7 = (y0.m) r7
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r8) goto L60
            goto L9f
        L60:
            r6 = r5
        L61:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
        L6d:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L97
            java.lang.Object r5 = r6.next()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0.f27723b = r7     // Catch: java.lang.Throwable -> L86
            r0.f27724c = r6     // Catch: java.lang.Throwable -> L86
            r0.f27727g = r2     // Catch: java.lang.Throwable -> L86
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L86
            if (r5 != r8) goto L6d
            goto L9f
        L86:
            r5 = move-exception
            T r1 = r7.element
            if (r1 != 0) goto L8e
            r7.element = r5
            goto L6d
        L8e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            kotlin.ExceptionsKt.addSuppressed(r1, r5)
            goto L6d
        L97:
            T r5 = r7.element
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 != 0) goto La0
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L9f:
            return r8
        La0:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.i.a(y0.i, java.util.List, y0.w0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
