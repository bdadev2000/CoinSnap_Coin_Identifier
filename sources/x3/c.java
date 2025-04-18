package x3;

import androidx.fragment.app.z;
import d3.g;
import java.io.EOFException;
import ki.e0;
import ki.i;
import ki.k;
import ki.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import vd.e;
import wh.a0;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: n, reason: collision with root package name */
    public static final l f27354n;

    /* renamed from: o, reason: collision with root package name */
    public static final l f27355o;

    /* renamed from: p, reason: collision with root package name */
    public static final l f27356p;

    /* renamed from: h, reason: collision with root package name */
    public final k f27357h;

    /* renamed from: i, reason: collision with root package name */
    public final i f27358i;

    /* renamed from: j, reason: collision with root package name */
    public int f27359j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f27360k;

    /* renamed from: l, reason: collision with root package name */
    public int f27361l;

    /* renamed from: m, reason: collision with root package name */
    public String f27362m;

    static {
        l lVar = l.f20996f;
        f27354n = a0.p("'\\");
        f27355o = a0.p("\"\\");
        f27356p = a0.p("{}[]:, \n\t\r\f/\\;#=");
        a0.p("\n\r");
        a0.p("*/");
    }

    public c(e0 e0Var) {
        this.f27357h = e0Var;
        this.f27358i = e0Var.f20977c;
        v(6);
    }

    @Override // x3.b
    public final void T() {
        int i10 = 0;
        do {
            int i11 = this.f27359j;
            if (i11 == 0) {
                i11 = W();
            }
            if (i11 == 3) {
                v(1);
            } else if (i11 == 1) {
                v(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 >= 0) {
                        this.f27350b--;
                    } else {
                        throw new z("Expected a value but was " + e.j(u()) + " at path " + z());
                    }
                } else if (i11 == 2) {
                    i10--;
                    if (i10 >= 0) {
                        this.f27350b--;
                    } else {
                        throw new z("Expected a value but was " + e.j(u()) + " at path " + z());
                    }
                } else {
                    i iVar = this.f27358i;
                    if (i11 != 14 && i11 != 10) {
                        if (i11 != 9 && i11 != 13) {
                            if (i11 != 8 && i11 != 12) {
                                if (i11 == 17) {
                                    iVar.skip(this.f27361l);
                                } else if (i11 == 18) {
                                    throw new z("Expected a value but was " + e.j(u()) + " at path " + z());
                                }
                            } else {
                                e0(f27354n);
                            }
                        } else {
                            e0(f27355o);
                        }
                    } else {
                        long c10 = this.f27357h.c(f27356p);
                        if (c10 == -1) {
                            c10 = iVar.f20994c;
                        }
                        iVar.skip(c10);
                    }
                }
                this.f27359j = 0;
            }
            i10++;
            this.f27359j = 0;
        } while (i10 != 0);
        int[] iArr = this.f27353f;
        int i12 = this.f27350b;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f27352d[i12 - 1] = AbstractJsonLexerKt.NULL;
    }

    public final void V() {
        U("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01be, code lost:
    
        if (r4 != 7) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c0, code lost:
    
        r17.f27361l = r3;
        r8 = 17;
        r17.f27359j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0193, code lost:
    
        if (Y(r1) != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0195, code lost:
    
        if (r4 != 2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0197, code lost:
    
        if (r6 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019d, code lost:
    
        if (r10 != Long.MIN_VALUE) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
    
        if (r7 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a5, code lost:
    
        if (r10 != 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a7, code lost:
    
        if (r7 != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a9, code lost:
    
        if (r7 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ac, code lost:
    
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ad, code lost:
    
        r17.f27360k = r10;
        r5.skip(r3);
        r8 = 16;
        r17.f27359j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b8, code lost:
    
        if (r4 == 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bb, code lost:
    
        if (r4 == 4) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int W() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.c.W():int");
    }

    public final int X(String str, g gVar) {
        int length = ((String[]) gVar.f16812c).length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(((String[]) gVar.f16812c)[i10])) {
                this.f27359j = 0;
                this.f27352d[this.f27350b - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean Y(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        V();
        throw null;
    }

    public final String Z() {
        String str;
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 14) {
            str = c0();
        } else if (i10 == 13) {
            str = b0(f27355o);
        } else if (i10 == 12) {
            str = b0(f27354n);
        } else if (i10 == 15) {
            str = this.f27362m;
        } else {
            throw new z("Expected a name but was " + e.j(u()) + " at path " + z());
        }
        this.f27359j = 0;
        this.f27352d[this.f27350b - 1] = str;
        return str;
    }

    public final int a0(boolean z10) {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            k kVar = this.f27357h;
            if (kVar.request(i11)) {
                long j3 = i10;
                i iVar = this.f27358i;
                byte k10 = iVar.k(j3);
                if (k10 != 10 && k10 != 32 && k10 != 13 && k10 != 9) {
                    iVar.skip(i11 - 1);
                    if (k10 == 47) {
                        if (!kVar.request(2L)) {
                            return k10;
                        }
                        V();
                        throw null;
                    }
                    if (k10 != 35) {
                        return k10;
                    }
                    V();
                    throw null;
                }
                i10 = i11;
            } else {
                if (!z10) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }

    public final String b0(l lVar) {
        StringBuilder sb2 = null;
        while (true) {
            long c10 = this.f27357h.c(lVar);
            if (c10 != -1) {
                i iVar = this.f27358i;
                if (iVar.k(c10) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(iVar.readUtf8(c10));
                    iVar.readByte();
                    sb2.append(d0());
                } else {
                    if (sb2 == null) {
                        String readUtf8 = iVar.readUtf8(c10);
                        iVar.readByte();
                        return readUtf8;
                    }
                    sb2.append(iVar.readUtf8(c10));
                    iVar.readByte();
                    return sb2.toString();
                }
            } else {
                U("Unterminated string");
                throw null;
            }
        }
    }

    public final String c0() {
        long c10 = this.f27357h.c(f27356p);
        i iVar = this.f27358i;
        if (c10 != -1) {
            return iVar.readUtf8(c10);
        }
        return iVar.readUtf8();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f27359j = 0;
        this.f27351c[0] = 8;
        this.f27350b = 1;
        this.f27358i.d();
        this.f27357h.close();
    }

    @Override // x3.b
    public final void d() {
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 3) {
            v(1);
            this.f27353f[this.f27350b - 1] = 0;
            this.f27359j = 0;
        } else {
            throw new z("Expected BEGIN_ARRAY but was " + e.j(u()) + " at path " + z());
        }
    }

    public final char d0() {
        int i10;
        int i11;
        k kVar = this.f27357h;
        if (kVar.request(1L)) {
            i iVar = this.f27358i;
            byte readByte = iVar.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (kVar.request(4L)) {
                                        char c10 = 0;
                                        for (int i12 = 0; i12 < 4; i12++) {
                                            byte k10 = iVar.k(i12);
                                            char c11 = (char) (c10 << 4);
                                            if (k10 >= 48 && k10 <= 57) {
                                                i11 = k10 - 48;
                                            } else {
                                                if (k10 >= 97 && k10 <= 102) {
                                                    i10 = k10 - 97;
                                                } else {
                                                    if (k10 < 65 || k10 > 70) {
                                                        U("\\u".concat(iVar.readUtf8(4L)));
                                                        throw null;
                                                    }
                                                    i10 = k10 - 65;
                                                }
                                                i11 = i10 + 10;
                                            }
                                            c10 = (char) (i11 + c11);
                                        }
                                        iVar.skip(4L);
                                        return c10;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + z());
                                }
                                U("Invalid escape sequence: \\" + ((char) readByte));
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
        U("Unterminated escape sequence");
        throw null;
    }

    public final void e0(l lVar) {
        while (true) {
            long c10 = this.f27357h.c(lVar);
            if (c10 != -1) {
                i iVar = this.f27358i;
                if (iVar.k(c10) == 92) {
                    iVar.skip(c10 + 1);
                    d0();
                } else {
                    iVar.skip(c10 + 1);
                    return;
                }
            } else {
                U("Unterminated string");
                throw null;
            }
        }
    }

    @Override // x3.b
    public final void g() {
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 1) {
            v(3);
            this.f27359j = 0;
        } else {
            throw new z("Expected BEGIN_OBJECT but was " + e.j(u()) + " at path " + z());
        }
    }

    @Override // x3.b
    public final void j() {
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 4) {
            int i11 = this.f27350b - 1;
            this.f27350b = i11;
            int[] iArr = this.f27353f;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f27359j = 0;
            return;
        }
        throw new z("Expected END_ARRAY but was " + e.j(u()) + " at path " + z());
    }

    @Override // x3.b
    public final void k() {
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 2) {
            int i11 = this.f27350b - 1;
            this.f27350b = i11;
            this.f27352d[i11] = null;
            int[] iArr = this.f27353f;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f27359j = 0;
            return;
        }
        throw new z("Expected END_OBJECT but was " + e.j(u()) + " at path " + z());
    }

    @Override // x3.b
    public final boolean p() {
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 != 2 && i10 != 4 && i10 != 18) {
            return true;
        }
        return false;
    }

    @Override // x3.b
    public final boolean q() {
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 5) {
            this.f27359j = 0;
            int[] iArr = this.f27353f;
            int i11 = this.f27350b - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f27359j = 0;
            int[] iArr2 = this.f27353f;
            int i12 = this.f27350b - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new z("Expected a boolean but was " + e.j(u()) + " at path " + z());
    }

    @Override // x3.b
    public final double r() {
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 16) {
            this.f27359j = 0;
            int[] iArr = this.f27353f;
            int i11 = this.f27350b - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f27360k;
        }
        if (i10 == 17) {
            this.f27362m = this.f27358i.readUtf8(this.f27361l);
        } else if (i10 == 9) {
            this.f27362m = b0(f27355o);
        } else if (i10 == 8) {
            this.f27362m = b0(f27354n);
        } else if (i10 == 10) {
            this.f27362m = c0();
        } else if (i10 != 11) {
            throw new z("Expected a double but was " + e.j(u()) + " at path " + z());
        }
        this.f27359j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f27362m);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.f27362m = null;
                this.f27359j = 0;
                int[] iArr2 = this.f27353f;
                int i12 = this.f27350b - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new a("JSON forbids NaN and infinities: " + parseDouble + " at path " + z());
        } catch (NumberFormatException unused) {
            throw new z("Expected a double but was " + this.f27362m + " at path " + z());
        }
    }

    @Override // x3.b
    public final int s() {
        String b02;
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 16) {
            long j3 = this.f27360k;
            int i11 = (int) j3;
            if (j3 == i11) {
                this.f27359j = 0;
                int[] iArr = this.f27353f;
                int i12 = this.f27350b - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new z("Expected an int but was " + this.f27360k + " at path " + z());
        }
        if (i10 == 17) {
            this.f27362m = this.f27358i.readUtf8(this.f27361l);
        } else if (i10 != 9 && i10 != 8) {
            if (i10 != 11) {
                throw new z("Expected an int but was " + e.j(u()) + " at path " + z());
            }
        } else {
            if (i10 == 9) {
                b02 = b0(f27355o);
            } else {
                b02 = b0(f27354n);
            }
            this.f27362m = b02;
            try {
                int parseInt = Integer.parseInt(b02);
                this.f27359j = 0;
                int[] iArr2 = this.f27353f;
                int i13 = this.f27350b - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f27359j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f27362m);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f27362m = null;
                this.f27359j = 0;
                int[] iArr3 = this.f27353f;
                int i15 = this.f27350b - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new z("Expected an int but was " + this.f27362m + " at path " + z());
        } catch (NumberFormatException unused2) {
            throw new z("Expected an int but was " + this.f27362m + " at path " + z());
        }
    }

    @Override // x3.b
    public final String t() {
        String readUtf8;
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 10) {
            readUtf8 = c0();
        } else if (i10 == 9) {
            readUtf8 = b0(f27355o);
        } else if (i10 == 8) {
            readUtf8 = b0(f27354n);
        } else if (i10 == 11) {
            readUtf8 = this.f27362m;
            this.f27362m = null;
        } else if (i10 == 16) {
            readUtf8 = Long.toString(this.f27360k);
        } else if (i10 == 17) {
            readUtf8 = this.f27358i.readUtf8(this.f27361l);
        } else {
            throw new z("Expected a string but was " + e.j(u()) + " at path " + z());
        }
        this.f27359j = 0;
        int[] iArr = this.f27353f;
        int i11 = this.f27350b - 1;
        iArr[i11] = iArr[i11] + 1;
        return readUtf8;
    }

    public final String toString() {
        return "JsonReader(" + this.f27357h + ")";
    }

    @Override // x3.b
    public final int u() {
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
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

    @Override // x3.b
    public final int w(g gVar) {
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return X(this.f27362m, gVar);
        }
        int e2 = this.f27357h.e((ki.z) gVar.f16813d);
        if (e2 != -1) {
            this.f27359j = 0;
            this.f27352d[this.f27350b - 1] = ((String[]) gVar.f16812c)[e2];
            return e2;
        }
        String str = this.f27352d[this.f27350b - 1];
        String Z = Z();
        int X = X(Z, gVar);
        if (X == -1) {
            this.f27359j = 15;
            this.f27362m = Z;
            this.f27352d[this.f27350b - 1] = str;
        }
        return X;
    }

    @Override // x3.b
    public final void x() {
        int i10 = this.f27359j;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 14) {
            long c10 = this.f27357h.c(f27356p);
            i iVar = this.f27358i;
            if (c10 == -1) {
                c10 = iVar.f20994c;
            }
            iVar.skip(c10);
        } else if (i10 == 13) {
            e0(f27355o);
        } else if (i10 == 12) {
            e0(f27354n);
        } else if (i10 != 15) {
            throw new z("Expected a name but was " + e.j(u()) + " at path " + z());
        }
        this.f27359j = 0;
        this.f27352d[this.f27350b - 1] = AbstractJsonLexerKt.NULL;
    }
}
