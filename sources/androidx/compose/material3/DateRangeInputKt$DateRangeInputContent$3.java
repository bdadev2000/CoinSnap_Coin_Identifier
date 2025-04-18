package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DateRangeInputKt$DateRangeInputContent$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f9053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f9055c;
    public final /* synthetic */ CalendarModel d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f9056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f9058h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9059i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9060j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangeInputKt$DateRangeInputContent$3(Long l2, Long l3, p pVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        super(2);
        this.f9053a = l2;
        this.f9054b = l3;
        this.f9055c = pVar;
        this.d = calendarModel;
        this.f9056f = gVar;
        this.f9057g = datePickerFormatter;
        this.f9058h = selectableDates;
        this.f9059i = datePickerColors;
        this.f9060j = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DateRangeInputKt.a(this.f9053a, this.f9054b, this.f9055c, this.d, this.f9056f, this.f9057g, this.f9058h, this.f9059i, (Composer) obj, RecomposeScopeImplKt.a(this.f9060j | 1));
        return b0.f30125a;
    }
}
