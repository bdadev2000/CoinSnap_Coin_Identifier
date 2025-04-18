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

/* loaded from: classes4.dex */
public class TreeWalker implements a.InterfaceC0158a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f12284i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f12285j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f12286k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f12287l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f12288m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f12289b;

    /* renamed from: h, reason: collision with root package name */
    private long f12295h;
    private List<TreeWalkerTimeLogger> a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f12290c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f12291d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f12293f = new com.iab.omid.library.bytedance2.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f12292e = new com.iab.omid.library.bytedance2.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f12294g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
            TreeWalker.this.f12294g.b();
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
            if (TreeWalker.f12286k != null) {
                TreeWalker.f12286k.post(TreeWalker.f12287l);
                TreeWalker.f12286k.postDelayed(TreeWalker.f12288m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f12295h);
    }

    private void e() {
        this.f12289b = 0;
        this.f12291d.clear();
        this.f12290c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f12290c = true;
                break;
            }
        }
        this.f12295h = f.b();
    }

    public static TreeWalker getInstance() {
        return f12284i;
    }

    private void i() {
        if (f12286k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f12286k = handler;
            handler.post(f12287l);
            f12286k.postDelayed(f12288m, 200L);
        }
    }

    private void k() {
        Handler handler = f12286k;
        if (handler != null) {
            handler.removeCallbacks(f12288m);
            f12286k = null;
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
        this.f12293f.e();
        long b3 = f.b();
        com.iab.omid.library.bytedance2.processor.a a10 = this.f12292e.a();
        if (this.f12293f.b().size() > 0) {
            Iterator<String> it = this.f12293f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a(null);
                a(next, this.f12293f.a(next), a11);
                com.iab.omid.library.bytedance2.utils.c.b(a11);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f12294g.a(a11, hashSet, b3);
            }
        }
        if (this.f12293f.c().size() > 0) {
            JSONObject a12 = a10.a(null);
            a(null, a10, a12, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(a12);
            this.f12294g.b(a12, this.f12293f.c(), b3);
            if (this.f12290c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it2 = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.f12291d);
                }
            }
        } else {
            this.f12294g.b();
        }
        this.f12293f.a();
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
        f12285j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.a.contains(treeWalkerTimeLogger)) {
            this.a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j3) {
        if (this.a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f12289b, TimeUnit.NANOSECONDS.toMillis(j3));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f12289b, j3);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f12293f.d(view);
        if (d10 == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, d10);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f12293f.f(view)));
        this.f12293f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0158a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.bytedance2.walking.c e2;
        if (h.d(view) && (e2 = this.f12293f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.f12290c && e2 == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f12291d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                a(view, aVar, a10, e2, z11);
            }
            this.f12289b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.processor.a b3 = this.f12292e.b();
        String b10 = this.f12293f.b(str);
        if (b10 != null) {
            JSONObject a10 = b3.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(a10, str);
            com.iab.omid.library.bytedance2.utils.c.b(a10, b10);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0159a c10 = this.f12293f.c(view);
        if (c10 == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c10);
        return true;
    }
}
