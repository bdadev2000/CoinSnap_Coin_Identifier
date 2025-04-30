package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance2.processor.a;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import com.iab.omid.library.bytedance2.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TreeWalker implements a.InterfaceC0146a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f14557i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f14558j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f14559k = null;
    private static final Runnable l = new b();
    private static final Runnable m = new c();
    private int b;

    /* renamed from: h, reason: collision with root package name */
    private long f14566h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f14560a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f14561c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f14562d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f14564f = new com.iab.omid.library.bytedance2.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f14563e = new com.iab.omid.library.bytedance2.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f14565g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
            TreeWalker.this.f14565g.b();
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
            if (TreeWalker.f14559k != null) {
                TreeWalker.f14559k.post(TreeWalker.l);
                TreeWalker.f14559k.postDelayed(TreeWalker.m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f14566h);
    }

    private void e() {
        this.b = 0;
        this.f14562d.clear();
        this.f14561c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f14561c = true;
                break;
            }
        }
        this.f14566h = f.b();
    }

    public static TreeWalker getInstance() {
        return f14557i;
    }

    private void i() {
        if (f14559k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f14559k = handler;
            handler.post(l);
            f14559k.postDelayed(m, 200L);
        }
    }

    private void k() {
        Handler handler = f14559k;
        if (handler != null) {
            handler.removeCallbacks(m);
            f14559k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f14560a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f14560a.add(treeWalkerTimeLogger);
    }

    public void f() {
        this.f14564f.e();
        long b8 = f.b();
        com.iab.omid.library.bytedance2.processor.a a6 = this.f14563e.a();
        if (this.f14564f.b().size() > 0) {
            Iterator<String> it = this.f14564f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a9 = a6.a(null);
                a(next, this.f14564f.a(next), a9);
                com.iab.omid.library.bytedance2.utils.c.b(a9);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f14565g.a(a9, hashSet, b8);
            }
        }
        if (this.f14564f.c().size() > 0) {
            JSONObject a10 = a6.a(null);
            a(null, a6, a10, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(a10);
            this.f14565g.b(a10, this.f14564f.c(), b8);
            if (this.f14561c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it2 = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.f14562d);
                }
            }
        } else {
            this.f14565g.b();
        }
        this.f14564f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f14560a.clear();
        f14558j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f14560a.contains(treeWalkerTimeLogger)) {
            this.f14560a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j7) {
        if (this.f14560a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f14560a) {
                treeWalkerTimeLogger.onTreeProcessed(this.b, TimeUnit.NANOSECONDS.toMillis(j7));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.b, j7);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d2 = this.f14564f.d(view);
        if (d2 == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, d2);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f14564f.f(view)));
        this.f14564f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z8) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z8);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0146a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z8) {
        com.iab.omid.library.bytedance2.walking.c e4;
        if (h.d(view) && (e4 = this.f14564f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject a6 = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, a6);
            if (!b(view, a6)) {
                boolean z9 = z8 || a(view, a6);
                if (this.f14561c && e4 == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z9) {
                    this.f14562d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                a(view, aVar, a6, e4, z9);
            }
            this.b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.processor.a b8 = this.f14563e.b();
        String b9 = this.f14564f.b(str);
        if (b9 != null) {
            JSONObject a6 = b8.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(a6, str);
            com.iab.omid.library.bytedance2.utils.c.b(a6, b9);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, a6);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0147a c9 = this.f14564f.c(view);
        if (c9 == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c9);
        return true;
    }
}
