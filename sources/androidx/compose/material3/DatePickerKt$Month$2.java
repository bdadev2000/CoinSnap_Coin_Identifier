package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DatePickerKt$Month$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f8907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f8908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8909c;
    public final /* synthetic */ Long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f8910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SelectedRangeInfo f8911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f8912h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8913i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8914j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8915k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$2(CalendarMonth calendarMonth, l lVar, long j2, Long l2, Long l3, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        super(2);
        this.f8907a = calendarMonth;
        this.f8908b = lVar;
        this.f8909c = j2;
        this.d = l2;
        this.f8910f = l3;
        this.f8911g = selectedRangeInfo;
        this.f8912h = datePickerFormatter;
        this.f8913i = selectableDates;
        this.f8914j = datePickerColors;
        this.f8915k = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.f(this.f8907a, this.f8908b, this.f8909c, this.d, this.f8910f, this.f8911g, this.f8912h, this.f8913i, this.f8914j, (Composer) obj, RecomposeScopeImplKt.a(this.f8915k | 1));
        return b0.f30125a;
    }
}
