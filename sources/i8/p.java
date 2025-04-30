package i8;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f20861j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f20862k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f20863a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20864c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20865d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20866e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20867f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20868g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20869h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20870i;

    public p(String str, String str2, long j7, String str3, String str4, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f20863a = str;
        this.b = str2;
        this.f20864c = j7;
        this.f20865d = str3;
        this.f20866e = str4;
        this.f20867f = z8;
        this.f20868g = z9;
        this.f20869h = z10;
        this.f20870i = z11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (G7.j.a(pVar.f20863a, this.f20863a) && G7.j.a(pVar.b, this.b) && pVar.f20864c == this.f20864c && G7.j.a(pVar.f20865d, this.f20865d) && G7.j.a(pVar.f20866e, this.f20866e) && pVar.f20867f == this.f20867f && pVar.f20868g == this.f20868g && pVar.f20869h == this.f20869h && pVar.f20870i == this.f20870i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20870i) + ((Boolean.hashCode(this.f20869h) + ((Boolean.hashCode(this.f20868g) + ((Boolean.hashCode(this.f20867f) + AbstractC2914a.b(AbstractC2914a.b((Long.hashCode(this.f20864c) + AbstractC2914a.b(AbstractC2914a.b(527, 31, this.f20863a), 31, this.b)) * 31, 31, this.f20865d), 31, this.f20866e)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20863a);
        sb.append('=');
        sb.append(this.b);
        if (this.f20869h) {
            long j7 = this.f20864c;
            if (j7 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n8.c.f21861a.get()).format(new Date(j7));
                G7.j.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f20870i) {
            sb.append("; domain=");
            sb.append(this.f20865d);
        }
        sb.append("; path=");
        sb.append(this.f20866e);
        if (this.f20867f) {
            sb.append("; secure");
        }
        if (this.f20868g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        G7.j.d(sb2, "toString()");
        return sb2;
    }
}
