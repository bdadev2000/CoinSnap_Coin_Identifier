package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PagerWrapperFlingBehavior implements FlingBehavior {

    /* renamed from: a, reason: collision with root package name */
    public final TargetedFlingBehavior f5317a;

    /* renamed from: b, reason: collision with root package name */
    public final PagerState f5318b;

    public PagerWrapperFlingBehavior(TargetedFlingBehavior targetedFlingBehavior, PagerState pagerState) {
        this.f5317a = targetedFlingBehavior;
        this.f5318b = pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1 r5, float r6, h0.g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) r0
            int r1 = r0.f5321c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5321c = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f5319a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f5321c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.jvm.internal.q.m(r7)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.jvm.internal.q.m(r7)
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$2$1 r7 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$2$1
            r7.<init>(r4, r5)
            r0.f5321c = r3
            androidx.compose.foundation.gestures.TargetedFlingBehavior r2 = r4.f5317a
            java.lang.Object r7 = r2.b(r5, r6, r7, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.a(androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1, float, h0.g):java.lang.Object");
    }
}
