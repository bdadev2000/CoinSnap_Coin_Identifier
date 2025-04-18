package androidx.compose.foundation.gestures;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {804}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ScrollingLogic$scroll$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3507a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f3509c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$scroll$2(ScrollingLogic scrollingLogic, g gVar, p pVar) {
        super(2, gVar);
        this.f3509c = scrollingLogic;
        this.d = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScrollingLogic$scroll$2 scrollingLogic$scroll$2 = new ScrollingLogic$scroll$2(this.f3509c, gVar, this.d);
        scrollingLogic$scroll$2.f3508b = obj;
        return scrollingLogic$scroll$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$scroll$2) create((ScrollScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3507a;
        if (i2 == 0) {
            q.m(obj);
            ScrollScope scrollScope = (ScrollScope) this.f3508b;
            ScrollingLogic scrollingLogic = this.f3509c;
            scrollingLogic.f3487h = scrollScope;
            ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = scrollingLogic.f3488i;
            this.f3507a = 1;
            if (this.d.invoke(scrollingLogic$nestedScrollScope$1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
