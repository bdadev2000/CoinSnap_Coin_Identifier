package com.mbridge.msdk.foundation.same.net.d;

import com.mbridge.msdk.tracker.network.h;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class a {
    public final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public final List<h> f13368b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f13369c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13370d;

    public a(int i10, byte[] bArr, List<h> list) {
        this(i10, bArr, a(list), list);
    }

    private static Map<String, String> a(List<h> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (h hVar : list) {
            treeMap.put(hVar.a(), hVar.b());
        }
        return treeMap;
    }

    private a(int i10, byte[] bArr, Map<String, String> map, List<h> list) {
        this.f13370d = i10;
        this.a = bArr;
        this.f13369c = map;
        if (list == null) {
            this.f13368b = null;
        } else {
            this.f13368b = Collections.unmodifiableList(list);
        }
    }
}
