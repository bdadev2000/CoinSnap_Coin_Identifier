package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
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
@e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ScrollExtensionsKt$animateScrollBy$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3412a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f3414c;
    public final /* synthetic */ AnimationSpec d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f3415f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f3416a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f3417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c0 c0Var, ScrollScope scrollScope) {
            super(2);
            this.f3416a = c0Var;
            this.f3417b = scrollScope;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            float floatValue = ((Number) obj).floatValue();
            ((Number) obj2).floatValue();
            c0 c0Var = this.f3416a;
            float f2 = c0Var.f30922a;
            c0Var.f30922a = this.f3417b.a(floatValue - f2) + f2;
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f2, AnimationSpec animationSpec, g gVar, c0 c0Var) {
        super(2, gVar);
        this.f3414c = f2;
        this.d = animationSpec;
        this.f3415f = c0Var;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.f3414c, this.d, gVar, this.f3415f);
        scrollExtensionsKt$animateScrollBy$2.f3413b = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create((ScrollScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3412a;
        if (i2 == 0) {
            q.m(obj);
            ScrollScope scrollScope = (ScrollScope) this.f3413b;
            float f2 = this.f3414c;
            AnimationSpec animationSpec = this.d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3415f, scrollScope);
            this.f3412a = 1;
            if (SuspendAnimationKt.c(0.0f, f2, animationSpec, anonymousClass1, this, 4) == aVar) {
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
