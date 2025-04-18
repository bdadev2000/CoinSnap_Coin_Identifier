package wh;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f27188j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f27189k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f27190l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f27191m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27192b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27193c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27194d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27195e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27196f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27197g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27198h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f27199i;

    public s(String str, String str2, long j3, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = str;
        this.f27192b = str2;
        this.f27193c = j3;
        this.f27194d = str3;
        this.f27195e = str4;
        this.f27196f = z10;
        this.f27197g = z11;
        this.f27198h = z12;
        this.f27199i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (Intrinsics.areEqual(sVar.a, this.a) && Intrinsics.areEqual(sVar.f27192b, this.f27192b) && sVar.f27193c == this.f27193c && Intrinsics.areEqual(sVar.f27194d, this.f27194d) && Intrinsics.areEqual(sVar.f27195e, this.f27195e) && sVar.f27196f == this.f27196f && sVar.f27197g == this.f27197g && sVar.f27198h == this.f27198h && sVar.f27199i == this.f27199i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27199i) + ((Boolean.hashCode(this.f27198h) + ((Boolean.hashCode(this.f27197g) + ((Boolean.hashCode(this.f27196f) + vd.e.c(this.f27195e, vd.e.c(this.f27194d, (Long.hashCode(this.f27193c) + vd.e.c(this.f27192b, vd.e.c(this.a, 527, 31), 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a);
        sb2.append('=');
        sb2.append(this.f27192b);
        if (this.f27198h) {
            long j3 = this.f27193c;
            if (j3 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                Date date = new Date(j3);
                y3.g gVar = ci.c.a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String format = ((DateFormat) ci.c.a.get()).format(date);
                Intrinsics.checkNotNullExpressionValue(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(format);
            }
        }
        if (!this.f27199i) {
            sb2.append("; domain=");
            sb2.append(this.f27194d);
        }
        sb2.append("; path=");
        sb2.append(this.f27195e);
        if (this.f27196f) {
            sb2.append("; secure");
        }
        if (this.f27197g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString()");
        return sb3;
    }
}
