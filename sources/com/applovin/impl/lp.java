package com.applovin.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class lp implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final hp f8864a;
    private final long[] b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f8865c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f8866d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f8867f;

    public lp(hp hpVar, Map map, Map map2, Map map3) {
        Map emptyMap;
        this.f8864a = hpVar;
        this.f8866d = map2;
        this.f8867f = map3;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.f8865c = emptyMap;
        this.b = hpVar.b();
    }

    @Override // com.applovin.impl.kl
    public long a(int i9) {
        return this.b[i9];
    }

    @Override // com.applovin.impl.kl
    public List b(long j7) {
        return this.f8864a.a(j7, this.f8865c, this.f8866d, this.f8867f);
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.b.length;
    }

    @Override // com.applovin.impl.kl
    public int a(long j7) {
        int a6 = yp.a(this.b, j7, false, false);
        if (a6 < this.b.length) {
            return a6;
        }
        return -1;
    }
}
