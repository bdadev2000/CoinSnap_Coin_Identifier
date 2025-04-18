package y0;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public abstract class b1 {
    public final Mutex a = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: b, reason: collision with root package name */
    public final CompletableDeferred f27693b = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    public abstract Object a(Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #1 {all -> 0x008b, blocks: (B:26:0x0061, B:28:0x0069, B:31:0x006f), top: B:25:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: all -> 0x008b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x008b, blocks: (B:26:0x0061, B:28:0x0069, B:31:0x006f), top: B:25:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof y0.a1
            if (r0 == 0) goto L13
            r0 = r7
            y0.a1 r0 = (y0.a1) r0
            int r1 = r0.f27691g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27691g = r1
            goto L18
        L13:
            y0.a1 r0 = new y0.a1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f27689d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27691g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.sync.Mutex r1 = r0.f27688c
            y0.b1 r0 = r0.f27687b
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L31
            goto L7e
        L31:
            r7 = move-exception
            goto L89
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3b:
            kotlinx.coroutines.sync.Mutex r2 = r0.f27688c
            y0.b1 r4 = r0.f27687b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L61
        L43:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.CompletableDeferred r7 = r6.f27693b
            boolean r7 = r7.isCompleted()
            if (r7 == 0) goto L51
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L51:
            r0.f27687b = r6
            kotlinx.coroutines.sync.Mutex r2 = r6.a
            r0.f27688c = r2
            r0.f27691g = r4
            java.lang.Object r7 = r2.lock(r5, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            r4 = r6
        L61:
            kotlinx.coroutines.CompletableDeferred r7 = r4.f27693b     // Catch: java.lang.Throwable -> L8b
            boolean r7 = r7.isCompleted()     // Catch: java.lang.Throwable -> L8b
            if (r7 == 0) goto L6f
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8b
            r2.unlock(r5)
            return r7
        L6f:
            r0.f27687b = r4     // Catch: java.lang.Throwable -> L8b
            r0.f27688c = r2     // Catch: java.lang.Throwable -> L8b
            r0.f27691g = r3     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r7 = r4.a(r0)     // Catch: java.lang.Throwable -> L8b
            if (r7 != r1) goto L7c
            return r1
        L7c:
            r1 = r2
            r0 = r4
        L7e:
            kotlinx.coroutines.CompletableDeferred r7 = r0.f27693b     // Catch: java.lang.Throwable -> L31
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L31
            r7.complete(r0)     // Catch: java.lang.Throwable -> L31
            r1.unlock(r5)
            return r0
        L89:
            r2 = r1
            goto L8c
        L8b:
            r7 = move-exception
        L8c:
            r2.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.b1.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
