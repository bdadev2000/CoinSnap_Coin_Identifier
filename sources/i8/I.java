package i8;

import java.io.Closeable;

/* loaded from: classes3.dex */
public final class I implements Closeable {
    public final C b;

    /* renamed from: c, reason: collision with root package name */
    public final A f20774c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20775d;

    /* renamed from: f, reason: collision with root package name */
    public final int f20776f;

    /* renamed from: g, reason: collision with root package name */
    public final r f20777g;

    /* renamed from: h, reason: collision with root package name */
    public final s f20778h;

    /* renamed from: i, reason: collision with root package name */
    public final M f20779i;

    /* renamed from: j, reason: collision with root package name */
    public final I f20780j;

    /* renamed from: k, reason: collision with root package name */
    public final I f20781k;
    public final I l;
    public final long m;

    /* renamed from: n, reason: collision with root package name */
    public final long f20782n;

    /* renamed from: o, reason: collision with root package name */
    public final J1.B f20783o;

    /* renamed from: p, reason: collision with root package name */
    public C2371h f20784p;

    public I(C c9, A a6, String str, int i9, r rVar, s sVar, M m, I i10, I i11, I i12, long j7, long j9, J1.B b) {
        G7.j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        G7.j.e(a6, "protocol");
        G7.j.e(str, "message");
        this.b = c9;
        this.f20774c = a6;
        this.f20775d = str;
        this.f20776f = i9;
        this.f20777g = rVar;
        this.f20778h = sVar;
        this.f20779i = m;
        this.f20780j = i10;
        this.f20781k = i11;
        this.l = i12;
        this.m = j7;
        this.f20782n = j9;
        this.f20783o = b;
    }

    public static String b(I i9, String str) {
        i9.getClass();
        String b = i9.f20778h.b(str);
        if (b == null) {
            return null;
        }
        return b;
    }

    public final C2371h a() {
        C2371h c2371h = this.f20784p;
        if (c2371h == null) {
            int i9 = C2371h.f20826n;
            C2371h m = com.facebook.appevents.n.m(this.f20778h);
            this.f20784p = m;
            return m;
        }
        return c2371h;
    }

    public final boolean c() {
        int i9 = this.f20776f;
        if (200 > i9 || i9 >= 300) {
            return false;
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        M m = this.f20779i;
        if (m != null) {
            m.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i8.H, java.lang.Object] */
    public final H h() {
        ?? obj = new Object();
        obj.f20764a = this.b;
        obj.b = this.f20774c;
        obj.f20765c = this.f20776f;
        obj.f20766d = this.f20775d;
        obj.f20767e = this.f20777g;
        obj.f20768f = this.f20778h.d();
        obj.f20769g = this.f20779i;
        obj.f20770h = this.f20780j;
        obj.f20771i = this.f20781k;
        obj.f20772j = this.l;
        obj.f20773k = this.m;
        obj.l = this.f20782n;
        obj.m = this.f20783o;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f20774c + ", code=" + this.f20776f + ", message=" + this.f20775d + ", url=" + this.b.f20754a + '}';
    }
}
