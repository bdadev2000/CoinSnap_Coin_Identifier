package vc;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public abstract class e1 {
    public static final u0 A;
    public static final s0 B;
    public static final u0 a = a(Class.class, new i0().a());

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f26419b = a(BitSet.class, new t0().a());

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f26420c;

    /* renamed from: d, reason: collision with root package name */
    public static final v0 f26421d;

    /* renamed from: e, reason: collision with root package name */
    public static final v0 f26422e;

    /* renamed from: f, reason: collision with root package name */
    public static final v0 f26423f;

    /* renamed from: g, reason: collision with root package name */
    public static final v0 f26424g;

    /* renamed from: h, reason: collision with root package name */
    public static final u0 f26425h;

    /* renamed from: i, reason: collision with root package name */
    public static final u0 f26426i;

    /* renamed from: j, reason: collision with root package name */
    public static final u0 f26427j;

    /* renamed from: k, reason: collision with root package name */
    public static final z f26428k;

    /* renamed from: l, reason: collision with root package name */
    public static final v0 f26429l;

    /* renamed from: m, reason: collision with root package name */
    public static final e0 f26430m;

    /* renamed from: n, reason: collision with root package name */
    public static final f0 f26431n;

    /* renamed from: o, reason: collision with root package name */
    public static final g0 f26432o;

    /* renamed from: p, reason: collision with root package name */
    public static final u0 f26433p;

    /* renamed from: q, reason: collision with root package name */
    public static final u0 f26434q;

    /* renamed from: r, reason: collision with root package name */
    public static final u0 f26435r;

    /* renamed from: s, reason: collision with root package name */
    public static final u0 f26436s;

    /* renamed from: t, reason: collision with root package name */
    public static final u0 f26437t;
    public static final u0 u;

    /* renamed from: v, reason: collision with root package name */
    public static final u0 f26438v;

    /* renamed from: w, reason: collision with root package name */
    public static final u0 f26439w;

    /* renamed from: x, reason: collision with root package name */
    public static final v0 f26440x;

    /* renamed from: y, reason: collision with root package name */
    public static final u0 f26441y;

    /* renamed from: z, reason: collision with root package name */
    public static final r0 f26442z;

    static {
        w0 w0Var = new w0();
        f26420c = new x0();
        f26421d = b(Boolean.TYPE, Boolean.class, w0Var);
        f26422e = b(Byte.TYPE, Byte.class, new y0());
        f26423f = b(Short.TYPE, Short.class, new z0());
        f26424g = b(Integer.TYPE, Integer.class, new a1());
        f26425h = a(AtomicInteger.class, new b1().a());
        f26426i = a(AtomicBoolean.class, new c1().a());
        f26427j = a(AtomicIntegerArray.class, new y().a());
        f26428k = new z();
        new a0();
        new b0();
        f26429l = b(Character.TYPE, Character.class, new c0());
        d0 d0Var = new d0();
        f26430m = new e0();
        f26431n = new f0();
        f26432o = new g0();
        f26433p = a(String.class, d0Var);
        f26434q = a(StringBuilder.class, new h0());
        f26435r = a(StringBuffer.class, new j0());
        f26436s = a(URL.class, new k0());
        f26437t = a(URI.class, new l0());
        int i10 = 1;
        u = new u0(InetAddress.class, new m0(), i10);
        f26438v = a(UUID.class, new n0());
        f26439w = a(Currency.class, new o0().a());
        f26440x = new v0(Calendar.class, GregorianCalendar.class, new p0(), i10);
        f26441y = a(Locale.class, new q0());
        r0 r0Var = new r0();
        f26442z = r0Var;
        A = new u0(com.google.gson.p.class, r0Var, i10);
        B = new s0();
    }

    public static u0 a(Class cls, com.google.gson.c0 c0Var) {
        return new u0(cls, c0Var, 0);
    }

    public static v0 b(Class cls, Class cls2, com.google.gson.c0 c0Var) {
        return new v0(cls, cls2, c0Var, 0);
    }
}
