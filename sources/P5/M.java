package p5;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final W f22281a;
    public final F7.a b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22282c;

    /* renamed from: d, reason: collision with root package name */
    public int f22283d;

    /* renamed from: e, reason: collision with root package name */
    public E f22284e;

    public M() {
        W w2 = W.f22301a;
        L l = L.f22280k;
        this.f22281a = w2;
        this.b = l;
        this.f22282c = a();
        this.f22283d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.b.invoke()).toString();
        G7.j.d(uuid, "uuidGenerator().toString()");
        String lowerCase = O7.o.A(uuid, "-", "").toLowerCase(Locale.ROOT);
        G7.j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final E b() {
        E e4 = this.f22284e;
        if (e4 != null) {
            return e4;
        }
        G7.j.k("currentSession");
        throw null;
    }
}
