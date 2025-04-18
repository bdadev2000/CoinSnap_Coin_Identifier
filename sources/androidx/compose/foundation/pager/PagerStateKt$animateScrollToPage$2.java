package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
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
@e(c = "androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2", f = "PagerState.kt", l = {953}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PagerStateKt$animateScrollToPage$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5309a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f5311c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutAnimateScrollScope f5312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f5313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f5314h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass3 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f5315a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f5316b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c0 c0Var, ScrollScope scrollScope) {
            super(2);
            this.f5315a = c0Var;
            this.f5316b = scrollScope;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            float floatValue = ((Number) obj).floatValue();
            ((Number) obj2).floatValue();
            c0 c0Var = this.f5315a;
            c0Var.f30922a += this.f5316b.a(floatValue - c0Var.f30922a);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerStateKt$animateScrollToPage$2(float f2, int i2, AnimationSpec animationSpec, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, g gVar, p pVar) {
        super(2, gVar);
        this.f5311c = pVar;
        this.d = i2;
        this.f5312f = lazyLayoutAnimateScrollScope;
        this.f5313g = f2;
        this.f5314h = animationSpec;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        p pVar = this.f5311c;
        PagerStateKt$animateScrollToPage$2 pagerStateKt$animateScrollToPage$2 = new PagerStateKt$animateScrollToPage$2(this.f5313g, this.d, this.f5314h, this.f5312f, gVar, pVar);
        pagerStateKt$animateScrollToPage$2.f5310b = obj;
        return pagerStateKt$animateScrollToPage$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PagerStateKt$animateScrollToPage$2) create((ScrollScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        int i2;
        a aVar = a.f30806a;
        int i3 = this.f5309a;
        if (i3 == 0) {
            q.m(obj);
            ScrollScope scrollScope = (ScrollScope) this.f5310b;
            int i4 = this.d;
            this.f5311c.invoke(scrollScope, new Integer(i4));
            LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope = this.f5312f;
            boolean z2 = i4 > lazyLayoutAnimateScrollScope.e();
            int a2 = (lazyLayoutAnimateScrollScope.a() - lazyLayoutAnimateScrollScope.e()) + 1;
            if (((z2 && i4 > lazyLayoutAnimateScrollScope.a()) || (!z2 && i4 < lazyLayoutAnimateScrollScope.e())) && Math.abs(i4 - lazyLayoutAnimateScrollScope.e()) >= 3) {
                if (z2) {
                    int e = i2;
                    lazyLayoutAnimateScrollScope.b(e, 0);
                } else {
                    int e2 = i2;
                    lazyLayoutAnimateScrollScope.b(e2, 0);
                }
            }
            float c2 = lazyLayoutAnimateScrollScope.c(i4) + this.f5313g;
            ?? obj2 = new Object();
            AnimationSpec animationSpec = this.f5314h;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(obj2, scrollScope);
            this.f5309a = 1;
            if (SuspendAnimationKt.c(0.0f, c2, animationSpec, anonymousClass3, this, 4) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
