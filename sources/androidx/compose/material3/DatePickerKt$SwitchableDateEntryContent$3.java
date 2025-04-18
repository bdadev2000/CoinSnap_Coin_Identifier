package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DatePickerKt$SwitchableDateEntryContent$3 extends r implements q0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f8942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f8944c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f8946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f8947h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8948i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8949j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$SwitchableDateEntryContent$3(Long l2, long j2, l lVar, l lVar2, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        super(4);
        this.f8942a = l2;
        this.f8943b = j2;
        this.f8944c = lVar;
        this.d = lVar2;
        this.f8945f = calendarModel;
        this.f8946g = gVar;
        this.f8947h = datePickerFormatter;
        this.f8948i = selectableDates;
        this.f8949j = datePickerColors;
    }

    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2 = ((DisplayMode) obj2).f9223a;
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        if (DisplayMode.a(i2, 0)) {
            composer.J(-1870124677);
            DatePickerKt.i(this.f8942a, this.f8943b, this.f8944c, this.d, this.f8945f, this.f8946g, this.f8947h, this.f8948i, this.f8949j, composer, 0);
            composer.D();
        } else if (DisplayMode.a(i2, 1)) {
            composer.J(-1870106124);
            DateInputKt.a(this.f8942a, this.f8944c, this.f8945f, this.f8946g, this.f8947h, this.f8948i, this.f8949j, composer, 0);
            composer.D();
        } else {
            composer.J(-2138321635);
            composer.D();
        }
        return b0.f30125a;
    }
}
