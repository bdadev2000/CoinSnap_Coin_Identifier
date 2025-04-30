package com.mbridge.msdk.foundation.same.net.d;

import com.mbridge.msdk.tracker.network.h;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15779a;
    public final List<h> b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f15780c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15781d;

    public a(int i9, byte[] bArr, List<h> list) {
        this(i9, bArr, a(list), list);
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

    private a(int i9, byte[] bArr, Map<String, String> map, List<h> list) {
        this.f15781d = i9;
        this.f15779a = bArr;
        this.f15780c = map;
        if (list == null) {
            this.b = null;
        } else {
            this.b = Collections.unmodifiableList(list);
        }
    }
}
