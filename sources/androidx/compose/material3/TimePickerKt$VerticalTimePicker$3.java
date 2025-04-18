package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$VerticalTimePicker$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f12490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f12491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12492c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12493f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12494g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$VerticalTimePicker$3(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z2, int i2, int i3) {
        super(2);
        this.f12490a = analogTimePickerState;
        this.f12491b = modifier;
        this.f12492c = timePickerColors;
        this.d = z2;
        this.f12493f = i2;
        this.f12494g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TimePickerKt.l(this.f12490a, this.f12491b, this.f12492c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f12493f | 1), this.f12494g);
        return b0.f30125a;
    }
}
