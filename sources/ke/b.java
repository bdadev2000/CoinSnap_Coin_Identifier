package ke;

import ge.c;
import ge.f;
import ge.i;
import ge.n;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class b {
    public static b a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f20682b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f20683c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f20684d;

    static {
        HashMap hashMap = new HashMap();
        f20682b = hashMap;
        HashMap hashMap2 = new HashMap();
        f20683c = hashMap2;
        HashMap hashMap3 = new HashMap();
        f20684d = hashMap3;
        hashMap.put(f.BACK, 1);
        hashMap.put(f.FRONT, 0);
        hashMap2.put(n.AUTO, 1);
        hashMap2.put(n.CLOUDY, 6);
        hashMap2.put(n.DAYLIGHT, 5);
        hashMap2.put(n.FLUORESCENT, 3);
        hashMap2.put(n.INCANDESCENT, 2);
        hashMap3.put(i.OFF, 0);
        hashMap3.put(i.ON, 18);
    }

    public static c a(HashMap hashMap, Integer num) {
        for (c cVar : hashMap.keySet()) {
            if (num.equals(hashMap.get(cVar))) {
                return cVar;
            }
        }
        return null;
    }
}
