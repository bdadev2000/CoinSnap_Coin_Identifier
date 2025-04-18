package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
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
public class TreeWalker implements a.InterfaceC0158a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f29003i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f29004j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f29005k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f29006l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f29007m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f29009b;

    /* renamed from: h, reason: collision with root package name */
    private long f29013h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f29008a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f29010c = false;
    private final List<com.iab.omid.library.applovin.weakreference.a> d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f29011f = new com.iab.omid.library.applovin.walking.a();
    private com.iab.omid.library.applovin.processor.b e = new com.iab.omid.library.applovin.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f29012g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    /* loaded from: classes3.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i2, long j2);
    }

    /* loaded from: classes3.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i2, long j2);
    }

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f29012g.b();
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
            if (TreeWalker.f29005k != null) {
                TreeWalker.f29005k.post(TreeWalker.f29006l);
                TreeWalker.f29005k.postDelayed(TreeWalker.f29007m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f29013h);
    }

    private void e() {
        this.f29009b = 0;
        this.d.clear();
        this.f29010c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f29010c = true;
                break;
            }
        }
        this.f29013h = f.b();
    }

    public static TreeWalker getInstance() {
        return f29003i;
    }

    private void i() {
        if (f29005k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f29005k = handler;
            handler.post(f29006l);
            f29005k.postDelayed(f29007m, 200L);
        }
    }

    private void k() {
        Handler handler = f29005k;
        if (handler != null) {
            handler.removeCallbacks(f29007m);
            f29005k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f29008a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f29008a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f29011f.e();
        long b2 = f.b();
        com.iab.omid.library.applovin.processor.a a2 = this.e.a();
        if (this.f29011f.b().size() > 0) {
            Iterator<String> it = this.f29011f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.a(null);
                a(next, this.f29011f.a(next), a3);
                com.iab.omid.library.applovin.utils.c.b(a3);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f29012g.a(a3, hashSet, b2);
            }
        }
        if (this.f29011f.c().size() > 0) {
            JSONObject a4 = a2.a(null);
            a(null, a2, a4, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(a4);
            this.f29012g.b(a4, this.f29011f.c(), b2);
            if (this.f29010c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it2 = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.d);
                }
            }
        } else {
            this.f29012g.b();
        }
        this.f29011f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f29008a.clear();
        f29004j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f29008a.contains(treeWalkerTimeLogger)) {
            this.f29008a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j2) {
        if (this.f29008a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f29008a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f29009b, TimeUnit.NANOSECONDS.toMillis(j2));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f29009b, j2);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d = this.f29011f.d(view);
        if (d == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, d);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f29011f.f(view)));
        this.f29011f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z2) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z2);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0158a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z2) {
        com.iab.omid.library.applovin.walking.c e;
        if (h.d(view) && (e = this.f29011f.e(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject a2 = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a2);
            if (!b(view, a2)) {
                boolean z3 = z2 || a(view, a2);
                if (this.f29010c && e == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z3) {
                    this.d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, a2, e, z3);
            }
            this.f29009b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a b2 = this.e.b();
        String b3 = this.f29011f.b(str);
        if (b3 != null) {
            JSONObject a2 = b2.a(view);
            com.iab.omid.library.applovin.utils.c.a(a2, str);
            com.iab.omid.library.applovin.utils.c.b(a2, b3);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a2);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0160a c2 = this.f29011f.c(view);
        if (c2 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c2);
        return true;
    }
}
