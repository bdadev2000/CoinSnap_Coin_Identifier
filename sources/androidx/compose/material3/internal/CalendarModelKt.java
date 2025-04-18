package androidx.compose.material3.internal;

import java.util.regex.Pattern;
import z0.d;
import z0.f;
import z0.h;
import z0.m;

/* loaded from: classes3.dex */
public final class CalendarModelKt {
    public static final DateInputFormat a(String str) {
        Pattern compile = Pattern.compile("[^dMy/\\-.]");
        p0.a.r(compile, "compile(...)");
        p0.a.s(str, "input");
        String replaceAll = compile.matcher(str).replaceAll("");
        p0.a.r(replaceAll, "replaceAll(...)");
        Pattern compile2 = Pattern.compile("d{1,2}");
        p0.a.r(compile2, "compile(...)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("dd");
        p0.a.r(replaceAll2, "replaceAll(...)");
        Pattern compile3 = Pattern.compile("M{1,2}");
        p0.a.r(compile3, "compile(...)");
        String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("MM");
        p0.a.r(replaceAll3, "replaceAll(...)");
        Pattern compile4 = Pattern.compile("y{1,4}");
        p0.a.r(compile4, "compile(...)");
        String replaceAll4 = compile4.matcher(replaceAll3).replaceAll("yyyy");
        p0.a.r(replaceAll4, "replaceAll(...)");
        String h12 = m.h1(".", m.k1(replaceAll4, "My", "M/y"));
        f a2 = h.a(new h("[/\\-.]"), h12);
        p0.a.p(a2);
        d b2 = a2.f31474c.b(0);
        p0.a.p(b2);
        int i2 = b2.f31470b.f31406a;
        String substring = h12.substring(i2, i2 + 1);
        p0.a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new DateInputFormat(h12, substring.charAt(0));
    }
}
