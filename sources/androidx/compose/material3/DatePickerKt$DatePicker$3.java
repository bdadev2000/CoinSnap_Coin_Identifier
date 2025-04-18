package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class DatePickerKt$DatePicker$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DatePickerState f8786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f8787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePicker$3(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter) {
        super(2);
        this.f8786a = datePickerState;
        this.f8787b = datePickerFormatter;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            DatePickerDefaults datePickerDefaults = DatePickerDefaults.f8723a;
            DatePickerState datePickerState = this.f8786a;
            datePickerDefaults.a(datePickerState.i(), datePickerState.e(), this.f8787b, PaddingKt.e(Modifier.Companion.f14687a, DatePickerKt.f8768f), composer, 27648, 0);
        }
        return b0.f30125a;
    }
}
