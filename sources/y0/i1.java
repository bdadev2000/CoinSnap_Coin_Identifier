package y0;

import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public final class i1 {
    public final Mutex a;

    /* renamed from: b, reason: collision with root package name */
    public final fb.c f27767b;

    /* renamed from: c, reason: collision with root package name */
    public final Flow f27768c;

    public i1(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.a = MutexKt.Mutex$default(false, 1, null);
        this.f27767b = new fb.c((Object) null);
        this.f27768c = FlowKt.flow(new h1(null));
    }

    public final Integer a() {
        return Boxing.boxInt(this.f27767b.w());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof y0.f1
            if (r0 == 0) goto L13
            r0 = r8
            y0.f1 r0 = (y0.f1) r0
            int r1 = r0.f27735g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27735g = r1
            goto L18
        L13:
            y0.f1 r0 = new y0.f1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f27733d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27735g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.f27731b
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L31
            goto L66
        L31:
            r8 = move-exception
            goto L6a
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlinx.coroutines.sync.Mutex r7 = r0.f27732c
            java.lang.Object r2 = r0.f27731b
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L59
        L45:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f27731b = r7
            kotlinx.coroutines.sync.Mutex r8 = r6.a
            r0.f27732c = r8
            r0.f27735g = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r2 = r7
            r7 = r8
        L59:
            r0.f27731b = r7     // Catch: java.lang.Throwable -> L31
            r0.f27732c = r5     // Catch: java.lang.Throwable -> L31
            r0.f27735g = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L31
            if (r8 != r1) goto L66
            return r1
        L66:
            r7.unlock(r5)
            return r8
        L6a:
            r7.unlock(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.i1.b(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof y0.g1
            if (r0 == 0) goto L13
            r0 = r8
            y0.g1 r0 = (y0.g1) r0
            int r1 = r0.f27746g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27746g = r1
            goto L18
        L13:
            y0.g1 r0 = new y0.g1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f27744d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27746g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            boolean r7 = r0.f27743c
            kotlinx.coroutines.sync.Mutex r0 = r0.f27742b
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L2e
            goto L55
        L2e:
            r8 = move-exception
            goto L5f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.sync.Mutex r8 = r6.a
            boolean r2 = r8.tryLock(r3)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch: java.lang.Throwable -> L5b
            r0.f27742b = r8     // Catch: java.lang.Throwable -> L5b
            r0.f27743c = r2     // Catch: java.lang.Throwable -> L5b
            r0.f27746g = r4     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5b
            if (r7 != r1) goto L52
            return r1
        L52:
            r0 = r8
            r8 = r7
            r7 = r2
        L55:
            if (r7 == 0) goto L5a
            r0.unlock(r3)
        L5a:
            return r8
        L5b:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5f:
            if (r7 == 0) goto L64
            r0.unlock(r3)
        L64:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.i1.c(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
