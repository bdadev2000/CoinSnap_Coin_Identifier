package androidx.compose.material3.internal;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.k;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

@StabilityInferred
@RequiresApi
/* loaded from: classes2.dex */
public final class CalendarModelImpl extends CalendarModel {
    public static final ZoneId d = ZoneId.of("UTC");

    /* renamed from: b, reason: collision with root package name */
    public final int f12945b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12946c;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static String a(long j2, String str, Locale locale, LinkedHashMap linkedHashMap) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object obj = linkedHashMap.get(str2);
            if (obj == null) {
                obj = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                linkedHashMap.put(str2, obj);
            }
            p0.a.q(obj, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return Instant.ofEpochMilli(j2).atZone(CalendarModelImpl.d).toLocalDate().format((DateTimeFormatter) obj);
        }
    }

    public CalendarModelImpl(Locale locale) {
        this.f12945b = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] values = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (DayOfWeek dayOfWeek : values) {
            arrayList.add(new k(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.f12946c = arrayList;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final String a(long j2, String str, Locale locale) {
        return Companion.a(j2, str, locale, this.f12944a);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate b(long j2) {
        LocalDate localDate = Instant.ofEpochMilli(j2).atZone(d).toLocalDate();
        return new CalendarDate(localDate.getYear(), localDate.getMonthValue(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * 1000, localDate.getDayOfMonth());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final DateInputFormat c(Locale locale) {
        return CalendarModelKt.a(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final int d() {
        return this.f12945b;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth e(int i2, int i3) {
        return l(LocalDate.of(i2, i3, 1));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth f(long j2) {
        return l(Instant.ofEpochMilli(j2).atZone(d).withDayOfMonth(1).toLocalDate());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth g(CalendarDate calendarDate) {
        return l(LocalDate.of(calendarDate.f12941a, calendarDate.f12942b, 1));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate h() {
        LocalDate now = LocalDate.now();
        return new CalendarDate(now.getYear(), now.getMonthValue(), now.atTime(LocalTime.MIDNIGHT).atZone(d).toInstant().toEpochMilli(), now.getDayOfMonth());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final List i() {
        return this.f12946c;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate j(String str, String str2) {
        try {
            LocalDate parse = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
            return new CalendarDate(parse.getYear(), parse.getMonth().getValue(), parse.atTime(LocalTime.MIDNIGHT).atZone(d).toInstant().toEpochMilli(), parse.getDayOfMonth());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth k(CalendarMonth calendarMonth, int i2) {
        return i2 <= 0 ? calendarMonth : l(Instant.ofEpochMilli(calendarMonth.e).atZone(d).toLocalDate().plusMonths(i2));
    }

    public final CalendarMonth l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.f12945b;
        if (value < 0) {
            value += 7;
        }
        int i2 = value;
        return new CalendarMonth(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(d).toInstant().toEpochMilli(), i2);
    }

    public final String toString() {
        return "CalendarModel";
    }
}
