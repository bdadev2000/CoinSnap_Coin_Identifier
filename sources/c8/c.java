package c8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l0.h;
import n9.x;
import y7.k;

/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: d, reason: collision with root package name */
    public long f2730d;

    /* renamed from: f, reason: collision with root package name */
    public long[] f2731f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f2732g;

    public c() {
        super(new k(), 7);
        this.f2730d = C.TIME_UNSET;
        this.f2731f = new long[0];
        this.f2732g = new long[0];
    }

    public static Serializable l(int i10, x xVar) {
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(xVar.o())).doubleValue());
                                xVar.H(2);
                                return date;
                            }
                            int y4 = xVar.y();
                            ArrayList arrayList = new ArrayList(y4);
                            for (int i11 = 0; i11 < y4; i11++) {
                                Serializable l10 = l(xVar.v(), xVar);
                                if (l10 != null) {
                                    arrayList.add(l10);
                                }
                            }
                            return arrayList;
                        }
                        return m(xVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String n10 = n(xVar);
                        int v10 = xVar.v();
                        if (v10 == 9) {
                            return hashMap;
                        }
                        Serializable l11 = l(v10, xVar);
                        if (l11 != null) {
                            hashMap.put(n10, l11);
                        }
                    }
                } else {
                    return n(xVar);
                }
            } else {
                if (xVar.v() != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(xVar.o()));
        }
    }

    public static HashMap m(x xVar) {
        int y4 = xVar.y();
        HashMap hashMap = new HashMap(y4);
        for (int i10 = 0; i10 < y4; i10++) {
            String n10 = n(xVar);
            Serializable l10 = l(xVar.v(), xVar);
            if (l10 != null) {
                hashMap.put(n10, l10);
            }
        }
        return hashMap;
    }

    public static String n(x xVar) {
        int A = xVar.A();
        int i10 = xVar.f22599b;
        xVar.H(A);
        return new String(xVar.a, i10, A);
    }

    public final boolean k(long j3, x xVar) {
        if (xVar.v() != 2 || !"onMetaData".equals(n(xVar)) || xVar.f22600c - xVar.f22599b == 0 || xVar.v() != 8) {
            return false;
        }
        HashMap m10 = m(xVar);
        Object obj = m10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f2730d = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f2731f = new long[size];
                this.f2732g = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f2731f[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f2732g[i10] = ((Double) obj5).longValue();
                    } else {
                        this.f2731f = new long[0];
                        this.f2732g = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
