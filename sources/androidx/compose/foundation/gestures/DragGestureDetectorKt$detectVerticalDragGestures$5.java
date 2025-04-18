package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", l = {479, 481, 489}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DragGestureDetectorKt$detectVerticalDragGestures$5 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public c0 f3262a;

    /* renamed from: b, reason: collision with root package name */
    public int f3263b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3264c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f3265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f3266g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f3267h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f3268a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar) {
            super(1);
            this.f3268a = pVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            this.f3268a.invoke(pointerInputChange, Float.valueOf(Offset.h(PointerEventKt.f(pointerInputChange, false))));
            pointerInputChange.a();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectVerticalDragGestures$5(g gVar, a aVar, a aVar2, l lVar, p pVar) {
        super(gVar);
        this.d = lVar;
        this.f3265f = pVar;
        this.f3266g = aVar;
        this.f3267h = aVar2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5 = new DragGestureDetectorKt$detectVerticalDragGestures$5(gVar, this.f3266g, this.f3267h, this.d, this.f3265f);
        dragGestureDetectorKt$detectVerticalDragGestures$5.f3264c = obj;
        return dragGestureDetectorKt$detectVerticalDragGestures$5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectVerticalDragGestures$5) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009d  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r13.f3263b
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L27
            if (r1 == r3) goto L1d
            if (r1 != r4) goto L15
            kotlin.jvm.internal.q.m(r14)
            goto L95
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            kotlin.jvm.internal.c0 r1 = r13.f3262a
            java.lang.Object r3 = r13.f3264c
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
            kotlin.jvm.internal.q.m(r14)
            goto L65
        L27:
            java.lang.Object r1 = r13.f3264c
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.jvm.internal.q.m(r14)
            goto L44
        L2f:
            kotlin.jvm.internal.q.m(r14)
            java.lang.Object r14 = r13.f3264c
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r14
            r13.f3264c = r14
            r13.f3263b = r5
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r14, r2, r13, r3)
            if (r1 != r0) goto L41
            return r0
        L41:
            r12 = r1
            r1 = r14
            r14 = r12
        L44:
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            kotlin.jvm.internal.c0 r11 = new kotlin.jvm.internal.c0
            r11.<init>()
            long r6 = r14.f15589a
            int r8 = r14.f15595i
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 r9 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
            r9.<init>(r11)
            r13.f3264c = r1
            r13.f3262a = r11
            r13.f3263b = r3
            r5 = r1
            r10 = r13
            java.lang.Object r14 = androidx.compose.foundation.gestures.DragGestureDetectorKt.e(r5, r6, r8, r9, r10)
            if (r14 != r0) goto L63
            return r0
        L63:
            r3 = r1
            r1 = r11
        L65:
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            if (r14 == 0) goto La8
            androidx.compose.ui.geometry.Offset r5 = new androidx.compose.ui.geometry.Offset
            long r6 = r14.f15591c
            r5.<init>(r6)
            q0.l r6 = r13.d
            r6.invoke(r5)
            float r1 = r1.f30922a
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            q0.p r1 = r13.f3265f
            r1.invoke(r14, r5)
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 r5 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1
            r5.<init>(r1)
            r13.f3264c = r2
            r13.f3262a = r2
            r13.f3263b = r4
            long r1 = r14.f15589a
            java.lang.Object r14 = androidx.compose.foundation.gestures.DragGestureDetectorKt.l(r3, r1, r5, r13)
            if (r14 != r0) goto L95
            return r0
        L95:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto La3
            q0.a r14 = r13.f3266g
            r14.invoke()
            goto La8
        La3:
            q0.a r14 = r13.f3267h
            r14.invoke()
        La8:
            d0.b0 r14 = d0.b0.f30125a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
