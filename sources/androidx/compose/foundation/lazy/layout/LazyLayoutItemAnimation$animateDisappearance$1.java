package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {216}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LazyLayoutItemAnimation$animateDisappearance$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemAnimation f4734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f4735c;
    public final /* synthetic */ GraphicsLayer d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GraphicsLayer f4736a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutItemAnimation f4737b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GraphicsLayer graphicsLayer, LazyLayoutItemAnimation lazyLayoutItemAnimation) {
            super(1);
            this.f4736a = graphicsLayer;
            this.f4737b = lazyLayoutItemAnimation;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            this.f4736a.g(((Number) ((Animatable) obj).d()).floatValue());
            this.f4737b.f4711c.invoke();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateDisappearance$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, GraphicsLayer graphicsLayer, g gVar) {
        super(2, gVar);
        this.f4734b = lazyLayoutItemAnimation;
        this.f4735c = finiteAnimationSpec;
        this.d = graphicsLayer;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.f4734b, this.f4735c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animateDisappearance$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f4733a;
        LazyLayoutItemAnimation lazyLayoutItemAnimation = this.f4734b;
        try {
            if (i2 == 0) {
                q.m(obj);
                Animatable animatable = lazyLayoutItemAnimation.f4722p;
                Float f2 = new Float(0.0f);
                FiniteAnimationSpec finiteAnimationSpec = this.f4735c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, lazyLayoutItemAnimation);
                this.f4733a = 1;
                if (Animatable.c(animatable, f2, finiteAnimationSpec, null, anonymousClass1, this, 4) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            lazyLayoutItemAnimation.f4717k.setValue(Boolean.TRUE);
            lazyLayoutItemAnimation.f(false);
            return b0.f30125a;
        } catch (Throwable th) {
            int i3 = LazyLayoutItemAnimation.f4708t;
            lazyLayoutItemAnimation.f(false);
            throw th;
        }
    }
}
