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
/* loaded from: classes2.dex */
public final class DatePickerKt$HorizontalMonthsList$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f8894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f8895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f8896c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f8898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f8899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8900i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8901j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8902k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$HorizontalMonthsList$3(LazyListState lazyListState, Long l2, l lVar, l lVar2, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        super(2);
        this.f8894a = lazyListState;
        this.f8895b = l2;
        this.f8896c = lVar;
        this.d = lVar2;
        this.f8897f = calendarModel;
        this.f8898g = gVar;
        this.f8899h = datePickerFormatter;
        this.f8900i = selectableDates;
        this.f8901j = datePickerColors;
        this.f8902k = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.e(this.f8894a, this.f8895b, this.f8896c, this.d, this.f8897f, this.f8898g, this.f8899h, this.f8900i, this.f8901j, (Composer) obj, RecomposeScopeImplKt.a(this.f8902k | 1));
        return b0.f30125a;
    }
}
