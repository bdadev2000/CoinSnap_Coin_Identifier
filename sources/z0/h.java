package z0;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f31477a;

    public h(Pattern pattern) {
        this.f31477a = pattern;
    }

    public static f a(h hVar, CharSequence charSequence) {
        hVar.getClass();
        p0.a.s(charSequence, "input");
        Matcher matcher = hVar.f31477a.matcher(charSequence);
        p0.a.r(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new f(matcher, charSequence);
        }
        return null;
    }

    private final Object writeReplace() {
        Pattern pattern = this.f31477a;
        String pattern2 = pattern.pattern();
        p0.a.r(pattern2, "pattern(...)");
        return new g(pattern2, pattern.flags());
    }

    public final String b(String str, q0.l lVar) {
        p0.a.s(str, "input");
        f a2 = a(this, str);
        if (a2 == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, Integer.valueOf(a2.b().f31406a).intValue());
            sb.append((CharSequence) lVar.invoke(a2));
            i2 = Integer.valueOf(a2.b().f31407b).intValue() + 1;
            Matcher matcher = a2.f31472a;
            int end = matcher.end() + (matcher.end() != matcher.start() ? 0 : 1);
            CharSequence charSequence = a2.f31473b;
            f fVar = null;
            if (end <= charSequence.length()) {
                Matcher matcher2 = matcher.pattern().matcher(charSequence);
                p0.a.r(matcher2, "matcher(...)");
                if (matcher2.find(end)) {
                    fVar = new f(matcher2, charSequence);
                }
            }
            a2 = fVar;
            if (i2 >= length) {
                break;
            }
        } while (a2 != null);
        if (i2 < length) {
            sb.append((CharSequence) str, i2, length);
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "toString(...)");
        return sb2;
    }

    public final String toString() {
        String pattern = this.f31477a.toString();
        p0.a.r(pattern, "toString(...)");
        return pattern;
    }

    public h(String str) {
        Pattern compile = Pattern.compile(str);
        p0.a.r(compile, "compile(...)");
        this.f31477a = compile;
    }
}
