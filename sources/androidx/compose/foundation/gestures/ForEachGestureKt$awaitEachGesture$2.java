package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import d0.b0;
import h0.g;
import h0.l;
import j0.e;
import j0.h;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {104, 107, 112}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ForEachGestureKt$awaitEachGesture$2 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3386a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f3388c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(g gVar, l lVar, p pVar) {
        super(gVar);
        this.f3388c = lVar;
        this.d = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(gVar, this.f3388c, this.d);
        forEachGestureKt$awaitEachGesture$2.f3387b = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ForEachGestureKt$awaitEachGesture$2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0060 -> B:5:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0081 -> B:5:0x003d). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r8.f3386a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r8.f3387b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.jvm.internal.q.m(r9)
            goto L26
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f3387b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.jvm.internal.q.m(r9)     // Catch: java.util.concurrent.CancellationException -> L28
        L26:
            r9 = r1
            goto L3c
        L28:
            r9 = move-exception
            r5 = r1
            r1 = r8
            goto L6e
        L2c:
            java.lang.Object r1 = r8.f3387b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.jvm.internal.q.m(r9)     // Catch: java.util.concurrent.CancellationException -> L28
            r9 = r8
            goto L55
        L35:
            kotlin.jvm.internal.q.m(r9)
            java.lang.Object r9 = r8.f3387b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
        L3c:
            r1 = r8
        L3d:
            h0.l r5 = r1.f3388c
            boolean r5 = kotlin.jvm.internal.e.p(r5)
            if (r5 == 0) goto L84
            q0.p r5 = r1.d     // Catch: java.util.concurrent.CancellationException -> L6a
            r1.f3387b = r9     // Catch: java.util.concurrent.CancellationException -> L6a
            r1.f3386a = r4     // Catch: java.util.concurrent.CancellationException -> L6a
            java.lang.Object r5 = r5.invoke(r9, r1)     // Catch: java.util.concurrent.CancellationException -> L6a
            if (r5 != r0) goto L52
            return r0
        L52:
            r7 = r1
            r1 = r9
            r9 = r7
        L55:
            r9.f3387b = r1     // Catch: java.util.concurrent.CancellationException -> L64
            r9.f3386a = r3     // Catch: java.util.concurrent.CancellationException -> L64
            java.lang.Object r5 = androidx.compose.foundation.gestures.ForEachGestureKt.a(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L64
            if (r5 != r0) goto L60
            return r0
        L60:
            r7 = r1
            r1 = r9
            r9 = r7
            goto L3d
        L64:
            r5 = move-exception
            r7 = r1
            r1 = r9
            r9 = r5
            r5 = r7
            goto L6e
        L6a:
            r5 = move-exception
            r7 = r5
            r5 = r9
            r9 = r7
        L6e:
            h0.l r6 = r1.f3388c
            boolean r6 = kotlin.jvm.internal.e.p(r6)
            if (r6 == 0) goto L83
            r1.f3387b = r5
            r1.f3386a = r2
            java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.a(r5, r1)
            if (r9 != r0) goto L81
            return r0
        L81:
            r9 = r5
            goto L3d
        L83:
            throw r9
        L84:
            d0.b0 r9 = d0.b0.f30125a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
