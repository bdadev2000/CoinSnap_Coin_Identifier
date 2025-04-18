package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import d0.b0;
import h0.g;
import i0.a;

/* loaded from: classes2.dex */
public final class AnchoredDraggableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3008a = 0;

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    public static final Object a(AnchoredDraggableState anchoredDraggableState, float f2, AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, g gVar) {
        Object a2;
        float e = draggableAnchors.e(obj);
        ?? obj2 = new Object();
        obj2.f30922a = Float.isNaN(anchoredDraggableState.f3068j.c()) ? 0.0f : anchoredDraggableState.f3068j.c();
        if (!Float.isNaN(e)) {
            float f3 = obj2.f30922a;
            if (f3 != e && (a2 = SuspendAnimationKt.a(f3, e, f2, anchoredDraggableState.f3063c, new AnchoredDraggableKt$animateTo$2$2(anchoredDragScope, obj2), gVar)) == a.f30806a) {
                return a2;
            }
        }
        return b0.f30125a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(q0.a r4, q0.p r5, h0.g r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.f3029b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3029b = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f3028a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f3029b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.jvm.internal.q.m(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.jvm.internal.q.m(r6)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            r0.f3029b = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            java.lang.Object r4 = p0.a.J(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            if (r4 != r1) goto L41
            goto L43
        L41:
            d0.b0 r1 = d0.b0.f30125a
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.b(q0.a, q0.p, h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.foundation.gestures.AnchoredDraggableState r5, java.lang.Object r6, float r7, h0.g r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3018c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r7 = r0.f3016a
            kotlin.jvm.internal.c0 r5 = r0.f3017b
            kotlin.jvm.internal.q.m(r8)
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.jvm.internal.q.m(r8)
            kotlin.jvm.internal.c0 r8 = new kotlin.jvm.internal.c0
            r8.<init>()
            r8.f30922a = r7
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r4 = 0
            r2.<init>(r5, r7, r8, r4)
            r0.f3017b = r8
            r0.f3016a = r7
            r0.d = r3
            androidx.compose.foundation.MutatePriority r3 = androidx.compose.foundation.MutatePriority.f2811a
            java.lang.Object r5 = r5.a(r6, r3, r2, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            r5 = r8
        L53:
            float r5 = r5.f30922a
            float r7 = r7 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.c(androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, float, h0.g):java.lang.Object");
    }
}
