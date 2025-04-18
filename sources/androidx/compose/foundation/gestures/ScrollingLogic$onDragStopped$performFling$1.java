package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", l = {745, 748, 751}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ScrollingLogic$onDragStopped$performFling$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public long f3503a;

    /* renamed from: b, reason: collision with root package name */
    public int f3504b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f3505c;
    public final /* synthetic */ ScrollingLogic d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, g gVar) {
        super(2, gVar);
        this.d = scrollingLogic;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.d, gVar);
        scrollingLogic$onDragStopped$performFling$1.f3505c = ((Velocity) obj).f17502a;
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(new Velocity(((Velocity) obj).f17502a), (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            i0.a r6 = i0.a.f30806a
            int r0 = r11.f3504b
            r1 = 3
            r2 = 2
            r3 = 1
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r11.d
            if (r0 == 0) goto L33
            if (r0 == r3) goto L2c
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1b
            long r0 = r11.f3503a
            long r2 = r11.f3505c
            kotlin.jvm.internal.q.m(r12)
            r9 = r0
            r0 = r12
            goto L76
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            long r2 = r11.f3503a
            long r7 = r11.f3505c
            kotlin.jvm.internal.q.m(r12)
            r0 = r12
            goto L5b
        L2c:
            long r7 = r11.f3505c
            kotlin.jvm.internal.q.m(r12)
            r0 = r12
            goto L45
        L33:
            kotlin.jvm.internal.q.m(r12)
            long r7 = r11.f3505c
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = r4.f3485f
            r11.f3505c = r7
            r11.f3504b = r3
            java.lang.Object r0 = r0.b(r7, r11)
            if (r0 != r6) goto L45
            return r6
        L45:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r9 = r0.f17502a
            long r9 = androidx.compose.ui.unit.Velocity.d(r7, r9)
            r11.f3505c = r7
            r11.f3503a = r9
            r11.f3504b = r2
            java.lang.Object r0 = r4.b(r9, r11)
            if (r0 != r6) goto L5a
            return r6
        L5a:
            r2 = r9
        L5b:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r9 = r0.f17502a
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = r4.f3485f
            long r2 = androidx.compose.ui.unit.Velocity.d(r2, r9)
            r11.f3505c = r7
            r11.f3503a = r9
            r11.f3504b = r1
            r1 = r2
            r3 = r9
            r5 = r11
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r6) goto L75
            return r6
        L75:
            r2 = r7
        L76:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r0 = r0.f17502a
            long r0 = androidx.compose.ui.unit.Velocity.d(r9, r0)
            long r0 = androidx.compose.ui.unit.Velocity.d(r2, r0)
            androidx.compose.ui.unit.Velocity r2 = new androidx.compose.ui.unit.Velocity
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
