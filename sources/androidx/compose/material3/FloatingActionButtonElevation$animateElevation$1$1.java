package androidx.compose.material3;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", l = {538}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FloatingActionButtonElevation$animateElevation$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButtonElevationAnimatable f9427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButtonElevation f9428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$1$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, FloatingActionButtonElevation floatingActionButtonElevation, g gVar) {
        super(2, gVar);
        this.f9427b = floatingActionButtonElevationAnimatable;
        this.f9428c = floatingActionButtonElevation;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new FloatingActionButtonElevation$animateElevation$1$1(this.f9427b, this.f9428c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FloatingActionButtonElevation$animateElevation$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f9426a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            FloatingActionButtonElevation floatingActionButtonElevation = this.f9428c;
            float f2 = floatingActionButtonElevation.f9423a;
            float f3 = floatingActionButtonElevation.f9424b;
            float f4 = floatingActionButtonElevation.d;
            float f5 = floatingActionButtonElevation.f9425c;
            this.f9426a = 1;
            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.f9427b;
            floatingActionButtonElevationAnimatable.f9438a = f2;
            floatingActionButtonElevationAnimatable.f9439b = f3;
            floatingActionButtonElevationAnimatable.f9440c = f4;
            floatingActionButtonElevationAnimatable.d = f5;
            Object b2 = floatingActionButtonElevationAnimatable.b(this);
            if (b2 != aVar) {
                b2 = b0Var;
            }
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0Var;
    }
}
