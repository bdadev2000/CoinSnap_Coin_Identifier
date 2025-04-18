package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.node.TraversableNodeKt;
import d0.b0;
import h0.g;
import i0.a;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ScrollingLogic {

    /* renamed from: a, reason: collision with root package name */
    public ScrollableState f3482a;

    /* renamed from: b, reason: collision with root package name */
    public OverscrollEffect f3483b;

    /* renamed from: c, reason: collision with root package name */
    public FlingBehavior f3484c;
    public Orientation d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public NestedScrollDispatcher f3485f;

    /* renamed from: g, reason: collision with root package name */
    public int f3486g = 1;

    /* renamed from: h, reason: collision with root package name */
    public ScrollScope f3487h = ScrollableKt.f3433a;

    /* renamed from: i, reason: collision with root package name */
    public final ScrollingLogic$nestedScrollScope$1 f3488i = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        public final long a(long j2) {
            ScrollingLogic scrollingLogic = ScrollingLogic.this;
            return ScrollingLogic.a(scrollingLogic, scrollingLogic.f3487h, j2, 1);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        public final long b(int i2, long j2) {
            ScrollingLogic scrollingLogic = ScrollingLogic.this;
            scrollingLogic.f3486g = i2;
            OverscrollEffect overscrollEffect = scrollingLogic.f3483b;
            return (overscrollEffect == null || !(scrollingLogic.f3482a.d() || scrollingLogic.f3482a.c())) ? ScrollingLogic.a(scrollingLogic, scrollingLogic.f3487h, j2, i2) : overscrollEffect.a(j2, scrollingLogic.f3486g, scrollingLogic.f3489j);
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public final l f3489j = new ScrollingLogic$performScrollForOverscroll$1(this);

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, ScrollableState scrollableState, NestedScrollDispatcher nestedScrollDispatcher, boolean z2) {
        this.f3482a = scrollableState;
        this.f3483b = overscrollEffect;
        this.f3484c = flingBehavior;
        this.d = orientation;
        this.e = z2;
        this.f3485f = nestedScrollDispatcher;
    }

    public static final long a(ScrollingLogic scrollingLogic, ScrollScope scrollScope, long j2, int i2) {
        long j3;
        NestedScrollNode nestedScrollNode = scrollingLogic.f3485f.f15519a;
        NestedScrollNode nestedScrollNode2 = null;
        NestedScrollNode nestedScrollNode3 = (nestedScrollNode == null || !nestedScrollNode.f14699n) ? null : (NestedScrollNode) TraversableNodeKt.b(nestedScrollNode);
        long j4 = 0;
        long g02 = nestedScrollNode3 != null ? nestedScrollNode3.g0(i2, j2) : 0L;
        long j5 = Offset.j(j2, g02);
        long d = scrollingLogic.d(scrollingLogic.g(scrollScope.a(scrollingLogic.f(scrollingLogic.d(Offset.b(j5, 0.0f, scrollingLogic.d == Orientation.f3395b ? 1 : 2))))));
        long j6 = Offset.j(j5, d);
        NestedScrollNode nestedScrollNode4 = scrollingLogic.f3485f.f15519a;
        if (nestedScrollNode4 != null && nestedScrollNode4.f14699n) {
            nestedScrollNode2 = (NestedScrollNode) TraversableNodeKt.b(nestedScrollNode4);
        }
        NestedScrollNode nestedScrollNode5 = nestedScrollNode2;
        if (nestedScrollNode5 != null) {
            j3 = d;
            j4 = nestedScrollNode5.E0(i2, d, j6);
        } else {
            j3 = d;
        }
        return Offset.k(Offset.k(g02, j3), j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r12, h0.g r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f3491b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.e0 r12 = r0.f3490a
            kotlin.jvm.internal.q.m(r14)
            goto L53
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            kotlin.jvm.internal.q.m(r14)
            kotlin.jvm.internal.e0 r14 = new kotlin.jvm.internal.e0
            r14.<init>()
            r14.f30927a = r12
            androidx.compose.foundation.MutatePriority r2 = androidx.compose.foundation.MutatePriority.f2811a
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r10 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.f3490a = r14
            r0.d = r3
            java.lang.Object r12 = r11.e(r2, r10, r0)
            if (r12 != r1) goto L52
            return r1
        L52:
            r12 = r14
        L53:
            long r12 = r12.f30927a
            androidx.compose.ui.unit.Velocity r14 = new androidx.compose.ui.unit.Velocity
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.b(long, h0.g):java.lang.Object");
    }

    public final float c(float f2) {
        return this.e ? f2 * (-1) : f2;
    }

    public final long d(long j2) {
        return this.e ? Offset.l(j2, -1.0f) : j2;
    }

    public final Object e(MutatePriority mutatePriority, p pVar, g gVar) {
        Object b2 = this.f3482a.b(mutatePriority, new ScrollingLogic$scroll$2(this, null, pVar), gVar);
        return b2 == a.f30806a ? b2 : b0.f30125a;
    }

    public final float f(long j2) {
        return this.d == Orientation.f3395b ? Offset.g(j2) : Offset.h(j2);
    }

    public final long g(float f2) {
        if (f2 == 0.0f) {
            return 0L;
        }
        return this.d == Orientation.f3395b ? OffsetKt.a(f2, 0.0f) : OffsetKt.a(0.0f, f2);
    }
}
