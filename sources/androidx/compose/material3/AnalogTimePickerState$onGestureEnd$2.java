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

@e(c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", f = "TimePicker.kt", l = {789}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AnalogTimePickerState$onGestureEnd$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f7577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f7578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$onGestureEnd$2(AnalogTimePickerState analogTimePickerState, float f2, g gVar) {
        super(1, gVar);
        this.f7578b = analogTimePickerState;
        this.f7579c = f2;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new AnalogTimePickerState$onGestureEnd$2(this.f7578b, this.f7579c, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((AnalogTimePickerState$onGestureEnd$2) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7577a;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f7578b.d;
            Float f2 = new Float(this.f7579c);
            SpringSpec c2 = AnimationSpecKt.c(0.0f, 0.0f, null, 7);
            this.f7577a = 1;
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
