package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$ClockDisplayNumbers$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockDisplayNumbers$2(TimePickerState timePickerState, TimePickerColors timePickerColors, int i2) {
        super(2);
        this.f12345a = timePickerState;
        this.f12346b = timePickerColors;
        this.f12347c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f12347c | 1);
        TimePickerKt.a(this.f12345a, this.f12346b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
