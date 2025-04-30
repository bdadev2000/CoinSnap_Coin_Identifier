package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0473l implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0481p f4733d;

    public /* synthetic */ RunnableC0473l(C0481p c0481p, ViewGroup viewGroup) {
        this.b = 2;
        this.f4733d = c0481p;
        this.f4732c = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                L0 l02 = (L0) this.f4732c;
                G7.j.e(l02, "$operation");
                C0481p c0481p = this.f4733d;
                G7.j.e(c0481p, "this$0");
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Transition for operation " + l02 + " has completed");
                }
                l02.c(c0481p);
                return;
            case 1:
                L0 l03 = (L0) this.f4732c;
                G7.j.e(l03, "$operation");
                C0481p c0481p2 = this.f4733d;
                G7.j.e(c0481p2, "this$0");
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Transition for operation " + l03 + " has completed");
                }
                l03.c(c0481p2);
                return;
            default:
                C0481p c0481p3 = this.f4733d;
                G7.j.e(c0481p3, "this$0");
                ViewGroup viewGroup = (ViewGroup) this.f4732c;
                G7.j.e(viewGroup, "$container");
                Iterator it = c0481p3.f4748c.iterator();
                while (it.hasNext()) {
                    L0 l04 = ((C0482q) it.next()).f4731a;
                    View view = l04.f4667c.getView();
                    if (view != null) {
                        Q7.n0.a(l04.f4666a, view, viewGroup);
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0473l(L0 l02, C0481p c0481p, int i9) {
        this.b = i9;
        this.f4732c = l02;
        this.f4733d = c0481p;
    }
}
