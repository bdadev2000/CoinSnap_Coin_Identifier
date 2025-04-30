package G;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f2.C2269g;
import g2.C2290d;
import g2.InterfaceC2288b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1238c;

    public f(C2290d c2290d) {
        this.f1238c = new WeakReference(c2290d);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i9;
        switch (this.b) {
            case 0:
                ((CoordinatorLayout) this.f1238c).p(0);
                return true;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C2290d c2290d = (C2290d) ((WeakReference) this.f1238c).get();
                if (c2290d != null) {
                    ArrayList arrayList = c2290d.b;
                    if (!arrayList.isEmpty()) {
                        View view = c2290d.f20423a;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int i10 = 0;
                        if (layoutParams != null) {
                            i9 = layoutParams.width;
                        } else {
                            i9 = 0;
                        }
                        int a6 = c2290d.a(view.getWidth(), i9, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                            i10 = layoutParams2.height;
                        }
                        int a9 = c2290d.a(view.getHeight(), i10, paddingBottom);
                        if (a6 > 0 || a6 == Integer.MIN_VALUE) {
                            if (a9 > 0 || a9 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((C2269g) ((InterfaceC2288b) it.next())).l(a6, a9);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c2290d.f20424c);
                                }
                                c2290d.f20424c = null;
                                arrayList.clear();
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
        }
    }

    public f(CoordinatorLayout coordinatorLayout) {
        this.f1238c = coordinatorLayout;
    }
}
