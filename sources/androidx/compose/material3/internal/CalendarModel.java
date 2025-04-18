package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class CalendarModel {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f12944a = new LinkedHashMap();

    public abstract String a(long j2, String str, Locale locale);

    public abstract CalendarDate b(long j2);

    public abstract DateInputFormat c(Locale locale);

    public abstract int d();

    public abstract CalendarMonth e(int i2, int i3);

    public abstract CalendarMonth f(long j2);

    public abstract CalendarMonth g(CalendarDate calendarDate);

    public abstract CalendarDate h();

    public abstract List i();

    public abstract CalendarDate j(String str, String str2);

    public abstract CalendarMonth k(CalendarMonth calendarMonth, int i2);
}
