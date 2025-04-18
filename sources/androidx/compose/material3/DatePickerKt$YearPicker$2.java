package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DatePickerKt$YearPicker$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f9009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f9011c;
    public final /* synthetic */ SelectableDates d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f9013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9014h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9015i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$YearPicker$2(Modifier modifier, long j2, l lVar, SelectableDates selectableDates, CalendarModel calendarModel, g gVar, DatePickerColors datePickerColors, int i2) {
        super(2);
        this.f9009a = modifier;
        this.f9010b = j2;
        this.f9011c = lVar;
        this.d = selectableDates;
        this.f9012f = calendarModel;
        this.f9013g = gVar;
        this.f9014h = datePickerColors;
        this.f9015i = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DatePickerKt.l(this.f9009a, this.f9010b, this.f9011c, this.d, this.f9012f, this.f9013g, this.f9014h, (Composer) obj, RecomposeScopeImplKt.a(this.f9015i | 1));
        return b0.f30125a;
    }
}
