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

@e(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {422}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SnackbarHostKt$animatedOpacity$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f11527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f11528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11529c;
    public final /* synthetic */ AnimationSpec d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0.a f11530f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedOpacity$2$1(Animatable animatable, boolean z2, AnimationSpec animationSpec, q0.a aVar, g gVar) {
        super(2, gVar);
        this.f11528b = animatable;
        this.f11529c = z2;
        this.d = animationSpec;
        this.f11530f = aVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SnackbarHostKt$animatedOpacity$2$1(this.f11528b, this.f11529c, this.d, this.f11530f, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SnackbarHostKt$animatedOpacity$2$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f11527a;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f11528b;
            Float f2 = new Float(this.f11529c ? 1.0f : 0.0f);
            AnimationSpec animationSpec = this.d;
            this.f11527a = 1;
            if (Animatable.c(animatable, f2, animationSpec, null, null, this, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        this.f11530f.invoke();
        return b0.f30125a;
    }
}
