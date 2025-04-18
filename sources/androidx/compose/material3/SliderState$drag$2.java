package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.SliderState$drag$2", f = "Slider.kt", l = {1972}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SliderState$drag$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f11501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderState f11502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f11503c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderState$drag$2(SliderState sliderState, MutatePriority mutatePriority, p pVar, g gVar) {
        super(2, gVar);
        this.f11502b = sliderState;
        this.f11503c = mutatePriority;
        this.d = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SliderState$drag$2(this.f11502b, this.f11503c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderState$drag$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f11501a;
        SliderState sliderState = this.f11502b;
        if (i2 == 0) {
            q.m(obj);
            sliderState.f11495k.setValue(Boolean.TRUE);
            this.f11501a = 1;
            if (sliderState.f11500p.c(sliderState.f11499o, this.f11503c, this.d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        sliderState.f11495k.setValue(Boolean.FALSE);
        return b0.f30125a;
    }
}
