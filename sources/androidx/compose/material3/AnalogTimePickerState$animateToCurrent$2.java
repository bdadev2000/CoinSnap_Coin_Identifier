package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;

@e(c = "androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2", f = "TimePicker.kt", l = {738}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AnalogTimePickerState$animateToCurrent$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f7574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f7575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$animateToCurrent$2(AnalogTimePickerState analogTimePickerState, float f2, g gVar) {
        super(1, gVar);
        this.f7575b = analogTimePickerState;
        this.f7576c = f2;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new AnalogTimePickerState$animateToCurrent$2(this.f7575b, this.f7576c, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((AnalogTimePickerState$animateToCurrent$2) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7574a;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f7575b.d;
            Float f2 = new Float(this.f7576c);
            SpringSpec c2 = AnimationSpecKt.c(1.0f, 700.0f, null, 4);
            this.f7574a = 1;
            obj = Animatable.c(animatable, f2, c2, null, null, this, 12);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj;
    }
}
