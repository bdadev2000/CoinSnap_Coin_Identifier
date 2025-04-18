package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

@StabilityInferred
/* loaded from: classes.dex */
public final class LegacyCalendarModelImpl extends CalendarModel {

    /* renamed from: b, reason: collision with root package name */
    public static final TimeZone f13011b = TimeZone.getTimeZone("UTC");

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final String a(long j2, String str, Locale locale) {
        LinkedHashMap linkedHashMap = this.f12944a;
        StringBuilder q2 = androidx.compose.foundation.text.input.a.q(str);
        q2.append(locale.toLanguageTag());
        String sb = q2.toString();
        Object obj = linkedHashMap.get(sb);
        TimeZone timeZone = f13011b;
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(timeZone);
            linkedHashMap.put(sb, simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j2);
        return ((SimpleDateFormat) obj2).format(Long.valueOf(calendar.getTimeInMillis()));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate b(long j2) {
        Calendar calendar = Calendar.getInstance(f13011b);
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.getTimeInMillis(), calendar.get(5));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final DateInputFormat c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        p0.a.q(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return CalendarModelKt.a(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final int d() {
        return 0;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth e(int i2, int i3) {
        Calendar calendar = Calendar.getInstance(f13011b);
        calendar.clear();
        calendar.set(1, i2);
        calendar.set(2, i3 - 1);
        calendar.set(5, 1);
        return l(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth f(long j2) {
        Calendar calendar = Calendar.getInstance(f13011b);
        calendar.setTimeInMillis(j2);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return l(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth g(CalendarDate calendarDate) {
        return e(calendarDate.f12941a, calendarDate.f12942b);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.getTimeInMillis() + calendar.get(16) + calendar.get(15), calendar.get(5));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final List i() {
        return null;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate j(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = f13011b;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(parse);
            return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.getTimeInMillis(), calendar.get(5));
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth k(CalendarMonth calendarMonth, int i2) {
        if (i2 <= 0) {
            return calendarMonth;
        }
        Calendar calendar = Calendar.getInstance(f13011b);
        calendar.setTimeInMillis(calendarMonth.e);
        calendar.add(2, i2);
        return l(calendar);
    }

    public final CalendarMonth l(Calendar calendar) {
        int i2 = (calendar.get(7) + 6) % 7;
        int i3 = i2 != 0 ? i2 : 7;
        if (i3 < 0) {
            i3 += 7;
        }
        return new CalendarMonth(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), calendar.getTimeInMillis(), i3);
    }

    public final String toString() {
        return "LegacyCalendarModel";
    }
}
