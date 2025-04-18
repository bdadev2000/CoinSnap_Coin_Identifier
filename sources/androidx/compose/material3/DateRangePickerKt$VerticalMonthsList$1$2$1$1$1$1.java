package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
final class DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f9175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f9176c;
    public final /* synthetic */ DatePickerColors d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1(DatePickerFormatter datePickerFormatter, CalendarMonth calendarMonth, List list, DatePickerColors datePickerColors) {
        super(2);
        this.f9174a = datePickerFormatter;
        this.f9175b = calendarMonth;
        this.f9176c = list;
        this.d = datePickerColors;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            String a2 = this.f9174a.a(Long.valueOf(this.f9175b.e), CalendarLocale_androidKt.a(composer));
            if (a2 == null) {
                a2 = "-";
            }
            Modifier e = PaddingKt.e(Modifier.Companion.f14687a, DateRangePickerKt.f9089a);
            List list = this.f9176c;
            boolean w = composer.w(list);
            Object u2 = composer.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$1$1(list);
                composer.o(u2);
            }
            TextKt.b(a2, SemanticsModifierKt.b(e, false, (l) u2), this.d.e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131064);
        }
        return b0.f30125a;
    }
}
