package androidx.compose.material3.internal;

import androidx.compose.runtime.Immutable;
import z0.m;

@Immutable
/* loaded from: classes2.dex */
public final class DateInputFormat {

    /* renamed from: a, reason: collision with root package name */
    public final String f12951a;

    /* renamed from: b, reason: collision with root package name */
    public final char f12952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12953c;

    public DateInputFormat(String str, char c2) {
        this.f12951a = str;
        this.f12952b = c2;
        this.f12953c = m.k1(str, String.valueOf(c2), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) obj;
        return p0.a.g(this.f12951a, dateInputFormat.f12951a) && this.f12952b == dateInputFormat.f12952b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f12952b) + (this.f12951a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f12951a + ", delimiter=" + this.f12952b + ')';
    }
}
