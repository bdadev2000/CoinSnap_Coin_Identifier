package P;

import java.util.Locale;

/* loaded from: classes.dex */
public final class l {
    public static final l b = new l(new m(k.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final m f2264a;

    public l(m mVar) {
        this.f2264a = mVar;
    }

    public static l a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i9 = 0; i9 < length; i9++) {
                localeArr[i9] = j.a(split[i9]);
            }
            return new l(new m(k.a(localeArr)));
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (this.f2264a.equals(((l) obj).f2264a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2264a.hashCode();
    }

    public final String toString() {
        return this.f2264a.toString();
    }
}
