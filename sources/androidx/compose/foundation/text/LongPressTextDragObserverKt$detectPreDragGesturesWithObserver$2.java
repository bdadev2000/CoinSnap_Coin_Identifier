package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import org.objectweb.asm.Opcodes;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {Opcodes.DADD, 103}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public PointerInputChange f6061a;

    /* renamed from: b, reason: collision with root package name */
    public int f6062b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6063c;
    public final /* synthetic */ TextDragObserver d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(TextDragObserver textDragObserver, g gVar) {
        super(gVar);
        this.d = textDragObserver;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.d, gVar);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f6063c = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:6:0x005f). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r13.f6062b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L22
            if (r1 != r3) goto L1a
            androidx.compose.ui.input.pointer.PointerInputChange r1 = r13.f6061a
            java.lang.Object r2 = r13.f6063c
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
            kotlin.jvm.internal.q.m(r14)
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r13
            goto L5f
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L22:
            java.lang.Object r1 = r13.f6063c
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.jvm.internal.q.m(r14)
            goto L3e
        L2a:
            kotlin.jvm.internal.q.m(r14)
            java.lang.Object r14 = r13.f6063c
            r1 = r14
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r13.f6063c = r1
            r13.f6062b = r2
            r14 = 0
            java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r1, r14, r13, r3)
            if (r14 != r0) goto L3e
            return r0
        L3e:
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            long r4 = r14.f15591c
            androidx.compose.foundation.text.TextDragObserver r2 = r13.d
            r2.a()
            r2 = r1
            r1 = r14
            r14 = r13
        L4a:
            r14.f6063c = r2
            r14.f6061a = r1
            r14.f6062b = r3
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.f15573b
            java.lang.Object r4 = r2.L1(r4, r14)
            if (r4 != r0) goto L59
            return r0
        L59:
            r12 = r0
            r0 = r14
            r14 = r4
            r4 = r2
            r2 = r1
            r1 = r12
        L5f:
            androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
            java.util.List r14 = r14.f15569a
            int r5 = r14.size()
            r6 = 0
        L68:
            if (r6 >= r5) goto L86
            java.lang.Object r7 = r14.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r8 = r7.f15589a
            long r10 = r2.f15589a
            boolean r8 = androidx.compose.ui.input.pointer.PointerId.a(r8, r10)
            if (r8 == 0) goto L83
            boolean r7 = r7.d
            if (r7 == 0) goto L83
            r14 = r0
            r0 = r1
            r1 = r2
            r2 = r4
            goto L4a
        L83:
            int r6 = r6 + 1
            goto L68
        L86:
            androidx.compose.foundation.text.TextDragObserver r14 = r0.d
            r14.c()
            d0.b0 r14 = d0.b0.f30125a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
