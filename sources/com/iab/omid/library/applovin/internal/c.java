package com.iab.omid.library.applovin.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f12158c = new c();
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f12159b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f12158c;
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f12159b);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return Collections.unmodifiableCollection(this.a);
    }

    public boolean d() {
        return this.f12159b.size() > 0;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.a.add(aVar);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d10 = d();
        this.a.remove(aVar);
        this.f12159b.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d10 = d();
        this.f12159b.add(aVar);
        if (d10) {
            return;
        }
        i.c().d();
    }
}
