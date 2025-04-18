package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class aj extends wl {

    /* renamed from: b, reason: collision with root package name */
    private long f3757b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f3758c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f3759d;

    public aj() {
        super(new g7());
        this.f3757b = C.TIME_UNSET;
        this.f3758c = new long[0];
        this.f3759d = new long[0];
    }

    private static Double d(yg ygVar) {
        return Double.valueOf(Double.longBitsToDouble(ygVar.s()));
    }

    private static HashMap e(yg ygVar) {
        int A = ygVar.A();
        HashMap hashMap = new HashMap(A);
        for (int i10 = 0; i10 < A; i10++) {
            String h10 = h(ygVar);
            Object a = a(ygVar, i(ygVar));
            if (a != null) {
                hashMap.put(h10, a);
            }
        }
        return hashMap;
    }

    private static HashMap f(yg ygVar) {
        HashMap hashMap = new HashMap();
        while (true) {
            String h10 = h(ygVar);
            int i10 = i(ygVar);
            if (i10 == 9) {
                return hashMap;
            }
            Object a = a(ygVar, i10);
            if (a != null) {
                hashMap.put(h10, a);
            }
        }
    }

    private static ArrayList g(yg ygVar) {
        int A = ygVar.A();
        ArrayList arrayList = new ArrayList(A);
        for (int i10 = 0; i10 < A; i10++) {
            Object a = a(ygVar, i(ygVar));
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    private static String h(yg ygVar) {
        int C = ygVar.C();
        int d10 = ygVar.d();
        ygVar.g(C);
        return new String(ygVar.c(), d10, C);
    }

    private static int i(yg ygVar) {
        return ygVar.w();
    }

    @Override // com.applovin.impl.wl
    public boolean a(yg ygVar) {
        return true;
    }

    public long[] b() {
        return this.f3759d;
    }

    public long[] c() {
        return this.f3758c;
    }

    private static Date c(yg ygVar) {
        Date date = new Date((long) d(ygVar).doubleValue());
        ygVar.g(2);
        return date;
    }

    public long a() {
        return this.f3757b;
    }

    @Override // com.applovin.impl.wl
    public boolean b(yg ygVar, long j3) {
        if (i(ygVar) != 2 || !"onMetaData".equals(h(ygVar)) || i(ygVar) != 8) {
            return false;
        }
        HashMap e2 = e(ygVar);
        Object obj = e2.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f3757b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = e2.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f3758c = new long[size];
                this.f3759d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f3758c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f3759d[i10] = ((Double) obj5).longValue();
                    } else {
                        this.f3758c = new long[0];
                        this.f3759d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    private static Object a(yg ygVar, int i10) {
        if (i10 == 8) {
            return e(ygVar);
        }
        if (i10 == 10) {
            return g(ygVar);
        }
        if (i10 == 11) {
            return c(ygVar);
        }
        if (i10 == 0) {
            return d(ygVar);
        }
        if (i10 == 1) {
            return b(ygVar);
        }
        if (i10 == 2) {
            return h(ygVar);
        }
        if (i10 != 3) {
            return null;
        }
        return f(ygVar);
    }

    private static Boolean b(yg ygVar) {
        return Boolean.valueOf(ygVar.w() == 1);
    }
}
