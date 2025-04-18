package com.bykv.vk.openvk.preload.a.d;

import a4.j;
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
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    private final Reader f9898c;

    /* renamed from: i, reason: collision with root package name */
    private long f9904i;

    /* renamed from: j, reason: collision with root package name */
    private int f9905j;

    /* renamed from: k, reason: collision with root package name */
    private String f9906k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f9907l;

    /* renamed from: n, reason: collision with root package name */
    private String[] f9909n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f9910o;
    public boolean a = false;

    /* renamed from: d, reason: collision with root package name */
    private final char[] f9899d = new char[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];

    /* renamed from: e, reason: collision with root package name */
    private int f9900e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f9901f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f9902g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f9903h = 0;

    /* renamed from: b, reason: collision with root package name */
    int f9897b = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f9908m = 0 + 1;

    static {
        f.a = new f() { // from class: com.bykv.vk.openvk.preload.a.d.a.1
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
                int i10 = aVar.f9897b;
                if (i10 == 0) {
                    i10 = aVar.q();
                }
                if (i10 == 13) {
                    aVar.f9897b = 9;
                    return;
                }
                if (i10 == 12) {
                    aVar.f9897b = 8;
                } else {
                    if (i10 == 14) {
                        aVar.f9897b = 10;
                        return;
                    }
                    throw new IllegalStateException("Expected a name but was " + aVar.f() + aVar.r());
                }
            }
        };
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f9907l = iArr;
        iArr[0] = 6;
        this.f9909n = new String[32];
        this.f9910o = new int[32];
        this.f9898c = reader;
    }

    private int g() throws IOException {
        String str;
        String str2;
        int i10;
        char c10 = this.f9899d[this.f9900e];
        if (c10 != 't' && c10 != 'T') {
            if (c10 != 'f' && c10 != 'F') {
                if (c10 != 'n' && c10 != 'N') {
                    return 0;
                }
                str = AbstractJsonLexerKt.NULL;
                str2 = "NULL";
                i10 = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i10 = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f9900e + i11 >= this.f9901f && !b(i11 + 1)) {
                return 0;
            }
            char c11 = this.f9899d[this.f9900e + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f9900e + length < this.f9901f || b(length + 1)) && a(this.f9899d[this.f9900e + length])) {
            return 0;
        }
        this.f9900e += length;
        this.f9897b = i10;
        return i10;
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
    
        r18.f9904i = r11;
        r18.f9900e += r8;
        r18.f9897b = 15;
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
    
        r18.f9905j = r8;
        r18.f9897b = 16;
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
            Method dump skipped, instructions count: 245
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
            int r3 = r6.f9900e
            int r4 = r3 + r2
            int r5 = r6.f9901f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f9899d
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
            char[] r3 = r6.f9899d
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
            char[] r3 = r6.f9899d
            int r4 = r6.f9900e
            r0.append(r3, r4, r2)
            int r3 = r6.f9900e
            int r3 = r3 + r2
            r6.f9900e = r3
            r2 = 1
            boolean r2 = r6.b(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f9899d
            int r3 = r6.f9900e
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f9899d
            int r3 = r6.f9900e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f9900e
            int r2 = r2 + r1
            r6.f9900e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.t():java.lang.String");
    }

    private void u() throws IOException {
        if (this.a) {
        } else {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void v() throws IOException {
        char c10;
        do {
            if (this.f9900e < this.f9901f || b(1)) {
                char[] cArr = this.f9899d;
                int i10 = this.f9900e;
                int i11 = i10 + 1;
                this.f9900e = i11;
                c10 = cArr[i10];
                if (c10 == '\n') {
                    this.f9902g++;
                    this.f9903h = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != '\r');
    }

    private char w() throws IOException {
        int i10;
        int i11;
        if (this.f9900e == this.f9901f && !b(1)) {
            throw b("Unterminated escape sequence");
        }
        char[] cArr = this.f9899d;
        int i12 = this.f9900e;
        int i13 = i12 + 1;
        this.f9900e = i13;
        char c10 = cArr[i12];
        if (c10 != '\n') {
            if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
                if (c10 != 'b') {
                    if (c10 != 'f') {
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 != 'r') {
                            if (c10 != 't') {
                                if (c10 == 'u') {
                                    if (i13 + 4 > this.f9901f && !b(4)) {
                                        throw b("Unterminated escape sequence");
                                    }
                                    int i14 = this.f9900e;
                                    int i15 = i14 + 4;
                                    char c11 = 0;
                                    while (i14 < i15) {
                                        char c12 = this.f9899d[i14];
                                        char c13 = (char) (c11 << 4);
                                        if (c12 >= '0' && c12 <= '9') {
                                            i11 = c12 - '0';
                                        } else {
                                            if (c12 >= 'a' && c12 <= 'f') {
                                                i10 = c12 - 'a';
                                            } else if (c12 >= 'A' && c12 <= 'F') {
                                                i10 = c12 - 'A';
                                            } else {
                                                throw new NumberFormatException("\\u".concat(new String(this.f9899d, this.f9900e, 4)));
                                            }
                                            i11 = i10 + 10;
                                        }
                                        c11 = (char) (i11 + c13);
                                        i14++;
                                    }
                                    this.f9900e += 4;
                                    return c11;
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
            this.f9902g++;
            this.f9903h = i13;
        }
        return c10;
    }

    private void x() throws IOException {
        a(true);
        int i10 = this.f9900e - 1;
        this.f9900e = i10;
        if (i10 + 5 > this.f9901f && !b(5)) {
            return;
        }
        char[] cArr = this.f9899d;
        if (cArr[i10] == ')' && cArr[i10 + 1] == ']' && cArr[i10 + 2] == '}' && cArr[i10 + 3] == '\'' && cArr[i10 + 4] == '\n') {
            this.f9900e += 5;
        }
    }

    public void a() throws IOException {
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 3) {
            a(1);
            this.f9910o[this.f9908m - 1] = 0;
            this.f9897b = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f() + r());
        }
    }

    public void b() throws IOException {
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 4) {
            int i11 = this.f9908m - 1;
            this.f9908m = i11;
            int[] iArr = this.f9910o;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f9897b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + f() + r());
    }

    public void c() throws IOException {
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 1) {
            a(3);
            this.f9897b = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f() + r());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9897b = 0;
        this.f9907l[0] = 8;
        this.f9908m = 1;
        this.f9898c.close();
    }

    public void d() throws IOException {
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 2) {
            int i11 = this.f9908m - 1;
            this.f9908m = i11;
            this.f9909n[i11] = null;
            int[] iArr = this.f9910o;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f9897b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + f() + r());
    }

    public boolean e() throws IOException {
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 != 2 && i10 != 4) {
            return true;
        }
        return false;
    }

    public b f() throws IOException {
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        switch (i10) {
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
        String b3;
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 14) {
            b3 = t();
        } else if (i10 == 12) {
            b3 = b('\'');
        } else if (i10 == 13) {
            b3 = b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + f() + r());
        }
        this.f9897b = 0;
        this.f9909n[this.f9908m - 1] = b3;
        return b3;
    }

    public String i() throws IOException {
        String str;
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 10) {
            str = t();
        } else if (i10 == 8) {
            str = b('\'');
        } else if (i10 == 9) {
            str = b('\"');
        } else if (i10 == 11) {
            str = this.f9906k;
            this.f9906k = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f9904i);
        } else if (i10 == 16) {
            str = new String(this.f9899d, this.f9900e, this.f9905j);
            this.f9900e += this.f9905j;
        } else {
            throw new IllegalStateException("Expected a string but was " + f() + r());
        }
        this.f9897b = 0;
        int[] iArr = this.f9910o;
        int i11 = this.f9908m - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public boolean j() throws IOException {
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 5) {
            this.f9897b = 0;
            int[] iArr = this.f9910o;
            int i11 = this.f9908m - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f9897b = 0;
            int[] iArr2 = this.f9910o;
            int i12 = this.f9908m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + f() + r());
    }

    public void k() throws IOException {
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 7) {
            this.f9897b = 0;
            int[] iArr = this.f9910o;
            int i11 = this.f9908m - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + f() + r());
    }

    public double l() throws IOException {
        char c10;
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            this.f9897b = 0;
            int[] iArr = this.f9910o;
            int i11 = this.f9908m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f9904i;
        }
        if (i10 == 16) {
            this.f9906k = new String(this.f9899d, this.f9900e, this.f9905j);
            this.f9900e += this.f9905j;
        } else if (i10 != 8 && i10 != 9) {
            if (i10 == 10) {
                this.f9906k = t();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + f() + r());
            }
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.f9906k = b(c10);
        }
        this.f9897b = 11;
        double parseDouble = Double.parseDouble(this.f9906k);
        if (!this.a && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + r());
        }
        this.f9906k = null;
        this.f9897b = 0;
        int[] iArr2 = this.f9910o;
        int i12 = this.f9908m - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public long m() throws IOException {
        char c10;
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            this.f9897b = 0;
            int[] iArr = this.f9910o;
            int i11 = this.f9908m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f9904i;
        }
        if (i10 == 16) {
            this.f9906k = new String(this.f9899d, this.f9900e, this.f9905j);
            this.f9900e += this.f9905j;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected a long but was " + f() + r());
            }
            if (i10 == 10) {
                this.f9906k = t();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f9906k = b(c10);
            }
            try {
                long parseLong = Long.parseLong(this.f9906k);
                this.f9897b = 0;
                int[] iArr2 = this.f9910o;
                int i12 = this.f9908m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f9897b = 11;
        double parseDouble = Double.parseDouble(this.f9906k);
        long j3 = (long) parseDouble;
        if (j3 == parseDouble) {
            this.f9906k = null;
            this.f9897b = 0;
            int[] iArr3 = this.f9910o;
            int i13 = this.f9908m - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j3;
        }
        throw new NumberFormatException("Expected a long but was " + this.f9906k + r());
    }

    public int n() throws IOException {
        char c10;
        int i10 = this.f9897b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            long j3 = this.f9904i;
            int i11 = (int) j3;
            if (j3 == i11) {
                this.f9897b = 0;
                int[] iArr = this.f9910o;
                int i12 = this.f9908m - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f9904i + r());
        }
        if (i10 == 16) {
            this.f9906k = new String(this.f9899d, this.f9900e, this.f9905j);
            this.f9900e += this.f9905j;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected an int but was " + f() + r());
            }
            if (i10 == 10) {
                this.f9906k = t();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f9906k = b(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.f9906k);
                this.f9897b = 0;
                int[] iArr2 = this.f9910o;
                int i13 = this.f9908m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f9897b = 11;
        double parseDouble = Double.parseDouble(this.f9906k);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.f9906k = null;
            this.f9897b = 0;
            int[] iArr3 = this.f9910o;
            int i15 = this.f9908m - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f9906k + r());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x009d. Please report as an issue. */
    public void o() throws IOException {
        int i10 = 0;
        do {
            int i11 = this.f9897b;
            if (i11 == 0) {
                i11 = q();
            }
            if (i11 == 3) {
                a(1);
            } else if (i11 == 1) {
                a(3);
            } else {
                if (i11 == 4) {
                    this.f9908m--;
                } else if (i11 == 2) {
                    this.f9908m--;
                } else {
                    if (i11 != 14 && i11 != 10) {
                        if (i11 != 8 && i11 != 12) {
                            if (i11 != 9 && i11 != 13) {
                                if (i11 == 16) {
                                    this.f9900e += this.f9905j;
                                }
                            } else {
                                c('\"');
                            }
                        } else {
                            c('\'');
                        }
                    } else {
                        do {
                            int i12 = 0;
                            while (true) {
                                int i13 = this.f9900e;
                                if (i13 + i12 < this.f9901f) {
                                    char c10 = this.f9899d[i13 + i12];
                                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                                        if (c10 != '#') {
                                            if (c10 != ',') {
                                                if (c10 != '/' && c10 != '=') {
                                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                                        if (c10 != ';') {
                                                            switch (c10) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i12++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f9900e = i13 + i12;
                                }
                            }
                            u();
                            this.f9900e += i12;
                        } while (b(1));
                    }
                    this.f9897b = 0;
                }
                i10--;
                this.f9897b = 0;
            }
            i10++;
            this.f9897b = 0;
        } while (i10 != 0);
        int[] iArr = this.f9910o;
        int i14 = this.f9908m;
        int i15 = i14 - 1;
        iArr[i15] = iArr[i15] + 1;
        this.f9909n[i14 - 1] = AbstractJsonLexerKt.NULL;
    }

    public String p() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f9908m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f9907l[i11];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = this.f9909n[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(this.f9910o[i11]);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            }
        }
        return sb2.toString();
    }

    public final int q() throws IOException {
        int a;
        int[] iArr = this.f9907l;
        int i10 = this.f9908m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int a10 = a(true);
            if (a10 != 44) {
                if (a10 != 59) {
                    if (a10 == 93) {
                        this.f9897b = 4;
                        return 4;
                    }
                    throw b("Unterminated array");
                }
                u();
            }
        } else if (i11 != 3 && i11 != 5) {
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int a11 = a(true);
                if (a11 != 58) {
                    if (a11 == 61) {
                        u();
                        if (this.f9900e < this.f9901f || b(1)) {
                            char[] cArr = this.f9899d;
                            int i12 = this.f9900e;
                            if (cArr[i12] == '>') {
                                this.f9900e = i12 + 1;
                            }
                        }
                    } else {
                        throw b("Expected ':'");
                    }
                }
            } else if (i11 == 6) {
                if (this.a) {
                    x();
                }
                this.f9907l[this.f9908m - 1] = 7;
            } else if (i11 == 7) {
                if (a(false) == -1) {
                    this.f9897b = 17;
                    return 17;
                }
                u();
                this.f9900e--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i10 - 1] = 4;
            if (i11 == 5 && (a = a(true)) != 44) {
                if (a != 59) {
                    if (a == 125) {
                        this.f9897b = 2;
                        return 2;
                    }
                    throw b("Unterminated object");
                }
                u();
            }
            int a12 = a(true);
            if (a12 != 34) {
                if (a12 != 39) {
                    if (a12 != 125) {
                        u();
                        this.f9900e--;
                        if (a((char) a12)) {
                            this.f9897b = 14;
                            return 14;
                        }
                        throw b("Expected name");
                    }
                    if (i11 != 5) {
                        this.f9897b = 2;
                        return 2;
                    }
                    throw b("Expected name");
                }
                u();
                this.f9897b = 12;
                return 12;
            }
            this.f9897b = 13;
            return 13;
        }
        int a13 = a(true);
        if (a13 != 34) {
            if (a13 != 39) {
                if (a13 != 44 && a13 != 59) {
                    if (a13 != 91) {
                        if (a13 != 93) {
                            if (a13 != 123) {
                                this.f9900e--;
                                int g10 = g();
                                if (g10 != 0) {
                                    return g10;
                                }
                                int s5 = s();
                                if (s5 != 0) {
                                    return s5;
                                }
                                if (a(this.f9899d[this.f9900e])) {
                                    u();
                                    this.f9897b = 10;
                                    return 10;
                                }
                                throw b("Expected value");
                            }
                            this.f9897b = 1;
                            return 1;
                        }
                        if (i11 == 1) {
                            this.f9897b = 4;
                            return 4;
                        }
                    } else {
                        this.f9897b = 3;
                        return 3;
                    }
                }
                if (i11 != 1 && i11 != 2) {
                    throw b("Unexpected value");
                }
                u();
                this.f9900e--;
                this.f9897b = 7;
                return 7;
            }
            u();
            this.f9897b = 8;
            return 8;
        }
        this.f9897b = 9;
        return 9;
    }

    public final String r() {
        StringBuilder n10 = j.n(" at line ", this.f9902g + 1, " column ", (this.f9900e - this.f9903h) + 1, " path ");
        n10.append(p());
        return n10.toString();
    }

    public String toString() {
        return getClass().getSimpleName() + r();
    }

    private void c(char c10) throws IOException {
        char[] cArr = this.f9899d;
        while (true) {
            int i10 = this.f9900e;
            int i11 = this.f9901f;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f9900e = i12;
                        return;
                    }
                    if (c11 == '\\') {
                        this.f9900e = i12;
                        w();
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f9902g++;
                            this.f9903h = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f9900e = i10;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean a(char c10) throws IOException {
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
        u();
        return false;
    }

    private String b(char c10) throws IOException {
        char[] cArr = this.f9899d;
        StringBuilder sb2 = null;
        while (true) {
            int i10 = this.f9900e;
            int i11 = this.f9901f;
            int i12 = i10;
            while (true) {
                if (i12 < i11) {
                    int i13 = i12 + 1;
                    char c11 = cArr[i12];
                    if (c11 == c10) {
                        this.f9900e = i13;
                        int i14 = (i13 - i10) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i10, i14);
                        }
                        sb2.append(cArr, i10, i14);
                        return sb2.toString();
                    }
                    if (c11 == '\\') {
                        this.f9900e = i13;
                        int i15 = (i13 - i10) - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max((i15 + 1) * 2, 16));
                        }
                        sb2.append(cArr, i10, i15);
                        sb2.append(w());
                    } else {
                        if (c11 == '\n') {
                            this.f9902g++;
                            this.f9903h = i13;
                        }
                        i12 = i13;
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i12 - i10) * 2, 16));
                    }
                    sb2.append(cArr, i10, i12 - i10);
                    this.f9900e = i12;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private void a(int i10) {
        int i11 = this.f9908m;
        int[] iArr = this.f9907l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f9907l = Arrays.copyOf(iArr, i12);
            this.f9910o = Arrays.copyOf(this.f9910o, i12);
            this.f9909n = (String[]) Arrays.copyOf(this.f9909n, i12);
        }
        int[] iArr2 = this.f9907l;
        int i13 = this.f9908m;
        this.f9908m = i13 + 1;
        iArr2[i13] = i10;
    }

    private int a(boolean z10) throws IOException {
        char[] cArr = this.f9899d;
        int i10 = this.f9900e;
        int i11 = this.f9901f;
        while (true) {
            if (i10 == i11) {
                this.f9900e = i10;
                if (!b(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + r());
                }
                i10 = this.f9900e;
                i11 = this.f9901f;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f9902g++;
                this.f9903h = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f9900e = i12;
                    if (i12 == i11) {
                        this.f9900e = i12 - 1;
                        boolean b3 = b(2);
                        this.f9900e++;
                        if (!b3) {
                            return c10;
                        }
                    }
                    u();
                    int i13 = this.f9900e;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f9900e = i13 + 1;
                        if (a("*/")) {
                            i10 = this.f9900e + 2;
                            i11 = this.f9901f;
                        } else {
                            throw b("Unterminated comment");
                        }
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f9900e = i13 + 1;
                        v();
                        i10 = this.f9900e;
                        i11 = this.f9901f;
                    }
                } else if (c10 == '#') {
                    this.f9900e = i12;
                    u();
                    v();
                    i10 = this.f9900e;
                    i11 = this.f9901f;
                } else {
                    this.f9900e = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    private boolean b(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f9899d;
        int i13 = this.f9903h;
        int i14 = this.f9900e;
        this.f9903h = i13 - i14;
        int i15 = this.f9901f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f9901f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f9901f = 0;
        }
        this.f9900e = 0;
        do {
            Reader reader = this.f9898c;
            int i17 = this.f9901f;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f9901f + read;
            this.f9901f = i11;
            if (this.f9902g == 0 && (i12 = this.f9903h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f9900e++;
                this.f9903h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private IOException b(String str) throws IOException {
        StringBuilder m10 = eb.j.m(str);
        m10.append(r());
        throw new d(m10.toString());
    }

    private boolean a(String str) throws IOException {
        int i10;
        int length = str.length();
        while (true) {
            if (this.f9900e + length > this.f9901f && !b(length)) {
                return false;
            }
            char[] cArr = this.f9899d;
            int i11 = this.f9900e;
            if (cArr[i11] != '\n') {
                while (i10 < length) {
                    i10 = this.f9899d[this.f9900e + i10] == str.charAt(i10) ? i10 + 1 : 0;
                }
                return true;
            }
            this.f9902g++;
            this.f9903h = i11 + 1;
            this.f9900e++;
        }
    }
}
