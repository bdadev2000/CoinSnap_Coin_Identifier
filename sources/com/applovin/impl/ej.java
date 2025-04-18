package com.applovin.impl;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ej extends xl {

    /* renamed from: b, reason: collision with root package name */
    private long f23728b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f23729c;
    private long[] d;

    public ej() {
        super(new i7());
        this.f23728b = -9223372036854775807L;
        this.f23729c = new long[0];
        this.d = new long[0];
    }

    private static Double d(bh bhVar) {
        return Double.valueOf(Double.longBitsToDouble(bhVar.s()));
    }

    private static HashMap e(bh bhVar) {
        int A = bhVar.A();
        HashMap hashMap = new HashMap(A);
        for (int i2 = 0; i2 < A; i2++) {
            String h2 = h(bhVar);
            Object a2 = a(bhVar, i(bhVar));
            if (a2 != null) {
                hashMap.put(h2, a2);
            }
        }
        return hashMap;
    }

    private static HashMap f(bh bhVar) {
        HashMap hashMap = new HashMap();
        while (true) {
            String h2 = h(bhVar);
            int i2 = i(bhVar);
            if (i2 == 9) {
                return hashMap;
            }
            Object a2 = a(bhVar, i2);
            if (a2 != null) {
                hashMap.put(h2, a2);
            }
        }
    }

    private static ArrayList g(bh bhVar) {
        int A = bhVar.A();
        ArrayList arrayList = new ArrayList(A);
        for (int i2 = 0; i2 < A; i2++) {
            Object a2 = a(bhVar, i(bhVar));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private static String h(bh bhVar) {
        int C = bhVar.C();
        int d = bhVar.d();
        bhVar.g(C);
        return new String(bhVar.c(), d, C);
    }

    private static int i(bh bhVar) {
        return bhVar.w();
    }

    public long a() {
        return this.f23728b;
    }

    public long[] b() {
        return this.d;
    }

    public long[] c() {
        return this.f23729c;
    }

    private static Date c(bh bhVar) {
        Date date = new Date((long) d(bhVar).doubleValue());
        bhVar.g(2);
        return date;
    }

    @Override // com.applovin.impl.xl
    public boolean a(bh bhVar) {
        return true;
    }

    @Override // com.applovin.impl.xl
    public boolean b(bh bhVar, long j2) {
        if (i(bhVar) != 2 || !"onMetaData".equals(h(bhVar)) || i(bhVar) != 8) {
            return false;
        }
        HashMap e = e(bhVar);
        Object obj = e.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f23728b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = e.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f23729c = new long[size];
                this.d = new long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f23729c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                    this.f23729c[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.d[i2] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    private static Object a(bh bhVar, int i2) {
        if (i2 == 8) {
            return e(bhVar);
        }
        if (i2 == 10) {
            return g(bhVar);
        }
        if (i2 == 11) {
            return c(bhVar);
        }
        if (i2 == 0) {
            return d(bhVar);
        }
        if (i2 == 1) {
            return b(bhVar);
        }
        if (i2 == 2) {
            return h(bhVar);
        }
        if (i2 != 3) {
            return null;
        }
        return f(bhVar);
    }

    private static Boolean b(bh bhVar) {
        return Boolean.valueOf(bhVar.w() == 1);
    }
}
