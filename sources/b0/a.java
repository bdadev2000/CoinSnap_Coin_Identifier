package b0;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class a {
    public a() {
    }

    public boolean e(View view) {
        return false;
    }

    public boolean f(View view, View view2) {
        return false;
    }

    public void g(d dVar) {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public void i() {
    }

    public void j() {
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return false;
    }

    public boolean n(View view) {
        return false;
    }

    public void o(View view, View view2, int i10, int[] iArr, int i11) {
    }

    public void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
    }

    public void q(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void r(View view, Parcelable parcelable) {
    }

    public Parcelable s(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean t(View view, int i10, int i11) {
        return false;
    }

    public void u(View view, View view2, int i10) {
    }

    public boolean v(View view, MotionEvent motionEvent) {
        return false;
    }

    public a(int i10) {
    }
}
