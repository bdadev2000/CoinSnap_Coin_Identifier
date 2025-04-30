package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f18231a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f18232c;

    /* renamed from: d, reason: collision with root package name */
    public final List<h> f18233d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18234e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18235f;

    public r(int i9, byte[] bArr, boolean z8, long j7, List<h> list) {
        this(i9, bArr, a(list), list, z8, j7);
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

    private r(int i9, byte[] bArr, Map<String, String> map, List<h> list, boolean z8, long j7) {
        this.f18231a = i9;
        this.b = bArr;
        this.f18232c = map;
        if (list == null) {
            this.f18233d = null;
        } else {
            this.f18233d = Collections.unmodifiableList(list);
        }
        this.f18234e = z8;
        this.f18235f = j7;
    }
}
