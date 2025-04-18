package p0;

import a1.c;
import b1.b2;
import b1.d0;
import b1.f0;
import b1.g2;
import b1.h0;
import b1.h1;
import b1.h2;
import b1.i0;
import b1.k0;
import b1.k1;
import b1.k2;
import b1.l1;
import b1.l2;
import b1.m0;
import b1.o0;
import b1.q0;
import b1.r0;
import b1.r1;
import b1.s;
import b1.t1;
import b1.w;
import b1.y1;
import com.google.android.gms.common.api.Api;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import e0.q;
import e1.a0;
import e1.b0;
import e1.f1;
import e1.h;
import e1.i1;
import e1.j0;
import e1.t0;
import e1.w0;
import e1.x0;
import f1.n;
import f1.u;
import g1.y;
import h0.g;
import h0.j;
import h0.l;
import h0.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import q0.p;
import r.f;
import w0.d;
import w0.e;

/* loaded from: classes3.dex */
public abstract class a {
    public static int A(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static void A0() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static long B(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Cannot coerce value to an empty range: maximum ", j4, " is less than minimum ");
        r2.append(j3);
        r2.append('.');
        throw new IllegalArgumentException(r2.toString());
    }

    public static void B0(String str) {
        RuntimeException runtimeException = new RuntimeException(androidx.compose.foundation.text.input.a.A("lateinit property ", str, " has not been initialized"));
        v0(a.class.getName(), runtimeException);
        throw runtimeException;
    }

    public static Comparable C(Comparable comparable, d dVar) {
        s(comparable, "<this>");
        s(dVar, "range");
        if (dVar.a()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dVar + '.');
        }
        float f2 = dVar.f31404a;
        if (d.b(comparable, Float.valueOf(f2)) && !d.b(Float.valueOf(f2), comparable)) {
            return Float.valueOf(f2);
        }
        float f3 = dVar.f31405b;
        return (!d.b(Float.valueOf(f3), comparable) || d.b(comparable, Float.valueOf(f3))) ? comparable : Float.valueOf(f3);
    }

