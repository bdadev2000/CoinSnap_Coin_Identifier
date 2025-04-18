package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class DateRangePickerKt$DateRangePicker$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DateRangePickerState f9095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$4(DateRangePickerState dateRangePickerState) {
        super(2);
        this.f9095a = dateRangePickerState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier e = PaddingKt.e(Modifier.Companion.f14687a, DatePickerKt.d);
            DateRangePickerState dateRangePickerState = this.f9095a;
            int e2 = dateRangePickerState.e();
            boolean I = composer.I(dateRangePickerState);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new DateRangePickerKt$DateRangePicker$4$1$1(dateRangePickerState);
                composer.o(u2);
            }
            DatePickerKt.d(e, e2, (l) u2, composer, 6);
        }
        return b0.f30125a;
    }
}
