package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {231}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LazyLayoutItemAnimation$release$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemAnimation f4747b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$release$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, g gVar) {
        super(2, gVar);
        this.f4747b = lazyLayoutItemAnimation;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyLayoutItemAnimation$release$1(this.f4747b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$release$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f4746a;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f4747b.f4721o;
            this.f4746a = 1;
            if (animatable.f(this) == aVar) {
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
