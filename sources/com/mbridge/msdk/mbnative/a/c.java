package com.mbridge.msdk.mbnative.a;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static Map<Integer, b<String, List<Campaign>>> f16407a = new HashMap();

    public static b<String, List<Campaign>> a(int i9) {
        if (f16407a.containsKey(Integer.valueOf(i9))) {
            return f16407a.get(Integer.valueOf(i9));
        }
        a aVar = new a(i9);
        f16407a.put(Integer.valueOf(i9), aVar);
        return aVar;
    }
}
