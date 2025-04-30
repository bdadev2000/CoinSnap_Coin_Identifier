package e8;

import java.util.Locale;
import java.util.Map;
import t7.C2720i;
import t7.C2726o;
import t7.C2727p;
import t7.C2728q;
import t7.C2729r;
import t7.C2730s;
import t7.C2731t;
import u7.AbstractC2829t;

/* loaded from: classes3.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f20159a;

    static {
        C2720i c2720i = new C2720i(G7.s.a(String.class), k0.f20172a);
        C2720i c2720i2 = new C2720i(G7.s.a(Character.TYPE), C2240o.f20183a);
        C2720i c2720i3 = new C2720i(G7.s.a(char[].class), C2239n.f20181c);
        C2720i c2720i4 = new C2720i(G7.s.a(Double.TYPE), C2245u.f20194a);
        C2720i c2720i5 = new C2720i(G7.s.a(double[].class), C2244t.f20192c);
        C2720i c2720i6 = new C2720i(G7.s.a(Float.TYPE), C.f20117a);
        C2720i c2720i7 = new C2720i(G7.s.a(float[].class), B.f20116c);
        C2720i c2720i8 = new C2720i(G7.s.a(Long.TYPE), O.f20131a);
        C2720i c2720i9 = new C2720i(G7.s.a(long[].class), N.f20130c);
        C2720i c2720i10 = new C2720i(G7.s.a(C2730s.class), v0.f20197a);
        C2720i c2720i11 = new C2720i(G7.s.a(C2731t.class), u0.f20195c);
        C2720i c2720i12 = new C2720i(G7.s.a(Integer.TYPE), K.f20127a);
        C2720i c2720i13 = new C2720i(G7.s.a(int[].class), J.f20126c);
        C2720i c2720i14 = new C2720i(G7.s.a(C2728q.class), s0.f20191a);
        C2720i c2720i15 = new C2720i(G7.s.a(C2729r.class), r0.f20189c);
        C2720i c2720i16 = new C2720i(G7.s.a(Short.TYPE), j0.f20171a);
        C2720i c2720i17 = new C2720i(G7.s.a(short[].class), i0.f20169c);
        C2720i c2720i18 = new C2720i(G7.s.a(t7.v.class), y0.f20206a);
        C2720i c2720i19 = new C2720i(G7.s.a(t7.w.class), x0.f20205c);
        C2720i c2720i20 = new C2720i(G7.s.a(Byte.TYPE), C2234i.f20168a);
        C2720i c2720i21 = new C2720i(G7.s.a(byte[].class), C2233h.f20166c);
        C2720i c2720i22 = new C2720i(G7.s.a(C2726o.class), p0.f20186a);
        C2720i c2720i23 = new C2720i(G7.s.a(C2727p.class), o0.f20184c);
        C2720i c2720i24 = new C2720i(G7.s.a(Boolean.TYPE), C2231f.f20162a);
        C2720i c2720i25 = new C2720i(G7.s.a(boolean[].class), C2230e.f20160c);
        C2720i c2720i26 = new C2720i(G7.s.a(t7.y.class), z0.b);
        G7.e a6 = G7.s.a(P7.a.class);
        int i9 = P7.a.f2440f;
        f20159a = AbstractC2829t.Z(c2720i, c2720i2, c2720i3, c2720i4, c2720i5, c2720i6, c2720i7, c2720i8, c2720i9, c2720i10, c2720i11, c2720i12, c2720i13, c2720i14, c2720i15, c2720i16, c2720i17, c2720i18, c2720i19, c2720i20, c2720i21, c2720i22, c2720i23, c2720i24, c2720i25, c2720i26, new C2720i(a6, C2246v.f20196a));
    }

    public static final String a(String str) {
        String valueOf;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                String valueOf2 = String.valueOf(charAt);
                G7.j.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
                Locale locale = Locale.ROOT;
                valueOf = valueOf2.toUpperCase(locale);
                G7.j.d(valueOf, "toUpperCase(...)");
                if (valueOf.length() > 1) {
                    if (charAt != 329) {
                        char charAt2 = valueOf.charAt(0);
                        String substring = valueOf.substring(1);
                        G7.j.d(substring, "substring(...)");
                        String lowerCase = substring.toLowerCase(locale);
                        G7.j.d(lowerCase, "toLowerCase(...)");
                        valueOf = charAt2 + lowerCase;
                    }
                } else {
                    valueOf = String.valueOf(Character.toTitleCase(charAt));
                }
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring2 = str.substring(1);
            G7.j.d(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        return str;
    }
}
