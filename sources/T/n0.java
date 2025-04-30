package T;

import android.animation.ValueAnimator;
import android.view.MenuItem;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import d1.C2161b;
import d1.C2166g;
import d1.C2168i;
import f1.C2262k;
import java.util.UUID;
import p.C2526e;
import p.MenuC2533l;
import p.ViewOnKeyListenerC2527f;

/* loaded from: classes.dex */
public final class n0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2911c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2912d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2914g;

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.b = i9;
        this.f2914g = obj;
        this.f2911c = obj2;
        this.f2912d = obj3;
        this.f2913f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2168i j7;
        switch (this.b) {
            case 0:
                p0.h((View) this.f2911c, (t0) this.f2912d, (E1.d) this.f2913f);
                ((ValueAnimator) this.f2914g).start();
                return;
            case 1:
                C2262k c2262k = (C2262k) this.f2913f;
                UUID uuid = (UUID) this.f2911c;
                String uuid2 = uuid.toString();
                androidx.work.o e4 = androidx.work.o.e();
                String str = e1.p.f20058c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                androidx.work.g gVar = (androidx.work.g) this.f2912d;
                sb.append(gVar);
                sb.append(")");
                e4.b(str, sb.toString(), new Throwable[0]);
                e1.p pVar = (e1.p) this.f2914g;
                WorkDatabase workDatabase = pVar.f20059a;
                WorkDatabase workDatabase2 = pVar.f20059a;
                workDatabase.c();
                try {
                    j7 = workDatabase2.n().j(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (j7 != null) {
                    if (j7.b == 2) {
                        C2166g c2166g = new C2166g(uuid2, gVar);
                        b1.h m = workDatabase2.m();
                        D0.j jVar = (D0.j) m.b;
                        jVar.b();
                        jVar.c();
                        try {
                            ((C2161b) m.f5270c).e(c2166g);
                            jVar.h();
                            jVar.f();
                        } catch (Throwable th) {
                            jVar.f();
                            throw th;
                        }
                    } else {
                        androidx.work.o.e().h(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.", new Throwable[0]);
                    }
                    c2262k.i(null);
                    workDatabase2.h();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            default:
                C2526e c2526e = (C2526e) this.f2911c;
                if (c2526e != null) {
                    com.bumptech.glide.f fVar = (com.bumptech.glide.f) this.f2914g;
                    ((ViewOnKeyListenerC2527f) fVar.f12819c).f22068C = true;
                    c2526e.b.c(false);
                    ((ViewOnKeyListenerC2527f) fVar.f12819c).f22068C = false;
                }
                MenuItem menuItem = (MenuItem) this.f2912d;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((MenuC2533l) this.f2913f).q(menuItem, null, 4);
                    return;
                }
                return;
        }
    }

    public n0(View view, t0 t0Var, E1.d dVar, ValueAnimator valueAnimator) {
        this.b = 0;
        this.f2911c = view;
        this.f2912d = t0Var;
        this.f2913f = dVar;
        this.f2914g = valueAnimator;
    }
}
