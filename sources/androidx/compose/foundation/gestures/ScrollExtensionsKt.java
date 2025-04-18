package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import d0.b0;
import h0.g;
import i0.a;
import j0.i;

/* loaded from: classes4.dex */
public final class ScrollExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.foundation.ScrollState r5, float r6, androidx.compose.animation.core.TweenSpec r7, h0.g r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) r0
            int r1 = r0.f3411c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3411c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3410b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f3411c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.c0 r5 = r0.f3409a
            kotlin.jvm.internal.q.m(r8)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.jvm.internal.q.m(r8)
            kotlin.jvm.internal.c0 r8 = new kotlin.jvm.internal.c0
            r8.<init>()
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r2 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r4 = 0
            r2.<init>(r6, r7, r4, r8)
            r0.f3409a = r8
            r0.f3411c = r3
            androidx.compose.foundation.MutatePriority r6 = androidx.compose.foundation.MutatePriority.f2811a
            java.lang.Object r5 = r5.b(r6, r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = r8
        L4d:
            float r5 = r5.f30922a
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.a(androidx.compose.foundation.ScrollState, float, androidx.compose.animation.core.TweenSpec, h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.foundation.ScrollState r5, float r6, h0.g r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1) r0
            int r1 = r0.f3420c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3420c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3419b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f3420c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.c0 r5 = r0.f3418a
            kotlin.jvm.internal.q.m(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.jvm.internal.q.m(r7)
            kotlin.jvm.internal.c0 r7 = new kotlin.jvm.internal.c0
            r7.<init>()
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 r2 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2
            r4 = 0
            r2.<init>(r7, r6, r4)
            r0.f3418a = r7
            r0.f3420c = r3
            androidx.compose.foundation.MutatePriority r6 = androidx.compose.foundation.MutatePriority.f2811a
            java.lang.Object r5 = r5.b(r6, r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = r7
        L4d:
            float r5 = r5.f30922a
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.b(androidx.compose.foundation.ScrollState, float, h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [j0.i, q0.p] */
    public static Object c(ScrollableState scrollableState, g gVar) {
        Object b2 = scrollableState.b(MutatePriority.f2811a, new i(2, null), gVar);
        return b2 == a.f30806a ? b2 : b0.f30125a;
    }
}
