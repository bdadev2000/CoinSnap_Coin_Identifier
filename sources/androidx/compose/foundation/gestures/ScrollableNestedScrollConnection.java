package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollableNestedScrollConnection implements NestedScrollConnection {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollingLogic f3447a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3448b;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z2) {
        this.f3447a = scrollingLogic;
        this.f3448b = z2;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long E0(int i2, long j2, long j3) {
        if (!this.f3448b) {
            return 0L;
        }
        ScrollingLogic scrollingLogic = this.f3447a;
        if (scrollingLogic.f3482a.a()) {
            return 0L;
        }
        return scrollingLogic.g(scrollingLogic.c(scrollingLogic.f3482a.e(scrollingLogic.c(scrollingLogic.f(j3)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h1(long r3, long r5, h0.g r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r3
            int r4 = r3.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.d = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.f3450b
            i0.a r7 = i0.a.f30806a
            int r0 = r3.d
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r5 = r3.f3449a
            kotlin.jvm.internal.q.m(r4)
            goto L45
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            kotlin.jvm.internal.q.m(r4)
            boolean r4 = r2.f3448b
            if (r4 == 0) goto L4e
            r3.f3449a = r5
            r3.d = r1
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r2.f3447a
            java.lang.Object r4 = r4.b(r5, r3)
            if (r4 != r7) goto L45
            return r7
        L45:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r3 = r4.f17502a
            long r3 = androidx.compose.ui.unit.Velocity.d(r5, r3)
            goto L50
        L4e:
            r3 = 0
        L50:
            androidx.compose.ui.unit.Velocity r5 = new androidx.compose.ui.unit.Velocity
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.h1(long, long, h0.g):java.lang.Object");
    }
}
