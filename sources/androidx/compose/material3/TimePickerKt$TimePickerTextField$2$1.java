package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TimePickerKt$TimePickerTextField$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f12452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$2$1(TimePickerState timePickerState, int i2, FocusRequester focusRequester, g gVar) {
        super(2, gVar);
        this.f12450a = timePickerState;
        this.f12451b = i2;
        this.f12452c = focusRequester;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TimePickerKt$TimePickerTextField$2$1(this.f12450a, this.f12451b, this.f12452c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        TimePickerKt$TimePickerTextField$2$1 timePickerKt$TimePickerTextField$2$1 = (TimePickerKt$TimePickerTextField$2$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        timePickerKt$TimePickerTextField$2$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        if (TimePickerSelectionMode.a(this.f12450a.c(), this.f12451b)) {
            this.f12452c.b();
        }
        return b0.f30125a;
    }
}
