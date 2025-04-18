package androidx.compose.material3;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class TimePickerKt$TimeSelector$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeSelector$2$1(int i2, TimePickerState timePickerState) {
        super(0);
        this.f12463a = i2;
        this.f12464b = timePickerState;
    }

    @Override // q0.a
    public final Object invoke() {
        TimePickerState timePickerState = this.f12464b;
        int c2 = timePickerState.c();
        int i2 = this.f12463a;
        if (!TimePickerSelectionMode.a(i2, c2)) {
            timePickerState.b(i2);
        }
        return b0.f30125a;
    }
}
