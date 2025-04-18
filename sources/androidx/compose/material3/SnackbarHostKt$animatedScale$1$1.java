package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", l = {432}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SnackbarHostKt$animatedScale$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f11531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f11532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11533c;
    public final /* synthetic */ AnimationSpec d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedScale$1$1(Animatable animatable, boolean z2, AnimationSpec animationSpec, g gVar) {
        super(2, gVar);
        this.f11532b = animatable;
        this.f11533c = z2;
        this.d = animationSpec;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SnackbarHostKt$animatedScale$1$1(this.f11532b, this.f11533c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SnackbarHostKt$animatedScale$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f11531a;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f11532b;
            Float f2 = new Float(this.f11533c ? 1.0f : 0.8f);
            AnimationSpec animationSpec = this.d;
            this.f11531a = 1;
            if (Animatable.c(animatable, f2, animationSpec, null, null, this, 12) == aVar) {
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
