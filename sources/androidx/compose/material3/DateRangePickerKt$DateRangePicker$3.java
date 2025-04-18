package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class DateRangePickerKt$DateRangePicker$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DateRangePickerState f9093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$3(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter) {
        super(2);
        this.f9093a = dateRangePickerState;
        this.f9094b = datePickerFormatter;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            DateRangePickerDefaults dateRangePickerDefaults = DateRangePickerDefaults.f9061a;
            DateRangePickerState dateRangePickerState = this.f9093a;
            dateRangePickerDefaults.b(dateRangePickerState.j(), dateRangePickerState.g(), dateRangePickerState.e(), this.f9094b, PaddingKt.e(Modifier.Companion.f14687a, DateRangePickerKt.f9091c), composer, 221184, 0);
        }
        return b0.f30125a;
    }
}
