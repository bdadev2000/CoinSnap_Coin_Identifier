package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;
import w0.g;

/* loaded from: classes2.dex */
final class DateRangePickerKt$SwitchableDateEntryContent$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f9121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9123c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f9124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9125g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f9126h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9127i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f9128j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9129k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$SwitchableDateEntryContent$2(Long l2, Long l3, long j2, p pVar, l lVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        super(3);
        this.f9121a = l2;
        this.f9122b = l3;
        this.f9123c = j2;
        this.d = pVar;
        this.f9124f = lVar;
        this.f9125g = calendarModel;
        this.f9126h = gVar;
        this.f9127i = datePickerFormatter;
        this.f9128j = selectableDates;
        this.f9129k = datePickerColors;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = ((DisplayMode) obj).f9223a;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.c(i2) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else if (DisplayMode.a(i2, 0)) {
            composer.J(-1871305297);
            DateRangePickerKt.b(this.f9121a, this.f9122b, this.f9123c, this.d, this.f9124f, this.f9125g, this.f9126h, this.f9127i, this.f9128j, this.f9129k, composer, 0);
            composer.D();
        } else if (DisplayMode.a(i2, 1)) {
            composer.J(-1871284056);
            DateRangeInputKt.a(this.f9121a, this.f9122b, this.d, this.f9125g, this.f9126h, this.f9127i, this.f9128j, this.f9129k, composer, 0);
            composer.D();
        } else {
            composer.J(2120210493);
            composer.D();
        }
        return b0.f30125a;
    }
}
