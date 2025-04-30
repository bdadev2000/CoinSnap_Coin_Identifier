package T;

import M0.C0225p;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: T.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275i0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2900a;

    public C0275i0(View view) {
        this.f2900a = new WeakReference(view);
    }

    public final void a(float f9) {
        View view = (View) this.f2900a.get();
        if (view != null) {
            view.animate().alpha(f9);
        }
    }

    public final void b() {
        View view = (View) this.f2900a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j7) {
        View view = (View) this.f2900a.get();
        if (view != null) {
            view.animate().setDuration(j7);
        }
    }

    public final void d(InterfaceC0277j0 interfaceC0277j0) {
        View view = (View) this.f2900a.get();
        if (view != null) {
            if (interfaceC0277j0 != null) {
                view.animate().setListener(new C0225p(view, 1, interfaceC0277j0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f9) {
        View view = (View) this.f2900a.get();
        if (view != null) {
            view.animate().translationY(f9);
        }
    }
}
