package j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import n0.r1;
import n0.s1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f19705c;

    /* renamed from: d, reason: collision with root package name */
    public s1 f19706d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19707e;

    /* renamed from: b, reason: collision with root package name */
    public long f19704b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final l f19708f = new l(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (!this.f19707e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r1) it.next()).b();
        }
        this.f19707e = false;
    }

    public final void b() {
        View view;
        if (this.f19707e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            r1 r1Var = (r1) it.next();
            long j3 = this.f19704b;
            if (j3 >= 0) {
                r1Var.c(j3);
            }
            Interpolator interpolator = this.f19705c;
            if (interpolator != null && (view = (View) r1Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f19706d != null) {
                r1Var.d(this.f19708f);
            }
            View view2 = (View) r1Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f19707e = true;
    }
}
