package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {782}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public ScrollingLogic f3493a;

    /* renamed from: b, reason: collision with root package name */
    public e0 f3494b;

    /* renamed from: c, reason: collision with root package name */
    public long f3495c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f3497g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0 f3498h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f3499i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, e0 e0Var, long j2, g gVar) {
        super(2, gVar);
        this.f3497g = scrollingLogic;
        this.f3498h = e0Var;
        this.f3499i = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.f3497g, this.f3498h, this.f3499i, gVar);
        scrollingLogic$doFlingAnimation$2.f3496f = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) create((NestedScrollScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        final ScrollingLogic scrollingLogic;
        e0 e0Var;
        long j2;
        ScrollingLogic scrollingLogic2;
        a aVar = a.f30806a;
        int i2 = this.d;
        Orientation orientation = Orientation.f3395b;
        if (i2 == 0) {
            q.m(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.f3496f;
            scrollingLogic = this.f3497g;
            ?? r1 = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public final float a(float f2) {
                    ScrollingLogic scrollingLogic3 = scrollingLogic;
                    return scrollingLogic3.c(scrollingLogic3.f(nestedScrollScope.b(2, scrollingLogic3.d(scrollingLogic3.g(f2)))));
                }
            };
            FlingBehavior flingBehavior = scrollingLogic.f3484c;
            e0Var = this.f3498h;
            long j3 = e0Var.f30927a;
            Orientation orientation2 = scrollingLogic.d;
            long j4 = this.f3499i;
            float c2 = scrollingLogic.c(orientation2 == orientation ? Velocity.b(j4) : Velocity.c(j4));
            this.f3496f = scrollingLogic;
            this.f3493a = scrollingLogic;
            this.f3494b = e0Var;
            this.f3495c = j3;
            this.d = 1;
            obj = flingBehavior.a(r1, c2, this);
            if (obj == aVar) {
                return aVar;
            }
            j2 = j3;
            scrollingLogic2 = scrollingLogic;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.f3495c;
            e0Var = this.f3494b;
            scrollingLogic = this.f3493a;
            scrollingLogic2 = (ScrollingLogic) this.f3496f;
            q.m(obj);
        }
        float c3 = scrollingLogic2.c(((Number) obj).floatValue());
        e0Var.f30927a = scrollingLogic.d == orientation ? Velocity.a(j2, c3, 0.0f, 2) : Velocity.a(j2, 0.0f, c3, 1);
        return b0.f30125a;
    }
}
