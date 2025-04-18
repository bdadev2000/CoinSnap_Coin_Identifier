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

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f29015a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0160a> f29016b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f29017c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();
    private final HashSet<String> e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f29018f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f29019g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f29020h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f29021i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0160a {

        /* renamed from: a, reason: collision with root package name */
        private final e f29022a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f29023b = new ArrayList<>();

        public C0160a(e eVar, String str) {
            this.f29022a = eVar;
            a(str);
        }

        public e a() {
            return this.f29022a;
        }

        public ArrayList<String> b() {
            return this.f29023b;
        }

        public void a(String str) {
            this.f29023b.add(str);
        }
    }

    public View a(String str) {
        return this.f29017c.get(str);
    }

    public HashSet<String> b() {
        return this.f29018f;
    }

    public HashSet<String> c() {
        return this.e;
    }

    public void d() {
        this.f29021i = true;
    }

    public c e(View view) {
        return this.d.contains(view) ? c.PARENT_VIEW : this.f29021i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f29020h.containsKey(view)) {
            return true;
        }
        this.f29020h.put(view, Boolean.TRUE);
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
            String a2 = h.a(view);
            if (a2 != null) {
                return a2;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f29020h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f29020h.containsKey(view)) {
            return this.f29020h.get(view);
        }
        Map<View, Boolean> map = this.f29020h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public C0160a c(View view) {
        C0160a c0160a = this.f29016b.get(view);
        if (c0160a != null) {
            this.f29016b.remove(view);
        }
        return c0160a;
    }

    public String d(View view) {
        if (this.f29015a.size() == 0) {
            return null;
        }
        String str = this.f29015a.get(view);
        if (str != null) {
            this.f29015a.remove(view);
        }
        return str;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c c2 = com.iab.omid.library.applovin.internal.c.c();
        if (c2 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c2.a()) {
                View c3 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c3 != null) {
                        String a2 = a(c3);
                        if (a2 == null) {
                            this.e.add(adSessionId);
                            this.f29015a.put(c3, adSessionId);
                            a(aVar);
                        } else if (a2 != "noWindowFocus") {
                            this.f29018f.add(adSessionId);
                            this.f29017c.put(adSessionId, c3);
                            this.f29019g.put(adSessionId, a2);
                        }
                    } else {
                        this.f29018f.add(adSessionId);
                        this.f29019g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f29015a.clear();
        this.f29016b.clear();
        this.f29017c.clear();
        this.d.clear();
        this.e.clear();
        this.f29018f.clear();
        this.f29019g.clear();
        this.f29021i = false;
    }

    public String b(String str) {
        return this.f29019g.get(str);
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
        C0160a c0160a = this.f29016b.get(view);
        if (c0160a != null) {
            c0160a.a(aVar.getAdSessionId());
        } else {
            this.f29016b.put(view, new C0160a(eVar, aVar.getAdSessionId()));
        }
    }
}
