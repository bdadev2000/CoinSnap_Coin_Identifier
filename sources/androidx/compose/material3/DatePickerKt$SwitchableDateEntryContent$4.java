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
public final class DatePickerKt$SwitchableDateEntryContent$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f8950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8952c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f8953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8954g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f8955h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f8956i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8957j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8958k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8959l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$SwitchableDateEntryContent$4(Long l2, long j2, int i2, l lVar, l lVar2, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i3) {
        super(2);
        this.f8950a = l2;
        this.f8951b = j2;
        this.f8952c = i2;
        this.d = lVar;
        this.f8953f = lVar2;
        this.f8954g = calendarModel;
        this.f8955h = gVar;
        this.f8956i = datePickerFormatter;
        this.f8957j = selectableDates;
        this.f8958k = datePickerColors;
        this.f8959l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.j(this.f8950a, this.f8951b, this.f8952c, this.d, this.f8953f, this.f8954g, this.f8955h, this.f8956i, this.f8957j, this.f8958k, (Composer) obj, RecomposeScopeImplKt.a(this.f8959l | 1));
        return b0.f30125a;
    }
}
