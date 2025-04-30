package com.bykv.vk.openvk.preload.a.d;

import Q7.n0;
import com.bykv.vk.openvk.preload.a.b.a.e;
import com.bykv.vk.openvk.preload.a.b.f;
import com.bykv.vk.openvk.preload.a.p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    private final Reader f13061c;

    /* renamed from: i, reason: collision with root package name */
    private long f13067i;

    /* renamed from: j, reason: collision with root package name */
    private int f13068j;

    /* renamed from: k, reason: collision with root package name */
    private String f13069k;
    private int[] l;

    /* renamed from: n, reason: collision with root package name */
    private String[] f13070n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f13071o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f13060a = false;

    /* renamed from: d, reason: collision with root package name */
    private final char[] f13062d = new char[1024];

    /* renamed from: e, reason: collision with root package name */
    private int f13063e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f13064f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f13065g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f13066h = 0;
    int b = 0;
    private int m = 1;

    static {
        f.f13022a = new f() { // from class: com.bykv.vk.openvk.preload.a.d.a.1
            @Override // com.bykv.vk.openvk.preload.a.b.f
            public final void a(a aVar) throws IOException {
                if (aVar instanceof e) {
                    e eVar = (e) aVar;
                    eVar.a(b.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) eVar.g()).next();
                    eVar.a(entry.getValue());
                    eVar.a(new p((String) entry.getKey()));
                    return;
                }
                int i9 = aVar.b;
                if (i9 == 0) {
                    i9 = aVar.q();
                }
                if (i9 == 13) {
                    aVar.b = 9;
                    return;
                }
                if (i9 == 12) {
                    aVar.b = 8;
                } else {
                    if (i9 == 14) {
                        aVar.b = 10;
                        return;
                    }
                    throw new IllegalStateException("Expected a name but was " + aVar.f() + aVar.r());
                }
            }
        };
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.f13070n = new String[32];
        this.f13071o = new int[32];
        this.f13061c = reader;
    }

    private int g() throws IOException {
        String str;
        String str2;
        int i9;
        char c9 = this.f13062d[this.f13063e];
        if (c9 != 't' && c9 != 'T') {
            if (c9 != 'f' && c9 != 'F') {
                if (c9 != 'n' && c9 != 'N') {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i9 = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i9 = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i9 = 5;
        }
        int length = str.length();
        for (int i10 = 1; i10 < length; i10++) {
            if (this.f13063e + i10 >= this.f13064f && !b(i10 + 1)) {
                return 0;
            }
            char c10 = this.f13062d[this.f13063e + i10];
            if (c10 != str.charAt(i10) && c10 != str2.charAt(i10)) {
                return 0;
            }
        }
        if ((this.f13063e + length < this.f13064f || b(length + 1)) && a(this.f13062d[this.f13063e + length])) {
            return 0;
        }
        this.f13063e += length;
        this.b = i9;
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0093, code lost:
    
        if (r9 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (r11 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        if (r13 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r18.f13067i = r11;
        r18.f13063e += r8;
        r18.b = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        if (r9 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        if (r9 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r9 != 7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        r18.f13068j = r8;
        r18.b = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x008f, code lost:
    
        if (a(r14) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0091, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int s() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.s():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        u();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String t() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f13063e
            int r4 = r3 + r2
            int r5 = r6.f13064f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f13062d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.u()
            goto L5c
        L4e:
            char[] r3 = r6.f13062d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f13062d
            int r4 = r6.f13063e
            r0.append(r3, r4, r2)
            int r3 = r6.f13063e
            int r3 = r3 + r2
            r6.f13063e = r3
            r2 = 1
            boolean r2 = r6.b(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f13062d
            int r3 = r6.f13063e
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f13062d
            int r3 = r6.f13063e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f13063e
            int r2 = r2 + r1
            r6.f13063e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.t():java.lang.String");
    }

    private void u() throws IOException {
        if (this.f13060a) {
        } else {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void v() throws IOException {
        char c9;
        do {
            if (this.f13063e < this.f13064f || b(1)) {
                char[] cArr = this.f13062d;
                int i9 = this.f13063e;
                int i10 = i9 + 1;
                this.f13063e = i10;
                c9 = cArr[i9];
                if (c9 == '\n') {
                    this.f13065g++;
                    this.f13066h = i10;
                    return;
                }
            } else {
                return;
            }
        } while (c9 != '\r');
    }

    private char w() throws IOException {
        int i9;
        if (this.f13063e == this.f13064f && !b(1)) {
            throw b("Unterminated escape sequence");
        }
        char[] cArr = this.f13062d;
        int i10 = this.f13063e;
        int i11 = i10 + 1;
        this.f13063e = i11;
        char c9 = cArr[i10];
        if (c9 != '\n') {
            if (c9 != '\"' && c9 != '\'' && c9 != '/' && c9 != '\\') {
                if (c9 != 'b') {
                    if (c9 != 'f') {
                        if (c9 == 'n') {
                            return '\n';
                        }
                        if (c9 != 'r') {
                            if (c9 != 't') {
                                if (c9 == 'u') {
                                    if (i10 + 5 > this.f13064f && !b(4)) {
                                        throw b("Unterminated escape sequence");
                                    }
                                    int i12 = this.f13063e;
                                    int i13 = i12 + 4;
                                    char c10 = 0;
                                    while (i12 < i13) {
                                        char c11 = this.f13062d[i12];
                                        char c12 = (char) (c10 << 4);
                                        if (c11 >= '0' && c11 <= '9') {
                                            i9 = c11 - '0';
                                        } else if (c11 >= 'a' && c11 <= 'f') {
                                            i9 = c11 - 'W';
                                        } else if (c11 >= 'A' && c11 <= 'F') {
                                            i9 = c11 - '7';
                                        } else {
                                            throw new NumberFormatException("\\u".concat(new String(this.f13062d, this.f13063e, 4)));
                                        }
                                        c10 = (char) (i9 + c12);
                                        i12++;
                                    }
                                    this.f13063e += 4;
                                    return c10;
                                }
                                throw b("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f13065g++;
            this.f13066h = i11;
        }
        return c9;
    }

    private void x() throws IOException {
        a(true);
        int i9 = this.f13063e;
        int i10 = i9 - 1;
        this.f13063e = i10;
        if (i9 + 4 > this.f13064f && !b(5)) {
            return;
        }
        char[] cArr = this.f13062d;
        if (cArr[i10] == ')' && cArr[i9] == ']' && cArr[i9 + 1] == '}' && cArr[i9 + 2] == '\'' && cArr[i9 + 3] == '\n') {
            this.f13063e += 5;
        }
    }

    public void a() throws IOException {
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 3) {
            a(1);
            this.f13071o[this.m - 1] = 0;
            this.b = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f() + r());
        }
    }

    public void b() throws IOException {
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 4) {
            int i10 = this.m;
            this.m = i10 - 1;
            int[] iArr = this.f13071o;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + f() + r());
    }

    public void c() throws IOException {
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 1) {
            a(3);
            this.b = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f() + r());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b = 0;
        this.l[0] = 8;
        this.m = 1;
        this.f13061c.close();
    }

    public void d() throws IOException {
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 2) {
            int i10 = this.m;
            int i11 = i10 - 1;
            this.m = i11;
            this.f13070n[i11] = null;
            int[] iArr = this.f13071o;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + f() + r());
    }

    public boolean e() throws IOException {
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 != 2 && i9 != 4) {
            return true;
        }
        return false;
    }

    public b f() throws IOException {
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        switch (i9) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String h() throws IOException {
        String b;
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 14) {
            b = t();
        } else if (i9 == 12) {
            b = b('\'');
        } else if (i9 == 13) {
            b = b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + f() + r());
        }
        this.b = 0;
        this.f13070n[this.m - 1] = b;
        return b;
    }

    public String i() throws IOException {
        String str;
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 10) {
            str = t();
        } else if (i9 == 8) {
            str = b('\'');
        } else if (i9 == 9) {
            str = b('\"');
        } else if (i9 == 11) {
            str = this.f13069k;
            this.f13069k = null;
        } else if (i9 == 15) {
            str = Long.toString(this.f13067i);
        } else if (i9 == 16) {
            str = new String(this.f13062d, this.f13063e, this.f13068j);
            this.f13063e += this.f13068j;
        } else {
            throw new IllegalStateException("Expected a string but was " + f() + r());
        }
        this.b = 0;
        int[] iArr = this.f13071o;
        int i10 = this.m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public boolean j() throws IOException {
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 5) {
            this.b = 0;
            int[] iArr = this.f13071o;
            int i10 = this.m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i9 == 6) {
            this.b = 0;
            int[] iArr2 = this.f13071o;
            int i11 = this.m - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + f() + r());
    }

    public void k() throws IOException {
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 7) {
            this.b = 0;
            int[] iArr = this.f13071o;
            int i10 = this.m - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + f() + r());
    }

    public double l() throws IOException {
        char c9;
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 15) {
            this.b = 0;
            int[] iArr = this.f13071o;
            int i10 = this.m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f13067i;
        }
        if (i9 == 16) {
            this.f13069k = new String(this.f13062d, this.f13063e, this.f13068j);
            this.f13063e += this.f13068j;
        } else if (i9 != 8 && i9 != 9) {
            if (i9 == 10) {
                this.f13069k = t();
            } else if (i9 != 11) {
                throw new IllegalStateException("Expected a double but was " + f() + r());
            }
        } else {
            if (i9 == 8) {
                c9 = '\'';
            } else {
                c9 = '\"';
            }
            this.f13069k = b(c9);
        }
        this.b = 11;
        double parseDouble = Double.parseDouble(this.f13069k);
        if (!this.f13060a && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + r());
        }
        this.f13069k = null;
        this.b = 0;
        int[] iArr2 = this.f13071o;
        int i11 = this.m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return parseDouble;
    }

    public long m() throws IOException {
        char c9;
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 15) {
            this.b = 0;
            int[] iArr = this.f13071o;
            int i10 = this.m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f13067i;
        }
        if (i9 == 16) {
            this.f13069k = new String(this.f13062d, this.f13063e, this.f13068j);
            this.f13063e += this.f13068j;
        } else {
            if (i9 != 8 && i9 != 9 && i9 != 10) {
                throw new IllegalStateException("Expected a long but was " + f() + r());
            }
            if (i9 == 10) {
                this.f13069k = t();
            } else {
                if (i9 == 8) {
                    c9 = '\'';
                } else {
                    c9 = '\"';
                }
                this.f13069k = b(c9);
            }
            try {
                long parseLong = Long.parseLong(this.f13069k);
                this.b = 0;
                int[] iArr2 = this.f13071o;
                int i11 = this.m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.b = 11;
        double parseDouble = Double.parseDouble(this.f13069k);
        long j7 = (long) parseDouble;
        if (j7 == parseDouble) {
            this.f13069k = null;
            this.b = 0;
            int[] iArr3 = this.f13071o;
            int i12 = this.m - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return j7;
        }
        throw new NumberFormatException("Expected a long but was " + this.f13069k + r());
    }

    public int n() throws IOException {
        char c9;
        int i9 = this.b;
        if (i9 == 0) {
            i9 = q();
        }
        if (i9 == 15) {
            long j7 = this.f13067i;
            int i10 = (int) j7;
            if (j7 == i10) {
                this.b = 0;
                int[] iArr = this.f13071o;
                int i11 = this.m - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f13067i + r());
        }
        if (i9 == 16) {
            this.f13069k = new String(this.f13062d, this.f13063e, this.f13068j);
            this.f13063e += this.f13068j;
        } else {
            if (i9 != 8 && i9 != 9 && i9 != 10) {
                throw new IllegalStateException("Expected an int but was " + f() + r());
            }
            if (i9 == 10) {
                this.f13069k = t();
            } else {
                if (i9 == 8) {
                    c9 = '\'';
                } else {
                    c9 = '\"';
                }
                this.f13069k = b(c9);
            }
            try {
                int parseInt = Integer.parseInt(this.f13069k);
                this.b = 0;
                int[] iArr2 = this.f13071o;
                int i12 = this.m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.b = 11;
        double parseDouble = Double.parseDouble(this.f13069k);
        int i13 = (int) parseDouble;
        if (i13 == parseDouble) {
            this.f13069k = null;
            this.b = 0;
            int[] iArr3 = this.f13071o;
            int i14 = this.m - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        }
        throw new NumberFormatException("Expected an int but was " + this.f13069k + r());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x009d. Please report as an issue. */
    public void o() throws IOException {
        int i9 = 0;
        do {
            int i10 = this.b;
            if (i10 == 0) {
                i10 = q();
            }
            if (i10 == 3) {
                a(1);
            } else if (i10 == 1) {
                a(3);
            } else {
                if (i10 == 4) {
                    this.m--;
                } else if (i10 == 2) {
                    this.m--;
                } else {
                    if (i10 != 14 && i10 != 10) {
                        if (i10 != 8 && i10 != 12) {
                            if (i10 != 9 && i10 != 13) {
                                if (i10 == 16) {
                                    this.f13063e += this.f13068j;
                                }
                            } else {
                                c('\"');
                            }
                        } else {
                            c('\'');
                        }
                    } else {
                        do {
                            int i11 = 0;
                            while (true) {
                                int i12 = this.f13063e;
                                if (i12 + i11 < this.f13064f) {
                                    char c9 = this.f13062d[i12 + i11];
                                    if (c9 != '\t' && c9 != '\n' && c9 != '\f' && c9 != '\r' && c9 != ' ') {
                                        if (c9 != '#') {
                                            if (c9 != ',') {
                                                if (c9 != '/' && c9 != '=') {
                                                    if (c9 != '{' && c9 != '}' && c9 != ':') {
                                                        if (c9 != ';') {
                                                            switch (c9) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i11++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f13063e = i12 + i11;
                                }
                            }
                            u();
                            this.f13063e += i11;
                        } while (b(1));
                    }
                    this.b = 0;
                }
                i9--;
                this.b = 0;
            }
            i9++;
            this.b = 0;
        } while (i9 != 0);
        int[] iArr = this.f13071o;
        int i13 = this.m;
        int i14 = i13 - 1;
        iArr[i14] = iArr[i14] + 1;
        this.f13070n[i13 - 1] = "null";
    }

    public String p() {
        StringBuilder sb = new StringBuilder("$");
        int i9 = this.m;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.l[i10];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3 || i11 == 4 || i11 == 5) {
                    sb.append('.');
                    String str = this.f13070n[i10];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(this.f13071o[i10]);
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public final int q() throws IOException {
        int a6;
        int[] iArr = this.l;
        int i9 = this.m;
        int i10 = iArr[i9 - 1];
        if (i10 == 1) {
            iArr[i9 - 1] = 2;
        } else if (i10 == 2) {
            int a9 = a(true);
            if (a9 != 44) {
                if (a9 != 59) {
                    if (a9 == 93) {
                        this.b = 4;
                        return 4;
                    }
                    throw b("Unterminated array");
                }
                u();
            }
        } else if (i10 != 3 && i10 != 5) {
            if (i10 == 4) {
                iArr[i9 - 1] = 5;
                int a10 = a(true);
                if (a10 != 58) {
                    if (a10 == 61) {
                        u();
                        if (this.f13063e < this.f13064f || b(1)) {
                            char[] cArr = this.f13062d;
                            int i11 = this.f13063e;
                            if (cArr[i11] == '>') {
                                this.f13063e = i11 + 1;
                            }
                        }
                    } else {
                        throw b("Expected ':'");
                    }
                }
            } else if (i10 == 6) {
                if (this.f13060a) {
                    x();
                }
                this.l[this.m - 1] = 7;
            } else if (i10 == 7) {
                if (a(false) == -1) {
                    this.b = 17;
                    return 17;
                }
                u();
                this.f13063e--;
            } else if (i10 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i9 - 1] = 4;
            if (i10 == 5 && (a6 = a(true)) != 44) {
                if (a6 != 59) {
                    if (a6 == 125) {
                        this.b = 2;
                        return 2;
                    }
                    throw b("Unterminated object");
                }
                u();
            }
            int a11 = a(true);
            if (a11 != 34) {
                if (a11 != 39) {
                    if (a11 != 125) {
                        u();
                        this.f13063e--;
                        if (a((char) a11)) {
                            this.b = 14;
                            return 14;
                        }
                        throw b("Expected name");
                    }
                    if (i10 != 5) {
                        this.b = 2;
                        return 2;
                    }
                    throw b("Expected name");
                }
                u();
                this.b = 12;
                return 12;
            }
            this.b = 13;
            return 13;
        }
        int a12 = a(true);
        if (a12 != 34) {
            if (a12 != 39) {
                if (a12 != 44 && a12 != 59) {
                    if (a12 != 91) {
                        if (a12 != 93) {
                            if (a12 != 123) {
                                this.f13063e--;
                                int g9 = g();
                                if (g9 != 0) {
                                    return g9;
                                }
                                int s5 = s();
                                if (s5 != 0) {
                                    return s5;
                                }
                                if (a(this.f13062d[this.f13063e])) {
                                    u();
                                    this.b = 10;
                                    return 10;
                                }
                                throw b("Expected value");
                            }
                            this.b = 1;
                            return 1;
                        }
                        if (i10 == 1) {
                            this.b = 4;
                            return 4;
                        }
                    } else {
                        this.b = 3;
                        return 3;
                    }
                }
                if (i10 != 1 && i10 != 2) {
                    throw b("Unexpected value");
                }
                u();
                this.f13063e--;
                this.b = 7;
                return 7;
            }
            u();
            this.b = 8;
            return 8;
        }
        this.b = 9;
        return 9;
    }

    public final String r() {
        StringBuilder o3 = n0.o(this.f13065g + 1, (this.f13063e - this.f13066h) + 1, " at line ", " column ", " path ");
        o3.append(p());
        return o3.toString();
    }

    public String toString() {
        return getClass().getSimpleName() + r();
    }

    private void c(char c9) throws IOException {
        char[] cArr = this.f13062d;
        while (true) {
            int i9 = this.f13063e;
            int i10 = this.f13064f;
            while (true) {
                if (i9 < i10) {
                    int i11 = i9 + 1;
                    char c10 = cArr[i9];
                    if (c10 == c9) {
                        this.f13063e = i11;
                        return;
                    }
                    if (c10 == '\\') {
                        this.f13063e = i11;
                        w();
                        break;
                    } else {
                        if (c10 == '\n') {
                            this.f13065g++;
                            this.f13066h = i11;
                        }
                        i9 = i11;
                    }
                } else {
                    this.f13063e = i9;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean a(char c9) throws IOException {
        if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
            return false;
        }
        if (c9 != '#') {
            if (c9 == ',') {
                return false;
            }
            if (c9 != '/' && c9 != '=') {
                if (c9 == '{' || c9 == '}' || c9 == ':') {
                    return false;
                }
                if (c9 != ';') {
                    switch (c9) {
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
        u();
        return false;
    }

    private String b(char c9) throws IOException {
        char[] cArr = this.f13062d;
        StringBuilder sb = null;
        while (true) {
            int i9 = this.f13063e;
            int i10 = this.f13064f;
            int i11 = i9;
            while (true) {
                if (i11 < i10) {
                    int i12 = i11 + 1;
                    char c10 = cArr[i11];
                    if (c10 == c9) {
                        this.f13063e = i12;
                        int i13 = (i12 - i9) - 1;
                        if (sb == null) {
                            return new String(cArr, i9, i13);
                        }
                        sb.append(cArr, i9, i13);
                        return sb.toString();
                    }
                    if (c10 == '\\') {
                        this.f13063e = i12;
                        int i14 = i12 - i9;
                        int i15 = i14 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i14 * 2, 16));
                        }
                        sb.append(cArr, i9, i15);
                        sb.append(w());
                    } else {
                        if (c10 == '\n') {
                            this.f13065g++;
                            this.f13066h = i12;
                        }
                        i11 = i12;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i11 - i9) * 2, 16));
                    }
                    sb.append(cArr, i9, i11 - i9);
                    this.f13063e = i11;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private void a(int i9) {
        int i10 = this.m;
        int[] iArr = this.l;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.l = Arrays.copyOf(iArr, i11);
            this.f13071o = Arrays.copyOf(this.f13071o, i11);
            this.f13070n = (String[]) Arrays.copyOf(this.f13070n, i11);
        }
        int[] iArr2 = this.l;
        int i12 = this.m;
        this.m = i12 + 1;
        iArr2[i12] = i9;
    }

    private int a(boolean z8) throws IOException {
        char[] cArr = this.f13062d;
        int i9 = this.f13063e;
        int i10 = this.f13064f;
        while (true) {
            if (i9 == i10) {
                this.f13063e = i9;
                if (!b(1)) {
                    if (!z8) {
                        return -1;
                    }
                    throw new EOFException("End of input" + r());
                }
                i9 = this.f13063e;
                i10 = this.f13064f;
            }
            int i11 = i9 + 1;
            char c9 = cArr[i9];
            if (c9 == '\n') {
                this.f13065g++;
                this.f13066h = i11;
            } else if (c9 != ' ' && c9 != '\r' && c9 != '\t') {
                if (c9 == '/') {
                    this.f13063e = i11;
                    if (i11 == i10) {
                        this.f13063e = i9;
                        boolean b = b(2);
                        this.f13063e++;
                        if (!b) {
                            return c9;
                        }
                    }
                    u();
                    int i12 = this.f13063e;
                    char c10 = cArr[i12];
                    if (c10 == '*') {
                        this.f13063e = i12 + 1;
                        if (a("*/")) {
                            i9 = this.f13063e + 2;
                            i10 = this.f13064f;
                        } else {
                            throw b("Unterminated comment");
                        }
                    } else {
                        if (c10 != '/') {
                            return c9;
                        }
                        this.f13063e = i12 + 1;
                        v();
                        i9 = this.f13063e;
                        i10 = this.f13064f;
                    }
                } else if (c9 == '#') {
                    this.f13063e = i11;
                    u();
                    v();
                    i9 = this.f13063e;
                    i10 = this.f13064f;
                } else {
                    this.f13063e = i11;
                    return c9;
                }
            }
            i9 = i11;
        }
    }

    private boolean b(int i9) throws IOException {
        int i10;
        int i11;
        char[] cArr = this.f13062d;
        int i12 = this.f13066h;
        int i13 = this.f13063e;
        this.f13066h = i12 - i13;
        int i14 = this.f13064f;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f13064f = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f13064f = 0;
        }
        this.f13063e = 0;
        do {
            Reader reader = this.f13061c;
            int i16 = this.f13064f;
            int read = reader.read(cArr, i16, cArr.length - i16);
            if (read == -1) {
                return false;
            }
            i10 = this.f13064f + read;
            this.f13064f = i10;
            if (this.f13065g == 0 && (i11 = this.f13066h) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f13063e++;
                this.f13066h = i11 + 1;
                i9++;
            }
        } while (i10 < i9);
        return true;
    }

    private IOException b(String str) throws IOException {
        StringBuilder b = AbstractC2965e.b(str);
        b.append(r());
        throw new d(b.toString());
    }

    private boolean a(String str) throws IOException {
        int i9;
        int length = str.length();
        while (true) {
            if (this.f13063e + length > this.f13064f && !b(length)) {
                return false;
            }
            char[] cArr = this.f13062d;
            int i10 = this.f13063e;
            if (cArr[i10] != '\n') {
                while (i9 < length) {
                    i9 = this.f13062d[this.f13063e + i9] == str.charAt(i9) ? i9 + 1 : 0;
                }
                return true;
            }
            this.f13065g++;
            this.f13066h = i10 + 1;
            this.f13063e++;
        }
    }
}
