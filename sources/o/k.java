package o;

import T.C0275i0;
import T.InterfaceC0277j0;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f21923c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0277j0 f21924d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21925e;
    public long b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final j f21926f = new j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21922a = new ArrayList();

    public final void a() {
        if (!this.f21925e) {
            return;
        }
        Iterator it = this.f21922a.iterator();
        while (it.hasNext()) {
            ((C0275i0) it.next()).b();
        }
        this.f21925e = false;
    }

    public final void b() {
        View view;
        if (this.f21925e) {
            return;
        }
        Iterator it = this.f21922a.iterator();
        while (it.hasNext()) {
            C0275i0 c0275i0 = (C0275i0) it.next();
            long j7 = this.b;
            if (j7 >= 0) {
                c0275i0.c(j7);
            }
            Interpolator interpolator = this.f21923c;
            if (interpolator != null && (view = (View) c0275i0.f2900a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f21924d != null) {
                c0275i0.d(this.f21926f);
            }
            View view2 = (View) c0275i0.f2900a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f21925e = true;
    }
}
