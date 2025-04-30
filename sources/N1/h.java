package N1;

import android.text.TextUtils;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final L4.f f2088e = new L4.f(7);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2089a;
    public final g b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2090c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f2091d;

    public h(String str, Object obj, g gVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f2090c = str;
            this.f2089a = obj;
            this.b = gVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static h a(Object obj, String str) {
        return new h(str, obj, f2088e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f2090c.equals(((h) obj).f2090c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2090c.hashCode();
    }

    public final String toString() {
        return AbstractC2914a.h(new StringBuilder("Option{key='"), this.f2090c, "'}");
    }
}
