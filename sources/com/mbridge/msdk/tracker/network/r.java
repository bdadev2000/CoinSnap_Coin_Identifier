package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class r {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15471b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f15472c;

    /* renamed from: d, reason: collision with root package name */
    public final List<h> f15473d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15474e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15475f;

    public r(int i10, byte[] bArr, boolean z10, long j3, List<h> list) {
        this(i10, bArr, a(list), list, z10, j3);
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

    private r(int i10, byte[] bArr, Map<String, String> map, List<h> list, boolean z10, long j3) {
        this.a = i10;
        this.f15471b = bArr;
        this.f15472c = map;
        if (list == null) {
            this.f15473d = null;
        } else {
            this.f15473d = Collections.unmodifiableList(list);
        }
        this.f15474e = z10;
        this.f15475f = j3;
    }
}
