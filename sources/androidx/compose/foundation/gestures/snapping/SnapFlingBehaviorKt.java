package androidx.compose.foundation.gestures.snapping;

import p0.a;

/* loaded from: classes2.dex */
public final class SnapFlingBehaviorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3701a = 400;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.foundation.gestures.ScrollScope r5, float r6, androidx.compose.animation.core.AnimationState r7, androidx.compose.animation.core.DecayAnimationSpec r8, q0.l r9, h0.g r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) r0
            int r1 = r0.f3705f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3705f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f3705f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r6 = r0.f3702a
            kotlin.jvm.internal.c0 r5 = r0.f3704c
            androidx.compose.animation.core.AnimationState r7 = r0.f3703b
            kotlin.jvm.internal.q.m(r10)
            goto L65
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.jvm.internal.q.m(r10)
            kotlin.jvm.internal.c0 r10 = new kotlin.jvm.internal.c0
            r10.<init>()
            java.lang.Object r2 = r7.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L4e
            r2 = r3
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>(r6, r10, r5, r9)
            r0.f3703b = r7
            r0.f3704c = r10
            r0.f3702a = r6
            r0.f3705f = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.e(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L64
            goto L72
        L64:
            r5 = r10
        L65:
            androidx.compose.foundation.gestures.snapping.AnimationResult r1 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r5 = r5.f30922a
            float r6 = r6 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r1.<init>(r5, r7)
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.a(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, q0.l, h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.foundation.gestures.ScrollScope r9, float r10, float r11, androidx.compose.animation.core.AnimationState r12, androidx.compose.animation.core.AnimationSpec r13, q0.l r14, h0.g r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1) r0
            int r1 = r0.f3713g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f3713g = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f3712f
            i0.a r0 = i0.a.f30806a
            int r1 = r6.f3713g
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            float r9 = r6.f3710b
            float r10 = r6.f3709a
            kotlin.jvm.internal.c0 r11 = r6.d
            androidx.compose.animation.core.AnimationState r12 = r6.f3711c
            kotlin.jvm.internal.q.m(r15)
            goto L7f
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            kotlin.jvm.internal.q.m(r15)
            kotlin.jvm.internal.c0 r15 = new kotlin.jvm.internal.c0
            r15.<init>()
            java.lang.Object r1 = r12.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r8 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r10)
            java.lang.Object r1 = r12.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L61
            r1 = r2
            goto L62
        L61:
            r1 = 0
        L62:
            r4 = r1 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2 r5 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2
            r5.<init>(r11, r15, r9, r14)
            r6.f3711c = r12
            r6.d = r15
            r6.f3709a = r10
            r6.f3710b = r8
            r6.f3713g = r2
            r1 = r12
            r2 = r3
            r3 = r13
            java.lang.Object r9 = androidx.compose.animation.core.SuspendAnimationKt.f(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L7d
            goto La0
        L7d:
            r11 = r15
            r9 = r8
        L7f:
            java.lang.Object r13 = r12.a()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            float r9 = c(r13, r9)
            androidx.compose.foundation.gestures.snapping.AnimationResult r0 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r11 = r11.f30922a
            float r10 = r10 - r11
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r10)
            r10 = 29
            androidx.compose.animation.core.AnimationState r9 = androidx.compose.animation.core.AnimationStateKt.b(r12, r7, r9, r10)
            r0.<init>(r11, r9)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.b(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, q0.l, h0.g):java.lang.Object");
    }

    public static final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return f3 > 0.0f ? a.x(f2, f3) : a.v(f2, f3);
    }
}
