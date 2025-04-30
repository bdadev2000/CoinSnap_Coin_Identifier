package com.applovin.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class aj extends wl {
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f6752c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f6753d;

    public aj() {
        super(new g7());
        this.b = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6752c = new long[0];
        this.f6753d = new long[0];
    }

    private static Double d(yg ygVar) {
        return Double.valueOf(Double.longBitsToDouble(ygVar.s()));
    }

    private static HashMap e(yg ygVar) {
        int A8 = ygVar.A();
        HashMap hashMap = new HashMap(A8);
        for (int i9 = 0; i9 < A8; i9++) {
            String h6 = h(ygVar);
            Object a6 = a(ygVar, i(ygVar));
            if (a6 != null) {
                hashMap.put(h6, a6);
            }
        }
        return hashMap;
    }

    private static HashMap f(yg ygVar) {
        HashMap hashMap = new HashMap();
        while (true) {
            String h6 = h(ygVar);
            int i9 = i(ygVar);
            if (i9 == 9) {
                return hashMap;
            }
            Object a6 = a(ygVar, i9);
            if (a6 != null) {
                hashMap.put(h6, a6);
            }
        }
    }

    private static ArrayList g(yg ygVar) {
        int A8 = ygVar.A();
        ArrayList arrayList = new ArrayList(A8);
        for (int i9 = 0; i9 < A8; i9++) {
            Object a6 = a(ygVar, i(ygVar));
            if (a6 != null) {
                arrayList.add(a6);
            }
        }
        return arrayList;
    }

    private static String h(yg ygVar) {
        int C8 = ygVar.C();
        int d2 = ygVar.d();
        ygVar.g(C8);
        return new String(ygVar.c(), d2, C8);
    }

    private static int i(yg ygVar) {
        return ygVar.w();
    }

    @Override // com.applovin.impl.wl
    public boolean a(yg ygVar) {
        return true;
    }

    public long[] b() {
        return this.f6753d;
    }

    public long[] c() {
        return this.f6752c;
    }

    private static Date c(yg ygVar) {
        Date date = new Date((long) d(ygVar).doubleValue());
        ygVar.g(2);
        return date;
    }

    public long a() {
        return this.b;
    }

    @Override // com.applovin.impl.wl
    public boolean b(yg ygVar, long j7) {
        if (i(ygVar) != 2 || !"onMetaData".equals(h(ygVar)) || i(ygVar) != 8) {
            return false;
        }
        HashMap e4 = e(ygVar);
        Object obj = e4.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = e4.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f6752c = new long[size];
                this.f6753d = new long[size];
                for (int i9 = 0; i9 < size; i9++) {
                    Object obj5 = list.get(i9);
                    Object obj6 = list2.get(i9);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f6752c[i9] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f6753d[i9] = ((Double) obj5).longValue();
                    } else {
                        this.f6752c = new long[0];
                        this.f6753d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    private static Object a(yg ygVar, int i9) {
        if (i9 == 8) {
            return e(ygVar);
        }
        if (i9 == 10) {
            return g(ygVar);
        }
        if (i9 == 11) {
            return c(ygVar);
        }
        if (i9 == 0) {
            return d(ygVar);
        }
        if (i9 == 1) {
            return b(ygVar);
        }
        if (i9 == 2) {
            return h(ygVar);
        }
        if (i9 != 3) {
            return null;
        }
        return f(ygVar);
    }

    private static Boolean b(yg ygVar) {
        return Boolean.valueOf(ygVar.w() == 1);
    }
}
