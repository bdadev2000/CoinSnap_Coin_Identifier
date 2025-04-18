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

/* loaded from: classes4.dex */
public class TreeWalker implements a.InterfaceC0154a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f12191i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f12192j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f12193k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f12194l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f12195m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f12196b;

    /* renamed from: h, reason: collision with root package name */
    private long f12202h;
    private List<TreeWalkerTimeLogger> a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f12197c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f12198d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f12200f = new com.iab.omid.library.applovin.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f12199e = new com.iab.omid.library.applovin.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f12201g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    /* loaded from: classes4.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j3);
    }

    /* loaded from: classes4.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j3);
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f12201g.b();
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    /* loaded from: classes4.dex */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f12193k != null) {
                TreeWalker.f12193k.post(TreeWalker.f12194l);
                TreeWalker.f12193k.postDelayed(TreeWalker.f12195m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f12202h);
    }

    private void e() {
        this.f12196b = 0;
        this.f12198d.clear();
        this.f12197c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f12197c = true;
                break;
            }
        }
        this.f12202h = f.b();
    }

    public static TreeWalker getInstance() {
        return f12191i;
    }

    private void i() {
        if (f12193k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f12193k = handler;
            handler.post(f12194l);
            f12193k.postDelayed(f12195m, 200L);
        }
    }

    private void k() {
        Handler handler = f12193k;
        if (handler != null) {
            handler.removeCallbacks(f12195m);
            f12193k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.a.add(treeWalkerTimeLogger);
    }

    public void f() {
        this.f12200f.e();
        long b3 = f.b();
        com.iab.omid.library.applovin.processor.a a10 = this.f12199e.a();
        if (this.f12200f.b().size() > 0) {
            Iterator<String> it = this.f12200f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a(null);
                a(next, this.f12200f.a(next), a11);
                com.iab.omid.library.applovin.utils.c.b(a11);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f12201g.a(a11, hashSet, b3);
            }
        }
        if (this.f12200f.c().size() > 0) {
            JSONObject a12 = a10.a(null);
            a(null, a10, a12, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(a12);
            this.f12201g.b(a12, this.f12200f.c(), b3);
            if (this.f12197c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it2 = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.f12198d);
                }
            }
        } else {
            this.f12201g.b();
        }
        this.f12200f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.a.clear();
        f12192j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.a.contains(treeWalkerTimeLogger)) {
            this.a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j3) {
        if (this.a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f12196b, TimeUnit.NANOSECONDS.toMillis(j3));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f12196b, j3);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f12200f.d(view);
        if (d10 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, d10);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f12200f.f(view)));
        this.f12200f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0154a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.applovin.walking.c e2;
        if (h.d(view) && (e2 = this.f12200f.e(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.f12197c && e2 == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f12198d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, a10, e2, z11);
            }
            this.f12196b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a b3 = this.f12199e.b();
        String b10 = this.f12200f.b(str);
        if (b10 != null) {
            JSONObject a10 = b3.a(view);
            com.iab.omid.library.applovin.utils.c.a(a10, str);
            com.iab.omid.library.applovin.utils.c.b(a10, b10);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0156a c10 = this.f12200f.c(view);
        if (c10 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c10);
        return true;
    }
}
