package yg;

import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class r extends s {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f28258k = new String[128];

    /* renamed from: i, reason: collision with root package name */
    public final ki.j f28259i;

    /* renamed from: j, reason: collision with root package name */
    public String f28260j;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f28258k[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f28258k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public r(ki.i iVar) {
        this.f28259i = iVar;
        int[] iArr = this.f28262c;
        int i10 = this.f28261b;
        this.f28261b = i10 + 1;
        iArr[i10] = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(ki.j r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = yg.r.f28258k
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.P(r4, r3, r8)
        L2e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.P(r4, r2, r8)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.r.w(ki.j, java.lang.String):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28259i.close();
        int i10 = this.f28261b;
        if (i10 <= 1 && (i10 != 1 || this.f28262c[i10 - 1] == 7)) {
            this.f28261b = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // yg.s
    public final r d() {
        if (!this.f28265g) {
            x();
            v(1, 2, AbstractJsonLexerKt.BEGIN_LIST);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + z());
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f28261b != 0) {
            this.f28259i.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // yg.s
    public final r g() {
        if (!this.f28265g) {
            x();
            v(3, 5, AbstractJsonLexerKt.BEGIN_OBJ);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + z());
    }

    @Override // yg.s
    public final r j() {
        this.f28265g = false;
        u(3, 5, AbstractJsonLexerKt.END_OBJ);
        return this;
    }

    @Override // yg.s
    public final r k(String str) {
        if (str != null) {
            if (this.f28261b != 0) {
                int q10 = q();
                if ((q10 == 3 || q10 == 5) && this.f28260j == null && !this.f28265g) {
                    this.f28260j = str;
                    this.f28263d[this.f28261b - 1] = str;
                    return this;
                }
                throw new IllegalStateException("Nesting problem.");
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new NullPointerException("name == null");
    }

    @Override // yg.s
    public final r p() {
        if (!this.f28265g) {
            if (this.f28260j != null) {
                this.f28260j = null;
                return this;
            }
            t();
            this.f28259i.writeUtf8(AbstractJsonLexerKt.NULL);
            int[] iArr = this.f28264f;
            int i10 = this.f28261b - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + z());
    }

    @Override // yg.s
    public final r r(long j3) {
        if (this.f28265g) {
            this.f28265g = false;
            k(Long.toString(j3));
            return this;
        }
        x();
        t();
        this.f28259i.writeUtf8(Long.toString(j3));
        int[] iArr = this.f28264f;
        int i10 = this.f28261b - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // yg.s
    public final r s(String str) {
        if (str == null) {
            p();
            return this;
        }
        if (this.f28265g) {
            this.f28265g = false;
            k(str);
            return this;
        }
        x();
        t();
        w(this.f28259i, str);
        int[] iArr = this.f28264f;
        int i10 = this.f28261b - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final void t() {
        int q10 = q();
        int i10 = 2;
        if (q10 != 1) {
            ki.j jVar = this.f28259i;
            if (q10 != 2) {
                if (q10 != 4) {
                    if (q10 != 9) {
                        i10 = 7;
                        if (q10 != 6) {
                            if (q10 == 7) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                            throw new IllegalStateException("Nesting problem.");
                        }
                    } else {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                } else {
                    jVar.writeUtf8(":");
                    i10 = 5;
                }
            } else {
                jVar.writeByte(44);
            }
        }
        this.f28262c[this.f28261b - 1] = i10;
    }

    public final void u(int i10, int i11, char c10) {
        int q10 = q();
        if (q10 != i11 && q10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f28260j == null) {
            int i12 = this.f28261b;
            int i13 = ~this.f28266h;
            if (i12 == i13) {
                this.f28266h = i13;
                return;
            }
            int i14 = i12 - 1;
            this.f28261b = i14;
            this.f28263d[i14] = null;
            int[] iArr = this.f28264f;
            int i15 = i14 - 1;
            iArr[i15] = iArr[i15] + 1;
            this.f28259i.writeByte(c10);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f28260j);
    }

    public final void v(int i10, int i11, char c10) {
        int i12;
        int i13 = this.f28261b;
        int i14 = this.f28266h;
        if (i13 == i14 && ((i12 = this.f28262c[i13 - 1]) == i10 || i12 == i11)) {
            this.f28266h = ~i14;
            return;
        }
        t();
        int i15 = this.f28261b;
        int[] iArr = this.f28262c;
        if (i15 == iArr.length) {
            if (i15 != 256) {
                this.f28262c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f28263d;
                this.f28263d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f28264f;
                this.f28264f = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new androidx.fragment.app.z("Nesting too deep at " + z() + ": circular reference?");
            }
        }
        int[] iArr3 = this.f28262c;
        int i16 = this.f28261b;
        int i17 = i16 + 1;
        this.f28261b = i17;
        iArr3[i16] = i10;
        this.f28264f[i17 - 1] = 0;
        this.f28259i.writeByte(c10);
    }

    public final void x() {
        if (this.f28260j != null) {
            int q10 = q();
            ki.j jVar = this.f28259i;
            if (q10 == 5) {
                jVar.writeByte(44);
            } else if (q10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f28262c[this.f28261b - 1] = 4;
            w(jVar, this.f28260j);
            this.f28260j = null;
        }
    }
}
