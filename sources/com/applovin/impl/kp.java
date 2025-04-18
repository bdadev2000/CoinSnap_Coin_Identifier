package com.applovin.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class kp implements nl {

    /* renamed from: a, reason: collision with root package name */
    private final gp f24933a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f24934b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f24935c;
    private final Map d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f24936f;

    public kp(gp gpVar, Map map, Map map2, Map map3) {
        this.f24933a = gpVar;
        this.d = map2;
        this.f24936f = map3;
        this.f24935c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f24934b = gpVar.b();
    }

    @Override // com.applovin.impl.nl
    public long a(int i2) {
        return this.f24934b[i2];
    }

    @Override // com.applovin.impl.nl
    public List b(long j2) {
        return this.f24933a.a(j2, this.f24935c, this.d, this.f24936f);
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.f24934b.length;
    }

    @Override // com.applovin.impl.nl
    public int a(long j2) {
        int a2 = xp.a(this.f24934b, j2, false, false);
        if (a2 < this.f24934b.length) {
            return a2;
        }
        return -1;
    }
}
