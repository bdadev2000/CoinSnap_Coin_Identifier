package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.a;

@StabilityInferred
@a
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class SnapFlingBehavior implements TargetedFlingBehavior {

    /* renamed from: a, reason: collision with root package name */
    public final SnapLayoutInfoProvider f3680a;

    /* renamed from: b, reason: collision with root package name */
    public final DecayAnimationSpec f3681b;

    /* renamed from: c, reason: collision with root package name */
    public final AnimationSpec f3682c;
    public final ScrollableKt$DefaultScrollMotionDurationScale$1 d = ScrollableKt.f3434b;

    public SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec) {
        this.f3680a = snapLayoutInfoProvider;
        this.f3681b = decayAnimationSpec;
        this.f3682c = animationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r7, androidx.compose.foundation.gestures.ScrollScope r8, float r9, float r10, q0.l r11, h0.g r12) {
        /*
            r7.getClass()
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            if (r0 == 0) goto L17
            r0 = r12
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1) r0
            int r1 = r0.f3700c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f3700c = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            r0.<init>(r7, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r6.f3698a
            i0.a r0 = i0.a.f30806a
            int r1 = r6.f3700c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            kotlin.jvm.internal.q.m(r12)
            goto L89
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.jvm.internal.q.m(r12)
            float r12 = java.lang.Math.abs(r9)
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L41
            goto L49
        L41:
            float r12 = java.lang.Math.abs(r10)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L51
        L49:
            r7 = 28
            androidx.compose.animation.core.AnimationState r7 = androidx.compose.animation.core.AnimationStateKt.a(r9, r10, r7)
        L4f:
            r0 = r7
            goto L8e
        L51:
            r6.f3700c = r2
            androidx.compose.animation.core.DecayAnimationSpec r12 = r7.f3681b
            float r1 = androidx.compose.animation.core.DecayAnimationSpecKt.a(r12, r1, r10)
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r9)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L6c
            androidx.compose.foundation.gestures.snapping.DecayApproachAnimation r7 = new androidx.compose.foundation.gestures.snapping.DecayApproachAnimation
            r7.<init>(r12)
            r1 = r7
            goto L74
        L6c:
            androidx.compose.foundation.gestures.snapping.TargetApproachAnimation r12 = new androidx.compose.foundation.gestures.snapping.TargetApproachAnimation
            androidx.compose.animation.core.AnimationSpec r7 = r7.f3682c
            r12.<init>(r7)
            r1 = r12
        L74:
            float r7 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.f3701a
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r9)
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r10)
            r2 = r8
            r5 = r11
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L89
            goto L8e
        L89:
            androidx.compose.foundation.gestures.snapping.AnimationResult r12 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r12
            androidx.compose.animation.core.AnimationState r7 = r12.f3673b
            goto L4f
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.c(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, androidx.compose.foundation.gestures.ScrollScope, float, float, q0.l, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.foundation.gestures.TargetedFlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1 r5, float r6, q0.l r7, h0.g r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1) r0
            int r1 = r0.f3697c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3697c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f3695a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f3697c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.jvm.internal.q.m(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.jvm.internal.q.m(r8)
            r0.f3697c = r3
            java.lang.Object r8 = r4.d(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r8
            java.lang.Object r5 = r8.f3672a
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L57
        L4b:
            androidx.compose.animation.core.AnimationState r5 = r8.f3673b
            java.lang.Object r5 = r5.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r6 = r5.floatValue()
        L57:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.b(androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1, float, q0.l, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1 r11, float r12, q0.l r13, h0.g r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f3684b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            q0.l r13 = r0.f3683a
            kotlin.jvm.internal.q.m(r14)
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.jvm.internal.q.m(r14)
            androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1 r14 = r10.d
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r8 = 0
            r4 = r2
            r5 = r12
            r6 = r11
            r7 = r10
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f3683a = r13
            r0.d = r3
            java.lang.Object r14 = kotlin.jvm.internal.e.G(r0, r14, r2)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.d(androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1, float, q0.l, h0.g):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        return p0.a.g(snapFlingBehavior.f3682c, this.f3682c) && p0.a.g(snapFlingBehavior.f3681b, this.f3681b) && p0.a.g(snapFlingBehavior.f3680a, this.f3680a);
    }

    public final int hashCode() {
        return this.f3680a.hashCode() + ((this.f3681b.hashCode() + (this.f3682c.hashCode() * 31)) * 31);
    }
}
