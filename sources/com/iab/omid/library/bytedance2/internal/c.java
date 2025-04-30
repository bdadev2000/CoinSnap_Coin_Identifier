package com.iab.omid.library.bytedance2.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f14520c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f14521a = new ArrayList<>();
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f14520c;
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> a() {
        return Collections.unmodifiableCollection(this.b);
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f14521a);
    }

    public boolean d() {
        return this.b.size() > 0;
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        this.f14521a.add(aVar);
    }

    public void b(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean d2 = d();
        this.f14521a.remove(aVar);
        this.b.remove(aVar);
        if (!d2 || d()) {
            return;
        }
        h.c().e();
    }

    public void c(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean d2 = d();
        this.b.add(aVar);
        if (d2) {
            return;
        }
        h.c().d();
    }
}
