package n0;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class r1 {
    public final WeakReference a;

    public r1(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j3) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j3);
        }
    }

    public final void d(s1 s1Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (s1Var != null) {
                view.animate().setListener(new q1(0, this, s1Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
