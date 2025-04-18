package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class e extends com.bykv.vk.openvk.preload.a.d.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Reader f9767c = new Reader() { // from class: com.bykv.vk.openvk.preload.a.b.a.e.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Object f9768d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Object[] f9769e;

    /* renamed from: f, reason: collision with root package name */
    private int f9770f;

    /* renamed from: g, reason: collision with root package name */
    private String[] f9771g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f9772h;

    private Object s() {
        Object[] objArr = this.f9769e;
        int i10 = this.f9770f - 1;
        this.f9770f = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private String t() {
        return " at path " + p();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void a() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY);
        a(((com.bykv.vk.openvk.preload.a.i) g()).iterator());
        this.f9772h[this.f9770f - 1] = 0;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void b() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_ARRAY);
        s();
        s();
        int i10 = this.f9770f;
        if (i10 > 0) {
            int[] iArr = this.f9772h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void c() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT);
        a(((com.bykv.vk.openvk.preload.a.n) g()).a.entrySet().iterator());
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9769e = new Object[]{f9768d};
        this.f9770f = 1;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void d() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_OBJECT);
        s();
        s();
        int i10 = this.f9770f;
        if (i10 > 0) {
            int[] iArr = this.f9772h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean e() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f10 = f();
        if (f10 != com.bykv.vk.openvk.preload.a.d.b.END_OBJECT && f10 != com.bykv.vk.openvk.preload.a.d.b.END_ARRAY) {
            return true;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final com.bykv.vk.openvk.preload.a.d.b f() throws IOException {
        while (this.f9770f != 0) {
            Object g10 = g();
            if (g10 instanceof Iterator) {
                boolean z10 = this.f9769e[this.f9770f - 2] instanceof com.bykv.vk.openvk.preload.a.n;
                Iterator it = (Iterator) g10;
                if (it.hasNext()) {
                    if (z10) {
                        return com.bykv.vk.openvk.preload.a.d.b.NAME;
                    }
                    a(it.next());
                } else {
                    if (z10) {
                        return com.bykv.vk.openvk.preload.a.d.b.END_OBJECT;
                    }
                    return com.bykv.vk.openvk.preload.a.d.b.END_ARRAY;
                }
            } else {
                if (g10 instanceof com.bykv.vk.openvk.preload.a.n) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT;
                }
                if (g10 instanceof com.bykv.vk.openvk.preload.a.i) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY;
                }
                if (g10 instanceof p) {
                    Object obj = ((p) g10).a;
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
                if (g10 instanceof com.bykv.vk.openvk.preload.a.m) {
                    return com.bykv.vk.openvk.preload.a.d.b.NULL;
                }
                if (g10 == f9768d) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
        return com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT;
    }

    public final Object g() {
        return this.f9769e[this.f9770f - 1];
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String h() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) g()).next();
        String str = (String) entry.getKey();
        this.f9771g[this.f9770f - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String i() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f10 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.STRING;
        if (f10 != bVar && f10 != com.bykv.vk.openvk.preload.a.d.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f10 + t());
        }
        String b3 = ((p) s()).b();
        int i10 = this.f9770f;
        if (i10 > 0) {
            int[] iArr = this.f9772h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return b3;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean j() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BOOLEAN);
        boolean f10 = ((p) s()).f();
        int i10 = this.f9770f;
        if (i10 > 0) {
            int[] iArr = this.f9772h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return f10;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void k() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NULL);
        s();
        int i10 = this.f9770f;
        if (i10 > 0) {
            int[] iArr = this.f9772h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final double l() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f10 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (f10 != bVar && f10 != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f10 + t());
        }
        double c10 = ((p) g()).c();
        if (!this.a && (Double.isNaN(c10) || Double.isInfinite(c10))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(c10)));
        }
        s();
        int i10 = this.f9770f;
        if (i10 > 0) {
            int[] iArr = this.f9772h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return c10;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final long m() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f10 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (f10 != bVar && f10 != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f10 + t());
        }
        long d10 = ((p) g()).d();
        s();
        int i10 = this.f9770f;
        if (i10 > 0) {
            int[] iArr = this.f9772h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return d10;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final int n() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f10 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (f10 != bVar && f10 != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f10 + t());
        }
        int e2 = ((p) g()).e();
        s();
        int i10 = this.f9770f;
        if (i10 > 0) {
            int[] iArr = this.f9772h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return e2;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void o() throws IOException {
        if (f() == com.bykv.vk.openvk.preload.a.d.b.NAME) {
            h();
            this.f9771g[this.f9770f - 2] = AbstractJsonLexerKt.NULL;
        } else {
            s();
            int i10 = this.f9770f;
            if (i10 > 0) {
                this.f9771g[i10 - 1] = AbstractJsonLexerKt.NULL;
            }
        }
        int i11 = this.f9770f;
        if (i11 > 0) {
            int[] iArr = this.f9772h;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String p() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (i10 < this.f9770f) {
            Object[] objArr = this.f9769e;
            Object obj = objArr[i10];
            if (obj instanceof com.bykv.vk.openvk.preload.a.i) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(this.f9772h[i10]);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                }
            } else if (obj instanceof com.bykv.vk.openvk.preload.a.n) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('.');
                    String str = this.f9771g[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
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
        int i10 = this.f9770f;
        Object[] objArr = this.f9769e;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f9769e = Arrays.copyOf(objArr, i11);
            this.f9772h = Arrays.copyOf(this.f9772h, i11);
            this.f9771g = (String[]) Arrays.copyOf(this.f9771g, i11);
        }
        Object[] objArr2 = this.f9769e;
        int i12 = this.f9770f;
        this.f9770f = i12 + 1;
        objArr2[i12] = obj;
    }
}
