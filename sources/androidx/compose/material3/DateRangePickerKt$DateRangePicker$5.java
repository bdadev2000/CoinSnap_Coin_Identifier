package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class DateRangePickerKt$DateRangePicker$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DateRangePickerState f9097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9099c;
    public final /* synthetic */ DatePickerColors d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$5(DateRangePickerState dateRangePickerState, CalendarModel calendarModel, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors) {
        super(2);
        this.f9097a = dateRangePickerState;
        this.f9098b = calendarModel;
        this.f9099c = datePickerFormatter;
        this.d = datePickerColors;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            DateRangePickerState dateRangePickerState = this.f9097a;
            Long j2 = dateRangePickerState.j();
            Long g2 = dateRangePickerState.g();
            long f2 = dateRangePickerState.f();
            int e = dateRangePickerState.e();
            boolean I = composer.I(dateRangePickerState);
            Object u2 = composer.u();
            Object obj3 = Composer.Companion.f13690a;
            if (I || u2 == obj3) {
                u2 = new DateRangePickerKt$DateRangePicker$5$1$1(dateRangePickerState);
                composer.o(u2);
            }
            p pVar = (p) u2;
            boolean I2 = composer.I(dateRangePickerState);
            Object u3 = composer.u();
            if (I2 || u3 == obj3) {
                u3 = new DateRangePickerKt$DateRangePicker$5$2$1(dateRangePickerState);
                composer.o(u3);
            }
            DateRangePickerKt.c(j2, g2, f2, e, pVar, (l) u3, this.f9098b, dateRangePickerState.c(), this.f9099c, dateRangePickerState.b(), this.d, composer, 0, 0);
        }
        return b0.f30125a;
    }
}
