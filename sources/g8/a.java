package g8;

import a5.C0398b;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e8.l0;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import u7.AbstractC2816g;
import u7.AbstractC2817h;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public abstract class a implements f8.i, d8.c, d8.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20492a = new ArrayList();
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final f8.b f20493c;

    /* renamed from: d, reason: collision with root package name */
    public final f8.h f20494d;

    public a(f8.b bVar) {
        this.f20493c = bVar;
        this.f20494d = bVar.f20370a;
    }

    public static f8.q F(f8.y yVar, String str) {
        f8.q qVar;
        if (yVar instanceof f8.q) {
            qVar = (f8.q) yVar;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            return qVar;
        }
        throw k.c(-1, "Unexpected 'null' when " + str + " was expected");
    }

    @Override // d8.a
    public final Object A(c8.g gVar, int i9, a8.b bVar, Object obj) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(bVar, "deserializer");
        String S8 = S(gVar, i9);
        l0 l0Var = new l0(this, bVar, obj, 1);
        this.f20492a.add(S8);
        Object invoke = l0Var.invoke();
        if (!this.b) {
            U();
        }
        this.b = false;
        return invoke;
    }

    @Override // d8.c
    public final short B() {
        return O(U());
    }

    @Override // d8.c
    public final float C() {
        return M(U());
    }

    @Override // d8.c
    public final double D() {
        return L(U());
    }

    @Override // d8.a
    public final int E(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        try {
            return Integer.parseInt(R(S(gVar, i9)).b());
        } catch (IllegalArgumentException unused) {
            V("int");
            throw null;
        }
    }

    public abstract f8.j G(String str);

    public final f8.j H() {
        f8.j G3;
        String str = (String) AbstractC2816g.Q(this.f20492a);
        if (str == null || (G3 = G(str)) == null) {
            return T();
        }
        return G3;
    }

    public final boolean I(Object obj) {
        String str = (String) obj;
        G7.j.e(str, "tag");
        f8.y R4 = R(str);
        if (!this.f20493c.f20370a.f20386c && F(R4, "boolean").b) {
            throw k.d(H().toString(), -1, AbstractC2914a.e("Boolean literal for key '", str, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."));
        }
        try {
            Boolean m = C2.m.m(R4);
            if (m != null) {
                return m.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            V("boolean");
            throw null;
        }
    }

    public final byte J(Object obj) {
        Byte b;
        String str = (String) obj;
        G7.j.e(str, "tag");
        try {
            int parseInt = Integer.parseInt(R(str).b());
            if (-128 <= parseInt && parseInt <= 127) {
                b = Byte.valueOf((byte) parseInt);
            } else {
                b = null;
            }
            if (b != null) {
                return b.byteValue();
            }
            V("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            V("byte");
            throw null;
        }
    }

    public final char K(Object obj) {
        String str = (String) obj;
        G7.j.e(str, "tag");
        try {
            String b = R(str).b();
            G7.j.e(b, "<this>");
            int length = b.length();
            if (length != 0) {
                if (length == 1) {
                    return b.charAt(0);
                }
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
            throw new NoSuchElementException("Char sequence is empty.");
        } catch (IllegalArgumentException unused) {
            V("char");
            throw null;
        }
    }

    public final double L(Object obj) {
        String str = (String) obj;
        G7.j.e(str, "tag");
        try {
            double parseDouble = Double.parseDouble(R(str).b());
            if (!this.f20493c.f20370a.f20394k && (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                Double valueOf = Double.valueOf(parseDouble);
                String obj2 = H().toString();
                G7.j.e(obj2, "output");
                throw k.c(-1, k.o(valueOf, str, obj2));
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            V("double");
            throw null;
        }
    }

    public final float M(Object obj) {
        String str = (String) obj;
        G7.j.e(str, "tag");
        try {
            float parseFloat = Float.parseFloat(R(str).b());
            if (!this.f20493c.f20370a.f20394k && (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                Float valueOf = Float.valueOf(parseFloat);
                String obj2 = H().toString();
                G7.j.e(obj2, "output");
                throw k.c(-1, k.o(valueOf, str, obj2));
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            V("float");
            throw null;
        }
    }

    public final d8.c N(Object obj, c8.g gVar) {
        String str = (String) obj;
        G7.j.e(str, "tag");
        G7.j.e(gVar, "inlineDescriptor");
        if (x.a(gVar)) {
            return new g(new U7.k(R(str).b()), this.f20493c);
        }
        this.f20492a.add(str);
        return this;
    }

    public final short O(Object obj) {
        Short sh;
        String str = (String) obj;
        G7.j.e(str, "tag");
        try {
            int parseInt = Integer.parseInt(R(str).b());
            if (-32768 <= parseInt && parseInt <= 32767) {
                sh = Short.valueOf((short) parseInt);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            V("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            V("short");
            throw null;
        }
    }

    public final String P(Object obj) {
        String str = (String) obj;
        G7.j.e(str, "tag");
        f8.y R4 = R(str);
        if (!this.f20493c.f20370a.f20386c && !F(R4, "string").b) {
            throw k.d(H().toString(), -1, AbstractC2914a.e("String literal for key '", str, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."));
        }
        if (!(R4 instanceof f8.t)) {
            return R4.b();
        }
        throw k.d(H().toString(), -1, "Unexpected 'null' value instead of string literal");
    }

    public String Q(c8.g gVar, int i9) {
        G7.j.e(gVar, CampaignEx.JSON_KEY_DESC);
        return gVar.g(i9);
    }

    public final f8.y R(String str) {
        f8.y yVar;
        G7.j.e(str, "tag");
        f8.j G3 = G(str);
        if (G3 instanceof f8.y) {
            yVar = (f8.y) G3;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            return yVar;
        }
        throw k.d(H().toString(), -1, "Expected JsonPrimitive at " + str + ", found " + G3);
    }

    public final String S(c8.g gVar, int i9) {
        G7.j.e(gVar, "<this>");
        String Q8 = Q(gVar, i9);
        G7.j.e(Q8, "nestedName");
        return Q8;
    }

    public abstract f8.j T();

    public final Object U() {
        ArrayList arrayList = this.f20492a;
        Object remove = arrayList.remove(AbstractC2817h.A(arrayList));
        this.b = true;
        return remove;
    }

    public final void V(String str) {
        throw k.d(H().toString(), -1, "Failed to parse '" + str + '\'');
    }

    @Override // d8.c, d8.a
    public final C0398b a() {
        return this.f20493c.b;
    }

    @Override // d8.c
    public d8.a b(c8.g gVar) {
        boolean z8;
        d8.a oVar;
        G7.j.e(gVar, "descriptor");
        f8.j H8 = H();
        com.bumptech.glide.c kind = gVar.getKind();
        if (G7.j.a(kind, c8.l.f5454e)) {
            z8 = true;
        } else {
            z8 = kind instanceof c8.d;
        }
        f8.b bVar = this.f20493c;
        if (z8) {
            if (H8 instanceof f8.c) {
                oVar = new p(bVar, (f8.c) H8);
            } else {
                throw k.c(-1, "Expected " + G7.s.a(f8.c.class) + " as the serialized body of " + gVar.a() + ", but had " + G7.s.a(H8.getClass()));
            }
        } else if (G7.j.a(kind, c8.l.f5455f)) {
            c8.g f9 = k.f(gVar.j(0), bVar.b);
            com.bumptech.glide.c kind2 = f9.getKind();
            if (!(kind2 instanceof c8.f) && !G7.j.a(kind2, c8.k.f5452e)) {
                if (bVar.f20370a.f20387d) {
                    if (H8 instanceof f8.c) {
                        oVar = new p(bVar, (f8.c) H8);
                    } else {
                        throw k.c(-1, "Expected " + G7.s.a(f8.c.class) + " as the serialized body of " + gVar.a() + ", but had " + G7.s.a(H8.getClass()));
                    }
                } else {
                    throw k.b(f9);
                }
            } else if (H8 instanceof f8.v) {
                oVar = new q(bVar, (f8.v) H8);
            } else {
                throw k.c(-1, "Expected " + G7.s.a(f8.v.class) + " as the serialized body of " + gVar.a() + ", but had " + G7.s.a(H8.getClass()));
            }
        } else if (H8 instanceof f8.v) {
            oVar = new o(bVar, (f8.v) H8, null, null);
        } else {
            throw k.c(-1, "Expected " + G7.s.a(f8.v.class) + " as the serialized body of " + gVar.a() + ", but had " + G7.s.a(H8.getClass()));
        }
        return oVar;
    }

    @Override // d8.a
    public void c(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
    }

    @Override // f8.i
    public final f8.b d() {
        return this.f20493c;
    }

    @Override // d8.c
    public final boolean e() {
        return I(U());
    }

    @Override // d8.c
    public final char f() {
        return K(U());
    }

    @Override // d8.a
    public final d8.c g(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return N(S(gVar, i9), gVar.j(i9));
    }

    @Override // d8.c
    public final d8.c i(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        return N(U(), gVar);
    }

    @Override // d8.a
    public final boolean j(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return I(S(gVar, i9));
    }

    @Override // d8.a
    public final char k(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return K(S(gVar, i9));
    }

    @Override // f8.i
    public final f8.j l() {
        return H();
    }

    @Override // d8.c
    public final int m() {
        String str = (String) U();
        G7.j.e(str, "tag");
        try {
            return Integer.parseInt(R(str).b());
        } catch (IllegalArgumentException unused) {
            V("int");
            throw null;
        }
    }

    @Override // d8.a
    public final float n(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return M(S(gVar, i9));
    }

    @Override // d8.a
    public final long o(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        try {
            return Long.parseLong(R(S(gVar, i9)).b());
        } catch (IllegalArgumentException unused) {
            V(Constants.LONG);
            throw null;
        }
    }

    @Override // d8.c
    public final String p() {
        return P(U());
    }

    @Override // d8.a
    public final short q(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return O(S(gVar, i9));
    }

    @Override // d8.a
    public final double r(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return L(S(gVar, i9));
    }

    @Override // d8.c
    public final long s() {
        String str = (String) U();
        G7.j.e(str, "tag");
        try {
            return Long.parseLong(R(str).b());
        } catch (IllegalArgumentException unused) {
            V(Constants.LONG);
            throw null;
        }
    }

    @Override // d8.c
    public final int t(c8.g gVar) {
        G7.j.e(gVar, "enumDescriptor");
        String str = (String) U();
        G7.j.e(str, "tag");
        return k.k(gVar, this.f20493c, R(str).b(), "");
    }

    @Override // d8.c
    public final Object u(a8.b bVar) {
        G7.j.e(bVar, "deserializer");
        return k.i(this, bVar);
    }

    @Override // d8.c
    public boolean v() {
        return !(H() instanceof f8.t);
    }

    @Override // d8.a
    public final String w(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return P(S(gVar, i9));
    }

    @Override // d8.a
    public final byte x(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return J(S(gVar, i9));
    }

    @Override // d8.c
    public final byte y() {
        return J(U());
    }

    @Override // d8.a
    public final Object z(c8.g gVar, int i9, a8.b bVar, Object obj) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(bVar, "deserializer");
        String S8 = S(gVar, i9);
        l0 l0Var = new l0(this, bVar, obj, 0);
        this.f20492a.add(S8);
        Object invoke = l0Var.invoke();
        if (!this.b) {
            U();
        }
        this.b = false;
        return invoke;
    }
}
