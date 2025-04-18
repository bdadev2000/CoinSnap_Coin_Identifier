package com.bykv.vk.openvk.preload.a.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class c implements Closeable, Flushable {
    private static final String[] a = new String[128];

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f9921b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9922c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9923d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9924e;

    /* renamed from: f, reason: collision with root package name */
    private final Writer f9925f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f9926g = new int[32];

    /* renamed from: h, reason: collision with root package name */
    private int f9927h = 0;

    /* renamed from: i, reason: collision with root package name */
    private String f9928i;

    /* renamed from: j, reason: collision with root package name */
    private String f9929j;

    /* renamed from: k, reason: collision with root package name */
    private String f9930k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            a[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f9921b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.f9929j = ":";
        this.f9924e = true;
        if (writer != null) {
            this.f9925f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private int f() {
        int i10 = this.f9927h;
        if (i10 != 0) {
            return this.f9926g[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void g() throws IOException {
        if (this.f9930k != null) {
            i();
            d(this.f9930k);
            this.f9930k = null;
        }
    }

    private void h() throws IOException {
        if (this.f9928i == null) {
            return;
        }
        this.f9925f.write(10);
        int i10 = this.f9927h;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f9925f.write(this.f9928i);
        }
    }

    private void i() throws IOException {
        int f10 = f();
        if (f10 == 5) {
            this.f9925f.write(44);
        } else if (f10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        h();
        b(4);
    }

    private void j() throws IOException {
        int f10 = f();
        if (f10 != 1) {
            if (f10 != 2) {
                if (f10 != 4) {
                    if (f10 != 6) {
                        if (f10 == 7) {
                            if (!this.f9922c) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    b(7);
                    return;
                }
                this.f9925f.append((CharSequence) this.f9929j);
                b(5);
                return;
            }
            this.f9925f.append(AbstractJsonLexerKt.COMMA);
            h();
            return;
        }
        b(2);
        h();
    }

    public c a() throws IOException {
        g();
        return a(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    public c b() throws IOException {
        return a(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public final void c(String str) {
        if (str.length() == 0) {
            this.f9928i = null;
            this.f9929j = ":";
        } else {
            this.f9928i = str;
            this.f9929j = ": ";
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9925f.close();
        int i10 = this.f9927h;
        if (i10 <= 1 && (i10 != 1 || this.f9926g[i10 - 1] == 7)) {
            this.f9927h = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d() throws IOException {
        return a(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    public c e() throws IOException {
        if (this.f9930k != null) {
            if (this.f9924e) {
                g();
            } else {
                this.f9930k = null;
                return this;
            }
        }
        j();
        this.f9925f.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public void flush() throws IOException {
        if (this.f9927h != 0) {
            this.f9925f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void b(int i10) {
        this.f9926g[this.f9927h - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f9923d
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.bykv.vk.openvk.preload.a.d.c.f9921b
            goto L9
        L7:
            java.lang.String[] r0 = com.bykv.vk.openvk.preload.a.d.c.a
        L9:
            java.io.Writer r1 = r8.f9925f
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
            java.io.Writer r6 = r8.f9925f
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f9925f
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f9925f
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f9925f
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.c.d(java.lang.String):void");
    }

    private c a(int i10, char c10) throws IOException {
        j();
        a(i10);
        this.f9925f.write(c10);
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

    private c a(int i10, int i11, char c10) throws IOException {
        int f10 = f();
        if (f10 != i11 && f10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f9930k == null) {
            this.f9927h--;
            if (f10 == i11) {
                h();
            }
            this.f9925f.write(c10);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f9930k);
    }

    public c c() throws IOException {
        g();
        return a(3, AbstractJsonLexerKt.BEGIN_OBJ);
    }

    private void a(int i10) {
        int i11 = this.f9927h;
        int[] iArr = this.f9926g;
        if (i11 == iArr.length) {
            this.f9926g = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f9926g;
        int i12 = this.f9927h;
        this.f9927h = i12 + 1;
        iArr2[i12] = i10;
    }

    public c a(String str) throws IOException {
        if (str != null) {
            if (this.f9930k == null) {
                if (this.f9927h != 0) {
                    this.f9930k = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public c a(boolean z10) throws IOException {
        g();
        j();
        this.f9925f.write(z10 ? "true" : "false");
        return this;
    }

    public c a(Boolean bool) throws IOException {
        if (bool == null) {
            return e();
        }
        g();
        j();
        this.f9925f.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c a(long j3) throws IOException {
        g();
        j();
        this.f9925f.write(Long.toString(j3));
        return this;
    }

    public c a(Number number) throws IOException {
        if (number == null) {
            return e();
        }
        g();
        String obj = number.toString();
        if (!this.f9922c && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        j();
        this.f9925f.append((CharSequence) obj);
        return this;
    }
}
