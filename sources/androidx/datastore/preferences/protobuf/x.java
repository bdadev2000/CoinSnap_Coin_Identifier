package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1478c = 0;
    public final m1 a = new m1(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f1479b;

    static {
        new x(0);
    }

    public x() {
    }

    public static void b(r rVar, j2 j2Var, int i10, Object obj) {
        if (j2Var == j2.f1384f) {
            rVar.z0(i10, 3);
            ((b) obj).b(rVar);
            rVar.z0(i10, 4);
            return;
        }
        rVar.z0(i10, j2Var.f1388c);
        switch (j2Var.ordinal()) {
            case 0:
                rVar.s0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                rVar.q0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                rVar.D0(((Long) obj).longValue());
                return;
            case 3:
                rVar.D0(((Long) obj).longValue());
                return;
            case 4:
                rVar.u0(((Integer) obj).intValue());
                return;
            case 5:
                rVar.s0(((Long) obj).longValue());
                return;
            case 6:
                rVar.q0(((Integer) obj).intValue());
                return;
            case 7:
                rVar.k0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof k) {
                    rVar.o0((k) obj);
                    return;
                } else {
                    rVar.y0((String) obj);
                    return;
                }
            case 9:
                ((b) obj).b(rVar);
                return;
            case 10:
                rVar.w0((b) obj);
                return;
            case 11:
                if (obj instanceof k) {
                    rVar.o0((k) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    rVar.m0(bArr, bArr.length);
                    return;
                }
            case 12:
                rVar.B0(((Integer) obj).intValue());
                return;
            case 13:
                rVar.u0(((Integer) obj).intValue());
                return;
            case 14:
                rVar.q0(((Integer) obj).intValue());
                return;
            case 15:
                rVar.s0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                rVar.B0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                rVar.D0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        m1 m1Var;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f1479b) {
            return;
        }
        int i10 = 0;
        while (true) {
            m1Var = this.a;
            if (i10 >= m1Var.i()) {
                break;
            }
            Map.Entry h10 = m1Var.h(i10);
            if (h10.getValue() instanceof e0) {
                e0 e0Var = (e0) h10.getValue();
                e0Var.getClass();
                h1 h1Var = h1.f1372c;
                h1Var.getClass();
                h1Var.a(e0Var.getClass()).makeImmutable(e0Var);
                e0Var.k();
            }
            i10++;
        }
        if (!m1Var.f1438f) {
            if (m1Var.i() <= 0) {
                Iterator it = m1Var.j().iterator();
                if (it.hasNext()) {
                    a4.j.t(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            } else {
                a4.j.t(m1Var.h(0).getKey());
                throw null;
            }
        }
        if (!m1Var.f1438f) {
            if (m1Var.f1437d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(m1Var.f1437d);
            }
            m1Var.f1437d = unmodifiableMap;
            if (m1Var.f1440h.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(m1Var.f1440h);
            }
            m1Var.f1440h = unmodifiableMap2;
            m1Var.f1438f = true;
        }
        this.f1479b = true;
    }

    public final Object clone() {
        x xVar = new x();
        m1 m1Var = this.a;
        if (m1Var.i() <= 0) {
            Iterator it = m1Var.j().iterator();
            if (!it.hasNext()) {
                return xVar;
            }
            Map.Entry entry = (Map.Entry) it.next();
            a4.j.t(entry.getKey());
            entry.getValue();
            throw null;
        }
        Map.Entry h10 = m1Var.h(0);
        a4.j.t(h10.getKey());
        h10.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return this.a.equals(((x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public x(int i10) {
        a();
        a();
    }
}
