package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.unit.IntOffset;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {Opcodes.DREM}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LazyLayoutItemAnimation$cancelPlacementAnimation$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemAnimation f4745b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$cancelPlacementAnimation$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, g gVar) {
        super(2, gVar);
        this.f4745b = lazyLayoutItemAnimation;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this.f4745b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$cancelPlacementAnimation$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f4744a;
        LazyLayoutItemAnimation lazyLayoutItemAnimation = this.f4745b;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = lazyLayoutItemAnimation.f4721o;
            IntOffset intOffset = new IntOffset(0L);
            this.f4744a = 1;
            if (animatable.e(intOffset, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        int i3 = LazyLayoutItemAnimation.f4708t;
        lazyLayoutItemAnimation.h(0L);
        lazyLayoutItemAnimation.g(false);
        return b0.f30125a;
    }
}
