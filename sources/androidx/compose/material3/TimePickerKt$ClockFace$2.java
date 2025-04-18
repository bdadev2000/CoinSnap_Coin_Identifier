package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$ClockFace$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f12362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12364c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockFace$2(AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, boolean z2, int i2) {
        super(2);
        this.f12362a = analogTimePickerState;
        this.f12363b = timePickerColors;
        this.f12364c = z2;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        TimePickerColors timePickerColors = this.f12363b;
        boolean z2 = this.f12364c;
        TimePickerKt.b(this.f12362a, timePickerColors, z2, (Composer) obj, a2);
        return b0.f30125a;
    }
}
