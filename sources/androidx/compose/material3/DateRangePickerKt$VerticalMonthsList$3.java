package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DateRangePickerKt$VerticalMonthsList$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f9185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f9187c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f9188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f9190h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9191i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f9192j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9193k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9194l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$3(LazyListState lazyListState, Long l2, Long l3, p pVar, l lVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        super(2);
        this.f9185a = lazyListState;
        this.f9186b = l2;
        this.f9187c = l3;
        this.d = pVar;
        this.f9188f = lVar;
        this.f9189g = calendarModel;
        this.f9190h = gVar;
        this.f9191i = datePickerFormatter;
        this.f9192j = selectableDates;
        this.f9193k = datePickerColors;
        this.f9194l = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DateRangePickerKt.a(this.f9185a, this.f9186b, this.f9187c, this.d, this.f9188f, this.f9189g, this.f9190h, this.f9191i, this.f9192j, this.f9193k, (Composer) obj, RecomposeScopeImplKt.a(this.f9194l | 1));
        return b0.f30125a;
    }
}
