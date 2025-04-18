package zc;

import com.google.gson.j;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public class b implements Closeable, Flushable {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f28730n = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f28731o = new String[128];

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f28732p;

    /* renamed from: b, reason: collision with root package name */
    public final Writer f28733b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f28734c;

    /* renamed from: d, reason: collision with root package name */
    public int f28735d;

    /* renamed from: f, reason: collision with root package name */
    public j f28736f;

    /* renamed from: g, reason: collision with root package name */
    public String f28737g;

    /* renamed from: h, reason: collision with root package name */
    public String f28738h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28739i;

    /* renamed from: j, reason: collision with root package name */
    public int f28740j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28741k;

    /* renamed from: l, reason: collision with root package name */
    public String f28742l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28743m;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f28731o[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f28731o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f28732p = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f28734c = iArr;
        this.f28735d = 0;
        if (iArr.length == 0) {
            this.f28734c = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f28734c;
        int i10 = this.f28735d;
        this.f28735d = i10 + 1;
        iArr2[i10] = 6;
        this.f28740j = 2;
        this.f28743m = true;
        Objects.requireNonNull(writer, "out == null");
        this.f28733b = writer;
        v(j.f12102d);
    }

    public void T(double d10) {
        Z();
        if (this.f28740j != 1 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        d();
        this.f28733b.append((CharSequence) Double.toString(d10));
    }

    public void U(long j3) {
        Z();
        d();
        this.f28733b.write(Long.toString(j3));
    }

    public void V(Boolean bool) {
        String str;
        if (bool == null) {
            t();
            return;
        }
        Z();
        d();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.f28733b.write(str);
    }

    public void W(Number number) {
        if (number == null) {
            t();
            return;
        }
        Z();
        String obj = number.toString();
        boolean z10 = true;
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                z10 = false;
            }
            if (!z10 && !f28730n.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f28740j != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        d();
        this.f28733b.append((CharSequence) obj);
    }

    public void X(String str) {
        if (str == null) {
            t();
            return;
        }
        Z();
        d();
        x(str);
    }

    public void Y(boolean z10) {
        String str;
        Z();
        d();
        if (z10) {
            str = "true";
        } else {
            str = "false";
        }
        this.f28733b.write(str);
    }

    public final void Z() {
        if (this.f28742l != null) {
            int u = u();
            if (u == 5) {
                this.f28733b.write(this.f28738h);
            } else if (u != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            s();
            this.f28734c[this.f28735d - 1] = 4;
            x(this.f28742l);
            this.f28742l = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28733b.close();
        int i10 = this.f28735d;
        if (i10 <= 1 && (i10 != 1 || this.f28734c[i10 - 1] == 7)) {
            this.f28735d = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d() {
        int u = u();
        if (u != 1) {
            Writer writer = this.f28733b;
            if (u != 2) {
                if (u != 4) {
                    if (u != 6) {
                        if (u == 7) {
                            if (this.f28740j != 1) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f28734c[this.f28735d - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f28737g);
                this.f28734c[this.f28735d - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.f28738h);
            s();
            return;
        }
        this.f28734c[this.f28735d - 1] = 2;
        s();
    }

    public void flush() {
        if (this.f28735d != 0) {
            this.f28733b.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g() {
        Z();
        d();
        int i10 = this.f28735d;
        int[] iArr = this.f28734c;
        if (i10 == iArr.length) {
            this.f28734c = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f28734c;
        int i11 = this.f28735d;
        this.f28735d = i11 + 1;
        iArr2[i11] = 1;
        this.f28733b.write(91);
    }

    public void j() {
        Z();
        d();
        int i10 = this.f28735d;
        int[] iArr = this.f28734c;
        if (i10 == iArr.length) {
            this.f28734c = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f28734c;
        int i11 = this.f28735d;
        this.f28735d = i11 + 1;
        iArr2[i11] = 3;
        this.f28733b.write(123);
    }

    public final void k(int i10, int i11, char c10) {
        int u = u();
        if (u != i11 && u != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f28742l == null) {
            this.f28735d--;
            if (u == i11) {
                s();
            }
            this.f28733b.write(c10);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f28742l);
    }

    public void p() {
        k(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public void q() {
        k(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    public void r(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f28742l == null) {
            int u = u();
            if (u != 3 && u != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.f28742l = str;
            return;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void s() {
        if (this.f28739i) {
            return;
        }
        String str = this.f28736f.a;
        Writer writer = this.f28733b;
        writer.write(str);
        int i10 = this.f28735d;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f28736f.f12103b);
        }
    }

    public b t() {
        if (this.f28742l != null) {
            if (this.f28743m) {
                Z();
            } else {
                this.f28742l = null;
                return this;
            }
        }
        d();
        this.f28733b.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public final int u() {
        int i10 = this.f28735d;
        if (i10 != 0) {
            return this.f28734c[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void v(j jVar) {
        boolean z10;
        Objects.requireNonNull(jVar);
        this.f28736f = jVar;
        this.f28738h = ",";
        if (jVar.f12104c) {
            this.f28737g = ": ";
            if (jVar.a.isEmpty()) {
                this.f28738h = ", ";
            }
        } else {
            this.f28737g = ":";
        }
        if (this.f28736f.a.isEmpty() && this.f28736f.f12103b.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28739i = z10;
    }

    public final void w(int i10) {
        if (i10 == 0) {
            throw null;
        }
        this.f28740j = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f28741k
            if (r0 == 0) goto L7
            java.lang.String[] r0 = zc.b.f28732p
            goto L9
        L7:
            java.lang.String[] r0 = zc.b.f28731o
        L9:
            java.io.Writer r1 = r8.f28733b
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.b.x(java.lang.String):void");
    }
}
