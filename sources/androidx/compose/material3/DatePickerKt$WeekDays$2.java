package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DatePickerKt$WeekDays$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$WeekDays$2(DatePickerColors datePickerColors, CalendarModel calendarModel, int i2) {
        super(2);
        this.f8961a = datePickerColors;
        this.f8962b = calendarModel;
        this.f8963c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f8963c | 1);
        DatePickerKt.h(this.f8961a, this.f8962b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
