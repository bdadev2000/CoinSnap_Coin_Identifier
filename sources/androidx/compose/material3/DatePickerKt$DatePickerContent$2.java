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
/* loaded from: classes3.dex */
public final class DatePickerKt$DatePickerContent$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f8829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f8831c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f8833g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f8834h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8835i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8836j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8837k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$2(Long l2, long j2, l lVar, l lVar2, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        super(2);
        this.f8829a = l2;
        this.f8830b = j2;
        this.f8831c = lVar;
        this.d = lVar2;
        this.f8832f = calendarModel;
        this.f8833g = gVar;
        this.f8834h = datePickerFormatter;
        this.f8835i = selectableDates;
        this.f8836j = datePickerColors;
        this.f8837k = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.i(this.f8829a, this.f8830b, this.f8831c, this.d, this.f8832f, this.f8833g, this.f8834h, this.f8835i, this.f8836j, (Composer) obj, RecomposeScopeImplKt.a(this.f8837k | 1));
        return b0.f30125a;
    }
}
