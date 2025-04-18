package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import i0.a;
import q0.p;

/* loaded from: classes3.dex */
public final class ForEachGestureKt {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if ((!r8) == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, h0.g r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.f3385c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3385c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3384b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f3385c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = r0.f3383a
            kotlin.jvm.internal.q.m(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.jvm.internal.q.m(r8)
            androidx.compose.ui.input.pointer.PointerEvent r8 = r7.S0()
            java.util.List r8 = r8.f15569a
            int r2 = r8.size()
            r5 = r4
        L40:
            if (r5 >= r2) goto L51
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L4e
            r8 = r3
            goto L52
        L4e:
            int r5 = r5 + 1
            goto L40
        L51:
            r8 = r4
        L52:
            r8 = r8 ^ r3
            if (r8 != 0) goto L7b
        L55:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.f15574c
            r0.f3383a = r7
            r0.f3385c = r3
            java.lang.Object r8 = r7.L1(r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r8 = r8.f15569a
            int r2 = r8.size()
            r5 = r4
        L6b:
            if (r5 >= r2) goto L7b
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L78
            goto L55
        L78:
            int r5 = r5 + 1
            goto L6b
        L7b:
            d0.b0 r7 = d0.b0.f30125a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, h0.g):java.lang.Object");
    }

    public static final Object b(PointerInputScope pointerInputScope, p pVar, g gVar) {
        Object K1 = pointerInputScope.K1(new ForEachGestureKt$awaitEachGesture$2(null, gVar.getContext(), pVar), gVar);
        return K1 == a.f30806a ? K1 : b0.f30125a;
    }
}
