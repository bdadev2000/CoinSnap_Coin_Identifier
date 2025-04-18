package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class ScrollableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ScrollableKt$NoOpScrollScope$1 f3433a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final ScrollableKt$DefaultScrollMotionDurationScale$1 f3434b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final ScrollableKt$UnityDensity$1 f3435c = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.foundation.gestures.ScrollingLogic r11, long r12, h0.g r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f3439c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.c0 r11 = r0.f3438b
            androidx.compose.foundation.gestures.ScrollingLogic r12 = r0.f3437a
            kotlin.jvm.internal.q.m(r14)
            r14 = r11
            r11 = r12
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.jvm.internal.q.m(r14)
            kotlin.jvm.internal.c0 r14 = new kotlin.jvm.internal.c0
            r14.<init>()
            androidx.compose.foundation.MutatePriority r2 = androidx.compose.foundation.MutatePriority.f2811a
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2 r10 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.f3437a = r11
            r0.f3438b = r14
            r0.d = r3
            java.lang.Object r12 = r11.e(r2, r10, r0)
            if (r12 != r1) goto L56
            goto L61
        L56:
            float r12 = r14.f30922a
            long r11 = r11.g(r12)
            androidx.compose.ui.geometry.Offset r1 = new androidx.compose.ui.geometry.Offset
            r1.<init>(r11)
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.a(androidx.compose.foundation.gestures.ScrollingLogic, long, h0.g):java.lang.Object");
    }

    public static final Modifier b(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        return modifier.T0(new ScrollableElement(overscrollEffect, bringIntoViewSpec, flingBehavior, orientation, scrollableState, mutableInteractionSource, z2, z3));
    }

    public static Modifier c(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource) {
        return b(modifier, scrollableState, orientation, null, z2, z3, null, mutableInteractionSource, null);
    }
}
