package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {323, 324, 329}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3248a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f3250c;
    public final /* synthetic */ a d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f3251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f3252g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f3253a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar) {
            super(1);
            this.f3253a = pVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            this.f3253a.invoke(pointerInputChange, new Offset(PointerEventKt.f(pointerInputChange, false)));
            pointerInputChange.a();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(g gVar, a aVar, a aVar2, l lVar, p pVar) {
        super(gVar);
        this.f3250c = lVar;
        this.d = aVar;
        this.f3251f = aVar2;
        this.f3252g = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(gVar, this.d, this.f3251f, this.f3250c, this.f3252g);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f3249b = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:9:0x007c, B:11:0x0084, B:13:0x0091, B:15:0x009d, B:17:0x00a0, B:20:0x00a3, B:24:0x00a9, B:28:0x0028, B:29:0x0057, B:31:0x005b, B:36:0x0030, B:37:0x0048, B:41:0x003c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:9:0x007c, B:11:0x0084, B:13:0x0091, B:15:0x009d, B:17:0x00a0, B:20:0x00a3, B:24:0x00a9, B:28:0x0028, B:29:0x0057, B:31:0x005b, B:36:0x0030, B:37:0x0048, B:41:0x003c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:9:0x007c, B:11:0x0084, B:13:0x0091, B:15:0x009d, B:17:0x00a0, B:20:0x00a3, B:24:0x00a9, B:28:0x0028, B:29:0x0057, B:31:0x005b, B:36:0x0030, B:37:0x0048, B:41:0x003c), top: B:2:0x0009 }] */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r8.f3248a
            r2 = 1
            r3 = 2
            q0.a r4 = r8.f3251f
            r5 = 3
            if (r1 == 0) goto L34
            if (r1 == r2) goto L2c
            if (r1 == r3) goto L24
            if (r1 != r5) goto L1c
            java.lang.Object r0 = r8.f3249b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
            kotlin.jvm.internal.q.m(r9)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L7c
        L19:
            r9 = move-exception
            goto Laf
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r1 = r8.f3249b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.jvm.internal.q.m(r9)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L57
        L2c:
            java.lang.Object r1 = r8.f3249b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.jvm.internal.q.m(r9)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L48
        L34:
            kotlin.jvm.internal.q.m(r9)
            java.lang.Object r9 = r8.f3249b
            r1 = r9
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r8.f3249b = r1     // Catch: java.util.concurrent.CancellationException -> L19
            r8.f3248a = r2     // Catch: java.util.concurrent.CancellationException -> L19
            r9 = 0
            java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r1, r9, r8, r3)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 != r0) goto L48
            return r0
        L48:
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9     // Catch: java.util.concurrent.CancellationException -> L19
            long r6 = r9.f15589a     // Catch: java.util.concurrent.CancellationException -> L19
            r8.f3249b = r1     // Catch: java.util.concurrent.CancellationException -> L19
            r8.f3248a = r3     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.c(r1, r6, r8)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 != r0) goto L57
            return r0
        L57:
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 == 0) goto Lac
            q0.l r2 = r8.f3250c     // Catch: java.util.concurrent.CancellationException -> L19
            long r6 = r9.f15591c     // Catch: java.util.concurrent.CancellationException -> L19
            androidx.compose.ui.geometry.Offset r3 = new androidx.compose.ui.geometry.Offset     // Catch: java.util.concurrent.CancellationException -> L19
            r3.<init>(r6)     // Catch: java.util.concurrent.CancellationException -> L19
            r2.invoke(r3)     // Catch: java.util.concurrent.CancellationException -> L19
            long r2 = r9.f15589a     // Catch: java.util.concurrent.CancellationException -> L19
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 r9 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1     // Catch: java.util.concurrent.CancellationException -> L19
            q0.p r6 = r8.f3252g     // Catch: java.util.concurrent.CancellationException -> L19
            r9.<init>(r6)     // Catch: java.util.concurrent.CancellationException -> L19
            r8.f3249b = r1     // Catch: java.util.concurrent.CancellationException -> L19
            r8.f3248a = r5     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.h(r1, r2, r9, r8)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 != r0) goto L7b
            return r0
        L7b:
            r0 = r1
        L7c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.util.concurrent.CancellationException -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 == 0) goto La9
            androidx.compose.ui.input.pointer.PointerEvent r9 = r0.S0()     // Catch: java.util.concurrent.CancellationException -> L19
            java.util.List r9 = r9.f15569a     // Catch: java.util.concurrent.CancellationException -> L19
            int r0 = r9.size()     // Catch: java.util.concurrent.CancellationException -> L19
            r1 = 0
        L8f:
            if (r1 >= r0) goto La3
            java.lang.Object r2 = r9.get(r1)     // Catch: java.util.concurrent.CancellationException -> L19
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2     // Catch: java.util.concurrent.CancellationException -> L19
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventKt.b(r2)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r3 == 0) goto La0
            r2.a()     // Catch: java.util.concurrent.CancellationException -> L19
        La0:
            int r1 = r1 + 1
            goto L8f
        La3:
            q0.a r9 = r8.d     // Catch: java.util.concurrent.CancellationException -> L19
            r9.invoke()     // Catch: java.util.concurrent.CancellationException -> L19
            goto Lac
        La9:
            r4.invoke()     // Catch: java.util.concurrent.CancellationException -> L19
        Lac:
            d0.b0 r9 = d0.b0.f30125a
            return r9
        Laf:
            r4.invoke()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
