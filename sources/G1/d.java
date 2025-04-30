package G1;

import java.io.EOFException;
import java.io.IOException;
import w8.f;
import w8.h;
import w8.i;
import w8.q;
import w8.t;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: n, reason: collision with root package name */
    public static final i f1254n;

    /* renamed from: o, reason: collision with root package name */
    public static final i f1255o;

    /* renamed from: p, reason: collision with root package name */
    public static final i f1256p;

    /* renamed from: h, reason: collision with root package name */
    public final h f1257h;

    /* renamed from: i, reason: collision with root package name */
    public final f f1258i;

    /* renamed from: j, reason: collision with root package name */
    public int f1259j;

    /* renamed from: k, reason: collision with root package name */
    public long f1260k;
    public int l;
    public String m;

    static {
        i iVar = i.f24015f;
        f1254n = r6.b.c("'\\");
        f1255o = r6.b.c("\"\\");
        f1256p = r6.b.c("{}[]:, \n\t\r\f/\\;#=");
        r6.b.c("\n\r");
        r6.b.c("*/");
    }

    public d(t tVar) {
        this.f1251c = new int[32];
        this.f1252d = new String[32];
        this.f1253f = new int[32];
        this.f1259j = 0;
        this.f1257h = tVar;
        this.f1258i = tVar.f24039c;
        p(6);
    }

    public final String C() {
        String str;
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 == 14) {
            str = F();
        } else if (i9 == 13) {
            str = E(f1255o);
        } else if (i9 == 12) {
            str = E(f1254n);
        } else if (i9 == 15) {
            str = this.m;
        } else {
            throw new RuntimeException("Expected a name but was " + AbstractC2914a.n(o()) + " at path " + i());
        }
        this.f1259j = 0;
        this.f1252d[this.b - 1] = str;
        return str;
    }

    public final int D(boolean z8) {
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            h hVar = this.f1257h;
            if (hVar.request(i10)) {
                long j7 = i9;
                f fVar = this.f1258i;
                byte c9 = fVar.c(j7);
                if (c9 != 10 && c9 != 32 && c9 != 13 && c9 != 9) {
                    fVar.skip(j7);
                    if (c9 == 47) {
                        if (!hVar.request(2L)) {
                            return c9;
                        }
                        u();
                        throw null;
                    }
                    if (c9 != 35) {
                        return c9;
                    }
                    u();
                    throw null;
                }
                i9 = i10;
            } else {
                if (!z8) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }

    public final String E(i iVar) {
        StringBuilder sb = null;
        while (true) {
            long e4 = this.f1257h.e(iVar);
            if (e4 != -1) {
                f fVar = this.f1258i;
                if (fVar.c(e4) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(fVar.readString(e4, O7.a.f2244a));
                    fVar.readByte();
                    sb.append(G());
                } else {
                    if (sb == null) {
                        String readString = fVar.readString(e4, O7.a.f2244a);
                        fVar.readByte();
                        return readString;
                    }
                    sb.append(fVar.readString(e4, O7.a.f2244a));
                    fVar.readByte();
                    return sb.toString();
                }
            } else {
                t("Unterminated string");
                throw null;
            }
        }
    }

    public final String F() {
        long e4 = this.f1257h.e(f1256p);
        f fVar = this.f1258i;
        if (e4 != -1) {
            fVar.getClass();
            return fVar.readString(e4, O7.a.f2244a);
        }
        return fVar.readUtf8();
    }

    public final char G() {
        int i9;
        h hVar = this.f1257h;
        if (hVar.request(1L)) {
            f fVar = this.f1258i;
            byte readByte = fVar.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (hVar.request(4L)) {
                                        char c9 = 0;
                                        for (int i10 = 0; i10 < 4; i10++) {
                                            byte c10 = fVar.c(i10);
                                            char c11 = (char) (c9 << 4);
                                            if (c10 >= 48 && c10 <= 57) {
                                                i9 = c10 - 48;
                                            } else if (c10 >= 97 && c10 <= 102) {
                                                i9 = c10 - 87;
                                            } else {
                                                if (c10 < 65 || c10 > 70) {
                                                    t("\\u".concat(fVar.readString(4L, O7.a.f2244a)));
                                                    throw null;
                                                }
                                                i9 = c10 - 55;
                                            }
                                            c9 = (char) (i9 + c11);
                                        }
                                        fVar.skip(4L);
                                        return c9;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + i());
                                }
                                t("Invalid escape sequence: \\" + ((char) readByte));
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
            return (char) readByte;
        }
        t("Unterminated escape sequence");
        throw null;
    }

    public final void H(i iVar) {
        while (true) {
            long e4 = this.f1257h.e(iVar);
            if (e4 != -1) {
                f fVar = this.f1258i;
                if (fVar.c(e4) == 92) {
                    fVar.skip(e4 + 1);
                    G();
                } else {
                    fVar.skip(e4 + 1);
                    return;
                }
            } else {
                t("Unterminated string");
                throw null;
            }
        }
    }

    @Override // G1.c
    public final void a() {
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 == 3) {
            p(1);
            this.f1253f[this.b - 1] = 0;
            this.f1259j = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_ARRAY but was " + AbstractC2914a.n(o()) + " at path " + i());
        }
    }

    @Override // G1.c
    public final void b() {
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 == 1) {
            p(3);
            this.f1259j = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_OBJECT but was " + AbstractC2914a.n(o()) + " at path " + i());
        }
    }

    @Override // G1.c
    public final void c() {
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 == 4) {
            int i10 = this.b;
            this.b = i10 - 1;
            int[] iArr = this.f1253f;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.f1259j = 0;
            return;
        }
        throw new RuntimeException("Expected END_ARRAY but was " + AbstractC2914a.n(o()) + " at path " + i());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1259j = 0;
        this.f1251c[0] = 8;
        this.b = 1;
        f fVar = this.f1258i;
        fVar.skip(fVar.f24014c);
        this.f1257h.close();
    }

    @Override // G1.c
    public final void h() {
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 == 2) {
            int i10 = this.b;
            int i11 = i10 - 1;
            this.b = i11;
            this.f1252d[i11] = null;
            int[] iArr = this.f1253f;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f1259j = 0;
            return;
        }
        throw new RuntimeException("Expected END_OBJECT but was " + AbstractC2914a.n(o()) + " at path " + i());
    }

    @Override // G1.c
    public final boolean j() {
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 != 2 && i9 != 4 && i9 != 18) {
            return true;
        }
        return false;
    }

    @Override // G1.c
    public final boolean k() {
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 == 5) {
            this.f1259j = 0;
            int[] iArr = this.f1253f;
            int i10 = this.b - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i9 == 6) {
            this.f1259j = 0;
            int[] iArr2 = this.f1253f;
            int i11 = this.b - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new RuntimeException("Expected a boolean but was " + AbstractC2914a.n(o()) + " at path " + i());
    }

    @Override // G1.c
    public final double l() {
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 == 16) {
            this.f1259j = 0;
            int[] iArr = this.f1253f;
            int i10 = this.b - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f1260k;
        }
        if (i9 == 17) {
            long j7 = this.l;
            f fVar = this.f1258i;
            fVar.getClass();
            this.m = fVar.readString(j7, O7.a.f2244a);
        } else if (i9 == 9) {
            this.m = E(f1255o);
        } else if (i9 == 8) {
            this.m = E(f1254n);
        } else if (i9 == 10) {
            this.m = F();
        } else if (i9 != 11) {
            throw new RuntimeException("Expected a double but was " + AbstractC2914a.n(o()) + " at path " + i());
        }
        this.f1259j = 11;
        try {
            double parseDouble = Double.parseDouble(this.m);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.m = null;
                this.f1259j = 0;
                int[] iArr2 = this.f1253f;
                int i11 = this.b - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseDouble;
            }
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + i());
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Expected a double but was " + this.m + " at path " + i());
        }
    }

    @Override // G1.c
    public final int m() {
        String E8;
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 == 16) {
            long j7 = this.f1260k;
            int i10 = (int) j7;
            if (j7 == i10) {
                this.f1259j = 0;
                int[] iArr = this.f1253f;
                int i11 = this.b - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new RuntimeException("Expected an int but was " + this.f1260k + " at path " + i());
        }
        if (i9 == 17) {
            long j9 = this.l;
            f fVar = this.f1258i;
            fVar.getClass();
            this.m = fVar.readString(j9, O7.a.f2244a);
        } else if (i9 != 9 && i9 != 8) {
            if (i9 != 11) {
                throw new RuntimeException("Expected an int but was " + AbstractC2914a.n(o()) + " at path " + i());
            }
        } else {
            if (i9 == 9) {
                E8 = E(f1255o);
            } else {
                E8 = E(f1254n);
            }
            this.m = E8;
            try {
                int parseInt = Integer.parseInt(E8);
                this.f1259j = 0;
                int[] iArr2 = this.f1253f;
                int i12 = this.b - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1259j = 11;
        try {
            double parseDouble = Double.parseDouble(this.m);
            int i13 = (int) parseDouble;
            if (i13 == parseDouble) {
                this.m = null;
                this.f1259j = 0;
                int[] iArr3 = this.f1253f;
                int i14 = this.b - 1;
                iArr3[i14] = iArr3[i14] + 1;
                return i13;
            }
            throw new RuntimeException("Expected an int but was " + this.m + " at path " + i());
        } catch (NumberFormatException unused2) {
            throw new RuntimeException("Expected an int but was " + this.m + " at path " + i());
        }
    }

    @Override // G1.c
    public final String n() {
        String readString;
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 == 10) {
            readString = F();
        } else if (i9 == 9) {
            readString = E(f1255o);
        } else if (i9 == 8) {
            readString = E(f1254n);
        } else if (i9 == 11) {
            readString = this.m;
            this.m = null;
        } else if (i9 == 16) {
            readString = Long.toString(this.f1260k);
        } else if (i9 == 17) {
            long j7 = this.l;
            f fVar = this.f1258i;
            fVar.getClass();
            readString = fVar.readString(j7, O7.a.f2244a);
        } else {
            throw new RuntimeException("Expected a string but was " + AbstractC2914a.n(o()) + " at path " + i());
        }
        this.f1259j = 0;
        int[] iArr = this.f1253f;
        int i10 = this.b - 1;
        iArr[i10] = iArr[i10] + 1;
        return readString;
    }

    @Override // G1.c
    public final int o() {
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        switch (i9) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // G1.c
    public final int q(a7.b bVar) {
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 < 12 || i9 > 15) {
            return -1;
        }
        if (i9 == 15) {
            return w(this.m, bVar);
        }
        int g9 = this.f1257h.g((q) bVar.f4078d);
        if (g9 != -1) {
            this.f1259j = 0;
            this.f1252d[this.b - 1] = ((String[]) bVar.f4077c)[g9];
            return g9;
        }
        String str = this.f1252d[this.b - 1];
        String C8 = C();
        int w2 = w(C8, bVar);
        if (w2 == -1) {
            this.f1259j = 15;
            this.m = C8;
            this.f1252d[this.b - 1] = str;
        }
        return w2;
    }

    @Override // G1.c
    public final void r() {
        int i9 = this.f1259j;
        if (i9 == 0) {
            i9 = v();
        }
        if (i9 == 14) {
            long e4 = this.f1257h.e(f1256p);
            f fVar = this.f1258i;
            if (e4 == -1) {
                e4 = fVar.f24014c;
            }
            fVar.skip(e4);
        } else if (i9 == 13) {
            H(f1255o);
        } else if (i9 == 12) {
            H(f1254n);
        } else if (i9 != 15) {
            throw new RuntimeException("Expected a name but was " + AbstractC2914a.n(o()) + " at path " + i());
        }
        this.f1259j = 0;
        this.f1252d[this.b - 1] = "null";
    }

    @Override // G1.c
    public final void s() {
        int i9 = 0;
        do {
            int i10 = this.f1259j;
            if (i10 == 0) {
                i10 = v();
            }
            if (i10 == 3) {
                p(1);
            } else if (i10 == 1) {
                p(3);
            } else {
                if (i10 == 4) {
                    i9--;
                    if (i9 >= 0) {
                        this.b--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + AbstractC2914a.n(o()) + " at path " + i());
                    }
                } else if (i10 == 2) {
                    i9--;
                    if (i9 >= 0) {
                        this.b--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + AbstractC2914a.n(o()) + " at path " + i());
                    }
                } else {
                    f fVar = this.f1258i;
                    if (i10 != 14 && i10 != 10) {
                        if (i10 != 9 && i10 != 13) {
                            if (i10 != 8 && i10 != 12) {
                                if (i10 == 17) {
                                    fVar.skip(this.l);
                                } else if (i10 == 18) {
                                    throw new RuntimeException("Expected a value but was " + AbstractC2914a.n(o()) + " at path " + i());
                                }
                            } else {
                                H(f1254n);
                            }
                        } else {
                            H(f1255o);
                        }
                    } else {
                        long e4 = this.f1257h.e(f1256p);
                        if (e4 == -1) {
                            e4 = fVar.f24014c;
                        }
                        fVar.skip(e4);
                    }
                }
                this.f1259j = 0;
            }
            i9++;
            this.f1259j = 0;
        } while (i9 != 0);
        int[] iArr = this.f1253f;
        int i11 = this.b - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f1252d[i11] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.f1257h + ")";
    }

    public final void u() {
        t("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b2, code lost:
    
        r21.f1260k = r10;
        r9.skip(r5);
        r1 = 16;
        r21.f1259j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01bf, code lost:
    
        if (r4 == 2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c2, code lost:
    
        if (r4 == 4) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c5, code lost:
    
        if (r4 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c7, code lost:
    
        r21.l = r5;
        r1 = 17;
        r21.f1259j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        if (x(r1) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019a, code lost:
    
        if (r4 != 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019c, code lost:
    
        if (r8 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
    
        if (r10 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a4, code lost:
    
        if (r13 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01aa, code lost:
    
        if (r10 != 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        if (r13 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ae, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b1, code lost:
    
        r10 = -r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v() {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.d.v():int");
    }

    public final int w(String str, a7.b bVar) {
        int length = ((String[]) bVar.f4077c).length;
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(((String[]) bVar.f4077c)[i9])) {
                this.f1259j = 0;
                this.f1252d[this.b - 1] = str;
                return i9;
            }
        }
        return -1;
    }

    public final boolean x(int i9) {
        if (i9 != 9 && i9 != 10 && i9 != 12 && i9 != 13 && i9 != 32) {
            if (i9 != 35) {
                if (i9 != 44) {
                    if (i9 != 47 && i9 != 61) {
                        if (i9 != 123 && i9 != 125 && i9 != 58) {
                            if (i9 != 59) {
                                switch (i9) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            u();
            throw null;
        }
        return false;
    }
}
