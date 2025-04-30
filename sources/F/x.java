package f;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.InterfaceC0511v;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import u7.C2814e;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f20240a;
    public final C2814e b = new C2814e();

    /* renamed from: c, reason: collision with root package name */
    public o f20241c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f20242d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f20243e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20244f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20245g;

    public x(Runnable runnable) {
        OnBackInvokedCallback a6;
        this.f20240a = runnable;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            if (i9 >= 34) {
                a6 = t.f20234a.a(new p(this, 0), new p(this, 1), new q(this, 0), new q(this, 1));
            } else {
                a6 = r.f20230a.a(new q(this, 2));
            }
            this.f20242d = a6;
        }
    }

    public final void a(InterfaceC0511v interfaceC0511v, o oVar) {
        G7.j.e(interfaceC0511v, "owner");
        G7.j.e(oVar, "onBackPressedCallback");
        AbstractC0505o lifecycle = interfaceC0511v.getLifecycle();
        if (((C0513x) lifecycle).f4904d == EnumC0504n.b) {
            return;
        }
        oVar.b.add(new u(this, lifecycle, oVar));
        f();
        oVar.f20227c = new w(0, this, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final v b(o oVar) {
        G7.j.e(oVar, "onBackPressedCallback");
        this.b.addLast(oVar);
        v vVar = new v(this, oVar);
        oVar.b.add(vVar);
        f();
        oVar.f20227c = new w(0, this, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        return vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        o oVar;
        o oVar2 = this.f20241c;
        if (oVar2 == null) {
            C2814e c2814e = this.b;
            ListIterator listIterator = c2814e.listIterator(c2814e.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    oVar = listIterator.previous();
                    if (((o) oVar).f20226a) {
                        break;
                    }
                } else {
                    oVar = 0;
                    break;
                }
            }
            oVar2 = oVar;
        }
        this.f20241c = null;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        o oVar;
        o oVar2 = this.f20241c;
        if (oVar2 == null) {
            C2814e c2814e = this.b;
            ListIterator listIterator = c2814e.listIterator(c2814e.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    oVar = listIterator.previous();
                    if (((o) oVar).f20226a) {
                        break;
                    }
                } else {
                    oVar = 0;
                    break;
                }
            }
            oVar2 = oVar;
        }
        this.f20241c = null;
        if (oVar2 != null) {
            oVar2.b();
            return;
        }
        Runnable runnable = this.f20240a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z8) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f20243e;
        OnBackInvokedCallback onBackInvokedCallback = this.f20242d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            r rVar = r.f20230a;
            if (z8 && !this.f20244f) {
                rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f20244f = true;
            } else if (!z8 && this.f20244f) {
                rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f20244f = false;
            }
        }
    }

    public final void f() {
        boolean z8 = this.f20245g;
        C2814e c2814e = this.b;
        boolean z9 = false;
        if (!(c2814e instanceof Collection) || !c2814e.isEmpty()) {
            Iterator<E> it = c2814e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((o) it.next()).f20226a) {
                    z9 = true;
                    break;
                }
            }
        }
        this.f20245g = z9;
        if (z9 != z8 && Build.VERSION.SDK_INT >= 33) {
            e(z9);
        }
    }
}
