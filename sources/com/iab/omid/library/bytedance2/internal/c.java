package com.iab.omid.library.bytedance2.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f12253c = new c();
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f12254b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f12253c;
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f12254b);
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> b() {
        return Collections.unmodifiableCollection(this.a);
    }

    public boolean d() {
        return this.f12254b.size() > 0;
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        this.a.add(aVar);
    }

    public void b(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean d10 = d();
        this.a.remove(aVar);
        this.f12254b.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        h.c().e();
    }

    public void c(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean d10 = d();
        this.f12254b.add(aVar);
        if (d10) {
            return;
        }
        h.c().d();
    }
}
