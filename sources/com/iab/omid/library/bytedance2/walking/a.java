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

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f14568a = new HashMap<>();
    private final HashMap<View, C0147a> b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f14569c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f14570d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f14571e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f14572f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f14573g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f14574h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f14575i;

    /* renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0147a {

        /* renamed from: a, reason: collision with root package name */
        private final e f14576a;
        private final ArrayList<String> b = new ArrayList<>();

        public C0147a(e eVar, String str) {
            this.f14576a = eVar;
            a(str);
        }

        public e a() {
            return this.f14576a;
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
            this.f14574h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f14574h.containsKey(view)) {
            return this.f14574h.get(view);
        }
        Map<View, Boolean> map = this.f14574h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f14569c.get(str);
    }

    public C0147a c(View view) {
        C0147a c0147a = this.b.get(view);
        if (c0147a != null) {
            this.b.remove(view);
        }
        return c0147a;
    }

    public String d(View view) {
        if (this.f14568a.size() == 0) {
            return null;
        }
        String str = this.f14568a.get(view);
        if (str != null) {
            this.f14568a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f14570d.contains(view) ? c.PARENT_VIEW : this.f14575i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f14574h.containsKey(view)) {
            return true;
        }
        this.f14574h.put(view, Boolean.TRUE);
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
        this.f14570d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f14573g.get(str);
    }

    public HashSet<String> c() {
        return this.f14571e;
    }

    public void d() {
        this.f14575i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c c9 = com.iab.omid.library.bytedance2.internal.c.c();
        if (c9 != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : c9.a()) {
                View c10 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c10 != null) {
                        String a6 = a(c10);
                        if (a6 == null) {
                            this.f14571e.add(adSessionId);
                            this.f14568a.put(c10, adSessionId);
                            a(aVar);
                        } else if (a6 != "noWindowFocus") {
                            this.f14572f.add(adSessionId);
                            this.f14569c.put(adSessionId, c10);
                            this.f14573g.put(adSessionId, a6);
                        }
                    } else {
                        this.f14572f.add(adSessionId);
                        this.f14573g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f14568a.clear();
        this.b.clear();
        this.f14569c.clear();
        this.f14570d.clear();
        this.f14571e.clear();
        this.f14572f.clear();
        this.f14573g.clear();
        this.f14575i = false;
    }

    public HashSet<String> b() {
        return this.f14572f;
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
        C0147a c0147a = this.b.get(view);
        if (c0147a != null) {
            c0147a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new C0147a(eVar, aVar.getAdSessionId()));
        }
    }
}
