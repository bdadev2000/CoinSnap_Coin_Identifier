package com.mbridge.msdk.mbnative.a;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c {
    public static Map<Integer, b<String, List<Campaign>>> a = new HashMap();

    public static b<String, List<Campaign>> a(int i10) {
        if (a.containsKey(Integer.valueOf(i10))) {
            return a.get(Integer.valueOf(i10));
        }
        a aVar = new a(i10);
        a.put(Integer.valueOf(i10), aVar);
        return aVar;
    }
}
