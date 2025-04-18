package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.unit.Velocity;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {358}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ScrollableNode$onDragStopped$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScrollableNode f3461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f3462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onDragStopped$1(ScrollableNode scrollableNode, long j2, g gVar) {
        super(2, gVar);
        this.f3461b = scrollableNode;
        this.f3462c = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ScrollableNode$onDragStopped$1(this.f3461b, this.f3462c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$onDragStopped$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        a aVar = a.f30806a;
        int i2 = this.f3460a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            ScrollingLogic scrollingLogic = this.f3461b.D;
            this.f3460a = 1;
            Orientation orientation = scrollingLogic.d;
            Orientation orientation2 = Orientation.f3395b;
            long j2 = this.f3462c;
            long a2 = orientation == orientation2 ? Velocity.a(j2, 0.0f, 0.0f, 1) : Velocity.a(j2, 0.0f, 0.0f, 2);
            ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(scrollingLogic, null);
            OverscrollEffect overscrollEffect = scrollingLogic.f3483b;
            if (overscrollEffect == null || (!scrollingLogic.f3482a.d() && !scrollingLogic.f3482a.c()) ? (invoke = scrollingLogic$onDragStopped$performFling$1.invoke(new Velocity(a2), this)) != aVar : (invoke = overscrollEffect.d(a2, scrollingLogic$onDragStopped$performFling$1, this)) != aVar) {
                invoke = b0Var;
            }
            if (invoke == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0Var;
    }
}
