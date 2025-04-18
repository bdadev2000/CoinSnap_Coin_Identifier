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
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {Opcodes.MONITOREXIT, Opcodes.MULTIANEWARRAY}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LazyLayoutItemAnimation$animateAppearance$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemAnimation f4729c;
    public final /* synthetic */ FiniteAnimationSpec d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GraphicsLayer f4730f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GraphicsLayer f4731a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutItemAnimation f4732b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GraphicsLayer graphicsLayer, LazyLayoutItemAnimation lazyLayoutItemAnimation) {
            super(1);
            this.f4731a = graphicsLayer;
            this.f4732b = lazyLayoutItemAnimation;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            this.f4731a.g(((Number) ((Animatable) obj).d()).floatValue());
            this.f4732b.f4711c.invoke();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$2(boolean z2, LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, GraphicsLayer graphicsLayer, g gVar) {
        super(2, gVar);
        this.f4728b = z2;
        this.f4729c = lazyLayoutItemAnimation;
        this.d = finiteAnimationSpec;
        this.f4730f = graphicsLayer;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.f4728b, this.f4729c, this.d, this.f4730f, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f4727a;
        LazyLayoutItemAnimation lazyLayoutItemAnimation = this.f4729c;
        try {
            if (i2 == 0) {
                q.m(obj);
                if (this.f4728b) {
                    Animatable animatable = lazyLayoutItemAnimation.f4722p;
                    Float f2 = new Float(0.0f);
                    this.f4727a = 1;
                    if (animatable.e(f2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                    int i3 = LazyLayoutItemAnimation.f4708t;
                    lazyLayoutItemAnimation.e(false);
                    return b0.f30125a;
                }
                q.m(obj);
            }
            Animatable animatable2 = lazyLayoutItemAnimation.f4722p;
            Float f3 = new Float(1.0f);
            FiniteAnimationSpec finiteAnimationSpec = this.d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4730f, lazyLayoutItemAnimation);
            this.f4727a = 2;
            if (Animatable.c(animatable2, f3, finiteAnimationSpec, null, anonymousClass1, this, 4) == aVar) {
                return aVar;
            }
            int i32 = LazyLayoutItemAnimation.f4708t;
            lazyLayoutItemAnimation.e(false);
            return b0.f30125a;
        } catch (Throwable th) {
            int i4 = LazyLayoutItemAnimation.f4708t;
            lazyLayoutItemAnimation.e(false);
            throw th;
        }
    }
}
