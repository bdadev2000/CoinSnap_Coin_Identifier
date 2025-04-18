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
/* loaded from: classes4.dex */
public final class DateInputKt$DateInputContent$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f8664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f8665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8666c;
    public final /* synthetic */ g d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f8667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8668g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8669h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8670i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputContent$4(Long l2, l lVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        super(2);
        this.f8664a = l2;
        this.f8665b = lVar;
        this.f8666c = calendarModel;
        this.d = gVar;
        this.f8667f = datePickerFormatter;
        this.f8668g = selectableDates;
        this.f8669h = datePickerColors;
        this.f8670i = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DateInputKt.a(this.f8664a, this.f8665b, this.f8666c, this.d, this.f8667f, this.f8668g, this.f8669h, (Composer) obj, RecomposeScopeImplKt.a(this.f8670i | 1));
        return b0.f30125a;
    }
}
