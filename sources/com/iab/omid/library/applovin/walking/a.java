package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class a {
    private final HashMap<View, String> a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0156a> f12203b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f12204c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f12205d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f12206e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f12207f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f12208g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f12209h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f12210i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0156a {
        private final e a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f12211b = new ArrayList<>();

        public C0156a(e eVar, String str) {
            this.a = eVar;
            a(str);
        }

        public e a() {
            return this.a;
        }

        public ArrayList<String> b() {
            return this.f12211b;
        }

        public void a(String str) {
            this.f12211b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f12209h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f12209h.containsKey(view)) {
            return this.f12209h.get(view);
        }
        Map<View, Boolean> map = this.f12209h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f12204c.get(str);
    }

    public C0156a c(View view) {
        C0156a c0156a = this.f12203b.get(view);
        if (c0156a != null) {
            this.f12203b.remove(view);
        }
        return c0156a;
    }

    public String d(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f12205d.contains(view) ? c.PARENT_VIEW : this.f12210i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f12209h.containsKey(view)) {
            return true;
        }
        this.f12209h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a = h.a(view);
            if (a != null) {
                return a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f12205d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f12208g.get(str);
    }

    public HashSet<String> c() {
        return this.f12206e;
    }

    public void d() {
        this.f12210i = true;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c c10 = com.iab.omid.library.applovin.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c10.a()) {
                View c11 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c11 != null) {
                        String a = a(c11);
                        if (a == null) {
                            this.f12206e.add(adSessionId);
                            this.a.put(c11, adSessionId);
                            a(aVar);
                        } else if (a != "noWindowFocus") {
                            this.f12207f.add(adSessionId);
                            this.f12204c.put(adSessionId, c11);
                            this.f12208g.put(adSessionId, a);
                        }
                    } else {
                        this.f12207f.add(adSessionId);
                        this.f12208g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.a.clear();
        this.f12203b.clear();
        this.f12204c.clear();
        this.f12205d.clear();
        this.f12206e.clear();
        this.f12207f.clear();
        this.f12208g.clear();
        this.f12210i = false;
    }

    public HashSet<String> b() {
        return this.f12207f;
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0156a c0156a = this.f12203b.get(view);
        if (c0156a != null) {
            c0156a.a(aVar.getAdSessionId());
        } else {
            this.f12203b.put(view, new C0156a(eVar, aVar.getAdSessionId()));
        }
    }
}