    public static String C0(char c2, Locale locale) {
        s(locale, "locale");
        String valueOf = String.valueOf(c2);
        q(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        r(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            String valueOf2 = String.valueOf(c2);
            q(valueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
            r(upperCase2, "toUpperCase(...)");
            return !g(upperCase, upperCase2) ? upperCase : String.valueOf(Character.toTitleCase(c2));
        }
        if (c2 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        String substring = upperCase.substring(1);
        r(substring, "substring(...)");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        r(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }

    public static final Object D(h hVar, p pVar, g gVar) {
        int i2 = b0.f30235a;
        Object collect = k(new n(new a0(pVar, null), hVar, m.f30726a, -2, 1), 0).collect(u.f30494a, gVar);
        i0.a aVar = i0.a.f30806a;
        d0.b0 b0Var = d0.b0.f30125a;
        if (collect != aVar) {
            collect = b0Var;
        }
        return collect == aVar ? collect : b0Var;
    }

    public static String D0(String str) {
        int i2;
        Comparable comparable;
        String str2;
        s(str, "<this>");
        List c12 = z0.m.c1(str);
        List list = c12;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!z0.m.Z0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.M(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                if (!o0(str3.charAt(i2))) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                i2 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i2));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        c12.size();
        int p2 = f0.p(c12);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                f0.D();
                throw null;
            }
            String str4 = (String) obj2;
            if ((i2 == 0 || i2 == p2) && z0.m.Z0(str4)) {
                str2 = null;
            } else {
                s(str4, "<this>");
                if (intValue < 0) {
                    throw new IllegalArgumentException(android.support.v4.media.d.j("Requested character count ", intValue, " is less than zero.").toString());
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str2 = str4.substring(length3);
                r(str2, "substring(...)");
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(length2);
        e0.u.J0(arrayList3, sb, null, 124);
        String sb2 = sb.toString();
        r(sb2, "toString(...)");
        return sb2;
    }

    public static int E(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static String E0(String str) {
        s(str, "<this>");
        if (!(!z0.m.Z0(ImpressionLog.Q))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List c12 = z0.m.c1(str);
        int length = str.length();
        c12.size();
        int p2 = f0.p(c12);
        ArrayList arrayList = new ArrayList();
        Iterator it = c12.iterator();
        int i2 = 0;
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                e0.u.J0(arrayList, sb, null, 124);
                String sb2 = sb.toString();
                r(sb2, "toString(...)");
                return sb2;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                f0.D();
                throw null;
            }
            String str3 = (String) next;
            if ((i2 != 0 && i2 != p2) || !z0.m.Z0(str3)) {
                int length2 = str3.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!o0(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1 && z0.m.p1(str3, ImpressionLog.Q, i4, false)) {
                    str2 = str3.substring(i4 + 1);
                    r(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i2 = i3;
        }
    }

    public static int F(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w0.g, w0.e] */
    public static w0.g F0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new e(i2, i3 - 1, 1);
        }
        w0.g gVar = w0.g.d;
        return w0.g.d;
    }

    public static final double G(int i2, int i3, int i4, int i5, f fVar) {
        double d = i4 / i2;
        double d2 = i5 / i3;
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            return Math.max(d, d2);
        }
        if (ordinal == 1) {
            return Math.min(d, d2);
        }
        throw new RuntimeException();
    }

    public static final k2 G0(g gVar, l lVar, Object obj) {
        k2 k2Var = null;
        if (!(gVar instanceof j0.d)) {
            return null;
        }
        if (lVar.i(l2.f22343a) != null) {
            j0.d dVar = (j0.d) gVar;
            while (true) {
                if ((dVar instanceof m0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof k2) {
                    k2Var = (k2) dVar;
                    break;
                }
            }
            if (k2Var != null) {
                k2Var.q0(lVar, obj);
            }
        }
        return k2Var;
    }

    public static final long H(long j2, c cVar, c cVar2) {
        s(cVar, "sourceUnit");
        s(cVar2, "targetUnit");
        return cVar2.f68a.convert(j2, cVar.f68a);
    }

    public static final Object H0(long j2, p pVar, g gVar) {
        if (j2 <= 0) {
            throw new g2("Timed out immediately", null);
        }
        Object w02 = w0(new h2(j2, gVar), pVar);
        i0.a aVar = i0.a.f30806a;
        return w02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (G(r9, r1, g(r7, r2) ? r0.getWidth() : v.g.e(r7.f31350a, r8), g(r7, r2) ? r0.getHeight() : v.g.e(r7.f31351b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap I(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, r.g r7, r.f r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.I(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, r.g, r.f, boolean):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object I0(long r7, q0.p r9, h0.g r10) {
        /*
            boolean r0 = r10 instanceof b1.i2
            if (r0 == 0) goto L13
            r0 = r10
            b1.i2 r0 = (b1.i2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            b1.i2 r0 = new b1.i2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f22333c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.jvm.internal.f0 r7 = r0.f22332b
            kotlin.jvm.internal.q.m(r10)     // Catch: b1.g2 -> L2a
            goto L57
        L2a:
            r8 = move-exception
            goto L5a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.jvm.internal.q.m(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            kotlin.jvm.internal.f0 r10 = new kotlin.jvm.internal.f0
            r10.<init>()
            r0.f22331a = r9     // Catch: b1.g2 -> L58
            r0.f22332b = r10     // Catch: b1.g2 -> L58
            r0.d = r4     // Catch: b1.g2 -> L58
            b1.h2 r2 = new b1.h2     // Catch: b1.g2 -> L58
            r2.<init>(r7, r0)     // Catch: b1.g2 -> L58
            r10.f30930a = r2     // Catch: b1.g2 -> L58
            java.lang.Object r10 = w0(r2, r9)     // Catch: b1.g2 -> L58
            if (r10 != r1) goto L57
            return r1
        L57:
            return r10
        L58:
            r8 = move-exception
            r7 = r10
        L5a:
            b1.h1 r9 = r8.f22324a
            java.lang.Object r7 = r7.f30930a
            if (r9 != r7) goto L61
            return r3
        L61:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.I0(long, q0.p, h0.g):java.lang.Object");
    }

    public static final Object J(p pVar, g gVar) {
        y yVar = new y(gVar, gVar.getContext());
        Object A = t0.A(yVar, yVar, pVar);
        i0.a aVar = i0.a.f30806a;
        return A;
    }

    public static String K(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = a.class.getName();
        int i2 = 0;
        while (!stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        while (stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        t2.append(str);
        return t2.toString();
    }

    public static final Object L(long j2, g gVar) {
        d0.b0 b0Var = d0.b0.f30125a;
        if (j2 <= 0) {
            return b0Var;
        }
        b1.l lVar = new b1.l(1, f0.r(gVar));
        lVar.p();
        if (j2 < Long.MAX_VALUE) {
            h0(lVar.f22340f).G(j2, lVar);
        }
        Object o2 = lVar.o();
        return o2 == i0.a.f30806a ? o2 : b0Var;
    }

    public static int M(char c2) {
        int digit = Character.digit((int) c2, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a decimal digit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0055, B:19:0x006a, B:21:0x0072, B:32:0x0046, B:35:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object N(e1.i r6, d1.r r7, boolean r8, h0.g r9) {
        /*
            boolean r0 = r9 instanceof e1.k
            if (r0 == 0) goto L13
            r0 = r9
            e1.k r0 = (e1.k) r0
            int r1 = r0.f30298g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30298g = r1
            goto L18
        L13:
            e1.k r0 = new e1.k
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30297f
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30298g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.d
            d1.a r6 = r0.f30296c
            d1.r r7 = r0.f30295b
            e1.i r2 = r0.f30294a
            kotlin.jvm.internal.q.m(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L55
        L34:
            r6 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.d
            d1.a r6 = r0.f30296c
            d1.r r7 = r0.f30295b
            e1.i r2 = r0.f30294a
            kotlin.jvm.internal.q.m(r9)     // Catch: java.lang.Throwable -> L34
            goto L6a
        L4a:
            kotlin.jvm.internal.q.m(r9)
            boolean r9 = r6 instanceof e1.k1
            if (r9 != 0) goto L98
            d1.a r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L55:
            r0.f30294a = r6     // Catch: java.lang.Throwable -> L34
            r0.f30295b = r7     // Catch: java.lang.Throwable -> L34
            r0.f30296c = r9     // Catch: java.lang.Throwable -> L34
            r0.d = r8     // Catch: java.lang.Throwable -> L34
            r0.f30298g = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L66
            return r1
        L66:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L87
            java.lang.Object r9 = r6.c()     // Catch: java.lang.Throwable -> L34
            r0.f30294a = r2     // Catch: java.lang.Throwable -> L34
            r0.f30295b = r7     // Catch: java.lang.Throwable -> L34
            r0.f30296c = r6     // Catch: java.lang.Throwable -> L34
            r0.d = r8     // Catch: java.lang.Throwable -> L34
            r0.f30298g = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
            return r1
        L87:
            if (r8 == 0) goto L8d
            r6 = 0
            kotlin.jvm.internal.e.j(r7, r6)
        L8d:
            d0.b0 r6 = d0.b0.f30125a
            return r6
        L90:
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r9 = move-exception
            if (r8 == 0) goto L97
            kotlin.jvm.internal.e.j(r7, r6)
        L97:
            throw r9
        L98:
            e1.k1 r6 = (e1.k1) r6
            java.lang.Throwable r6 = r6.f30302a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.N(e1.i, d1.r, boolean, h0.g):java.lang.Object");
    }

    public static d1.b a(int i2, int i3, int i4) {
        d1.b nVar;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (i3 == 1) {
                    return new d1.n(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i2 != 0) {
                return i2 != Integer.MAX_VALUE ? i3 == 1 ? new d1.b(i2, null) : new d1.n(i2, i3, null) : new d1.b(Api.BaseClientBuilder.API_PRIORITY_OTHER, null);
            }
            nVar = i3 == 1 ? new d1.b(0, null) : new d1.n(1, i3, null);
        } else if (i3 == 1) {
            d1.f.p8.getClass();
            nVar = new d1.b(d1.e.f30177b, null);
        } else {
            nVar = new d1.n(1, i3, null);
        }
        return nVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b1.r1, b1.s] */
    public static s b() {
        ?? r1Var = new r1(true);
        r1Var.W(null);
        return r1Var;
    }

    public static final g1.f c(l lVar) {
        if (lVar.i(b1.a0.f22285b) == null) {
            lVar = lVar.u(new k1(null));
        }
        return new g1.f(lVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b1.b2, b1.k1] */
    public static b2 d() {
        return new k1(null);
    }

    public static final boolean d0(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static void e(StringBuilder sb, Object obj, q0.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e0(e1.h r5, h0.g r6) {
        /*
            boolean r0 = r6 instanceof e1.f0
            if (r0 == 0) goto L13
            r0 = r6
            e1.f0 r0 = (e1.f0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            e1.f0 r0 = new e1.f0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f30263c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            android.support.v4.media.session.i r3 = f1.c.f30458b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            e1.c0 r5 = r0.f30262b
            kotlin.jvm.internal.f0 r0 = r0.f30261a
            kotlin.jvm.internal.q.m(r6)     // Catch: f1.a -> L2d
            goto L5d
        L2d:
            r6 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.jvm.internal.q.m(r6)
            kotlin.jvm.internal.f0 r6 = new kotlin.jvm.internal.f0
            r6.<init>()
            r6.f30930a = r3
            e1.c0 r2 = new e1.c0
            r2.<init>(r6)
            r0.f30261a = r6     // Catch: f1.a -> L55
            r0.f30262b = r2     // Catch: f1.a -> L55
            r0.d = r4     // Catch: f1.a -> L55
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: f1.a -> L55
            if (r5 != r1) goto L53
            goto L61
        L53:
            r0 = r6
            goto L5d
        L55:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L59:
            e1.i r1 = r6.f30450a
            if (r1 != r5) goto L6a
        L5d:
            java.lang.Object r1 = r0.f30930a
            if (r1 == r3) goto L62
        L61:
            return r1
        L62:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.e0(e1.h, h0.g):java.lang.Object");
    }

    public static boolean f(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f0(e1.h r5, q0.p r6, h0.g r7) {
        /*
            boolean r0 = r7 instanceof e1.g0
            if (r0 == 0) goto L13
            r0 = r7
            e1.g0 r0 = (e1.g0) r0
            int r1 = r0.f30272f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30272f = r1
            goto L18
        L13:
            e1.g0 r0 = new e1.g0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30272f
            android.support.v4.media.session.i r3 = f1.c.f30458b
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            e1.e0 r5 = r0.f30271c
            kotlin.jvm.internal.f0 r6 = r0.f30270b
            q0.p r0 = r0.f30269a
            kotlin.jvm.internal.q.m(r7)     // Catch: f1.a -> L2f
            goto L63
        L2f:
            r7 = move-exception
            goto L5f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.jvm.internal.q.m(r7)
            kotlin.jvm.internal.f0 r7 = new kotlin.jvm.internal.f0
            r7.<init>()
            r7.f30930a = r3
            e1.e0 r2 = new e1.e0
            r2.<init>(r6, r7)
            r0.f30269a = r6     // Catch: f1.a -> L5a
            r0.f30270b = r7     // Catch: f1.a -> L5a
            r0.f30271c = r2     // Catch: f1.a -> L5a
            r0.f30272f = r4     // Catch: f1.a -> L5a
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: f1.a -> L5a
            if (r5 != r1) goto L57
            goto L67
        L57:
            r0 = r6
            r6 = r7
            goto L63
        L5a:
            r5 = move-exception
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L5f:
            e1.i r1 = r7.f30450a
            if (r1 != r5) goto L7c
        L63:
            java.lang.Object r1 = r6.f30930a
            if (r1 == r3) goto L68
        L67:
            return r1
        L68:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L7c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.f0(e1.h, q0.p, h0.g):java.lang.Object");
    }

    public static boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    public static final l g0(l lVar, l lVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        w wVar = w.f22385c;
        boolean booleanValue = ((Boolean) lVar.H(bool, wVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) lVar2.H(bool, wVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return lVar.u(lVar2);
        }
        ?? obj = new Object();
        obj.f30930a = lVar2;
        m mVar = m.f30726a;
        l lVar3 = (l) lVar.H(mVar, new z0.l(2, obj, z2));
        if (booleanValue2) {
            obj.f30930a = ((l) obj.f30930a).H(mVar, w.f22384b);
        }
        return lVar3.u((l) obj.f30930a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(Collection collection, g gVar) {
        if (collection.isEmpty()) {
            return e0.w.f30218a;
        }
        i0[] i0VarArr = (i0[]) collection.toArray(new i0[0]);
        b1.e eVar = new b1.e(i0VarArr);
        b1.l lVar = new b1.l(1, f0.r(gVar));
        lVar.p();
        int length = i0VarArr.length;
        b1.c[] cVarArr = new b1.c[length];
        for (int i2 = 0; i2 < length; i2++) {
            r1 r1Var = (r1) i0VarArr[i2];
            r1Var.start();
            b1.c cVar = new b1.c(eVar, lVar);
            cVar.f22291g = r1Var.y(false, true, cVar);
            cVarArr[i2] = cVar;
        }
        b1.d dVar = new b1.d(cVarArr);
        for (int i3 = 0; i3 < length; i3++) {
            b1.c cVar2 = cVarArr[i3];
            cVar2.getClass();
            b1.c.f22289i.set(cVar2, dVar);
        }
        if (!(b1.l.f22338h.get(lVar) instanceof y1)) {
            dVar.c();
        } else {
            lVar.z(dVar);
        }
        Object o2 = lVar.o();
        i0.a aVar = i0.a.f30806a;
        return o2;
    }

    public static final k0 h0(l lVar) {
        j i2 = lVar.i(h0.h.f30725a);
        k0 k0Var = i2 instanceof k0 ? (k0) i2 : null;
        return k0Var == null ? h0.f22326a : k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(h0.g r4) {
        /*
            boolean r0 = r4 instanceof b1.l0
            if (r0 == 0) goto L13
            r0 = r4
            b1.l0 r0 = (b1.l0) r0
            int r1 = r0.f22342b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22342b = r1
            goto L18
        L13:
            b1.l0 r0 = new b1.l0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f22341a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f22342b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            kotlin.jvm.internal.q.m(r4)
            goto L47
        L2f:
            kotlin.jvm.internal.q.m(r4)
            r0.f22342b = r3
            b1.l r4 = new b1.l
            h0.g r0 = b1.f0.r(r0)
            r4.<init>(r3, r0)
            r4.p()
            java.lang.Object r4 = r4.o()
            if (r4 != r1) goto L47
            return
        L47:
            d0.e r4 = new d0.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.i(h0.g):void");
    }

    public static final Class i0(x0.c cVar) {
        s(cVar, "<this>");
        Class a2 = ((i) cVar).a();
        q(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(d1.q r4, q0.a r5, h0.g r6) {
        /*
            boolean r0 = r6 instanceof d1.o
            if (r0 == 0) goto L13
            r0 = r6
            d1.o r0 = (d1.o) r0
            int r1 = r0.f30189c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30189c = r1
            goto L18
        L13:
            d1.o r0 = new d1.o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f30188b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30189c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            q0.a r5 = r0.f30187a
            kotlin.jvm.internal.q.m(r6)     // Catch: java.lang.Throwable -> L29
            goto L67
        L29:
            r4 = move-exception
            goto L6d
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.jvm.internal.q.m(r6)
            h0.l r6 = r0.getContext()
            b1.a0 r2 = b1.a0.f22285b
            h0.j r6 = r6.i(r2)
            if (r6 != r4) goto L71
            r0.getClass()     // Catch: java.lang.Throwable -> L29
            r0.f30187a = r5     // Catch: java.lang.Throwable -> L29
            r0.f30189c = r3     // Catch: java.lang.Throwable -> L29
            b1.l r6 = new b1.l     // Catch: java.lang.Throwable -> L29
            h0.g r0 = b1.f0.r(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.p()     // Catch: java.lang.Throwable -> L29
            i.i r0 = new i.i     // Catch: java.lang.Throwable -> L29
            r2 = 6
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            d1.p r4 = (d1.p) r4     // Catch: java.lang.Throwable -> L29
            r4.c(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.o()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L67
            return r1
        L67:
            r5.invoke()
            d0.b0 r4 = d0.b0.f30125a
            return r4
        L6d:
            r5.invoke()
            throw r4
        L71:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.j(d1.q, q0.a, h0.g):java.lang.Object");
    }

    public static final Class j0(x0.c cVar) {
        s(cVar, "<this>");
        Class a2 = ((i) cVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a2 : Double.class;
            case 104431:
                return !name.equals(ImpressionLog.w) ? a2 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a2 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a2 : Character.class;
            case 3327612:
                return !name.equals("long") ? a2 : Long.class;
            case 3625364:
                return !name.equals("void") ? a2 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a2 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a2 : Float.class;
            case 109413500:
                return !name.equals("short") ? a2 : Short.class;
            default:
                return a2;
        }
    }

    public static h k(f1.g gVar, int i2) {
        int i3;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i2).toString());
        }
        if (i2 == -1) {
            i3 = 2;
            i2 = 0;
        } else {
            i3 = 1;
        }
        l lVar = gVar.f30468a;
        s(lVar, "context");
        int i4 = gVar.f30470c;
        int i5 = gVar.f30469b;
        if (i3 == 1) {
            if (i5 != -3) {
                if (i2 != -3) {
                    if (i5 != -2) {
                        if (i2 != -2) {
                            i2 += i5;
                            if (i2 < 0) {
                                i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                            }
                        }
                    }
                }
                i2 = i5;
            }
            i3 = i4;
        }
        return (g(lVar, lVar) && i2 == i5 && i3 == i4) ? gVar : gVar.d(lVar, i2, i3);
    }

    public static final e1.c l(p pVar) {
        return new e1.c(pVar, m.f30726a, -2, 1);
    }

    public static int l0(int i2) {
        if (i2 < 0) {
            return -1;
        }
        return i2 > 0 ? 1 : 0;
    }

    public static final void m(d0 d0Var, CancellationException cancellationException) {
        h1 h1Var = (h1) d0Var.getCoroutineContext().i(b1.a0.f22285b);
        if (h1Var != null) {
            h1Var.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + d0Var).toString());
        }
    }

    public static /* synthetic */ q0 m0(h1 h1Var, boolean z2, l1 l1Var, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return h1Var.y(z2, (i2 & 2) != 0, l1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable n(h0.g r4, e1.h r5, e1.i r6) {
        /*
            boolean r0 = r4 instanceof e1.s
            if (r0 == 0) goto L13
            r0 = r4
            e1.s r0 = (e1.s) r0
            int r1 = r0.f30333c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30333c = r1
            goto L18
        L13:
            e1.s r0 = new e1.s
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f30332b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30333c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.jvm.internal.f0 r5 = r0.f30331a
            kotlin.jvm.internal.q.m(r4)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r4 = move-exception
            r1 = r4
            goto L51
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.jvm.internal.q.m(r4)
            kotlin.jvm.internal.f0 r4 = new kotlin.jvm.internal.f0
            r4.<init>()
            e1.u r2 = new e1.u     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L4e
            r0.f30331a = r4     // Catch: java.lang.Throwable -> L4e
            r0.f30333c = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r5.collect(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r4 != r1) goto L4c
            goto L82
        L4c:
            r1 = 0
            goto L82
        L4e:
            r5 = move-exception
            r1 = r5
            r5 = r4
        L51:
            java.lang.Object r4 = r5.f30930a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5d
            boolean r5 = g(r4, r1)
            if (r5 != 0) goto L7f
        L5d:
            h0.l r5 = r0.getContext()
            b1.a0 r6 = b1.a0.f22285b
            h0.j r5 = r5.i(r6)
            b1.h1 r5 = (b1.h1) r5
            if (r5 == 0) goto L80
            boolean r6 = r5.isCancelled()
            if (r6 != 0) goto L72
            goto L80
        L72:
            java.util.concurrent.CancellationException r5 = r5.n()
            if (r5 == 0) goto L80
            boolean r5 = g(r5, r1)
            if (r5 != 0) goto L7f
            goto L80
        L7f:
            throw r1
        L80:
            if (r4 != 0) goto L83
        L82:
            return r1
        L83:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L8b
            kotlin.jvm.internal.q.a(r4, r1)
            throw r4
        L8b:
            kotlin.jvm.internal.q.a(r1, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.n(h0.g, e1.h, e1.i):java.io.Serializable");
    }

    public static final boolean n0(d0 d0Var) {
        h1 h1Var = (h1) d0Var.getCoroutineContext().i(b1.a0.f22285b);
        if (h1Var != null) {
            return h1Var.isActive();
        }
        return true;
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        v0(a.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static boolean o0(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static void p(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        v0(a.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p0(java.util.ArrayList r4, h0.g r5) {
        /*
            boolean r0 = r5 instanceof b1.f
            if (r0 == 0) goto L13
            r0 = r5
            b1.f r0 = (b1.f) r0
            int r1 = r0.f22305c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22305c = r1
            goto L18
        L13:
            b1.f r0 = new b1.f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f22304b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f22305c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.f22303a
            kotlin.jvm.internal.q.m(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.jvm.internal.q.m(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            b1.h1 r5 = (b1.h1) r5
            r0.f22303a = r4
            r0.f22305c = r3
            java.lang.Object r5 = r5.v(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            d0.b0 r4 = d0.b0.f30125a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.p0(java.util.ArrayList, h0.g):java.lang.Object");
    }

    public static void q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        v0(a.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static final l q0(d0 d0Var, l lVar) {
        l g02 = g0(d0Var.getCoroutineContext(), lVar, true);
        h1.d dVar = o0.f22355a;
        return (g02 == dVar || g02.i(h0.h.f30725a) != null) ? g02 : g02.u(dVar);
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        v0(a.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static e r0(w0.g gVar) {
        return new e(gVar.f31407b, gVar.f31406a, -gVar.f31408c);
    }

    public static void s(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(K(str));
        v0(a.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static int s0(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static void t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(K(str));
        v0(a.class.getName(), illegalArgumentException);
        throw illegalArgumentException;
    }

    public static int t0(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.g, w0.e] */
    public static void u(int i2) {
        if (new e(2, 36, 1).c(i2)) {
            return;
        }
        StringBuilder t2 = android.support.v4.media.d.t("radix ", i2, " was not in valid range ");
        t2.append(new e(2, 36, 1));
        throw new IllegalArgumentException(t2.toString());
    }

    public static long u0(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    public static float v(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static void v0(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static long w(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    public static final Object w0(h2 h2Var, p pVar) {
        Object uVar;
        Object a02;
        h2Var.g0(new r0(h0(h2Var.d.getContext()).E(h2Var.f22327f, h2Var, h2Var.f22283c), 0));
        try {
            kotlin.jvm.internal.e.g(2, pVar);
            uVar = pVar.invoke(h2Var, h2Var);
        } catch (Throwable th) {
            uVar = new b1.u(false, th);
        }
        i0.a aVar = i0.a.f30806a;
        if (uVar == aVar || (a02 = h2Var.a0(uVar)) == f0.e) {
            return aVar;
        }
        if (a02 instanceof b1.u) {
            Throwable th2 = ((b1.u) a02).f22378a;
            if (!(th2 instanceof g2)) {
                throw th2;
            }
            if (((g2) th2).f22324a != h2Var) {
                throw th2;
            }
            if (uVar instanceof b1.u) {
                throw ((b1.u) uVar).f22378a;
            }
        } else {
            uVar = f0.I(a02);
        }
        return uVar;
    }

    public static float x(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final e1.o0 x0(e1.j jVar, g1.f fVar, f1 f1Var, Float f2) {
        w0 w0Var;
        f1.g gVar;
        h e;
        d1.f.p8.getClass();
        d1.e eVar = d1.e.f30176a;
        if (!(jVar instanceof f1.g) || (e = (gVar = (f1.g) jVar).e()) == null) {
            w0Var = new w0(m.f30726a, jVar);
        } else {
            if (gVar.f30469b != -3) {
            }
            w0Var = new w0(gVar.f30468a, e);
        }
        i1 c2 = t0.c(f2);
        h hVar = w0Var.f30361a;
        int i2 = g(f1Var, x0.f30365a) ? 1 : 4;
        j0 j0Var = new j0(f1Var, hVar, c2, f2, null);
        l q02 = q0(fVar, w0Var.f30362b);
        b1.a t1Var = i2 == 2 ? new t1(q02, j0Var) : new b1.a(q02, true);
        t1Var.o0(i2, t1Var, j0Var);
        return new e1.o0(c2);
    }

    public static double y(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static e y0(w0.g gVar, int i2) {
        s(gVar, "<this>");
        boolean z2 = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        s(valueOf, "step");
        if (z2) {
            if (gVar.f31408c <= 0) {
                i2 = -i2;
            }
            return new e(gVar.f31406a, gVar.f31407b, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static float z(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static String z0(Object obj, String str) {
        return str + obj;
    }

    public void O(boolean z2) {
        c0(Boolean.valueOf(z2));
    }

    public void P(byte b2) {
        c0(Byte.valueOf(b2));
    }

    public void Q(char c2) {
        c0(Character.valueOf(c2));
    }

    public void R(double d) {
        c0(Double.valueOf(d));
    }

    public abstract void S(l1.f fVar, int i2);

    public void T(l1.f fVar, int i2) {
        s(fVar, "enumDescriptor");
        c0(Integer.valueOf(i2));
    }

    public void U(float f2) {
        c0(Float.valueOf(f2));
    }

    public void V(int i2) {
        c0(Integer.valueOf(i2));
    }

    public void W(long j2) {
        c0(Long.valueOf(j2));
    }

    public abstract void X();

    public void Y(l1.f fVar, int i2, k1.a aVar, Object obj) {
        s(fVar, "descriptor");
        s(aVar, "serializer");
        S(fVar, i2);
        Z(aVar, obj);
    }

    public void Z(k1.a aVar, Object obj) {
        s(aVar, "serializer");
        aVar.a(this, obj);
    }

    public void a0(short s2) {
        c0(Short.valueOf(s2));
    }

    public void b0(String str) {
        s(str, "value");
        c0(str);
    }

    public abstract void c0(Object obj);

    public abstract o1.a k0();
}
