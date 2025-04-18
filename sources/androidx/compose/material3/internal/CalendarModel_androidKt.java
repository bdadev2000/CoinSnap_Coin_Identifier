package androidx.compose.material3.internal;

import android.text.format.DateFormat;
import androidx.compose.material3.internal.CalendarModelImpl;
import java.time.ZoneId;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CalendarModel_androidKt {
    public static final String a(long j2, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = linkedHashMap.get(str2);
        if (obj == null) {
            obj = DateFormat.getBestDateTimePattern(locale, str);
            linkedHashMap.put(str2, obj);
        }
        String obj2 = obj.toString();
        ZoneId zoneId = CalendarModelImpl.d;
        return CalendarModelImpl.Companion.a(j2, obj2, locale, linkedHashMap);
    }
}
