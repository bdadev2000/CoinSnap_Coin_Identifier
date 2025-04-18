package yg;

import java.io.EOFException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class q extends p {

    /* renamed from: m, reason: collision with root package name */
    public static final ki.l f28247m;

    /* renamed from: n, reason: collision with root package name */
    public static final ki.l f28248n;

    /* renamed from: o, reason: collision with root package name */
    public static final ki.l f28249o;

    /* renamed from: p, reason: collision with root package name */
    public static final ki.l f28250p;

    /* renamed from: q, reason: collision with root package name */
    public static final ki.l f28251q;

    /* renamed from: g, reason: collision with root package name */
    public final ki.k f28252g;

    /* renamed from: h, reason: collision with root package name */
    public final ki.i f28253h;

    /* renamed from: i, reason: collision with root package name */
    public int f28254i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f28255j;

    /* renamed from: k, reason: collision with root package name */
    public int f28256k;

    /* renamed from: l, reason: collision with root package name */
    public String f28257l;

    static {
        ki.l lVar = ki.l.f20996f;
        f28247m = wh.a0.p("'\\");
        f28248n = wh.a0.p("\"\\");
        f28249o = wh.a0.p("{}[]:, \n\t\r\f/\\;#=");
        f28250p = wh.a0.p("\n\r");
        f28251q = wh.a0.p("*/");
    }

    public q(ki.k kVar) {
        this.f28252g = kVar;
        this.f28253h = kVar.y();
        v(6);
    }

    @Override // yg.p
    public final void T() {
        int i10 = 0;
        do {
            int i11 = this.f28254i;
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
                        this.f28243b--;
                    } else {
                        throw new androidx.fragment.app.z("Expected a value but was " + vd.e.k(u()) + " at path " + z());
                    }
                } else if (i11 == 2) {
                    i10--;
                    if (i10 >= 0) {
                        this.f28243b--;
                    } else {
                        throw new androidx.fragment.app.z("Expected a value but was " + vd.e.k(u()) + " at path " + z());
                    }
                } else {
                    ki.i iVar = this.f28253h;
                    if (i11 != 14 && i11 != 10) {
                        if (i11 != 9 && i11 != 13) {
                            if (i11 != 8 && i11 != 12) {
                                if (i11 == 17) {
                                    iVar.skip(this.f28256k);
                                } else if (i11 == 18) {
                                    throw new androidx.fragment.app.z("Expected a value but was " + vd.e.k(u()) + " at path " + z());
                                }
                            } else {
                                f0(f28247m);
                            }
                        } else {
                            f0(f28248n);
                        }
                    } else {
                        long c10 = this.f28252g.c(f28249o);
                        if (c10 == -1) {
                            c10 = iVar.f20994c;
                        }
                        iVar.skip(c10);
                    }
                }
                this.f28254i = 0;
            }
            i10++;
            this.f28254i = 0;
        } while (i10 != 0);
        int[] iArr = this.f28246f;
        int i12 = this.f28243b;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f28245d[i12 - 1] = AbstractJsonLexerKt.NULL;
    }

    public final void V() {
        U("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c5, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c6, code lost:
    
        r21.f28255j = r4;
        r10.skip(r2);
        r8 = 16;
        r21.f28254i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d1, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d4, code lost:
    
        if (r8 == r3) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d7, code lost:
    
        if (r8 == 4) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01da, code lost:
    
        if (r8 != 7) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01dc, code lost:
    
        r21.f28256k = r2;
        r8 = 17;
        r21.f28254i = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d3, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ab, code lost:
    
        if (Z(r6) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ae, code lost:
    
        if (r8 != 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b0, code lost:
    
        if (r3 == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b6, code lost:
    
        if (r4 != Long.MIN_VALUE) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b8, code lost:
    
        if (r11 == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01be, code lost:
    
        if (r4 != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c0, code lost:
    
        if (r11 != 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c2, code lost:
    
        if (r11 == 0) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int W() {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.q.W():int");
    }

    public final int X(String str, o oVar) {
        int length = oVar.a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(oVar.a[i10])) {
                this.f28254i = 0;
                this.f28245d[this.f28243b - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final int Y(String str, o oVar) {
        int length = oVar.a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(oVar.a[i10])) {
                this.f28254i = 0;
                int[] iArr = this.f28246f;
                int i11 = this.f28243b - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    public final boolean Z(int i10) {
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
        return false;
    }

    public final String a0() {
        String str;
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 14) {
            str = d0();
        } else if (i10 == 13) {
            str = c0(f28248n);
        } else if (i10 == 12) {
            str = c0(f28247m);
        } else if (i10 == 15) {
            str = this.f28257l;
            this.f28257l = null;
        } else {
            throw new androidx.fragment.app.z("Expected a name but was " + vd.e.k(u()) + " at path " + z());
        }
        this.f28254i = 0;
        this.f28245d[this.f28243b - 1] = str;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1.skip(r2 - 1);
        r2 = yg.q.f28250p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r3 != 47) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r3 != 35) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        V();
        r2 = r5.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r2 == (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        r1.skip(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r2 = r1.f20994c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:
    
        if (r5.request(2) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        V();
        r10 = r1.k(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        if (r10 == 42) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        r1.readByte();
        r1.readByte();
        r3 = r5.f(yg.q.f28251q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r3 == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        r3 = r3 + r2.f20997b.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        r1.skip(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r0 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        U("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007c, code lost:
    
        r3 = r1.f20994c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004a, code lost:
    
        if (r10 == 47) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004d, code lost:
    
        r1.readByte();
        r1.readByte();
        r2 = r5.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0059, code lost:
    
        if (r2 == (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005f, code lost:
    
        r1.skip(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005d, code lost:
    
        r2 = r1.f20994c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x003e, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b0(boolean r13) {
        /*
            r12 = this;
        L0:
            r0 = 0
            r1 = r0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            ki.k r5 = r12.f28252g
            boolean r3 = r5.request(r3)
            if (r3 == 0) goto La8
            long r3 = (long) r1
            ki.i r1 = r12.f28253h
            byte r3 = r1.k(r3)
            r4 = 10
            if (r3 == r4) goto La5
            r4 = 32
            if (r3 == r4) goto La5
            r4 = 13
            if (r3 == r4) goto La5
            r4 = 9
            if (r3 != r4) goto L26
            goto La5
        L26:
            int r2 = r2 + (-1)
            long r6 = (long) r2
            r1.skip(r6)
            ki.l r2 = yg.q.f28250p
            r6 = 1
            r8 = -1
            r4 = 47
            if (r3 != r4) goto L8c
            r10 = 2
            boolean r10 = r5.request(r10)
            if (r10 != 0) goto L3f
            return r3
        L3f:
            r12.V()
            byte r10 = r1.k(r6)
            r11 = 42
            if (r10 == r11) goto L63
            if (r10 == r4) goto L4d
            return r3
        L4d:
            r1.readByte()
            r1.readByte()
            long r2 = r5.c(r2)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L5d
            long r2 = r2 + r6
            goto L5f
        L5d:
            long r2 = r1.f20994c
        L5f:
            r1.skip(r2)
            goto L0
        L63:
            r1.readByte()
            r1.readByte()
            ki.l r2 = yg.q.f28251q
            long r3 = r5.f(r2)
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 == 0) goto L74
            r0 = 1
        L74:
            if (r0 == 0) goto L7c
            byte[] r2 = r2.f20997b
            int r2 = r2.length
            long r5 = (long) r2
            long r3 = r3 + r5
            goto L7e
        L7c:
            long r3 = r1.f20994c
        L7e:
            r1.skip(r3)
            if (r0 == 0) goto L85
            goto L0
        L85:
            java.lang.String r13 = "Unterminated comment"
            r12.U(r13)
            r13 = 0
            throw r13
        L8c:
            r0 = 35
            if (r3 != r0) goto La4
            r12.V()
            long r2 = r5.c(r2)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L9d
            long r2 = r2 + r6
            goto L9f
        L9d:
            long r2 = r1.f20994c
        L9f:
            r1.skip(r2)
            goto L0
        La4:
            return r3
        La5:
            r1 = r2
            goto L2
        La8:
            if (r13 != 0) goto Lac
            r13 = -1
            return r13
        Lac:
            java.io.EOFException r13 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.q.b0(boolean):int");
    }

    public final String c0(ki.l lVar) {
        StringBuilder sb2 = null;
        while (true) {
            long c10 = this.f28252g.c(lVar);
            if (c10 != -1) {
                ki.i iVar = this.f28253h;
                if (iVar.k(c10) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(iVar.readUtf8(c10));
                    iVar.readByte();
                    sb2.append(e0());
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28254i = 0;
        this.f28244c[0] = 8;
        this.f28243b = 1;
        this.f28253h.d();
        this.f28252g.close();
    }

    @Override // yg.p
    public final void d() {
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 3) {
            v(1);
            this.f28246f[this.f28243b - 1] = 0;
            this.f28254i = 0;
        } else {
            throw new androidx.fragment.app.z("Expected BEGIN_ARRAY but was " + vd.e.k(u()) + " at path " + z());
        }
    }

    public final String d0() {
        long c10 = this.f28252g.c(f28249o);
        ki.i iVar = this.f28253h;
        if (c10 != -1) {
            return iVar.readUtf8(c10);
        }
        return iVar.readUtf8();
    }

    public final char e0() {
        int i10;
        int i11;
        ki.k kVar = this.f28252g;
        if (kVar.request(1L)) {
            ki.i iVar = this.f28253h;
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

    public final void f0(ki.l lVar) {
        while (true) {
            long c10 = this.f28252g.c(lVar);
            if (c10 != -1) {
                ki.i iVar = this.f28253h;
                if (iVar.k(c10) == 92) {
                    iVar.skip(c10 + 1);
                    e0();
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

    @Override // yg.p
    public final void g() {
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 1) {
            v(3);
            this.f28254i = 0;
        } else {
            throw new androidx.fragment.app.z("Expected BEGIN_OBJECT but was " + vd.e.k(u()) + " at path " + z());
        }
    }

    @Override // yg.p
    public final void j() {
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 4) {
            int i11 = this.f28243b - 1;
            this.f28243b = i11;
            int[] iArr = this.f28246f;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f28254i = 0;
            return;
        }
        throw new androidx.fragment.app.z("Expected END_ARRAY but was " + vd.e.k(u()) + " at path " + z());
    }

    @Override // yg.p
    public final void k() {
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 2) {
            int i11 = this.f28243b - 1;
            this.f28243b = i11;
            this.f28245d[i11] = null;
            int[] iArr = this.f28246f;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f28254i = 0;
            return;
        }
        throw new androidx.fragment.app.z("Expected END_OBJECT but was " + vd.e.k(u()) + " at path " + z());
    }

    @Override // yg.p
    public final boolean p() {
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 != 2 && i10 != 4 && i10 != 18) {
            return true;
        }
        return false;
    }

    @Override // yg.p
    public final double q() {
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 16) {
            this.f28254i = 0;
            int[] iArr = this.f28246f;
            int i11 = this.f28243b - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f28255j;
        }
        if (i10 == 17) {
            this.f28257l = this.f28253h.readUtf8(this.f28256k);
        } else if (i10 == 9) {
            this.f28257l = c0(f28248n);
        } else if (i10 == 8) {
            this.f28257l = c0(f28247m);
        } else if (i10 == 10) {
            this.f28257l = d0();
        } else if (i10 != 11) {
            throw new androidx.fragment.app.z("Expected a double but was " + vd.e.k(u()) + " at path " + z());
        }
        this.f28254i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f28257l);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.f28257l = null;
                this.f28254i = 0;
                int[] iArr2 = this.f28246f;
                int i12 = this.f28243b - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new x3.a("JSON forbids NaN and infinities: " + parseDouble + " at path " + z());
        } catch (NumberFormatException unused) {
            throw new androidx.fragment.app.z("Expected a double but was " + this.f28257l + " at path " + z());
        }
    }

    @Override // yg.p
    public final int r() {
        String c02;
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 16) {
            long j3 = this.f28255j;
            int i11 = (int) j3;
            if (j3 == i11) {
                this.f28254i = 0;
                int[] iArr = this.f28246f;
                int i12 = this.f28243b - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new androidx.fragment.app.z("Expected an int but was " + this.f28255j + " at path " + z());
        }
        if (i10 == 17) {
            this.f28257l = this.f28253h.readUtf8(this.f28256k);
        } else if (i10 != 9 && i10 != 8) {
            if (i10 != 11) {
                throw new androidx.fragment.app.z("Expected an int but was " + vd.e.k(u()) + " at path " + z());
            }
        } else {
            if (i10 == 9) {
                c02 = c0(f28248n);
            } else {
                c02 = c0(f28247m);
            }
            this.f28257l = c02;
            try {
                int parseInt = Integer.parseInt(c02);
                this.f28254i = 0;
                int[] iArr2 = this.f28246f;
                int i13 = this.f28243b - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f28254i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f28257l);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f28257l = null;
                this.f28254i = 0;
                int[] iArr3 = this.f28246f;
                int i15 = this.f28243b - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new androidx.fragment.app.z("Expected an int but was " + this.f28257l + " at path " + z());
        } catch (NumberFormatException unused2) {
            throw new androidx.fragment.app.z("Expected an int but was " + this.f28257l + " at path " + z());
        }
    }

    @Override // yg.p
    public final void s() {
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 7) {
            this.f28254i = 0;
            int[] iArr = this.f28246f;
            int i11 = this.f28243b - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new androidx.fragment.app.z("Expected null but was " + vd.e.k(u()) + " at path " + z());
    }

    @Override // yg.p
    public final String t() {
        String readUtf8;
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 10) {
            readUtf8 = d0();
        } else if (i10 == 9) {
            readUtf8 = c0(f28248n);
        } else if (i10 == 8) {
            readUtf8 = c0(f28247m);
        } else if (i10 == 11) {
            readUtf8 = this.f28257l;
            this.f28257l = null;
        } else if (i10 == 16) {
            readUtf8 = Long.toString(this.f28255j);
        } else if (i10 == 17) {
            readUtf8 = this.f28253h.readUtf8(this.f28256k);
        } else {
            throw new androidx.fragment.app.z("Expected a string but was " + vd.e.k(u()) + " at path " + z());
        }
        this.f28254i = 0;
        int[] iArr = this.f28246f;
        int i11 = this.f28243b - 1;
        iArr[i11] = iArr[i11] + 1;
        return readUtf8;
    }

    public final String toString() {
        return "JsonReader(" + this.f28252g + ")";
    }

    @Override // yg.p
    public final int u() {
        int i10 = this.f28254i;
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

    @Override // yg.p
    public final int w(o oVar) {
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return X(this.f28257l, oVar);
        }
        int e2 = this.f28252g.e(oVar.f28242b);
        if (e2 != -1) {
            this.f28254i = 0;
            this.f28245d[this.f28243b - 1] = oVar.a[e2];
            return e2;
        }
        String str = this.f28245d[this.f28243b - 1];
        String a02 = a0();
        int X = X(a02, oVar);
        if (X == -1) {
            this.f28254i = 15;
            this.f28257l = a02;
            this.f28245d[this.f28243b - 1] = str;
        }
        return X;
    }

    @Override // yg.p
    public final void x() {
        int i10 = this.f28254i;
        if (i10 == 0) {
            i10 = W();
        }
        if (i10 == 14) {
            long c10 = this.f28252g.c(f28249o);
            ki.i iVar = this.f28253h;
            if (c10 == -1) {
                c10 = iVar.f20994c;
            }
            iVar.skip(c10);
        } else if (i10 == 13) {
            f0(f28248n);
        } else if (i10 == 12) {
            f0(f28247m);
        } else if (i10 != 15) {
            throw new androidx.fragment.app.z("Expected a name but was " + vd.e.k(u()) + " at path " + z());
        }
        this.f28254i = 0;
        this.f28245d[this.f28243b - 1] = AbstractJsonLexerKt.NULL;
    }
}
