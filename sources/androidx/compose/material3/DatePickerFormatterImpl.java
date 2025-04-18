package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import java.util.Locale;

@Immutable
/* loaded from: classes3.dex */
final class DatePickerFormatterImpl implements DatePickerFormatter {

    /* renamed from: a, reason: collision with root package name */
    public final String f8762a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8763b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8764c;
    public final LinkedHashMap d = new LinkedHashMap();

    public DatePickerFormatterImpl(String str, String str2, String str3) {
        this.f8762a = str;
        this.f8763b = str2;
        this.f8764c = str3;
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public final String a(Long l2, Locale locale) {
        if (l2 == null) {
            return null;
        }
        return CalendarModel_androidKt.a(l2.longValue(), this.f8762a, locale, this.d);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public final String b(Long l2, Locale locale, boolean z2) {
        if (l2 == null) {
            return null;
        }
        return CalendarModel_androidKt.a(l2.longValue(), z2 ? this.f8764c : this.f8763b, locale, this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DatePickerFormatterImpl)) {
            return false;
        }
        DatePickerFormatterImpl datePickerFormatterImpl = (DatePickerFormatterImpl) obj;
        return p0.a.g(this.f8762a, datePickerFormatterImpl.f8762a) && p0.a.g(this.f8763b, datePickerFormatterImpl.f8763b) && p0.a.g(this.f8764c, datePickerFormatterImpl.f8764c);
    }

    public final int hashCode() {
        return this.f8764c.hashCode() + androidx.compose.foundation.text.input.a.b(this.f8763b, this.f8762a.hashCode() * 31, 31);
    }
}
