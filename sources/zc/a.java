package zc;

import eb.j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import vd.e;
import wh.a0;

/* loaded from: classes3.dex */
public class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final Reader f28715b;

    /* renamed from: j, reason: collision with root package name */
    public long f28722j;

    /* renamed from: k, reason: collision with root package name */
    public int f28723k;

    /* renamed from: l, reason: collision with root package name */
    public String f28724l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f28725m;

    /* renamed from: o, reason: collision with root package name */
    public String[] f28727o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f28728p;

    /* renamed from: q, reason: collision with root package name */
    public int f28729q = 2;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f28716c = new char[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];

    /* renamed from: d, reason: collision with root package name */
    public int f28717d = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f28718f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f28719g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f28720h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f28721i = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f28726n = 1;

    static {
        a0.f27010c = new a0();
    }

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f28725m = iArr;
        iArr[0] = 6;
        this.f28727o = new String[32];
        this.f28728p = new int[32];
        this.f28715b = stringReader;
    }

    public final int T() {
        char c10;
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 15) {
            long j3 = this.f28722j;
            int i11 = (int) j3;
            if (j3 == i11) {
                this.f28721i = 0;
                int[] iArr = this.f28728p;
                int i12 = this.f28726n - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f28722j + v());
        }
        if (i10 == 16) {
            this.f28724l = new String(this.f28716c, this.f28717d, this.f28723k);
            this.f28717d += this.f28723k;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw k0("an int");
            }
            if (i10 == 10) {
                this.f28724l = a0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f28724l = Y(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.f28724l);
                this.f28721i = 0;
                int[] iArr2 = this.f28728p;
                int i13 = this.f28726n - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f28721i = 11;
        double parseDouble = Double.parseDouble(this.f28724l);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.f28724l = null;
            this.f28721i = 0;
            int[] iArr3 = this.f28728p;
            int i15 = this.f28726n - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f28724l + v());
    }

    public final long U() {
        char c10;
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 15) {
            this.f28721i = 0;
            int[] iArr = this.f28728p;
            int i11 = this.f28726n - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f28722j;
        }
        if (i10 == 16) {
            this.f28724l = new String(this.f28716c, this.f28717d, this.f28723k);
            this.f28717d += this.f28723k;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw k0("a long");
            }
            if (i10 == 10) {
                this.f28724l = a0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f28724l = Y(c10);
            }
            try {
                long parseLong = Long.parseLong(this.f28724l);
                this.f28721i = 0;
                int[] iArr2 = this.f28728p;
                int i12 = this.f28726n - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f28721i = 11;
        double parseDouble = Double.parseDouble(this.f28724l);
        long j3 = (long) parseDouble;
        if (j3 == parseDouble) {
            this.f28724l = null;
            this.f28721i = 0;
            int[] iArr3 = this.f28728p;
            int i13 = this.f28726n - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j3;
        }
        throw new NumberFormatException("Expected a long but was " + this.f28724l + v());
    }

    public final String V() {
        String Y;
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 14) {
            Y = a0();
        } else if (i10 == 12) {
            Y = Y('\'');
        } else if (i10 == 13) {
            Y = Y('\"');
        } else {
            throw k0("a name");
        }
        this.f28721i = 0;
        this.f28727o[this.f28726n - 1] = Y;
        return Y;
    }

    public final int W(boolean z10) {
        int i10 = this.f28717d;
        int i11 = this.f28718f;
        while (true) {
            boolean z11 = true;
            if (i10 == i11) {
                this.f28717d = i10;
                if (!r(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + v());
                }
                i10 = this.f28717d;
                i11 = this.f28718f;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f28716c;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f28719g++;
                this.f28720h = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f28717d = i12;
                    if (i12 == i11) {
                        this.f28717d = i12 - 1;
                        boolean r6 = r(2);
                        this.f28717d++;
                        if (!r6) {
                            return c10;
                        }
                    }
                    j();
                    int i13 = this.f28717d;
                    char c11 = cArr[i13];
                    if (c11 != '*') {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f28717d = i13 + 1;
                        g0();
                        i10 = this.f28717d;
                        i11 = this.f28718f;
                    } else {
                        this.f28717d = i13 + 1;
                        while (true) {
                            if (this.f28717d + 2 > this.f28718f && !r(2)) {
                                z11 = false;
                                break;
                            }
                            int i14 = this.f28717d;
                            if (cArr[i14] == '\n') {
                                this.f28719g++;
                                this.f28720h = i14 + 1;
                            } else {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    if (cArr[this.f28717d + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                }
                                break;
                            }
                            this.f28717d++;
                        }
                        if (z11) {
                            i10 = this.f28717d + 2;
                            i11 = this.f28718f;
                        } else {
                            j0("Unterminated comment");
                            throw null;
                        }
                    }
                } else if (c10 == '#') {
                    this.f28717d = i12;
                    j();
                    g0();
                    i10 = this.f28717d;
                    i11 = this.f28718f;
                } else {
                    this.f28717d = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    public final void X() {
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 7) {
            this.f28721i = 0;
            int[] iArr = this.f28728p;
            int i11 = this.f28726n - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw k0(AbstractJsonLexerKt.NULL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        r11.f28717d = r8;
        r8 = (r8 - r2) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r8 + 1) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r4 - r2) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        r1.append(r7, r2, r4 - r2);
        r11.f28717d = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String Y(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f28717d
            int r3 = r11.f28718f
        L6:
            r4 = r2
        L7:
            r5 = 1
            r6 = 16
            char[] r7 = r11.f28716c
            if (r4 >= r3) goto L6c
            int r8 = r4 + 1
            char r4 = r7[r4]
            int r9 = r11.f28729q
            r10 = 3
            if (r9 != r10) goto L22
            r9 = 32
            if (r4 < r9) goto L1c
            goto L22
        L1c:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.j0(r12)
            throw r0
        L22:
            if (r4 != r12) goto L38
            r11.f28717d = r8
            int r8 = r8 - r2
            int r8 = r8 - r5
            if (r1 != 0) goto L30
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r2, r8)
            return r12
        L30:
            r1.append(r7, r2, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L38:
            r9 = 92
            if (r4 != r9) goto L5f
            r11.f28717d = r8
            int r8 = r8 - r2
            int r8 = r8 - r5
            if (r1 != 0) goto L50
            int r1 = r8 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r6)
            r3.<init>(r1)
            r1 = r3
        L50:
            r1.append(r7, r2, r8)
            char r2 = r11.d0()
            r1.append(r2)
            int r2 = r11.f28717d
            int r3 = r11.f28718f
            goto L6
        L5f:
            r6 = 10
            if (r4 != r6) goto L6a
            int r4 = r11.f28719g
            int r4 = r4 + r5
            r11.f28719g = r4
            r11.f28720h = r8
        L6a:
            r4 = r8
            goto L7
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r4 - r2
            int r1 = r1 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r6)
            r3.<init>(r1)
            r1 = r3
        L7c:
            int r3 = r4 - r2
            r1.append(r7, r2, r3)
            r11.f28717d = r4
            boolean r2 = r11.r(r5)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.j0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.a.Y(char):java.lang.String");
    }

    public final String Z() {
        String str;
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 10) {
            str = a0();
        } else if (i10 == 8) {
            str = Y('\'');
        } else if (i10 == 9) {
            str = Y('\"');
        } else if (i10 == 11) {
            str = this.f28724l;
            this.f28724l = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f28722j);
        } else if (i10 == 16) {
            str = new String(this.f28716c, this.f28717d, this.f28723k);
            this.f28717d += this.f28723k;
        } else {
            throw k0("a string");
        }
        this.f28721i = 0;
        int[] iArr = this.f28728p;
        int i11 = this.f28726n - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        j();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a0() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f28717d
            int r4 = r3 + r2
            int r5 = r7.f28718f
            char[] r6 = r7.f28716c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.j()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.r(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f28717d
            r0.append(r6, r3, r2)
            int r3 = r7.f28717d
            int r3 = r3 + r2
            r7.f28717d = r3
            r2 = 1
            boolean r2 = r7.r(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f28717d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f28717d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f28717d
            int r2 = r2 + r1
            r7.f28717d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.a.a0():java.lang.String");
    }

    public final int b0() {
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void c0(int i10) {
        int i11 = this.f28726n;
        int[] iArr = this.f28725m;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f28725m = Arrays.copyOf(iArr, i12);
            this.f28728p = Arrays.copyOf(this.f28728p, i12);
            this.f28727o = (String[]) Arrays.copyOf(this.f28727o, i12);
        }
        int[] iArr2 = this.f28725m;
        int i13 = this.f28726n;
        this.f28726n = i13 + 1;
        iArr2[i13] = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28721i = 0;
        this.f28725m[0] = 8;
        this.f28726n = 1;
        this.f28715b.close();
    }

    public final void d() {
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 3) {
            c0(1);
            this.f28728p[this.f28726n - 1] = 0;
            this.f28721i = 0;
            return;
        }
        throw k0("BEGIN_ARRAY");
    }

    public final char d0() {
        int i10;
        int i11;
        if (this.f28717d == this.f28718f && !r(1)) {
            j0("Unterminated escape sequence");
            throw null;
        }
        int i12 = this.f28717d;
        int i13 = i12 + 1;
        this.f28717d = i13;
        char[] cArr = this.f28716c;
        char c10 = cArr[i12];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 != 'b') {
                            if (c10 != 'f') {
                                if (c10 == 'n') {
                                    return '\n';
                                }
                                if (c10 != 'r') {
                                    if (c10 != 't') {
                                        if (c10 == 'u') {
                                            if (i13 + 4 > this.f28718f && !r(4)) {
                                                j0("Unterminated escape sequence");
                                                throw null;
                                            }
                                            int i14 = this.f28717d;
                                            int i15 = i14 + 4;
                                            int i16 = 0;
                                            while (i14 < i15) {
                                                char c11 = cArr[i14];
                                                int i17 = i16 << 4;
                                                if (c11 >= '0' && c11 <= '9') {
                                                    i11 = c11 - '0';
                                                } else {
                                                    if (c11 >= 'a' && c11 <= 'f') {
                                                        i10 = c11 - 'a';
                                                    } else if (c11 >= 'A' && c11 <= 'F') {
                                                        i10 = c11 - 'A';
                                                    } else {
                                                        j0("Malformed Unicode escape \\u".concat(new String(cArr, this.f28717d, 4)));
                                                        throw null;
                                                    }
                                                    i11 = i10 + 10;
                                                }
                                                i16 = i17 + i11;
                                                i14++;
                                            }
                                            this.f28717d += 4;
                                            return (char) i16;
                                        }
                                        j0("Invalid escape sequence");
                                        throw null;
                                    }
                                    return '\t';
                                }
                                return '\r';
                            }
                            return '\f';
                        }
                        return '\b';
                    }
                }
            }
            return c10;
        }
        if (this.f28729q != 3) {
            this.f28719g++;
            this.f28720h = i13;
        } else {
            j0("Cannot escape a newline character in strict mode");
            throw null;
        }
        if (this.f28729q == 3) {
            j0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c10;
    }

    public final void e0(int i10) {
        if (i10 != 0) {
            this.f28729q = i10;
            return;
        }
        throw null;
    }

    public final void f0(char c10) {
        do {
            int i10 = this.f28717d;
            int i11 = this.f28718f;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.f28716c[i10];
                if (c11 == c10) {
                    this.f28717d = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f28717d = i12;
                    d0();
                    i10 = this.f28717d;
                    i11 = this.f28718f;
                } else {
                    if (c11 == '\n') {
                        this.f28719g++;
                        this.f28720h = i12;
                    }
                    i10 = i12;
                }
            }
            this.f28717d = i10;
        } while (r(1));
        j0("Unterminated string");
        throw null;
    }

    public final void g() {
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 1) {
            c0(3);
            this.f28721i = 0;
            return;
        }
        throw k0("BEGIN_OBJECT");
    }

    public final void g0() {
        char c10;
        do {
            if (this.f28717d < this.f28718f || r(1)) {
                int i10 = this.f28717d;
                int i11 = i10 + 1;
                this.f28717d = i11;
                c10 = this.f28716c[i10];
                if (c10 == '\n') {
                    this.f28719g++;
                    this.f28720h = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void h0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f28717d
            int r2 = r1 + r0
            int r3 = r4.f28718f
            if (r2 >= r3) goto L51
            char[] r2 = r4.f28716c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.j()
        L4b:
            int r1 = r4.f28717d
            int r1 = r1 + r0
            r4.f28717d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f28717d = r1
            r0 = 1
            boolean r0 = r4.r(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.a.h0():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public final void i0() {
        int i10 = 0;
        do {
            int i11 = this.f28721i;
            if (i11 == 0) {
                i11 = k();
            }
            switch (i11) {
                case 1:
                    c0(3);
                    i10++;
                    this.f28721i = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f28727o[this.f28726n - 1] = null;
                    }
                    this.f28726n--;
                    i10--;
                    this.f28721i = 0;
                    break;
                case 3:
                    c0(1);
                    i10++;
                    this.f28721i = 0;
                    break;
                case 4:
                    this.f28726n--;
                    i10--;
                    this.f28721i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f28721i = 0;
                    break;
                case 8:
                    f0('\'');
                    this.f28721i = 0;
                    break;
                case 9:
                    f0('\"');
                    this.f28721i = 0;
                    break;
                case 10:
                    h0();
                    this.f28721i = 0;
                    break;
                case 12:
                    f0('\'');
                    if (i10 == 0) {
                        this.f28727o[this.f28726n - 1] = "<skipped>";
                    }
                    this.f28721i = 0;
                    break;
                case 13:
                    f0('\"');
                    if (i10 == 0) {
                        this.f28727o[this.f28726n - 1] = "<skipped>";
                    }
                    this.f28721i = 0;
                    break;
                case 14:
                    h0();
                    if (i10 == 0) {
                        this.f28727o[this.f28726n - 1] = "<skipped>";
                    }
                    this.f28721i = 0;
                    break;
                case 16:
                    this.f28717d += this.f28723k;
                    this.f28721i = 0;
                    break;
                case 17:
                    return;
            }
        } while (i10 > 0);
        int[] iArr = this.f28728p;
        int i12 = this.f28726n - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public final void j() {
        if (this.f28729q == 1) {
            return;
        }
        j0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void j0(String str) {
        StringBuilder m10 = j.m(str);
        m10.append(v());
        m10.append("\nSee ");
        m10.append(c6.c.i("malformed-json"));
        throw new c(m10.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0217, code lost:
    
        if (u(r1) != false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0219, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021a, code lost:
    
        if (r5 != 2) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x021c, code lost:
    
        if (r13 == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0222, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0224, code lost:
    
        if (r12 == 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022a, code lost:
    
        if (r7 != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x022c, code lost:
    
        if (r12 != 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022e, code lost:
    
        if (r12 == 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0231, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0232, code lost:
    
        r19.f28722j = r7;
        r19.f28717d += r11;
        r7 = 15;
        r19.f28721i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x023e, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x023f, code lost:
    
        if (r5 == r1) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0242, code lost:
    
        if (r5 == 4) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0245, code lost:
    
        if (r5 != 7) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0247, code lost:
    
        r19.f28723k = r11;
        r7 = 16;
        r19.f28721i = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0281 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k() {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.a.k():int");
    }

    public final IllegalStateException k0(String str) {
        String str2;
        if (b0() == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        StringBuilder o10 = a4.j.o("Expected ", str, " but was ");
        o10.append(e.l(b0()));
        o10.append(v());
        o10.append("\nSee ");
        o10.append(c6.c.i(str2));
        return new IllegalStateException(o10.toString());
    }

    public final void p() {
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 4) {
            int i11 = this.f28726n - 1;
            this.f28726n = i11;
            int[] iArr = this.f28728p;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f28721i = 0;
            return;
        }
        throw k0("END_ARRAY");
    }

    public final void q() {
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 2) {
            int i11 = this.f28726n - 1;
            this.f28726n = i11;
            this.f28727o[i11] = null;
            int[] iArr = this.f28728p;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f28721i = 0;
            return;
        }
        throw k0("END_OBJECT");
    }

    public final boolean r(int i10) {
        int i11;
        int i12;
        int i13 = this.f28720h;
        int i14 = this.f28717d;
        this.f28720h = i13 - i14;
        int i15 = this.f28718f;
        char[] cArr = this.f28716c;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f28718f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f28718f = 0;
        }
        this.f28717d = 0;
        do {
            int i17 = this.f28718f;
            int read = this.f28715b.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f28718f + read;
            this.f28718f = i11;
            if (this.f28719g == 0 && (i12 = this.f28720h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f28717d++;
                this.f28720h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final String s(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f28726n;
            if (i10 < i11) {
                int i12 = this.f28725m[i10];
                switch (i12) {
                    case 1:
                    case 2:
                        int i13 = this.f28728p[i10];
                        if (z10 && i13 > 0 && i10 == i11 - 1) {
                            i13--;
                        }
                        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                        sb2.append(i13);
                        sb2.append(AbstractJsonLexerKt.END_LIST);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb2.append('.');
                        String str = this.f28727o[i10];
                        if (str == null) {
                            break;
                        } else {
                            sb2.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(j.i("Unknown scope value: ", i12));
                }
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    public final boolean t() {
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 != 2 && i10 != 4 && i10 != 17) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return a.class.getSimpleName() + v();
    }

    public final boolean u(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    public final String v() {
        StringBuilder n10 = a4.j.n(" at line ", this.f28719g + 1, " column ", (this.f28717d - this.f28720h) + 1, " path ");
        n10.append(s(false));
        return n10.toString();
    }

    public final boolean w() {
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 5) {
            this.f28721i = 0;
            int[] iArr = this.f28728p;
            int i11 = this.f28726n - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f28721i = 0;
            int[] iArr2 = this.f28728p;
            int i12 = this.f28726n - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw k0("a boolean");
    }

    public final double x() {
        char c10;
        int i10 = this.f28721i;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 15) {
            this.f28721i = 0;
            int[] iArr = this.f28728p;
            int i11 = this.f28726n - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f28722j;
        }
        if (i10 == 16) {
            this.f28724l = new String(this.f28716c, this.f28717d, this.f28723k);
            this.f28717d += this.f28723k;
        } else if (i10 != 8 && i10 != 9) {
            if (i10 == 10) {
                this.f28724l = a0();
            } else if (i10 != 11) {
                throw k0("a double");
            }
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.f28724l = Y(c10);
        }
        this.f28721i = 11;
        double parseDouble = Double.parseDouble(this.f28724l);
        if (this.f28729q != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            j0("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f28724l = null;
        this.f28721i = 0;
        int[] iArr2 = this.f28728p;
        int i12 = this.f28726n - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }
}
