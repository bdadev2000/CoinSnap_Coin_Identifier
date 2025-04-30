package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4591c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f4592a = new c0(16);
    public boolean b;

    static {
        new C0441p(0);
    }

    public C0441p() {
    }

    public static void b(C0435j c0435j, z0 z0Var, int i9, Object obj) {
        if (z0Var == z0.f4612f) {
            c0435j.i0(i9, 3);
            ((AbstractC0425a) obj).c(c0435j);
            c0435j.i0(i9, 4);
            return;
        }
        c0435j.i0(i9, z0Var.f4615c);
        switch (z0Var.ordinal()) {
            case 0:
                c0435j.b0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c0435j.Z(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                c0435j.m0(((Long) obj).longValue());
                return;
            case 3:
                c0435j.m0(((Long) obj).longValue());
                return;
            case 4:
                c0435j.d0(((Integer) obj).intValue());
                return;
            case 5:
                c0435j.b0(((Long) obj).longValue());
                return;
            case 6:
                c0435j.Z(((Integer) obj).intValue());
                return;
            case 7:
                c0435j.S(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof C0432g) {
                    c0435j.X((C0432g) obj);
                    return;
                } else {
                    c0435j.h0((String) obj);
                    return;
                }
            case 9:
                ((AbstractC0425a) obj).c(c0435j);
                return;
            case 10:
                c0435j.f0((AbstractC0425a) obj);
                return;
            case 11:
                if (obj instanceof C0432g) {
                    c0435j.X((C0432g) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    c0435j.V(bArr.length, bArr);
                    return;
                }
            case 12:
                c0435j.k0(((Integer) obj).intValue());
                return;
            case 13:
                c0435j.d0(((Integer) obj).intValue());
                return;
            case 14:
                c0435j.Z(((Integer) obj).intValue());
                return;
            case 15:
                c0435j.b0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0435j.k0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0435j.m0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.b) {
            return;
        }
        c0 c0Var = this.f4592a;
        if (!c0Var.f4552f) {
            if (c0Var.f4550c.size() <= 0) {
                Iterator it = c0Var.d().iterator();
                if (it.hasNext()) {
                    com.mbridge.msdk.foundation.entity.o.v(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            } else {
                com.mbridge.msdk.foundation.entity.o.v(c0Var.c(0).getKey());
                throw null;
            }
        }
        if (!c0Var.f4552f) {
            if (c0Var.f4551d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(c0Var.f4551d);
            }
            c0Var.f4551d = unmodifiableMap;
            if (c0Var.f4554h.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(c0Var.f4554h);
            }
            c0Var.f4554h = unmodifiableMap2;
            c0Var.f4552f = true;
        }
        this.b = true;
    }

    public final Object clone() {
        C0441p c0441p = new C0441p();
        c0 c0Var = this.f4592a;
        if (c0Var.f4550c.size() <= 0) {
            Iterator it = c0Var.d().iterator();
            if (!it.hasNext()) {
                return c0441p;
            }
            Map.Entry entry = (Map.Entry) it.next();
            com.mbridge.msdk.foundation.entity.o.v(entry.getKey());
            entry.getValue();
            throw null;
        }
        Map.Entry c9 = c0Var.c(0);
        com.mbridge.msdk.foundation.entity.o.v(c9.getKey());
        c9.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0441p)) {
            return false;
        }
        return this.f4592a.equals(((C0441p) obj).f4592a);
    }

    public final int hashCode() {
        return this.f4592a.hashCode();
    }

    public C0441p(int i9) {
        a();
        a();
    }
}
