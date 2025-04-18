package j0;

import java.util.Locale;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f19714b = new k(new m(j.a(new Locale[0])));
    public final l a;

    public k(m mVar) {
        this.a = mVar;
    }

    public static k a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i10 = 0; i10 < length; i10++) {
                localeArr[i10] = i.a(split[i10]);
            }
            return new k(new m(j.a(localeArr)));
        }
        return f19714b;
    }

    public final boolean b() {
        return ((m) this.a).a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (this.a.equals(((k) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
