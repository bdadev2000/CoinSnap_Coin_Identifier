package U7;

import Q7.AbstractC0255x;
import Q7.C0249q;
import Q7.n0;
import com.applovin.impl.L;
import java.util.ArrayList;
import t7.y;
import u7.AbstractC2816g;
import x7.EnumC2928a;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public final class k implements T7.b {
    public final /* synthetic */ int b;

    /* renamed from: c */
    public int f3372c;

    /* renamed from: d */
    public final Object f3373d;

    /* renamed from: f */
    public Object f3374f;

    /* renamed from: g */
    public final Object f3375g;

    /* renamed from: h */
    public final Object f3376h;

    public k(F7.q qVar, T7.b bVar, w7.k kVar, int i9, S7.a aVar) {
        this.b = 0;
        this.b = 0;
        this.f3373d = kVar;
        this.f3372c = i9;
        this.f3374f = aVar;
        this.f3375g = bVar;
        this.f3376h = qVar;
    }

    public static /* synthetic */ void r(k kVar, String str, int i9, String str2, int i10) {
        if ((i10 & 2) != 0) {
            i9 = kVar.f3372c;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        kVar.q(i9, str, str2);
        throw null;
    }

    public boolean A() {
        int y4 = y();
        String str = (String) this.f3376h;
        if (y4 == str.length() || y4 == -1 || str.charAt(y4) != ',') {
            return false;
        }
        this.f3372c++;
        return true;
    }

    public boolean B() {
        int x9 = x(y());
        String str = (String) this.f3376h;
        int length = str.length() - x9;
        if (length < 4 || x9 == -1) {
            return true;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            if ("null".charAt(i9) != str.charAt(x9 + i9)) {
                return true;
            }
        }
        if (length > 4 && g8.k.g(str.charAt(x9 + 4)) == 0) {
            return true;
        }
        this.f3372c = x9 + 4;
        return false;
    }

    public void C(char c9) {
        int i9 = this.f3372c - 1;
        this.f3372c = i9;
        if (i9 >= 0 && c9 == '\"' && G7.j.a(m(), "null")) {
            q(this.f3372c - 4, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw null;
        }
        s(g8.k.g(c9));
        throw null;
    }

    public int a(CharSequence charSequence, int i9) {
        int i10 = i9 + 4;
        if (i10 >= charSequence.length()) {
            this.f3372c = i9;
            if (i10 < charSequence.length()) {
                return a(charSequence, this.f3372c);
            }
            r(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        ((StringBuilder) this.f3375g).append((char) (u(charSequence, i9 + 3) + (u(charSequence, i9) << 12) + (u(charSequence, i9 + 1) << 8) + (u(charSequence, i9 + 2) << 4)));
        return i10;
    }

    public boolean b() {
        int i9 = this.f3372c;
        boolean z8 = false;
        if (i9 == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.f3376h;
            if (i9 < str.length()) {
                char charAt = str.charAt(i9);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f3372c = i9;
                    if (charAt == '}' || charAt == ']' || charAt == ':' || charAt == ',') {
                        z8 = true;
                    }
                    return !z8;
                }
                i9++;
            } else {
                this.f3372c = i9;
                return false;
            }
        }
    }

    public boolean c(int i9) {
        int x9 = x(i9);
        String str = (String) this.f3376h;
        if (x9 < str.length() && x9 != -1) {
            int i10 = x9 + 1;
            int charAt = str.charAt(x9) | ' ';
            if (charAt != 102) {
                if (charAt == 116) {
                    d(i10, "rue");
                    return true;
                }
                r(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                throw null;
            }
            d(i10, "alse");
            return false;
        }
        r(this, "EOF", 0, null, 6);
        throw null;
    }

    public void d(int i9, String str) {
        String str2 = (String) this.f3376h;
        if (str2.length() - i9 >= str.length()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) != (str2.charAt(i9 + i10) | ' ')) {
                    r(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.f3372c = str.length() + i9;
            return;
        }
        r(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public String e() {
        String p2;
        char c9;
        i('\"');
        int i9 = this.f3372c;
        String str = (String) this.f3376h;
        int I5 = O7.g.I(str, '\"', i9, false, 4);
        if (I5 != -1) {
            int i10 = i9;
            while (i10 < I5) {
                if (str.charAt(i10) == '\\') {
                    int i11 = this.f3372c;
                    char charAt = str.charAt(i10);
                    boolean z8 = false;
                    while (charAt != '\"') {
                        if (charAt == '\\') {
                            ((StringBuilder) this.f3375g).append((CharSequence) str, i11, i10);
                            int x9 = x(i10 + 1);
                            if (x9 != -1) {
                                int i12 = x9 + 1;
                                char charAt2 = str.charAt(x9);
                                if (charAt2 == 'u') {
                                    i12 = a(str, i12);
                                } else {
                                    if (charAt2 < 'u') {
                                        c9 = g8.d.f20499a[charAt2];
                                    } else {
                                        c9 = 0;
                                    }
                                    if (c9 != 0) {
                                        ((StringBuilder) this.f3375g).append(c9);
                                    } else {
                                        r(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                        throw null;
                                    }
                                }
                                i11 = x(i12);
                                if (i11 == -1) {
                                    r(this, "EOF", i11, null, 4);
                                    throw null;
                                }
                            } else {
                                r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                                throw null;
                            }
                        } else {
                            i10++;
                            if (i10 >= str.length()) {
                                ((StringBuilder) this.f3375g).append((CharSequence) str, i11, i10);
                                i11 = x(i10);
                                if (i11 == -1) {
                                    r(this, "EOF", i11, null, 4);
                                    throw null;
                                }
                            } else {
                                continue;
                                charAt = str.charAt(i10);
                            }
                        }
                        i10 = i11;
                        z8 = true;
                        charAt = str.charAt(i10);
                    }
                    if (!z8) {
                        p2 = str.subSequence(i11, i10).toString();
                    } else {
                        p2 = p(i11, i10);
                    }
                    this.f3372c = i10 + 1;
                    return p2;
                }
                i10++;
            }
            this.f3372c = I5 + 1;
            String substring = str.substring(i9, I5);
            G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        s((byte) 1);
        throw null;
    }

    public String f(String str, boolean z8) {
        String n2;
        String n9;
        G7.j.e(str, "keyToMatch");
        int i9 = this.f3372c;
        try {
            if (g() != 6) {
                this.f3372c = i9;
                return null;
            }
            if (z8) {
                n2 = e();
            } else {
                n2 = n();
            }
            if (G7.j.a(n2, str)) {
                if (g() != 5) {
                    this.f3372c = i9;
                    return null;
                }
                if (z8) {
                    n9 = l();
                } else {
                    n9 = n();
                }
                this.f3372c = i9;
                return n9;
            }
            this.f3372c = i9;
            return null;
        } catch (Throwable th) {
            this.f3372c = i9;
            throw th;
        }
    }

    public byte g() {
        byte g9;
        do {
            int i9 = this.f3372c;
            if (i9 != -1) {
                String str = (String) this.f3376h;
                if (i9 < str.length()) {
                    int i10 = this.f3372c;
                    this.f3372c = i10 + 1;
                    g9 = g8.k.g(str.charAt(i10));
                } else {
                    return (byte) 10;
                }
            } else {
                return (byte) 10;
            }
        } while (g9 == 3);
        return g9;
    }

    public byte h(byte b) {
        byte g9 = g();
        if (g9 == b) {
            return g9;
        }
        s(b);
        throw null;
    }

    public void i(char c9) {
        if (this.f3372c == -1) {
            C(c9);
            throw null;
        }
        while (true) {
            int i9 = this.f3372c;
            String str = (String) this.f3376h;
            if (i9 < str.length()) {
                int i10 = this.f3372c;
                this.f3372c = i10 + 1;
                char charAt = str.charAt(i10);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    if (charAt == c9) {
                        return;
                    }
                    C(c9);
                    throw null;
                }
            } else {
                C(c9);
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public long j() {
        boolean z8;
        int i9;
        ?? r9;
        int i10;
        int x9 = x(y());
        String str = (String) this.f3376h;
        int i11 = 6;
        int i12 = 0;
        ?? r72 = 0;
        if (x9 < str.length() && x9 != -1) {
            if (str.charAt(x9) == '\"') {
                x9++;
                if (x9 != str.length()) {
                    z8 = true;
                } else {
                    r(this, "EOF", 0, null, 6);
                    throw null;
                }
            } else {
                z8 = false;
            }
            int i13 = x9;
            boolean z9 = false;
            long j7 = 0;
            int i14 = 1;
            while (i14 != 0) {
                char charAt = str.charAt(i13);
                if (charAt == '-') {
                    if (i13 == x9) {
                        i13++;
                        z9 = true;
                    } else {
                        r(this, "Unexpected symbol '-' in numeric literal", i12, r72, i11);
                        throw r72;
                    }
                } else {
                    if (g8.k.g(charAt) != 0) {
                        break;
                    }
                    i13++;
                    if (i13 != str.length()) {
                        i14 = 1;
                    } else {
                        i14 = i12;
                    }
                    int i15 = charAt - '0';
                    if (i15 >= 0) {
                        if (i15 < 10) {
                            j7 = (j7 * 10) - i15;
                            if (j7 <= 0) {
                                i11 = 6;
                                i12 = 0;
                                r72 = 0;
                            } else {
                                r(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        } else {
                            i9 = i12;
                            r9 = r72;
                            i10 = 6;
                        }
                    } else {
                        i9 = i12;
                        r9 = r72;
                        i10 = i11;
                    }
                    r(this, "Unexpected symbol '" + charAt + "' in numeric literal", i9, r9, i10);
                    throw r9;
                }
            }
            if (x9 != i13 && (!z9 || x9 != i13 - 1)) {
                if (z8) {
                    if (i14 != 0) {
                        if (str.charAt(i13) == '\"') {
                            i13++;
                        } else {
                            r(this, "Expected closing quotation mark", 0, null, 6);
                            throw null;
                        }
                    } else {
                        r(this, "EOF", 0, null, 6);
                        throw null;
                    }
                }
                this.f3372c = i13;
                if (!z9) {
                    if (j7 != Long.MIN_VALUE) {
                        return -j7;
                    }
                    r(this, "Numeric value overflow", 0, null, 6);
                    throw null;
                }
                return j7;
            }
            r(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        r(this, "EOF", 0, null, 6);
        throw null;
    }

    @Override // T7.b
    public Object k(T7.c cVar, w7.f fVar) {
        Object d2;
        w7.k f9;
        boolean z8;
        y yVar = y.f23029a;
        EnumC2928a enumC2928a = EnumC2928a.b;
        if (this.f3372c == -3) {
            w7.k context = fVar.getContext();
            Boolean bool = Boolean.FALSE;
            C0249q c0249q = C0249q.f2580d;
            w7.k kVar = (w7.k) this.f3373d;
            if (!((Boolean) kVar.b(bool, c0249q)).booleanValue()) {
                f9 = context.n(kVar);
            } else {
                f9 = AbstractC0255x.f(context, kVar, false);
            }
            if (G7.j.a(f9, context)) {
                d2 = t(cVar, fVar);
                if (d2 != enumC2928a) {
                    return yVar;
                }
            } else {
                w7.g gVar = w7.g.b;
                if (G7.j.a(f9.h(gVar), context.h(gVar))) {
                    w7.k context2 = fVar.getContext();
                    if (cVar instanceof v) {
                        z8 = true;
                    } else {
                        z8 = cVar instanceof o;
                    }
                    if (!z8) {
                        cVar = new T7.j(cVar, context2);
                    }
                    d2 = p.a(f9, cVar, V7.a.k(f9), new f(this, null), fVar);
                    if (d2 != enumC2928a) {
                        return yVar;
                    }
                }
            }
            return d2;
        }
        d2 = AbstractC0255x.d(new d(cVar, this, null), fVar);
        if (d2 != enumC2928a) {
            d2 = yVar;
        }
        if (d2 != enumC2928a) {
            return yVar;
        }
        return d2;
    }

    public String l() {
        String str = (String) this.f3374f;
        if (str != null) {
            G7.j.b(str);
            this.f3374f = null;
            return str;
        }
        return e();
    }

    public String m() {
        String p2;
        String str = (String) this.f3374f;
        if (str != null) {
            G7.j.b(str);
            this.f3374f = null;
            return str;
        }
        int y4 = y();
        String str2 = (String) this.f3376h;
        if (y4 < str2.length() && y4 != -1) {
            byte g9 = g8.k.g(str2.charAt(y4));
            if (g9 == 1) {
                return l();
            }
            if (g9 == 0) {
                boolean z8 = false;
                while (g8.k.g(str2.charAt(y4)) == 0) {
                    y4++;
                    if (y4 >= str2.length()) {
                        ((StringBuilder) this.f3375g).append((CharSequence) str2, this.f3372c, y4);
                        int x9 = x(y4);
                        if (x9 == -1) {
                            this.f3372c = y4;
                            return p(0, 0);
                        }
                        y4 = x9;
                        z8 = true;
                    }
                }
                if (!z8) {
                    p2 = str2.subSequence(this.f3372c, y4).toString();
                } else {
                    p2 = p(this.f3372c, y4);
                }
                this.f3372c = y4;
                return p2;
            }
            r(this, "Expected beginning of the string, but got " + str2.charAt(y4), 0, null, 6);
            throw null;
        }
        r(this, "EOF", y4, null, 4);
        throw null;
    }

    public String n() {
        String m = m();
        if (G7.j.a(m, "null")) {
            if (((String) this.f3376h).charAt(this.f3372c - 1) != '\"') {
                r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return m;
    }

    public k o(w7.k kVar, int i9, S7.a aVar) {
        return new k((F7.q) this.f3376h, (T7.b) this.f3375g, kVar, i9, aVar);
    }

    public String p(int i9, int i10) {
        ((StringBuilder) this.f3375g).append((CharSequence) this.f3376h, i9, i10);
        StringBuilder sb = (StringBuilder) this.f3375g;
        String sb2 = sb.toString();
        G7.j.d(sb2, "escapedString.toString()");
        sb.setLength(0);
        return sb2;
    }

    public void q(int i9, String str, String str2) {
        String concat;
        G7.j.e(str, "message");
        G7.j.e(str2, "hint");
        if (str2.length() == 0) {
            concat = "";
        } else {
            concat = "\n".concat(str2);
        }
        StringBuilder c9 = AbstractC2965e.c(str, " at path: ");
        c9.append(((D0.l) this.f3373d).e());
        c9.append(concat);
        throw g8.k.d((String) this.f3376h, i9, c9.toString());
    }

    public void s(byte b) {
        String str;
        String str2;
        int i9;
        if (b == 1) {
            str = "quotation mark '\"'";
        } else if (b == 4) {
            str = "comma ','";
        } else if (b == 5) {
            str = "colon ':'";
        } else if (b == 6) {
            str = "start of the object '{'";
        } else if (b == 7) {
            str = "end of the object '}'";
        } else if (b == 8) {
            str = "start of the array '['";
        } else if (b == 9) {
            str = "end of the array ']'";
        } else {
            str = "valid token";
        }
        int i10 = this.f3372c;
        String str3 = (String) this.f3376h;
        if (i10 != str3.length() && (i9 = this.f3372c) > 0) {
            str2 = String.valueOf(str3.charAt(i9 - 1));
        } else {
            str2 = "EOF";
        }
        r(this, n0.j("Expected ", str, ", but had '", str2, "' instead"), this.f3372c - 1, null, 4);
        throw null;
    }

    public Object t(T7.c cVar, w7.f fVar) {
        Object d2 = AbstractC0255x.d(new j(cVar, this, null), fVar);
        if (d2 == EnumC2928a.b) {
            return d2;
        }
        return y.f23029a;
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return ((T7.b) this.f3375g) + " -> " + z();
            default:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f3376h);
                sb.append("', currentPosition=");
                return com.mbridge.msdk.foundation.entity.o.l(sb, this.f3372c, ')');
        }
    }

    public int u(CharSequence charSequence, int i9) {
        char charAt = charSequence.charAt(i9);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        r(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public T7.b v(w7.k kVar, int i9, S7.a aVar) {
        w7.k kVar2 = (w7.k) this.f3373d;
        w7.k n2 = kVar.n(kVar2);
        S7.a aVar2 = S7.a.b;
        S7.a aVar3 = (S7.a) this.f3374f;
        int i10 = this.f3372c;
        if (aVar == aVar2) {
            if (i10 != -3) {
                if (i9 != -3) {
                    if (i10 != -2) {
                        if (i9 != -2) {
                            i9 += i10;
                            if (i9 < 0) {
                                i9 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i9 = i10;
            }
            aVar = aVar3;
        }
        if (G7.j.a(n2, kVar2) && i9 == i10 && aVar == aVar3) {
            return this;
        }
        return o(n2, i9, aVar);
    }

    public byte w() {
        int i9 = this.f3372c;
        while (true) {
            int x9 = x(i9);
            if (x9 != -1) {
                char charAt = ((String) this.f3376h).charAt(x9);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f3372c = x9;
                    return g8.k.g(charAt);
                }
                i9 = x9 + 1;
            } else {
                this.f3372c = x9;
                return (byte) 10;
            }
        }
    }

    public int x(int i9) {
        if (i9 >= ((String) this.f3376h).length()) {
            return -1;
        }
        return i9;
    }

    public int y() {
        char charAt;
        int i9 = this.f3372c;
        if (i9 == -1) {
            return i9;
        }
        while (true) {
            String str = (String) this.f3376h;
            if (i9 >= str.length() || !((charAt = str.charAt(i9)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i9++;
        }
        this.f3372c = i9;
        return i9;
    }

    public String z() {
        ArrayList arrayList = new ArrayList(4);
        w7.l lVar = w7.l.b;
        w7.k kVar = (w7.k) this.f3373d;
        if (kVar != lVar) {
            arrayList.add("context=" + kVar);
        }
        int i9 = this.f3372c;
        if (i9 != -3) {
            arrayList.add("capacity=" + i9);
        }
        S7.a aVar = S7.a.b;
        S7.a aVar2 = (S7.a) this.f3374f;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return L.k(sb, AbstractC2816g.O(arrayList, ", ", null, null, null, 62), ']');
    }

    public k(String str) {
        this.b = 1;
        G7.j.e(str, "source");
        D0.l lVar = new D0.l((byte) 0, 7);
        lVar.f626c = new Object[8];
        int[] iArr = new int[8];
        for (int i9 = 0; i9 < 8; i9++) {
            iArr[i9] = -1;
        }
        lVar.f627d = iArr;
        lVar.b = -1;
        this.f3373d = lVar;
        this.f3375g = new StringBuilder();
        this.f3376h = str;
    }
}
