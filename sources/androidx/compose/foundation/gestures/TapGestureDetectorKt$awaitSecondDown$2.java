package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {212}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TapGestureDetectorKt$awaitSecondDown$2 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public long f3515a;

    /* renamed from: b, reason: collision with root package name */
    public int f3516b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3517c;
    public final /* synthetic */ PointerInputChange d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(PointerInputChange pointerInputChange, g gVar) {
        super(gVar);
        this.d = pointerInputChange;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.d, gVar);
        tapGestureDetectorKt$awaitSecondDown$2.f3517c = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0046 -> B:5:0x004c). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r9.f3516b
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            long r3 = r9.f3515a
            java.lang.Object r1 = r9.f3517c
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.jvm.internal.q.m(r10)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            goto L4c
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            kotlin.jvm.internal.q.m(r10)
            java.lang.Object r10 = r9.f3517c
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            androidx.compose.ui.input.pointer.PointerInputChange r1 = r9.d
            long r3 = r1.f15590b
            androidx.compose.ui.platform.ViewConfiguration r1 = r10.getViewConfiguration()
            r1.b()
            r5 = 40
            long r5 = r5 + r3
            r1 = r10
            r3 = r5
            r10 = r9
        L37:
            r10.f3517c = r1
            r10.f3515a = r3
            r10.f3516b = r2
            r5 = 0
            r6 = 3
            java.lang.Object r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r1, r5, r10, r6)
            if (r5 != r0) goto L46
            return r0
        L46:
            r8 = r0
            r0 = r10
            r10 = r5
            r4 = r3
            r3 = r1
            r1 = r8
        L4c:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            long r6 = r10.f15590b
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L55
            return r10
        L55:
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
