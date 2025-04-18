package b0;

import android.util.Log;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2264b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2265c;

    public e(t4.f fVar) {
        this.f2265c = new WeakReference(fVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        int i10 = this.f2264b;
        Object obj = this.f2265c;
        switch (i10) {
            case 0:
                ((CoordinatorLayout) obj).p(0);
                return true;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                t4.f fVar = (t4.f) ((WeakReference) obj).get();
                if (fVar != null) {
                    ArrayList arrayList = fVar.f25264b;
                    if (!arrayList.isEmpty()) {
                        int c10 = fVar.c();
                        int b3 = fVar.b();
                        if (c10 <= 0 && c10 != Integer.MIN_VALUE) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (b3 <= 0 && b3 != Integer.MIN_VALUE) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                z12 = true;
                            }
                        }
                        if (z12) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((s4.h) ((t4.d) it.next())).n(c10, b3);
                            }
                            ViewTreeObserver viewTreeObserver = fVar.a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(fVar.f25265c);
                            }
                            fVar.f25265c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
        }
    }

    public e(CoordinatorLayout coordinatorLayout) {
        this.f2265c = coordinatorLayout;
    }
}
