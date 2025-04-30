package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TreeWalker implements a.InterfaceC0142a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f14458i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f14459j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f14460k = null;
    private static final Runnable l = new b();
    private static final Runnable m = new c();
    private int b;

    /* renamed from: h, reason: collision with root package name */
    private long f14467h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f14461a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f14462c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f14463d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f14465f = new com.iab.omid.library.applovin.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f14464e = new com.iab.omid.library.applovin.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f14466g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    /* loaded from: classes3.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i9, long j7);
    }

    /* loaded from: classes3.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i9, long j7);
    }

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f14466g.b();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f14460k != null) {
                TreeWalker.f14460k.post(TreeWalker.l);
                TreeWalker.f14460k.postDelayed(TreeWalker.m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f14467h);
    }

    private void e() {
        this.b = 0;
        this.f14463d.clear();
        this.f14462c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f14462c = true;
                break;
            }
        }
        this.f14467h = f.b();
    }

    public static TreeWalker getInstance() {
        return f14458i;
    }

    private void i() {
        if (f14460k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f14460k = handler;
            handler.post(l);
            f14460k.postDelayed(m, 200L);
        }
    }

    private void k() {
        Handler handler = f14460k;
        if (handler != null) {
            handler.removeCallbacks(m);
            f14460k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f14461a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f14461a.add(treeWalkerTimeLogger);
    }

    public void f() {
        this.f14465f.e();
        long b8 = f.b();
        com.iab.omid.library.applovin.processor.a a6 = this.f14464e.a();
        if (this.f14465f.b().size() > 0) {
            Iterator<String> it = this.f14465f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a9 = a6.a(null);
                a(next, this.f14465f.a(next), a9);
                com.iab.omid.library.applovin.utils.c.b(a9);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f14466g.a(a9, hashSet, b8);
            }
        }
        if (this.f14465f.c().size() > 0) {
            JSONObject a10 = a6.a(null);
            a(null, a6, a10, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(a10);
            this.f14466g.b(a10, this.f14465f.c(), b8);
            if (this.f14462c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it2 = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.f14463d);
                }
            }
        } else {
            this.f14466g.b();
        }
        this.f14465f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f14461a.clear();
        f14459j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f14461a.contains(treeWalkerTimeLogger)) {
            this.f14461a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j7) {
        if (this.f14461a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f14461a) {
                treeWalkerTimeLogger.onTreeProcessed(this.b, TimeUnit.NANOSECONDS.toMillis(j7));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.b, j7);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d2 = this.f14465f.d(view);
        if (d2 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, d2);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f14465f.f(view)));
        this.f14465f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z8) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z8);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0142a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z8) {
        com.iab.omid.library.applovin.walking.c e4;
        if (h.d(view) && (e4 = this.f14465f.e(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject a6 = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a6);
            if (!b(view, a6)) {
                boolean z9 = z8 || a(view, a6);
                if (this.f14462c && e4 == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z9) {
                    this.f14463d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, a6, e4, z9);
            }
            this.b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a b8 = this.f14464e.b();
        String b9 = this.f14465f.b(str);
        if (b9 != null) {
            JSONObject a6 = b8.a(view);
            com.iab.omid.library.applovin.utils.c.a(a6, str);
            com.iab.omid.library.applovin.utils.c.b(a6, b9);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a6);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0144a c9 = this.f14465f.c(view);
        if (c9 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c9);
        return true;
    }
}
