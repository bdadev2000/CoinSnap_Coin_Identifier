package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
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
    private final HashMap<View, C0159a> f12296b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f12297c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f12298d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f12299e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f12300f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f12301g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f12302h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f12303i;

    /* renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0159a {
        private final e a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f12304b = new ArrayList<>();

        public C0159a(e eVar, String str) {
            this.a = eVar;
            a(str);
        }

        public e a() {
            return this.a;
        }

        public ArrayList<String> b() {
            return this.f12304b;
        }

        public void a(String str) {
            this.f12304b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f12302h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f12302h.containsKey(view)) {
            return this.f12302h.get(view);
        }
        Map<View, Boolean> map = this.f12302h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f12297c.get(str);
    }

    public C0159a c(View view) {
        C0159a c0159a = this.f12296b.get(view);
        if (c0159a != null) {
            this.f12296b.remove(view);
        }
        return c0159a;
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
        return this.f12298d.contains(view) ? c.PARENT_VIEW : this.f12303i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f12302h.containsKey(view)) {
            return true;
        }
        this.f12302h.put(view, Boolean.TRUE);
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
        this.f12298d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f12301g.get(str);
    }

    public HashSet<String> c() {
        return this.f12299e;
    }

    public void d() {
        this.f12303i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c c10 = com.iab.omid.library.bytedance2.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : c10.a()) {
                View c11 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c11 != null) {
                        String a = a(c11);
                        if (a == null) {
                            this.f12299e.add(adSessionId);
                            this.a.put(c11, adSessionId);
                            a(aVar);
                        } else if (a != "noWindowFocus") {
                            this.f12300f.add(adSessionId);
                            this.f12297c.put(adSessionId, c11);
                            this.f12301g.put(adSessionId, a);
                        }
                    } else {
                        this.f12300f.add(adSessionId);
                        this.f12301g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.a.clear();
        this.f12296b.clear();
        this.f12297c.clear();
        this.f12298d.clear();
        this.f12299e.clear();
        this.f12300f.clear();
        this.f12301g.clear();
        this.f12303i = false;
    }

    public HashSet<String> b() {
        return this.f12300f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0159a c0159a = this.f12296b.get(view);
        if (c0159a != null) {
            c0159a.a(aVar.getAdSessionId());
        } else {
            this.f12296b.put(view, new C0159a(eVar, aVar.getAdSessionId()));
        }
    }
}
