package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import d0.b0;
import h0.g;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class AnchoredDraggableKt {
    public static final DraggableAnchors a(l lVar) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        lVar.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.f12963a);
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
            boolean r0 = r6 instanceof androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.f12803b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12803b = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12802a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f12803b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.jvm.internal.q.m(r6)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.jvm.internal.q.m(r6)
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            r0.f12803b = r3     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            java.lang.Object r4 = p0.a.J(r6, r0)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            if (r4 != r1) goto L41
            goto L43
        L41:
            d0.b0 r1 = d0.b0.f30125a
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.b(q0.a, q0.p, h0.g):java.lang.Object");
    }

    public static Modifier c(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z2, boolean z3, int i2) {
        return DraggableKt.a(modifier, anchoredDraggableState.f12823f, orientation, (i2 & 4) != 0 ? true : z2, null, anchoredDraggableState.f12830m.getValue() != null, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), (i2 & 8) != 0 ? false : z3, 32);
    }

    public static final Object d(AnchoredDraggableState anchoredDraggableState, Object obj, float f2, g gVar) {
        Object b2 = anchoredDraggableState.b(obj, MutatePriority.f2811a, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f2, null), gVar);
        return b2 == i0.a.f30806a ? b2 : b0.f30125a;
    }

    public static final Modifier e(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, p pVar) {
        return modifier.T0(new DraggableAnchorsElement(anchoredDraggableState, pVar, orientation));
    }
}
