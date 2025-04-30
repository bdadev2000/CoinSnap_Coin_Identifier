package com.bykv.vk.openvk.preload.a.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f13082a = new String[128];
    private static final String[] b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13083c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13084d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13085e;

    /* renamed from: f, reason: collision with root package name */
    private final Writer f13086f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f13087g = new int[32];

    /* renamed from: h, reason: collision with root package name */
    private int f13088h = 0;

    /* renamed from: i, reason: collision with root package name */
    private String f13089i;

    /* renamed from: j, reason: collision with root package name */
    private String f13090j;

    /* renamed from: k, reason: collision with root package name */
    private String f13091k;

    static {
        for (int i9 = 0; i9 <= 31; i9++) {
            f13082a[i9] = String.format("\\u%04x", Integer.valueOf(i9));
        }
        String[] strArr = f13082a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.f13090j = ":";
        this.f13085e = true;
        if (writer != null) {
            this.f13086f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private int f() {
        int i9 = this.f13088h;
        if (i9 != 0) {
            return this.f13087g[i9 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void g() throws IOException {
        if (this.f13091k != null) {
            i();
            d(this.f13091k);
            this.f13091k = null;
        }
    }

    private void h() throws IOException {
        if (this.f13089i == null) {
            return;
        }
        this.f13086f.write(10);
        int i9 = this.f13088h;
        for (int i10 = 1; i10 < i9; i10++) {
            this.f13086f.write(this.f13089i);
        }
    }

    private void i() throws IOException {
        int f9 = f();
        if (f9 == 5) {
            this.f13086f.write(44);
        } else if (f9 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        h();
        b(4);
    }

    private void j() throws IOException {
        int f9 = f();
        if (f9 != 1) {
            if (f9 != 2) {
                if (f9 != 4) {
                    if (f9 != 6) {
                        if (f9 == 7) {
                            if (!this.f13083c) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    b(7);
                    return;
                }
                this.f13086f.append((CharSequence) this.f13090j);
                b(5);
                return;
            }
            this.f13086f.append(',');
            h();
            return;
        }
        b(2);
        h();
    }

    public c a() throws IOException {
        g();
        return a(1, '[');
    }

    public c b() throws IOException {
        return a(1, 2, ']');
    }

    public final void c(String str) {
        if (str.length() == 0) {
            this.f13089i = null;
            this.f13090j = ":";
        } else {
            this.f13089i = str;
            this.f13090j = ": ";
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13086f.close();
        int i9 = this.f13088h;
        if (i9 <= 1 && (i9 != 1 || this.f13087g[i9 - 1] == 7)) {
            this.f13088h = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d() throws IOException {
        return a(3, 5, '}');
    }

    public c e() throws IOException {
        if (this.f13091k != null) {
            if (this.f13085e) {
                g();
            } else {
                this.f13091k = null;
                return this;
            }
        }
        j();
        this.f13086f.write("null");
        return this;
    }

    public void flush() throws IOException {
        if (this.f13088h != 0) {
            this.f13086f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void b(int i9) {
        this.f13087g[this.f13088h - 1] = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f13084d
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.bykv.vk.openvk.preload.a.d.c.b
            goto L9
        L7:
            java.lang.String[] r0 = com.bykv.vk.openvk.preload.a.d.c.f13082a
        L9:
            java.io.Writer r1 = r8.f13086f
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f13086f
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f13086f
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f13086f
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f13086f
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.c.d(java.lang.String):void");
    }

    private c a(int i9, char c9) throws IOException {
        j();
        a(i9);
        this.f13086f.write(c9);
        return this;
    }

    public c b(String str) throws IOException {
        if (str == null) {
            return e();
        }
        g();
        j();
        d(str);
        return this;
    }

    private c a(int i9, int i10, char c9) throws IOException {
        int f9 = f();
        if (f9 != i10 && f9 != i9) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f13091k == null) {
            this.f13088h--;
            if (f9 == i10) {
                h();
            }
            this.f13086f.write(c9);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f13091k);
    }

    public c c() throws IOException {
        g();
        return a(3, '{');
    }

    private void a(int i9) {
        int i10 = this.f13088h;
        int[] iArr = this.f13087g;
        if (i10 == iArr.length) {
            this.f13087g = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f13087g;
        int i11 = this.f13088h;
        this.f13088h = i11 + 1;
        iArr2[i11] = i9;
    }

    public c a(String str) throws IOException {
        if (str != null) {
            if (this.f13091k == null) {
                if (this.f13088h != 0) {
                    this.f13091k = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public c a(boolean z8) throws IOException {
        g();
        j();
        this.f13086f.write(z8 ? "true" : "false");
        return this;
    }

    public c a(Boolean bool) throws IOException {
        if (bool == null) {
            return e();
        }
        g();
        j();
        this.f13086f.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c a(long j7) throws IOException {
        g();
        j();
        this.f13086f.write(Long.toString(j7));
        return this;
    }

    public c a(Number number) throws IOException {
        if (number == null) {
            return e();
        }
        g();
        String obj = number.toString();
        if (!this.f13083c && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        j();
        this.f13086f.append((CharSequence) obj);
        return this;
    }
}
