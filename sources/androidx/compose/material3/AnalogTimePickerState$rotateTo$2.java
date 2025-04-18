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

@e(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", l = {803, 806}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AnalogTimePickerState$rotateTo$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f7580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f7581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7582c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$rotateTo$2(AnalogTimePickerState analogTimePickerState, float f2, boolean z2, g gVar) {
        super(1, gVar);
        this.f7581b = analogTimePickerState;
        this.f7582c = f2;
        this.d = z2;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new AnalogTimePickerState$rotateTo$2(this.f7581b, this.f7582c, this.d, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((AnalogTimePickerState$rotateTo$2) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7580a;
        if (i2 == 0) {
            q.m(obj);
            AnalogTimePickerState analogTimePickerState = this.f7581b;
            boolean a2 = TimePickerSelectionMode.a(analogTimePickerState.f7571a.c(), 0);
            TimePickerState timePickerState = analogTimePickerState.f7571a;
            float f2 = this.f7582c;
            if (a2) {
                double d = 0.2617994f + 1.5707963267948966d;
                double d2 = 0.5235988f;
                float f3 = ((((int) ((f2 + d) / d2)) % 12) % 12) * 0.5235988f;
                analogTimePickerState.f7572b = f3;
                timePickerState.d(((((int) ((f3 + d) / d2)) % 12) % 12) + (timePickerState.i() ? 12 : 0));
            } else {
                double d3 = 0.10471976f;
                float f4 = (((int) ((f2 + r3) / d3)) % 60) * 0.10471976f;
                analogTimePickerState.f7573c = f4;
                timePickerState.e(((int) ((f4 + (0.05235988f + 1.5707963267948966d)) / d3)) % 60);
            }
            if (this.d) {
                float f5 = f2 + 1.5707964f;
                if (f5 < 0.0f) {
                    f5 += 6.2831855f;
                }
                float j2 = analogTimePickerState.j(f5);
                Animatable animatable = analogTimePickerState.d;
                Float f6 = new Float(j2);
                SpringSpec c2 = AnimationSpecKt.c(1.0f, 700.0f, null, 4);
                this.f7580a = 2;
                Object c3 = Animatable.c(animatable, f6, c2, null, null, this, 12);
                return c3 == aVar ? aVar : c3;
            }
            Animatable animatable2 = analogTimePickerState.d;
            float f7 = f2 + 1.5707964f;
            if (f7 < 0.0f) {
                f7 += 6.2831855f;
            }
            Float f8 = new Float(f7);
            this.f7580a = 1;
            if (animatable2.e(f8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                return obj;
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
