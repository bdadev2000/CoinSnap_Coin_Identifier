package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {967}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ScrollableKt$semanticsScrollBy$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3440a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f3442c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f3443f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f3444a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScrollingLogic f3445b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NestedScrollScope f3446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c0 c0Var, ScrollingLogic scrollingLogic, NestedScrollScope nestedScrollScope) {
            super(2);
            this.f3444a = c0Var;
            this.f3445b = scrollingLogic;
            this.f3446c = nestedScrollScope;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            float floatValue = ((Number) obj).floatValue();
            ((Number) obj2).floatValue();
            c0 c0Var = this.f3444a;
            float f2 = floatValue - c0Var.f30922a;
            ScrollingLogic scrollingLogic = this.f3445b;
            c0Var.f30922a += scrollingLogic.c(scrollingLogic.f(this.f3446c.a(scrollingLogic.g(scrollingLogic.c(f2)))));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j2, c0 c0Var, g gVar) {
        super(2, gVar);
        this.f3442c = scrollingLogic;
        this.d = j2;
        this.f3443f = c0Var;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.f3442c, this.d, this.f3443f, gVar);
        scrollableKt$semanticsScrollBy$2.f3441b = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableKt$semanticsScrollBy$2) create((NestedScrollScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3440a;
        if (i2 == 0) {
            q.m(obj);
            NestedScrollScope nestedScrollScope = (NestedScrollScope) this.f3441b;
            ScrollingLogic scrollingLogic = this.f3442c;
            float f2 = scrollingLogic.f(this.d);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3443f, scrollingLogic, nestedScrollScope);
            this.f3440a = 1;
            if (SuspendAnimationKt.c(0.0f, f2, null, anonymousClass1, this, 12) == aVar) {
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
