package ke;

import ge.c;
import ge.f;
import ge.g;
import ge.i;
import ge.n;
import java.util.HashMap;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes4.dex */
public final class a {
    public static a a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f20678b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f20679c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f20680d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f20681e;

    static {
        HashMap hashMap = new HashMap();
        f20678b = hashMap;
        HashMap hashMap2 = new HashMap();
        f20679c = hashMap2;
        HashMap hashMap3 = new HashMap();
        f20680d = hashMap3;
        HashMap hashMap4 = new HashMap();
        f20681e = hashMap4;
        hashMap.put(g.OFF, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        hashMap.put(g.ON, DebugKt.DEBUG_PROPERTY_VALUE_ON);
        hashMap.put(g.AUTO, DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        hashMap.put(g.TORCH, "torch");
        hashMap3.put(f.BACK, 0);
        hashMap3.put(f.FRONT, 1);
        hashMap2.put(n.AUTO, DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        hashMap2.put(n.INCANDESCENT, "incandescent");
        hashMap2.put(n.FLUORESCENT, "fluorescent");
        hashMap2.put(n.DAYLIGHT, "daylight");
        hashMap2.put(n.CLOUDY, "cloudy-daylight");
        hashMap4.put(i.OFF, DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        hashMap4.put(i.ON, "hdr");
    }

    public static c a(HashMap hashMap, Object obj) {
        for (c cVar : hashMap.keySet()) {
            if (obj.equals(hashMap.get(cVar))) {
                return cVar;
            }
        }
        return null;
    }
}
