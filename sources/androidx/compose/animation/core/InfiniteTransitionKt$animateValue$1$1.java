package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class InfiniteTransitionKt$animateValue$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition.TransitionAnimationState f2124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2125c;
    public final /* synthetic */ InfiniteRepeatableSpec d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$1$1(Number number, InfiniteTransition.TransitionAnimationState transitionAnimationState, Number number2, InfiniteRepeatableSpec infiniteRepeatableSpec) {
        super(0);
        this.f2123a = number;
        this.f2124b = transitionAnimationState;
        this.f2125c = number2;
        this.d = infiniteRepeatableSpec;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (p0.a.g(r8.f2125c, r0.f2102b) == false) goto L6;
     */
    @Override // q0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            r8 = this;
            androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState r0 = r8.f2124b
            java.lang.Object r1 = r0.f2101a
            java.lang.Object r2 = r8.f2123a
            boolean r1 = p0.a.g(r2, r1)
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.f2102b
            java.lang.Object r2 = r8.f2125c
            boolean r1 = p0.a.g(r2, r1)
            if (r1 != 0) goto L3c
        L16:
            java.lang.Object r5 = r8.f2123a
            java.lang.Object r6 = r8.f2125c
            androidx.compose.animation.core.InfiniteRepeatableSpec r3 = r8.d
            r0.f2101a = r5
            r0.f2102b = r6
            r0.f2104f = r3
            androidx.compose.animation.core.TargetBasedAnimation r1 = new androidx.compose.animation.core.TargetBasedAnimation
            androidx.compose.animation.core.TwoWayConverter r4 = r0.f2103c
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r0.f2105g = r1
            androidx.compose.animation.core.InfiniteTransition r1 = androidx.compose.animation.core.InfiniteTransition.this
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f2099b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setValue(r2)
            r1 = 0
            r0.f2106h = r1
            r1 = 1
            r0.f2107i = r1
        L3c:
            d0.b0 r0 = d0.b0.f30125a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1$1.invoke():java.lang.Object");
    }
}
