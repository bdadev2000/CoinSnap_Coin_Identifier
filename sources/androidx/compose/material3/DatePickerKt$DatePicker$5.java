package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class DatePickerKt$DatePicker$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DatePickerState f8790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f8792c;
    public final /* synthetic */ DatePickerColors d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePicker$5(DatePickerState datePickerState, CalendarModel calendarModel, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors) {
        super(2);
        this.f8790a = datePickerState;
        this.f8791b = calendarModel;
        this.f8792c = datePickerFormatter;
        this.d = datePickerColors;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            DatePickerState datePickerState = this.f8790a;
            Long i2 = datePickerState.i();
            long f2 = datePickerState.f();
            int e = datePickerState.e();
            boolean I = composer.I(datePickerState);
            Object u2 = composer.u();
            Object obj3 = Composer.Companion.f13690a;
            if (I || u2 == obj3) {
                u2 = new DatePickerKt$DatePicker$5$1$1(datePickerState);
                composer.o(u2);
            }
            l lVar = (l) u2;
            boolean I2 = composer.I(datePickerState);
            Object u3 = composer.u();
            if (I2 || u3 == obj3) {
                u3 = new DatePickerKt$DatePicker$5$2$1(datePickerState);
                composer.o(u3);
            }
            DatePickerKt.j(i2, f2, e, lVar, (l) u3, this.f8791b, datePickerState.c(), this.f8792c, datePickerState.b(), this.d, composer, 0);
        }
        return b0.f30125a;
    }
}
