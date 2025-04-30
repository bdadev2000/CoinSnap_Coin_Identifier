package com.iab.omid.library.applovin.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f14418c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f14419a = new ArrayList<>();
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f14418c;
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> a() {
        return Collections.unmodifiableCollection(this.b);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f14419a);
    }

    public boolean d() {
        return this.b.size() > 0;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f14419a.add(aVar);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d2 = d();
        this.f14419a.remove(aVar);
        this.b.remove(aVar);
        if (!d2 || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d2 = d();
        this.b.add(aVar);
        if (d2) {
            return;
        }
        i.c().d();
    }
}
