package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DateRangePickerKt$DateRangePickerContent$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f9110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9112c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f9113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9114g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f9115h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f9117j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9118k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9119l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePickerContent$2(Long l2, Long l3, long j2, p pVar, l lVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        super(2);
        this.f9110a = l2;
        this.f9111b = l3;
        this.f9112c = j2;
        this.d = pVar;
        this.f9113f = lVar;
        this.f9114g = calendarModel;
        this.f9115h = gVar;
        this.f9116i = datePickerFormatter;
        this.f9117j = selectableDates;
        this.f9118k = datePickerColors;
        this.f9119l = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DateRangePickerKt.b(this.f9110a, this.f9111b, this.f9112c, this.d, this.f9113f, this.f9114g, this.f9115h, this.f9116i, this.f9117j, this.f9118k, (Composer) obj, RecomposeScopeImplKt.a(this.f9119l | 1));
        return b0.f30125a;
    }
}
