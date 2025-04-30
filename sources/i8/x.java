package i8;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f20893c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f20894d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f20895a;
    public final String[] b;

    public x(String str, String[] strArr) {
        this.f20895a = str;
        this.b = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.b;
        int i9 = 0;
        int p2 = R2.b.p(0, strArr.length - 1, 2);
        if (p2 >= 0) {
            while (true) {
                int i10 = i9 + 2;
                if (O7.o.y(strArr[i9], "charset")) {
                    str = strArr[i9 + 1];
                    break;
                }
                if (i9 == p2) {
                    break;
                }
                i9 = i10;
            }
        }
        str = null;
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof x) && G7.j.a(((x) obj).f20895a, this.f20895a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20895a.hashCode();
    }

    public final String toString() {
        return this.f20895a;
    }
}
