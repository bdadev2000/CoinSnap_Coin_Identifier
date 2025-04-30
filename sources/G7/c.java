package G7;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class c implements M7.a, Serializable {
    public transient M7.a b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1322c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f1323d;

    /* renamed from: f, reason: collision with root package name */
    public final String f1324f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1325g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1326h;

    public c(Object obj, Class cls, String str, String str2, boolean z8) {
        this.f1322c = obj;
        this.f1323d = cls;
        this.f1324f = str;
        this.f1325g = str2;
        this.f1326h = z8;
    }

    public abstract M7.a a();

    public final d c() {
        Class cls = this.f1323d;
        if (cls == null) {
            return null;
        }
        if (this.f1326h) {
            s.f1335a.getClass();
            return new m(cls);
        }
        return s.a(cls);
    }
}
