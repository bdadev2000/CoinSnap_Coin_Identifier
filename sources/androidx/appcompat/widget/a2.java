package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class a2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b2 f805c;

    public /* synthetic */ a2(b2 b2Var, int i10) {
        this.f804b = i10;
        this.f805c = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f804b;
        b2 b2Var = this.f805c;
        switch (i10) {
            case 0:
                ViewParent parent = b2Var.f812f.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                b2Var.a();
                View view = b2Var.f812f;
                if (view.isEnabled() && !view.isLongClickable() && b2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    b2Var.f815i = true;
                    return;
                }
                return;
        }
    }
}
