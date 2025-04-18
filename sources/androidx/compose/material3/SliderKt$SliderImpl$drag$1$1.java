package androidx.compose.material3;

import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SliderKt$SliderImpl$drag$1$1 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderState f11439a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$drag$1$1(SliderState sliderState, g gVar) {
        super(3, gVar);
        this.f11439a = sliderState;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        SliderKt$SliderImpl$drag$1$1 sliderKt$SliderImpl$drag$1$1 = new SliderKt$SliderImpl$drag$1$1(this.f11439a, (g) obj3);
        b0 b0Var = b0.f30125a;
        sliderKt$SliderImpl$drag$1$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        kotlin.jvm.internal.q.m(obj);
        ((SliderState$gestureEndAction$1) this.f11439a.f11496l).invoke();
        return b0.f30125a;
    }
}
