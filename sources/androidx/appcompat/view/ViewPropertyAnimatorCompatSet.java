package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo
/* loaded from: classes2.dex */
public class ViewPropertyAnimatorCompatSet {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f641c;
    public ViewPropertyAnimatorListener d;
    public boolean e;

    /* renamed from: b, reason: collision with root package name */
    public long f640b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final ViewPropertyAnimatorListenerAdapter f642f = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.view.ViewPropertyAnimatorCompatSet.1

        /* renamed from: a, reason: collision with root package name */
        public boolean f643a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f644b = 0;

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void a() {
            if (this.f643a) {
                return;
            }
            this.f643a = true;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.d;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.a();
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd() {
            int i2 = this.f644b + 1;
            this.f644b = i2;
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = ViewPropertyAnimatorCompatSet.this;
            if (i2 == viewPropertyAnimatorCompatSet.f639a.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = viewPropertyAnimatorCompatSet.d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.onAnimationEnd();
                }
                this.f644b = 0;
                this.f643a = false;
                viewPropertyAnimatorCompatSet.e = false;
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f639a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.f639a.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.f639a.iterator();
        while (it.hasNext()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) it.next();
            long j2 = this.f640b;
            if (j2 >= 0) {
                viewPropertyAnimatorCompat.c(j2);
            }
            Interpolator interpolator = this.f641c;
            if (interpolator != null && (view = (View) viewPropertyAnimatorCompat.f18764a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                viewPropertyAnimatorCompat.d(this.f642f);
            }
            View view2 = (View) viewPropertyAnimatorCompat.f18764a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
