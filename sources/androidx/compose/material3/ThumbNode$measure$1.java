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

@e(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", l = {265}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ThumbNode$measure$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f12297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThumbNode f12298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f12299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$measure$1(ThumbNode thumbNode, float f2, g gVar) {
        super(2, gVar);
        this.f12298b = thumbNode;
        this.f12299c = f2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ThumbNode$measure$1(this.f12298b, this.f12299c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ThumbNode$measure$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12297a;
        if (i2 == 0) {
            q.m(obj);
            ThumbNode thumbNode = this.f12298b;
            Animatable animatable = thumbNode.f12294s;
            if (animatable != null) {
                Float f2 = new Float(this.f12299c);
                AnimationSpec animationSpec = thumbNode.f12292q ? SwitchKt.f11691f : SwitchKt.f11692g;
                this.f12297a = 1;
                obj = Animatable.c(animatable, f2, animationSpec, null, null, this, 12);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return b0.f30125a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        return b0.f30125a;
    }
}
