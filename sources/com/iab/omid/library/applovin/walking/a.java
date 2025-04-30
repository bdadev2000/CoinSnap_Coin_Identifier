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

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f14469a = new HashMap<>();
    private final HashMap<View, C0144a> b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f14470c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f14471d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f14472e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f14473f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f14474g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f14475h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f14476i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0144a {

        /* renamed from: a, reason: collision with root package name */
        private final e f14477a;
        private final ArrayList<String> b = new ArrayList<>();

        public C0144a(e eVar, String str) {
            this.f14477a = eVar;
            a(str);
        }

        public e a() {
            return this.f14477a;
        }

        public ArrayList<String> b() {
            return this.b;
        }

        public void a(String str) {
            this.b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f14475h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f14475h.containsKey(view)) {
            return this.f14475h.get(view);
        }
        Map<View, Boolean> map = this.f14475h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f14470c.get(str);
    }

    public C0144a c(View view) {
        C0144a c0144a = this.b.get(view);
        if (c0144a != null) {
            this.b.remove(view);
        }
        return c0144a;
    }

    public String d(View view) {
        if (this.f14469a.size() == 0) {
            return null;
        }
        String str = this.f14469a.get(view);
        if (str != null) {
            this.f14469a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f14471d.contains(view) ? c.PARENT_VIEW : this.f14476i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f14475h.containsKey(view)) {
            return true;
        }
        this.f14475h.put(view, Boolean.TRUE);
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
            String a6 = h.a(view);
            if (a6 != null) {
                return a6;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f14471d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f14474g.get(str);
    }

    public HashSet<String> c() {
        return this.f14472e;
    }

    public void d() {
        this.f14476i = true;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c c9 = com.iab.omid.library.applovin.internal.c.c();
        if (c9 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c9.a()) {
                View c10 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c10 != null) {
                        String a6 = a(c10);
                        if (a6 == null) {
                            this.f14472e.add(adSessionId);
                            this.f14469a.put(c10, adSessionId);
                            a(aVar);
                        } else if (a6 != "noWindowFocus") {
                            this.f14473f.add(adSessionId);
                            this.f14470c.put(adSessionId, c10);
                            this.f14474g.put(adSessionId, a6);
                        }
                    } else {
                        this.f14473f.add(adSessionId);
                        this.f14474g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f14469a.clear();
        this.b.clear();
        this.f14470c.clear();
        this.f14471d.clear();
        this.f14472e.clear();
        this.f14473f.clear();
        this.f14474g.clear();
        this.f14476i = false;
    }

    public HashSet<String> b() {
        return this.f14473f;
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
        C0144a c0144a = this.b.get(view);
        if (c0144a != null) {
            c0144a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new C0144a(eVar, aVar.getAdSessionId()));
        }
    }
}
