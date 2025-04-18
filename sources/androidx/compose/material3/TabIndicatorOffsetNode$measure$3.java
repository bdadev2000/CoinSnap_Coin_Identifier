package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.unit.Dp;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", f = "TabRow.kt", l = {916}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TabIndicatorOffsetNode$measure$3 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f11722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f11723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f11724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetNode$measure$3(Animatable animatable, float f2, g gVar) {
        super(2, gVar);
        this.f11723b = animatable;
        this.f11724c = f2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TabIndicatorOffsetNode$measure$3(this.f11723b, this.f11724c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TabIndicatorOffsetNode$measure$3) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f11722a;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f11723b;
            Dp dp = new Dp(this.f11724c);
            TweenSpec tweenSpec = TabRowKt.f11820c;
            this.f11722a = 1;
            if (Animatable.c(animatable, dp, tweenSpec, null, null, this, 12) == aVar) {
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
