package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", f = "Slider.kt", l = {1739}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RangeSliderLogic$captureThumb$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RangeSliderLogic f10759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10760c;
    public final /* synthetic */ Interaction d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeSliderLogic$captureThumb$1(RangeSliderLogic rangeSliderLogic, boolean z2, Interaction interaction, g gVar) {
        super(2, gVar);
        this.f10759b = rangeSliderLogic;
        this.f10760c = z2;
        this.d = interaction;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new RangeSliderLogic$captureThumb$1(this.f10759b, this.f10760c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((RangeSliderLogic$captureThumb$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f10758a;
        if (i2 == 0) {
            q.m(obj);
            RangeSliderLogic rangeSliderLogic = this.f10759b;
            MutableInteractionSource mutableInteractionSource = this.f10760c ? rangeSliderLogic.f10756b : rangeSliderLogic.f10757c;
            this.f10758a = 1;
            if (mutableInteractionSource.a(this.d, this) == aVar) {
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
