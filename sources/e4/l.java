package e4;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final x5.c f17103e = new x5.c();
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final k f17104b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17105c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f17106d;

    public l(String str, Object obj, k kVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f17105c = str;
            this.a = obj;
            this.f17104b = kVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static l a(Object obj, String str) {
        return new l(str, obj, f17103e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f17105c.equals(((l) obj).f17105c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17105c.hashCode();
    }

    public final String toString() {
        return vd.e.h(new StringBuilder("Option{key='"), this.f17105c, "'}");
    }
}
