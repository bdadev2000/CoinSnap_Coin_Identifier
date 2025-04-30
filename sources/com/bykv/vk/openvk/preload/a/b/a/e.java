package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends com.bykv.vk.openvk.preload.a.d.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Reader f12883c = new Reader() { // from class: com.bykv.vk.openvk.preload.a.b.a.e.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i9, int i10) throws IOException {
            throw new AssertionError();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Object f12884d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Object[] f12885e;

    /* renamed from: f, reason: collision with root package name */
    private int f12886f;

    /* renamed from: g, reason: collision with root package name */
    private String[] f12887g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f12888h;

    private Object s() {
        Object[] objArr = this.f12885e;
        int i9 = this.f12886f - 1;
        this.f12886f = i9;
        Object obj = objArr[i9];
        objArr[i9] = null;
        return obj;
    }

    private String t() {
        return " at path " + p();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void a() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY);
        a(((com.bykv.vk.openvk.preload.a.i) g()).iterator());
        this.f12888h[this.f12886f - 1] = 0;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void b() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_ARRAY);
        s();
        s();
        int i9 = this.f12886f;
        if (i9 > 0) {
            int[] iArr = this.f12888h;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void c() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT);
        a(((com.bykv.vk.openvk.preload.a.n) g()).f13131a.entrySet().iterator());
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12885e = new Object[]{f12884d};
        this.f12886f = 1;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void d() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_OBJECT);
        s();
        s();
        int i9 = this.f12886f;
        if (i9 > 0) {
            int[] iArr = this.f12888h;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean e() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f9 = f();
        if (f9 != com.bykv.vk.openvk.preload.a.d.b.END_OBJECT && f9 != com.bykv.vk.openvk.preload.a.d.b.END_ARRAY) {
            return true;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final com.bykv.vk.openvk.preload.a.d.b f() throws IOException {
        while (this.f12886f != 0) {
            Object g9 = g();
            if (g9 instanceof Iterator) {
                boolean z8 = this.f12885e[this.f12886f - 2] instanceof com.bykv.vk.openvk.preload.a.n;
                Iterator it = (Iterator) g9;
                if (it.hasNext()) {
                    if (z8) {
                        return com.bykv.vk.openvk.preload.a.d.b.NAME;
                    }
                    a(it.next());
                } else {
                    if (z8) {
                        return com.bykv.vk.openvk.preload.a.d.b.END_OBJECT;
                    }
                    return com.bykv.vk.openvk.preload.a.d.b.END_ARRAY;
                }
            } else {
                if (g9 instanceof com.bykv.vk.openvk.preload.a.n) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT;
                }
                if (g9 instanceof com.bykv.vk.openvk.preload.a.i) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY;
                }
                if (g9 instanceof p) {
                    Object obj = ((p) g9).f13132a;
                    if (obj instanceof String) {
                        return com.bykv.vk.openvk.preload.a.d.b.STRING;
                    }
                    if (obj instanceof Boolean) {
                        return com.bykv.vk.openvk.preload.a.d.b.BOOLEAN;
                    }
                    if (obj instanceof Number) {
                        return com.bykv.vk.openvk.preload.a.d.b.NUMBER;
                    }
                    throw new AssertionError();
                }
                if (g9 instanceof com.bykv.vk.openvk.preload.a.m) {
                    return com.bykv.vk.openvk.preload.a.d.b.NULL;
                }
                if (g9 == f12884d) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
        return com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT;
    }

    public final Object g() {
        return this.f12885e[this.f12886f - 1];
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String h() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) g()).next();
        String str = (String) entry.getKey();
        this.f12887g[this.f12886f - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String i() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f9 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.STRING;
        if (f9 != bVar && f9 != com.bykv.vk.openvk.preload.a.d.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f9 + t());
        }
        String b = ((p) s()).b();
        int i9 = this.f12886f;
        if (i9 > 0) {
            int[] iArr = this.f12888h;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return b;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean j() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BOOLEAN);
        boolean f9 = ((p) s()).f();
        int i9 = this.f12886f;
        if (i9 > 0) {
            int[] iArr = this.f12888h;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return f9;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void k() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NULL);
        s();
        int i9 = this.f12886f;
        if (i9 > 0) {
            int[] iArr = this.f12888h;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final double l() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f9 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (f9 != bVar && f9 != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f9 + t());
        }
        double c9 = ((p) g()).c();
        if (!this.f13060a && (Double.isNaN(c9) || Double.isInfinite(c9))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(c9)));
        }
        s();
        int i9 = this.f12886f;
        if (i9 > 0) {
            int[] iArr = this.f12888h;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return c9;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final long m() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f9 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (f9 != bVar && f9 != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f9 + t());
        }
        long d2 = ((p) g()).d();
        s();
        int i9 = this.f12886f;
        if (i9 > 0) {
            int[] iArr = this.f12888h;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return d2;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final int n() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f9 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (f9 != bVar && f9 != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f9 + t());
        }
        int e4 = ((p) g()).e();
        s();
        int i9 = this.f12886f;
        if (i9 > 0) {
            int[] iArr = this.f12888h;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return e4;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void o() throws IOException {
        if (f() == com.bykv.vk.openvk.preload.a.d.b.NAME) {
            h();
            this.f12887g[this.f12886f - 2] = "null";
        } else {
            s();
            int i9 = this.f12886f;
            if (i9 > 0) {
                this.f12887g[i9 - 1] = "null";
            }
        }
        int i10 = this.f12886f;
        if (i10 > 0) {
            int[] iArr = this.f12888h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String p() {
        StringBuilder sb = new StringBuilder("$");
        int i9 = 0;
        while (i9 < this.f12886f) {
            Object[] objArr = this.f12885e;
            Object obj = objArr[i9];
            if (obj instanceof com.bykv.vk.openvk.preload.a.i) {
                i9++;
                if (objArr[i9] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f12888h[i9]);
                    sb.append(']');
                }
            } else if (obj instanceof com.bykv.vk.openvk.preload.a.n) {
                i9++;
                if (objArr[i9] instanceof Iterator) {
                    sb.append('.');
                    String str = this.f12887g[i9];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i9++;
        }
        return sb.toString();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String toString() {
        return "e";
    }

    public final void a(com.bykv.vk.openvk.preload.a.d.b bVar) throws IOException {
        if (f() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + f() + t());
    }

    public final void a(Object obj) {
        int i9 = this.f12886f;
        Object[] objArr = this.f12885e;
        if (i9 == objArr.length) {
            int i10 = i9 * 2;
            this.f12885e = Arrays.copyOf(objArr, i10);
            this.f12888h = Arrays.copyOf(this.f12888h, i10);
            this.f12887g = (String[]) Arrays.copyOf(this.f12887g, i10);
        }
        Object[] objArr2 = this.f12885e;
        int i11 = this.f12886f;
        this.f12886f = i11 + 1;
        objArr2[i11] = obj;
    }
}
