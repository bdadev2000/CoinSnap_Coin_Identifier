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
public final class DateRangePickerKt$SwitchableDateEntryContent$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f9130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9132c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f9133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f9134g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9135h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f9136i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9137j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f9138k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9139l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9140m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9141n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$SwitchableDateEntryContent$3(Long l2, Long l3, long j2, int i2, p pVar, l lVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i3, int i4) {
        super(2);
        this.f9130a = l2;
        this.f9131b = l3;
        this.f9132c = j2;
        this.d = i2;
        this.f9133f = pVar;
        this.f9134g = lVar;
        this.f9135h = calendarModel;
        this.f9136i = gVar;
        this.f9137j = datePickerFormatter;
        this.f9138k = selectableDates;
        this.f9139l = datePickerColors;
        this.f9140m = i3;
        this.f9141n = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DateRangePickerKt.c(this.f9130a, this.f9131b, this.f9132c, this.d, this.f9133f, this.f9134g, this.f9135h, this.f9136i, this.f9137j, this.f9138k, this.f9139l, (Composer) obj, RecomposeScopeImplKt.a(this.f9140m | 1), RecomposeScopeImplKt.a(this.f9141n));
        return b0.f30125a;
    }
}
