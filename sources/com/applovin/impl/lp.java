package com.applovin.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class lp implements kl {
    private final hp a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f5901b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f5902c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f5903d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f5904f;

    public lp(hp hpVar, Map map, Map map2, Map map3) {
        Map emptyMap;
        this.a = hpVar;
        this.f5903d = map2;
        this.f5904f = map3;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.f5902c = emptyMap;
        this.f5901b = hpVar.b();
    }

    @Override // com.applovin.impl.kl
    public long a(int i10) {
        return this.f5901b[i10];
    }

    @Override // com.applovin.impl.kl
    public List b(long j3) {
        return this.a.a(j3, this.f5902c, this.f5903d, this.f5904f);
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.f5901b.length;
    }

    @Override // com.applovin.impl.kl
    public int a(long j3) {
        int a = yp.a(this.f5901b, j3, false, false);
        if (a < this.f5901b.length) {
            return a;
        }
        return -1;
    }
}
